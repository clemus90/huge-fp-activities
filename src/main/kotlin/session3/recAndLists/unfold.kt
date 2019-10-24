package session3.recAndLists

fun <T>prepend(list: List<T>, element: T) = listOf(element) + list

fun range(start: Int, end: Int): List<Int> {
    val result: MutableList<Int> = mutableListOf()
    var index = start
    while (index < end) {
        result.add(index)
        index++
    }
    return result
}

fun <T> unfold(seed: T, f:(T) -> T, p: (T) -> Boolean): List<T> = TODO("unfold like you would do in a regular loop")

fun <T> unfoldedRange(start: Int, end: Int): List<Int> = TODO("reimplement range")

fun <T> recursiveRange(start: Int, end: Int) : List<Int> = TODO("reimplement range as a recursive function using prepend")

fun <T> recursiveUnfold(seed: T, f:(T) -> T, p: (T) -> Boolean): List<T> = TODO("unfold based on the recursiveRange using prepend")

fun <T> corecursiveUnfold(seed: T, f:(T) -> T, p: (T) -> Boolean): List<T> = TODO("unfold but tailrecursive")