fun functionWithUnusedParameter(used: String) {
    println("It is used parameter: $used")
}

fun getHello(): String = "Hello!"

fun main() {
    functionWithUnusedParameter("first")
    functionWithUnusedParameter("used")
    getHello()
}

private const val INITIAL = 173

fun createList(): List<Int> = listOf(INITIAL)

object TestObject

fun smartCompletionDemo(): TestObject {
    val iterations = 5
    repeat(iterations) {
        println("Hello")
    }

    return TestObject
}
