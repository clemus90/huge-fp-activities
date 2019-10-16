package session3.recAndLists

fun <T, U> foldLeft(list: List<T>, initial: U, f: (U, T) -> U): U = TODO("abstract corecursive style functions")

fun foldedSum(list: List<Int>): Int = TODO("sum using foldLeft")

fun foldedToString(list: List<Char>): String = TODO("toString using append and foldLeft")

fun <T>foldedMakeString(list: List<T>, delim: String): String = TODO("makeString using foldLeft")

fun <T, U> foldRight(list: List<T>, seed: U, f: (T, U) -> U): U = TODO("abstract recursive style functions")

fun rightFoldedToString(list: List<Char>): String = TODO("toString using prepend and foldRight ")