package session3.tailRecursion

fun sum(n: Int): Int = if (n < 1) 0 else n + sum(n - 1)

fun corecursiveSum(n: Int): Int = TODO("write the corecursive version of sum")