package com.mutualofomaha.vcs.repository

import com.mutualofomaha.vcs.entity.DC
import org.springframework.data.repository.CrudRepository

/**
 * Created by req88092 on 2019-08-09
 */
interface DCRepository extends CrudRepository<DC, Integer> {

    List<DC> findAll()

    List<DC> findByCategory(String category)

}