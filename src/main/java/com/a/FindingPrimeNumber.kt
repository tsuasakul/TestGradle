import com.a.MaybePrimeInt

fun main() {
    val numbers = (1..1000).map { MaybePrimeInt(it) }
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)
}

