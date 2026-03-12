import java.awt.Color

abstract class Scratch {
    abstract fun someMethod(string1: String, string2: String, string3: String)

    fun exampleMethod(condition: Boolean) {
        if (condition) {
            System.err.println("Beginning of the work")
            someMethod("first string", "second string", "third string")
            System.err.println("End of the work")
        }
    }
}

class MoveDemo : Thread() {
    var started = false

    private fun printDebugMessage() {
        println("Hello from a thread!")
    }

    override fun run() {
        started = true
        printDebugMessage()
    }
}

fun main() {
    val hue = 5f
    val saturation = 10f
    val brightness = 10f

    val rgb = Color.HSBtoRGB(hue, saturation, brightness)
    val red = rgb shr 16 and 0xFF
    val green = rgb shr 8 and 0xFF
    val blue = rgb and 0xFF
    println("r=$red, g=$green, b=$blue")

    MoveDemo().start()
}
