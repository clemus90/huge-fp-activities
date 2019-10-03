package session3.corecursion

fun append(s: String, c: Char): String = "$s$c"

fun toString(list: List<Char>, s: String): String =
    TODO("implement a sublist and index based to string, making use of append")

fun moreIdiomaticToString(list: List<Char>, s: String): String =
    TODO("A more idiomatic to string using drop and first")

fun cleanToString(list:List<Char>): String =
    TODO("An implementation that doesn't require de string seed")