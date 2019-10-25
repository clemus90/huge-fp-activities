package session3.memoization

import java.math.BigInteger

fun <T, U> foldLeft(list: List<T>, initial: U, f: (U, T) -> U): U = TODO("use the solution of foldLeft previusly coded")

fun <T> iterate(seed: T, f: (T) -> T, n: Int): List<T> = TODO("Given a seed and an increment function, return n elements")

fun <T, U> map(f: (T) -> U, list: List<T>): List<U> = TODO("map each element of the list using f")
// Extra: Use foldLeft

// Hint think of fibonacci as the following sequence (1, 1), (1, 2), (2, 3), (3, 5), (5, 8)
fun fiboIterative(n: Int): String = TODO("Write fibonacci in terms of iterate and map")

val cache = mutableMapOf<Int, Int>()

fun double(x: Int) =
    if (cache.containsKey(x)) {
        cache[x]
    } else {
        val result = x * 2
        cache.put(x, result)
        result
    }