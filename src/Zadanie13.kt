//Задание 2, номер 13, практическая работа 7
fun main(){
    try {
        print("Введите сторону a треугольника: ")
        var a = readLine()!!.toDouble()
        print("Введите сторону b треугольника: ")
        var b = readLine()!!.toDouble()
        print("Введите сторону c треугольника: ")
        var c = readLine()!!.toDouble()
        if (a>0 && b>0 && c>0) {
            var p = (a + b + c) / 2
            var h: Double
            var bisa: Double
            var m: Double
            h = (2.0 / a) * Math.sqrt(p * (p - a) * (p - b) * (p - c))
            m = 0.5 * (Math.sqrt(2.0 * Math.pow(b, 2.0) * (2.0 * Math.pow(c, 2.0)) - Math.pow(a, 2.0)))
            bisa = (2.0 * Math.sqrt(b * c * p * (p - a))) / (b + c)
            println("h=${String.format("%.3f", h)}")
            println("m=${String.format("%.3f", m)}")
            println("bisa=${String.format("%.3f", bisa)}")
        }
        else println("Сторона треугольника не может быть отрицательным числом")
    }
    catch (e:Exception)
    {println("Ошибка ввода!")}
}