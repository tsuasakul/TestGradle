package com.a

import kotlin.math.sqrt

class MaybePrimeInt(val value: Int) : MaybePrimeNumber {
    private fun isEvenlyDividedBy(denominator: Int) = value.rem(denominator) == 0

    override fun toString(): String {
        return value.toString()
    }
    override fun isPrimeNumber(): Boolean {
        // https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        // https://stackoverflow.com/questions/5811151/why-do-we-check-up-to-the-square-root-of-a-prime-number-to-determine-if-it-is-pr
        return when {
            (2..sqrt(value.toDouble()).toInt()).any(::isEvenlyDividedBy) -> false
            else -> value > 1
        }
    }
}