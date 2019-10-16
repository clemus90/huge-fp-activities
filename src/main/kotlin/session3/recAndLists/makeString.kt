package session3.recAndLists

fun <T> List<T>.head(): T = TODO("define the head function for a list of any type")
fun <T> List<T>.tail(): List<T> = TODO("define the head function for a list of any type")

fun <T> makeString(list: List<T>, delim: String): String =
    when {
        list.isEmpty() -> ""
        list.tail().isEmpty() -> "${list.head()}${makeString(list.tail(), delim)}"
        else -> "${list.head()}$delim${makeString(list.tail(), delim)}"
    }

fun <T> makeStringTail(list: List<T>, delim: String): String = TODO("makeString but tail recursive")