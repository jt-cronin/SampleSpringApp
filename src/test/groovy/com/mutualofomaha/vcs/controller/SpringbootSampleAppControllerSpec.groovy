package com.mutualofomaha.vcs.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

/**
 * Created by req88092 on 2019-08-13
 */
@ActiveProfiles('dev')
@SpringBootTest
class SpringbootSampleAppControllerSpec extends Specification {

    @Autowired
    SpringbootSampleAppController springbootSampleAppController

    def 'test getMarvelData() method' () {
        when: 'Calling to get marvel data'
        def result = springbootSampleAppController.getMarvelData()

        then: 'Expected result is returned'
        result
    }

    def 'test getMarvelDataByCategory() method' () {
        when: 'Calling to get marvel data by category'
        def result = springbootSampleAppController.getMarvelDataByCategory('HERO')

        then: 'Expected result is returned'
        result
    }

    def 'test getDcData() method' () {
        when: 'Calling to get dc data'
        def result = springbootSampleAppController.getDcData()

        then: 'Expected result is returned'
        result
    }

    def 'test getDcDataByCategory() method' () {
        when: 'Calling to get dc data by category'
        def result = springbootSampleAppController.getDcDataByCategory('VILLAIN')

        then: 'Expected result is returned'
        result
    }
}
