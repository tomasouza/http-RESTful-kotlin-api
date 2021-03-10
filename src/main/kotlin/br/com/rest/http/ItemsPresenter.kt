package br.com.rest.http

import br.com.rest.core.item.*
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("/items")
class ItemsPresenter @Inject
constructor(private val listItems: ListItems,
            private val getItem: GetItem,
            private val createItem: CreateItem,
            private val updateItem: UpdateItem,
            private val changeItemName: ChangeItemName
){

    @Get
    fun get() : List<Item> {
        return listItems.execute()
    }

    @Get("/{id}")
    fun get(@PathVariable id: Int): Item {
        return getItem.execute(id)
    }

    @Post
    fun create(@Body item: Item): Item {
        return createItem.execute(item)
    }

    @Put
    fun update(@Body item: Item): Item {
        return updateItem.execute(item)
    }
}