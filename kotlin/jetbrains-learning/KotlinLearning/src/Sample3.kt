import java.text.DecimalFormat

fun customFormat(pattern: String, value: Double) {
    val myFormatter = DecimalFormat(pattern)
    val output = myFormatter.format(value)
    println("$value $pattern $output")
}

fun main() {
    customFormat("###,###.###", 123456.789)
    customFormat("###.###", 123456.789)
    customFormat("000000.000", 123.78)
    customFormat("$###,###.###", 12345.67)
}
