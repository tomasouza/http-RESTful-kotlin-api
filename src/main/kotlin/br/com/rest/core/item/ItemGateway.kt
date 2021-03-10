package br.com.rest.core.item

interface ItemGateway {
    fun create(item: Item): Item
    fun get(id: Int): Item
    fun delete(id: Int)
    fun update(item: Item): Item
    fun list(): List<Item>
}
