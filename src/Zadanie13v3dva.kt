//Задание 3, номер 13, часть 2, практическая работа 7
fun main() {
    print("Введите a: ")
    var a = readLine()!!.toDouble()
    print("Введите b: ")
    var b = readLine()!!.toDouble()
    print("Введите k: ")
    var k = readLine()!!.toDouble()
    var res = doubleArrayOf()
    var n: Int = 0
    if (a == 0.0) {
        res[n] = ((-b / k), 0.0)
        n++
    } else if (b == 0.0) {
        res[n] = (0.0, 0.0)
        n++
    } else if (k == 0.0)
    {
        res[n] = (a / b, b)
        n++
    }
    else  var d = b * b + 4 * k * a
    if (d > 0) {
        var x = (-b - d * 0.5) / (2 * a)
        var y = k * x + b
        res[n]=(x, y)
        n++
        x = (-b + d * 0.5) / (2 * a)
        y = k * x + b
        res[n]=(x, y)
        n++
    } else if (d < 0) {
        var x = b / (2 * a)
        res[n]=(x, k * x + b)
        n++
    }
}