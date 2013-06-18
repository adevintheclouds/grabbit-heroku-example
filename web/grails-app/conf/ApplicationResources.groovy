modules = {
    'jquery-ui' {
        dependsOn 'jquery'
        resource url: '/js/jquery/jquery-ui-1.9.2.custom.min.js'
    }

    'ui-addressLookup' {
        dependsOn 'jquery-ui'
        resource url: '/js/jquery/widgets/ui.addressLookup.js'
    }
}