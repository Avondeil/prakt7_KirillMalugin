//Задание 1, номер 3, практическая работа 7
fun main (){
    try{
        print("Введите первое число прогрессии ")
        var K = readLine()!!.toDouble()
        print("Введите знаменатель ")
        var P =readLine()!!.toDouble()
        print("Введите номер 1 элемента ")
        var kol1 = readLine()!!.toInt()
        print("Введите номер 2 элемента ")
        var kol2 = readLine()!!.toInt()
        var sum=0
        var a:Double
        if (kol1>0 && kol2>0)
        {
            if (kol1<kol2)
            {
                for (g in kol1..kol2)
                {
                    if (g==1)
                    {
                        a=K
                        sum= (sum + a).toInt();
                    }
                    if (g>1)
                    {
                        a=K*Math.pow(P, (g-1).toDouble())
                        sum=(sum + a).toInt();
                    }
                }
                println(sum)}
            else print("Номер 1 должен быть меньше 2 номера (num1<num2)")
        }else print("Введены отрицательные номера!")


    } catch (e:Exception){
        println("Неккоректный ввод данных!")
    }
}