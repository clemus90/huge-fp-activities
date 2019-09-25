package session2.composition

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

// Exercise 3
fun compose(f: Nothing, g: Nothing): Nothing = TODO("write the compose function")

// Exercise 4
fun polymorphicCompose(f: Nothing, g: Nothing): Nothing = TODO("write the compose function")

fun main() {
    println(square(triple(2)))
}