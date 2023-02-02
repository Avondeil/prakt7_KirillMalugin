import kotlin.math.tan

//Задание 2, номер 23, практическая работа 7
fun main(){
    try {
        print("Введите количество углов n-угольника: ");
        var n = readLine()!!.toInt()
        print("Введите длину стороны $n-угольника: ");
        var long = readLine()!!.toDouble()
        if (n>0 && long>0)
        {
        print("Введите радиус окружности: ")
        var r = readLine()!!.toDouble();
        var p = 2 * n * r * tan(Math.PI / n)
        println("p=${String.format("%.3f", p)}")}
        else println("Ввод отрицательных значений запрещен! Повторите попытку")
    }
    catch(e:Exception) {
        println("Ввод неккоректных данных!")
    }
}