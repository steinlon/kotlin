// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = customers.flatMap { it.getOrderedProducts() }.toSet()
    return customers.fold(allProducts, { orderByAll, customer ->
        val products = customer.getOrderedProducts()
        orderByAll.intersect(products)
    })
}

fun Customer.getOrderedProducts(): List<Product> = orders.flatMap { it.products }