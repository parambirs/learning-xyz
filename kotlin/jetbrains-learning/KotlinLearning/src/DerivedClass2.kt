class DerivedClass2 : SomeInterface {
    override fun foo(demo: Any) {
        println(demo.javaClass.name)
    }
}
