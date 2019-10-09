package session3.recAndLists

fun sumOfInts(list: List<Int>): Int =
    if (list.isEmpty()) 0 else list[0] + sumOfInts(list.drop(1))

fun <T> head(list: List<T>): T = TODO("define the head function for a list of any type")
fun <T> tail(list: List<T>): List<T> = TODO("define the head function for a list of any type")

fun sum(list: List<Int>): Int = TODO("define sum in terms of head and tail")

// Extra exercise, use extension functions for the head and tail

fun sumTail(list: List<Int>): Int = TODO("same but tail recursive")