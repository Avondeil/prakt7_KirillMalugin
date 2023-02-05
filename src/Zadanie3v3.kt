//Задание 3, номер 3, практическая работа 7
fun main(){
    try{
    print("Введите длину окружности: ")
    var l=readLine()!!.toDouble()
    var r:Double
    if (l>0)
    {
        r=l/(2*Math.PI)
        var S:Double=Math.PI*Math.pow(r,2.0)
        println("Площадь окружности: $S")
    }
    else println("Длина окружности не может быть отрицательным числом")
    } catch (e:Exception){
        println("Неккоректный ввод данных")
    }
}