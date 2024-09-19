// Exercise
// Complete the code to make the program print "Mary is 20 years old" to standard output:
// fun main() {
// val name = "Mary"
// val age = 20
//  println("$name is $age years old")
// }
// ____________________________________________________
// Exercise
// Explicitly declare the correct type for each variable:
// fun main() {

// val a : Int = 1000

// val b : String = "log message"


// val c : Double = 3.14


// val d :Long = 100_000_000_000_000

// val e :Boolean = false

// val f :Char = 'n'

// println("$a $b $c $d $e $f")
// }
// ______________________________________________________________________________________________
// Exercise 1
// You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
// fun main() {
// val greenNumbers = listOf(1, 4, 23)
// val redNumbers = listOf(17, 2)
// println(greenNumbers.count())
// println(redNumbers.count())
// println(greenNumbers.count() + redNumbers.count())
// }
// ______________________________________________________________________________
// Exercise 2
// You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol
// is supported or not (isSupported must be a Boolean value).
// fun main() {
// val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
// val requested = "smtp"
// 1-// val isSupported  = requested.uppercase() in SUPPORTED
// 2-// if (SUPPORTED.contains(requested)) true else false
// println("Support for $requested: $isSupported")
// }
// ____________________________________________________________________________________
// Exercise 3
// Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
// fun main() {
// val number2word = mapOf(1 to "o n e", 2 to "t w o", 3 to "t h r e e")// Write your code here
// val n = 2
// println("$n is spelt as '${number2word[n]}'")
// }
// ___________________________________________________________________________________________



// Exercise 1
// Define a data class Employee with two properties: one for a name, and another for a salary. Make sure that the property for salary is mutable, otherwise you won’t
// get a salary boost at the end of the year! The main function demonstrates how you can use this data class.



// data class Employee (val name:String,var salary:Int){

// }
// fun main() {
// val emp = Employee("Mary", 20)
// println(emp)
// emp.salary += 10
// println(emp)
// }
// _______________________________________________________________________________
// Exercise 2
// To test your code, you need a generator that can create random employees. Define a class with a fixed list of potential names (inside the class body), and that is
// configured by a minimum and maximum salary (inside the class header). Once again, the main function demonstrates how you can use this class.
// Hint
// Lists have an extension function called .random() that returns a random item within a list.
// Hint
// Random.nextInt(from = ..., until = ...) gives you a random Int number within specified limits.







// import kotlin.random.Random
//  data class Employee(val name: String, var salary: Int)
//   class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int)
//    { val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
//     fun generateEmployee() = Employee(names.random(),
//      Random.nextInt(from = minSalary, until = maxSalary)) } 
//      fun main() {
//         val empGen = RandomEmployeeGenerator(10, 30)
//         92
//         println(empGen.generateEmployee())
//         println(empGen.generateEmployee())
//         println(empGen.generateEmployee())
//         empGen.minSalary = 50
//         empGen.maxSalary = 100
//         println(empGen.generateEmployee())
//         }
//     println(empGen.generateEmployee())
//      println(empGen.generateEmployee())
//       println(empGen.generateEmployee())
//        empGen.minSalary = 50
//     empGen.maxSalary = 100 
//     println(empGen.generateEmployee()) }