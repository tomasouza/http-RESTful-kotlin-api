package br.com.rest.core.item

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Item (@Id @GeneratedValue val id: Long, val name : String, val price : BigDecimal)
