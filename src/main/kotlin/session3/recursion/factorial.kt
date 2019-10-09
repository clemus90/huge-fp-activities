package session3.recursion

//val factorial: (Int) -> Int = TODO("write a recursive factorial")
val factorial: (Int) -> Int by lazy { { value: Int -> if(value == 0) 1 else value * factorial(value - 1) } }