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
@Table(name = 'T_MARVEL')
@Entity
@ToString
class Marvel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int marvelId
    String name
    String category
    String gender
    String home
    String intelligence
    String strength
    String speed
    String fightingSkills
    @Temporal(TemporalType.TIMESTAMP)
    Date rowCreateTsp
}
