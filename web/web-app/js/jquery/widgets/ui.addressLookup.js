
$.widget( "ui.postcodeLookup", {
    options: {
        buttonText: 'Lookup',
        selectButtonText: 'Choose',
        addressSelected: null,
        lookupUrl: 'http://localhost:8080/web/addressLookup/findAddress'
    },

    _create: function() {
        this.wrapper = $('<div class="ui-postcode-lookup input-append"/>');
        this.element.wrap(this.wrapper);

        this.lookupButton = $('<button>', { class: 'btn', text: this.options.buttonText });
        this.element.after(this.lookupButton);

        this._on(this.lookupButton, {
            click: "_lookupAddress"
        });

        this.resultsWrapper = $('<div>', { class: 'ui-postcode-lookup-results-wraper'});
        this.lookupResults = $('<select>', { class: 'ui-postcode-lookup-results' });
        this.selectButton = $('<button>', { class: 'btn', text: this.options.selectButtonText });

        this.resultsWrapper.append(this.lookupResults).append(this.selectButton);

        this._on(this.selectButton, {
            click: "_selectAddress"
        });
    },

    _lookupAddress: function() {
        this.lookupResults.find('option').remove();

        var that = this;

        $.getJSON(this.options.lookupUrl, { postcode: this.element.val() }, function(data) {
            $.each(data, function(index, address) {
                that.lookupResults
                    .append($('<option>', { value : JSON.stringify(address) })
                        .text(address.addressLine1)
                    );

                that.lookupButton.after(that.resultsWrapper);
            });
        });

        return false;
    },

    _selectAddress: function() {

        var selectedAddress = this.lookupResults.val();
        var address = JSON.parse(selectedAddress);

        this._trigger("addressSelected", event, { address: address });

        this.resultsWrapper.detach();
    }
});