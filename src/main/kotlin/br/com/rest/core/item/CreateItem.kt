package br.com.rest.core.item

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreateItem @Inject
constructor(private val itemGateway: ItemGateway){
    fun execute(item: Item): Item {
        return itemGateway.create(item)
    }
}
