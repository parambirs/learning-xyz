interface Engine {
    fun callStarter()
}

interface Wheel {
    fun rotateClockwise(angle: Float)
    fun rotateCounterClockwise(angle: Float)
}

class CheckEngineException : Exception()

@Throws(CheckEngineException::class)
fun Engine.startEngineAndLog() {
    callStarter()
    println("Engine started!")
}

fun Wheel.rotateWheel(angle: Float) {
    if (angle > 0) {
        rotateClockwise(angle)
    } else {
        rotateCounterClockwise(angle)
    }
}
