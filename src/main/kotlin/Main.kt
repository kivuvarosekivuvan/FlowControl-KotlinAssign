fun main() {
    odds()
    println(namesA(arrayOf("Rachael", "Rose","Moses","Pricsilla", "Amos","Mary","Joy") ) )
    party(20)
    party(6)
    party(10)
    numbers()

}
//1. Create a function that prints out all the odd numbers between 1 and 100
fun odds(){
    for( num in  0..100)
        if(num %2 ==1){
            println(num)
        } }
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun namesA(names:Array<String>):Int{
    var p=0
    for (q in names) {
        if (q.length >= 5){
            p++
        } }
    return p++
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

fun party(age:Int) {
    when (age) {
        in 1..6 -> println("Is Served : milk")
        in 6  ..15-> println("Is Served : fanta")
        else -> println("Is Served: Cocacola")
    } }

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun numbers(){
    for (num in 1..100)
        if(num % 15==0){
            println(" $num is: FizzBuzz")
        }
        else if(num % 3==0 ){
            println("$num is: Fizz")
        }
        else if(num %5==0){
            println(" $num is: Buzz")
        }
        else{
            println(num)

        }}
