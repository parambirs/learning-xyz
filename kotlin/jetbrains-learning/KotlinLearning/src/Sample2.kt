import java.io.BufferedReader
import java.io.FileReader

fun readStrings(): List<String> {
    return BufferedReader(FileReader("input.txt")).readLines()
}

fun main() {
    val list = readStrings()
    val filtered = list.filter { it.isNotEmpty() }
    filtered.forEach {
        println(it)
    }
}

const val A_CONST = 10000
const val B_CONST = 500

class Processor {
    companion object {
        fun process(a: Int, b: Int): Int {
            return a * b + A_CONST
        }
    }
}

fun calc() {
    Processor.process(A_CONST, B_CONST)
}
