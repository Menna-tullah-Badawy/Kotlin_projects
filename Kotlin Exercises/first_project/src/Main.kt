//fun main() {
//    val grade = 50
//
//    val result = when {
//        grade >= 90 -> "A"
//        grade >= 80 -> "B"
//        grade >= 70 -> "C"
//        grade >= 60 -> "D"
//        else -> "F"
//    }
//
//    println(result)
//}
//fun main() {
//    val x = add(arrayOf(1, 2, 3, 4, 5, 6))
//    println("Sum of even numbers: $x")
//}
//
//fun add(y: Array<Int>): Int {
//    var sum = 0
//    for (num in y) {
//        if (num % 2 == 0) {
//            sum += num
//        }
//    }
//    return sum
//}
//__________________________________________________________________
//var->نعدل ونقراالقيمةو
//val->نقرأونديها قيمه واحدة بس
//:->لتحديد نوعة اي
//:: -> لمعرفة هو تبع اني class
//string يكتب داخل ""
//char يكتب داخل ''
//.isBlank->تبع الbooleanبترجعلي صح وخطأ

//fun main() {
//    var firstName = "Ahmed"
//    firstName = "menna"
//val age =12
//    println(firstName)
//    println(age)
//
//}
//___________________________________________________________________
//fun main(){
////    بيعمل مسافة
//val message:String="""
//    hello,
//    my name is menna.
//    how are you?
//""".trimIndent()
//    println(message)
////بيحط
//    val message2:String="""
//    hello,
//    my name is Ahmed.
//    how are you?
//""".replaceIndent( "-")
//    println(message2)
////بيشيل
//    val message3:String="""
//   - hello,
//   - my name is Ahmed.
//   - how are you?
//""".trimMargin( "-")
//    println(message3)
//
//
//}
//___________________________________________________________________
// return ->عشان ببعت قيمه محددة 
// fun main(){
//     sayHello2()
//     var x =sayHello()
//     println(x)

// }

// fun sayHello():String{
//     return "hello"
// }
// fun sayHello2(){
//     println("menna") 
// }
// __________________________________________________________________
// عشان اعمل داله جوه دالة بس مش الاصلية لازم اخد بالي عشان الدالة الابن بتكون جوه دالة الاب
// fun main(){
// sayHello()
// }

// fun sayHello(){
// println("sayHello")
// fun menna(){
//     println("menna")
// }
// menna()
// }
// ____________________________________________________












// _______________________________________________________________

// fun main(){
//     val x :MutableList<String> =mutableListOf("a","b","c","d")
//     x.add("e")
//     x.remove("c")
    
//     x.addAll(mutableListOf("f","Z"))
//     println(x)
//     println(x.count())
// }
// fun main(){
//     fun main() {
//         val x = (1..100).toList()  
//         val y = x.filter { it % 2== 0 } 
//         val a = x.filter { it % 2 != 0 } 
//         println(y)
//         println(a)
//     }

   
       
      
    
    
    // fun main() {
    //     val x = (1..100).toList()  
    //     val y = x.filter { it % 2 == 0 }  
    //     val a = x.filter { it % 2 != 0 }  
    //     println(y)  
    //     println(a)  
    // }
    


   
// data class User(
//     var name:String,
//     var id:Int)
   
// fun main(){
//     val user1 = User("menna",1)
//     val user2 = User("Ahmed",2)
// println(user1)
// }
// __________________________________________________________________
// with nerds (oop)
// data class Student(
//     val name: String,
//     val age: Int,
//     val degreeList: List<Double>
// )

// fun calculateAverage(degrees: List<Double>): Double {
//     return degrees.sum() / degrees.size
// }

// fun getGrade(average: Double): String {
//     return when {
//         average >= 90 -> "A"
//         average >= 80 -> "B"
//         average >= 70 -> "C"
//         average >= 60 -> "D"
//         else -> "F"
//     }
// }

// fun main() {
//     val students = listOf(
//         Student("menna", 16, listOf(95.0, 88.5, 92.0)),
//         Student("ahmed", 17, listOf(85.0, 78.5, 82.0)),
//         Student("jody", 16, listOf(75.0, 68.5, 72.0)),
//         Student("Karma", 17, listOf(65.0, 58.5, 62.0))
//     )

//     val studentGrades = students.groupByTo(mutableMapOf()) { student ->
//         getGrade(calculateAverage(student.degreeList))
//     }.mapValues { (_, students) ->
//         students.map { it.name }
//     }

//     println("Grade A Students: ${studentGrades["A"]}")
//     println("Grade B Students: ${studentGrades["B"]}")
//     println("Grade C Students: ${studentGrades["C"]}")
//     println("Grade D Students: ${studentGrades["D"]}")
// }

// open class Animal(val name: String) {
//     open fun makeSound() {
//         println("makes a sound")
//     }
// }

// class Dog(name: String, val breed: String) : Animal(name) {
//     override fun makeSound() {
//         println(" barks")
//     }
// }


// class Cat(name: String, val color: String) : Animal(name) {
//     override fun makeSound() {
//         println("meows")
//     }
// }

// fun main() {
//     val dog = Dog("d", "Black")
//     val cat = Cat("c", "white")

//     dog.makeSound()
//     cat.makeSound()
// }





// interface Animal {
   
//     fun makeSound()
// }


// class Dog : Animal {
//     override fun makeSound() {
//         println(" barks")
//     }
// }


// class Cat : Animal {
//     override fun makeSound() {
//         println(" meows")
//     }
// }

// fun main() {
//     val dog = Dog()
//     val cat = Cat()

//     dog.makeSound()
//     cat.makeSound()
// }



// abstract class Animal(val name: String) {
//     abstract fun makeSound()
// }
// class Dog(name: String) : Animal(name) {
//     override fun makeSound() {
//         println("The dog barks")
//     }
// }


// class Cat(name: String) : Animal(name) {
//     override fun makeSound() {
//         println("The cat meows")
//     }
// }

// fun main() {
//     val dog = Dog("Buddy")
//     val cat = Cat("Whiskers")

//     dog.makeSound()
//     cat.makeSound()
// }


// interface Animal {
    
//     fun makeSound()
// }


// abstract class Pet(val name: String) : Animal {
//         fun printName() {
//         println("My name is $name")
//     }
// }


// class Dog(name: String) : Pet(name) {
//     override fun makeSound() {
//         println(" barks")
//     }
// }

// class Cat(name: String) : Pet(name) {
//     override fun makeSound() {
//         println(" meows")
//     }
// }

// fun main() {
//     val dog = Dog("b")
//     val cat = Cat("c")

//     dog.printName()
//     dog.makeSound()

//     println()

//     cat.printName()
//     cat.makeSound()
// }
