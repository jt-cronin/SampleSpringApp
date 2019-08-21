package com.mutualofomaha.vcs.controller

import com.mutualofomaha.vcs.service.SpringbootSampleAppService
import groovy.util.logging.Slf4j
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by req88092 on 2019-08-09
 */
@RequestMapping('/api')
@RestController
@Api(description = 'Restful micro service for springboot sample application data requests')
@Slf4j
class SpringbootSampleAppController {

    @Autowired
    SpringbootSampleAppService springbootSampleAppService

    @GetMapping(path = '/marvel', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve all marvel data')
    def getMarvelData() {
        log.info('Getting marvel data')
        return springbootSampleAppService.getAllMarvelData()
    }

    @GetMapping(path = '/marvel/{category}', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to get Marvel data by category')
    def getMarvelDataByCategory(@RequestParam String category) {
        log.info('Getting Marvel data by category')
        return springbootSampleAppService.getMarvelCategoryData(category.toUpperCase())
    }

    @GetMapping(path = '/dc', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve all DC data')
    def getDcData() {
        log.info('Getting DC data')
        return springbootSampleAppService.getAllDcData()
    }

    @GetMapping(path = '/dc/{category}', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to get DC data by category')
    def getDcDataByCategory(@RequestParam String category) {
        log.info('Getting DC data by category')
        return springbootSampleAppService.getDcCategoryData(category.toUpperCase())
    }
}
