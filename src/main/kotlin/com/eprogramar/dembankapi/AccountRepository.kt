package com.eprogramar.dembankapi

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long > {
}