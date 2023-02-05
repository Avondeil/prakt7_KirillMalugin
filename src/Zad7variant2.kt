import kotlin.math.tan
//Задание 1,номер 7(2), практическая работа 7
fun main(){
    try {
        print("Введите x: ")
        var x = readLine()!!.toDouble()
        print("Введите y: ")
        var y = readLine()!!.toDouble()
        print("Введите x: ")
        var z = readLine()!!.toDouble()
        var a: Double
        var b: Double
        a = (Math.sqrt(3 + Math.pow(Math.E, y - 1))) / 1 + Math.pow(x, 2.0) * Math.abs(y - tan(z))
        b = 1 + Math.abs(y - x) + (Math.pow(y - x, 2.0)) / 2 + Math.pow(Math.abs(y - x), 3.0) / 3
        println("a=${String.format("%.3f", a)}")
        println("b=${String.format("%.3f", b)}")
    } catch (e:Exception){println("Неккоректный ввод данных!")}
}