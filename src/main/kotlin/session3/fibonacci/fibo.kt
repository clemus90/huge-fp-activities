package session3.fibonacci

import java.math.BigInteger

fun fibonacci(n: Int): Int =
    if (n == 0 || n == 1)
        1
    else
        fibonacci(n - 1) + fibonacci(n - 2)


//fun tailFibonacci(n: BigInteger): BigInteger = TODO("make fibonacci tail recursive")

fun tailFibonacci(n:BigInteger): BigInteger {
    tailrec fun rec(nMinus2: BigInteger, nMinus1: BigInteger, current: BigInteger):BigInteger =
        if(n==current)
            nMinus1 + nMinus2
        else
            rec(nMinus1, nMinus1 + nMinus2, current + BigInteger.ONE)
    return rec(BigInteger.ONE,BigInteger.ONE, BigInteger.valueOf(2))
}