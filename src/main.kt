
fun main(args: Array<String>) {

    var a = 11
    var b = 5

    var ans1 = 0
    ans1 = a % b
    print("$ans1 \n")


    var isCompare = a!= b
    print("$isCompare \n")

    var ourAnswer = 0
    ourAnswer  += 1



    println ("addition: $a + $b = ${a + b}")
    println ("subtraction: $a - $b = ${a - b}")
    println ("multiplication: $a * $b = ${a * b}")
    println ("division: $a / $b = ${a / b}")
    println("comparison: $a > $b:  ${a > b}")
    println("increment for five counts $a += 1-5 :")
    for (i in 1..5 ) {
       a+=i
       println(a)
    }
}



