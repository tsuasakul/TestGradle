import com.a.MaybePrimeInt

fun main() {
    val numbers = (1..100).map { MaybePrimeInt(it) }
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)
}

