package br.com.rest.core.item

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetItem @Inject
constructor(private val itemGateway: ItemGateway){
    fun execute(id: Int): Item {
        return itemGateway.get(id)
    }
}
