package session2.exercise1

class Person(val name: String)

fun main() {
    val cacique = Person("Diomedes Diaz")
    val el10deLosPases = Person("Diomedes Diaz")
    println("El cacique es el 10 de los pases: ${cacique == el10deLosPases}")
}