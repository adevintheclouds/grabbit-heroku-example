<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>

<html lang="en">

<head>
    <r:require module="ui-addressLookup"/>
    <r:require module="bootstrap"/>

    <r:layoutResources/>
</head>

<body>

<r:script>

    $( "#postcode" ).postcodeLookup({
        addressSelected: function(event, data) {
            $('#addressLine1').val(data.address.addressLine1);
            $('#addressLine2').val(data.address.addressLine2);
            $('#town').val(data.address.town);
            $('#county').val(data.address.county);
            $('#postcode').val(data.address.postcode);
        },
        lookupUrl: "${createLink(controller:'AddressLookup', action:'findAddress')}"
    });

</r:script>

<div class="container">
    <form>
        <fieldset>
            <legend>Your Address</legend>

            <label>Address Line 1</label><g:textField name="addressLine1"/>
            <label>Address Line 2</label><g:textField name="addressLine2"/>
            <label>Town</label><g:textField name="town"/>
            <label>County</label><g:textField name="county"/>
            <label>Postcode</label><g:textField name="postcode"/>
        </fieldset>
    </form>
</div>

<r:layoutResources/>
</body>

</html>