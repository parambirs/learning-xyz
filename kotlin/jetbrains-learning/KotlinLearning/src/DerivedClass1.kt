open class DerivedClass1 : SomeInterface {
    override fun foo(demo: Any) {
        println("demo")
    }
}

class SecondLevelClassA : DerivedClass1() {
    override fun foo(demo: Any) {
        println("foo")
    }
}

class SecondLevelClassB : DerivedClass1()
