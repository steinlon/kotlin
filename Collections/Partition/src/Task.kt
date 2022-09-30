// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter { it ->
    val (delivered, unDelivered) = it.orders.partition { it.isDelivered }
    unDelivered.size > delivered.size
}.toSet()
