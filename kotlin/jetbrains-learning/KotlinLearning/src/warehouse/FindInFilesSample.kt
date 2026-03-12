package warehouse

fun main() {
    val warehouse = Warehouse()
    warehouse.addFruits("peach", 3)
    warehouse.addFruits("pineapple", 5)
    warehouse.addFruits("mango", 1)
    warehouse.addFruits("orange", 5)
    val result = warehouse.takeFruit("orange")
    if (result) {
        println("This orange was delicious!")
    }
    warehouse.printAllFruits()
}