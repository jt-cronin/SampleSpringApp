package com.mutualofomaha.vcs.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

/**
 * Created by req88092 on 2019-08-13
 */
@ActiveProfiles('dev')
@SpringBootTest
class SpringbootSampleAppServiceSpec extends Specification{

    @Autowired
    SpringbootSampleAppService springbootSampleAppService

    def 'test getAllMarvelData() method' () {
        when: 'Calling to get all marvel data'
        def result = springbootSampleAppService.getAllMarvelData()

        then: 'Expected result is returned'
        result
    }

    def 'test getAllDcData() method' () {
        when: 'Calling to get all dc data'
        def result = springbootSampleAppService.getAllDcData()

        then: 'Expected result is returned'
        result
    }

    def 'test getDcCategoryData() method' () {
        when: 'Calling to get dc data based on category'
        def result = springbootSampleAppService.getDcCategoryData('HERO')

        then: 'Expected result is returned'
        result
    }

    def 'test getMarvelCategoryData() method' () {
        when: 'Calling to get marvel data based on category'
        def result = springbootSampleAppService.getMarvelCategoryData('VILLAIN')

        then: 'Expected result is returned'
        result
    }
}
