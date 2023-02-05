fun main(){
    try {
        print("Введите x: ")
        var x = readLine()!!.toDouble()
        print("Введите y: ")
        var y = readLine()!!.toDouble()
        print("Введите z: ")
        var z = readLine()!!.toDouble()
        var U: Double
        if (x < z) {
            U = Math.max(x, y)
            println("U=$U")
        } else {
            U = Math.min(x, y)
            println("U=$U")
        }
    }
    catch (e:Exception)
    {
        println("Неккоректный ввод данных!")
    }
}