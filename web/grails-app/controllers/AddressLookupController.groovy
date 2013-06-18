import com.adevintheclouds.addresslookup.IAddressLookup
import grails.converters.JSON

class AddressLookupController {

    IAddressLookup addressLookup

    def index() {}

    def findAddress(String postcode) {

        def addresses = addressLookup.findAddress(postcode)

        render addresses as JSON
    }

}
