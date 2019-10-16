package session3.recAndLists

fun <T>reverse(list: List<T>): List<T> = TODO("use any fold to reverse")

fun <T>r(list: List<T>): List<T> = foldLeft(list, listOf<T>()) { acc, curr -> listOf(curr) + acc }