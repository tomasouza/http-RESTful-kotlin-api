package br.com.rest.core.item

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ListItems @Inject
constructor(private val itemGateway: ItemGateway){
    fun execute(): List<Item> {
        return itemGateway.list()
    }
}
