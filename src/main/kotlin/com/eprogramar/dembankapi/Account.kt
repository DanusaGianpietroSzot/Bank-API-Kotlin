package com.eprogramar.dembankapi

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "accounts")
data class Account (
    @Id @GeneratedValue//gera Ids automaticamente
    var id:Long? = null,
    val name:String,
    val document: String,
    val phone: String
)