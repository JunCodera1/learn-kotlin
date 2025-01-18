import java.math.BigInteger

fun powerBig(a: BigInteger, b: Int): BigInteger {
    var result = BigInteger.ONE
    repeat(b) {
        result = result.multiply(a)
    }
    return result
}

fun main() {
    val a = BigInteger("2")
    val b = 100
    val result = powerBig(a, b)
    println("$a pow $b = $result")
}
