//Задание 1,номер 8, практическая работа 7
fun main (){
    try {
        print("Введите числитель: ")
        var one = readLine()!!.toDouble()
        print("Введите знаменатель: ")
        var two = readLine()!!.toDouble()
        var x = one / two
        var z: Double
        z = 5*Math.pow(x, 3.0) + 70 * Math.pow(x, 2.0) + 14 * x
        println("Значение многочлена по формуле: ${String.format("%.3f", z)}")
    } catch(e:Exception){print("Ошибка при вводе")}
}