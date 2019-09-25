package session2.higherOrder

val f: (Double) -> Int = { a -> (a * 3).toInt() }
val g: (Long) -> Double = { a -> a + 2.0 }

// Exercise 7
val compose: Nothing = TODO("writer a curried Compose")

// Exercise 8
fun polymorphicCompose():Nothing = TODO("write the compose")

// Exercise 9
fun composeInverted():Nothing = TODO("invert the compose")

// Exercise 10
fun applyFirstArgument(): Nothing = TODO("apply 1st argument")

// Exercise 11
fun <A, B, C, D> func(a: A, b: B, c: C, d: D): String = "$a, $b, $c, $d"

fun curryFunc(): Nothing = TODO("Curyy func")

// Exercise 12
fun curry(): Nothing = TODO("curry any 2 arg function")

// Exercise 13
fun swap(): Nothing = TODO("curry any 2 arg function")

fun main() {

}

fun cos(arg: Double): Double {
    fun f(x: Double): Double = Math.PI / 2 - x
    fun sin(x: Double): Double = Math.sin(x)
    return compose(::f, ::sin)(arg)
}

val taxRate = 0.09
fun addTax(price: Double) = price + price * taxRate