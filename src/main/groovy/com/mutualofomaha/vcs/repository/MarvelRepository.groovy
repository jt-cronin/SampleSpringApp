package com.mutualofomaha.vcs.repository

import com.mutualofomaha.vcs.entity.Marvel
import org.springframework.data.repository.CrudRepository

/**
 * Created by req88092 on 2019-08-09
 */
interface MarvelRepository extends CrudRepository<Marvel, Integer> {

    List<Marvel> findAll()

    List<Marvel> findByCategory(String category)
}
