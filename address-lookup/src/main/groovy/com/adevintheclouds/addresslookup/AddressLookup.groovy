package com.adevintheclouds.addresslookup

import groovy.util.logging.Log4j

@Log4j
class AddressLookup implements IAddressLookup {

    @Override
    List<Address> findAddress(String postcode) {

        log.debug("Made it into findAddress($postcode)")

        return [
            new Address(addressLine1: '52b Hova Villas', addressLine2: '', town: 'Hove', county: 'East Sussex', postcode: 'BN33DG'),
            new Address(addressLine1: 'An Organisation', addressLine2: '50 Hova Villas', town: 'Hove', county: 'East Sussex', postcode: 'BN33DG')
        ]
    }
}
