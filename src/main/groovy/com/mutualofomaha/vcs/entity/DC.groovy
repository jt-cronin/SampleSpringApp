package com.mutualofomaha.vcs.entity

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType

/**
 * Created by req88092 on 2019-08-09
 */
@Table(name = 'T_DC')
@Entity
@ToString
class DC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int dcId
    String name
    String category
    String gender
    String identity
    @Temporal(TemporalType.TIMESTAMP)
    Date rowCreateTsp
}
