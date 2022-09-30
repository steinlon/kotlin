fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }
    val sum: Int.(Int) -> Int = { other -> plus(other) }
    val sumNew: Int.(Int) -> Int = { other -> this + other }
    val sumNewNew = fun Int.(other: Int): Int = this + other

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}
