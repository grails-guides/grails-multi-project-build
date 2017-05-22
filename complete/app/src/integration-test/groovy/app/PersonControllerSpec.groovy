package app

import demo.OCI
import grails.test.mixin.integration.Integration
import spock.lang.Specification
import grails.plugins.rest.client.RestBuilder

@Integration
class PersonControllerSpec extends Specification {

    def '/person endpoints return one of the names'() {

        given:
        RestBuilder rest = new RestBuilder()

        when:
        def resp = rest.get("http://localhost:${serverPort}/person")

        then:
        OCI.PEOPLE.contains resp.text
    }
}
