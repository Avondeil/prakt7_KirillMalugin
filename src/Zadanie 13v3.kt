//Задание 3, номер 13, практическая работа 7
fun main(){
    try{
    print("Введите x1: ")
    var x1= readLine()!!.toDouble()
    print("Введите y1: ")
    var y1= readLine()!!.toDouble()
    print("Введите x2: ")
    var x2= readLine()!!.toDouble()
    print("Введите y2: ")
    var y2= readLine()!!.toDouble()
    print("Введите x3: ")
    var x3= readLine()!!.toDouble()
    print("Введите y3: ")
    var y3= readLine()!!.toDouble()
    var z1:Double
    var z2:Double
    var z3:Double
    var p:Double
    var s:Double
    z1=Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0))
    z2=Math.sqrt(Math.pow((x3-x2),2.0)+Math.pow((y3-y2),2.0))
    z3=Math.sqrt(Math.pow((x1-x3),2.0)+Math.pow((y1-y3),2.0))
    p=(z1+z2+z3)
        println("Периметр: $p")
        p=p/2
    s=(Math.sqrt(p*(p-z1)*(p-z2)*(p-z3)))
    print("Площадь: $s")}
    catch (e:Exception){
        println("Ошибка ввода данных!")
    }
}