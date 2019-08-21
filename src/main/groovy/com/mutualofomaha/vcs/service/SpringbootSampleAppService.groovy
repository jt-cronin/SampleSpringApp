package com.mutualofomaha.vcs.service

import com.mutualofomaha.vcs.repository.DCRepository
import com.mutualofomaha.vcs.repository.MarvelRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by req88092 on 2019-08-09
 */
@Slf4j
@Service
class SpringbootSampleAppService {

    @Autowired
    DCRepository dcRepository

    @Autowired
    MarvelRepository marvelRepository

    def getAllMarvelData() {
        log.info('Retrieving all data from database for Marvel')
        def result =  marvelRepository.findAll()
        log.debug('Successfully returned marvel data with size: ' + result.size())
        return result
    }

    def getAllDcData() {
        log.info('Retrieving all data from database for DC')
        def result = dcRepository.findAll()
        log.debug('Successfully returned DC data with size: ' + result.size())
        return result
    }

    def getDcCategoryData(String category) {
        log.info('Retrieving DC data from the database for category: ' + category)
        def result =  dcRepository.findByCategory(category)
        log.debug('Successfully returned DC category data with size: ' + result.size())
        return result
    }

    def getMarvelCategoryData(String category) {
        log.info('Retrieving Marvel data from the database for category: ' + category)
        def result =  marvelRepository.findByCategory(category)
        log.debug('Successfully returned Marvel category data with size: ' + result.size())
        return result
    }

}
