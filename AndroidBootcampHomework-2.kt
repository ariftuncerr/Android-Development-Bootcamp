fun main(){
    println( celsiusToFahrenheit(10.2))
    perimeterRectangle(12.1,10.2)
    println(factorial(12))
    numberOfA("ArifariflecodeTime")
    println(calculateSalary(21))
    println(calculateInternetPrice(51))

}


fun celsiusToFahrenheit(celsius : Double) : Double{
    return (celsius*1.8) + 32
}
fun perimeterRectangle(width : Double, height : Double){
    println("Rectangle Perimeter is : ${width*2 + height*2}")
}
fun factorial(n : Int): Int {
    var value = 1
    for (i in 1..n){
        value *= i
    }
    return value
}
fun numberOfA(str : String){
    var i = 0
    var counter = 0
    while (i < str.length){
        if(str[i] == 'a' || str[i] == 'A'){
            counter++
        }
        i++
    }
    println("String includes number of $counter a")
}

//Homework 2.2
fun sumOfInsideAngle(numberOfEdge : Int): Int {
    return (numberOfEdge-2)*180
}
fun calculateSalary(day : Int) : Double {
    val workingHours = day*8
    if(workingHours >= 160){
        var extraTimePrice : Double= (workingHours- 160) *20.0
        var normalTimePrice : Double = 10*160.0
        return extraTimePrice + normalTimePrice

    }
    else{
        return workingHours*10.0
    }

}
fun calculateInternetPrice(limit : Int) : Double{
    if(limit <= 50 )
        return 100.0
    else{
        return  ((limit-50)*4) + 100.0
    }
}
