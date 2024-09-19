// class Contact(var id: Int, val email: String) {

//     var name: String = ""

//     var age: Int = 0

//     constructor(id: Int, email: String, name: String,age :Int , newE:String) : this(id, email) {

//             this.age = age
//         this.name = name
//         println("$newE")
//     }
// }

// fun main() {
//     // استخدام الباني الأساسي
//     val contact1 = Contact(1, "e@gmail.com")
//     // println("ID: ${contact1.id}, Email: ${contact1.email}, Name: ${contact1.name}")  // Output: ID: 1, Email: e@gmail.com, Name: 

//     // استخدام الباني الثانوي
//     val contact2 = Contact(2, "e2@gmail.com", "John Doe",25,"newemail@.com")
//     // println(contact2.age)
//     // println("ID: ${contact2.id}, Email: ${contact2.email}, Name: ${contact2.name}")  // Output: ID: 2, Email: e2@gmail.com, Name: John Doe

//     // تعديل ID
//     contact1.id = 6
//     // println("Updated ID for contact1: ${contact1.id}")  // Output: Updated ID for contact1: 6
// }


// class Contact(var name: String, var age: Int ) {

//     var id: Int = 0
//     var email: String ="e@gmail.com"
//    constructor( name: String,email:String) :this (name,0)

   

//     init{
//         val uppercaseName = name.uppercase()
//         println("Name: $uppercaseName")
//     }

//     init{
//      val   ageInMonths = age * 12
//         println("Age in months: $ageInMonths")   
//      }

//      init{
//         println("$email")
//         println("ID: $id")
//      }
    
// }

// fun main() {
//     // استخدام الباني الأساسي
//     val contact1 = Contact("menna",22)
// println(contact1.name)
// println(contact1.id)
// println(contact1.email)
// println(contact1.age)




    // println("ID: ${contact1.id}, Email: ${contact1.email}, Name: ${contact1.name}")  // Output: ID: 1, Email: e@gmail.com, Name: 

    // استخدام الباني الثانوي
    // val contact2 = Contact(2, "e2@gmail.com", "John Doe",25,"newemail@.com")
    // println(contact2.age)
    // println("ID: ${contact2.id}, Email: ${contact2.email}, Name: ${contact2.name}")  // Output: ID: 2, Email: e2@gmail.com, Name: John Doe

    // تعديل ID
    // contact1.id = 6
    // println("Updated ID for contact1: ${contact1.id}")  // Output: Updated ID for contact1: 6



// // ________________________________________________________________________________________________
// //   data class Person(val name: String, val age: Int) {
// //     var city: String = "Unknown"
// //     var country: String = "Unknown"

   
// //     constructor(name: String, age: Int, city: String) : this(name, age) {
// //         this.city = city
// //     }

  
// //     constructor(name: String, age: Int, city: String, country: String) : this(name, age, city) {
// //         this.country = country
// //     }
// // }

// // fun main() {
// //     val person1 = Person("John", 30)
// //     val person2 = Person("Doe", 25, "New York")
// //     val person3 = Person("Alice", 28, "Los Angeles", "USA")

// //     val ageS:String = "30"
// //     println(person1.age.toString() == ageS )

// //     val (name , id) = person1
// //     println("Name: $name, ID: $id")

// //     val newPerson = person1.copy(name = "menna")
// //     println(newPerson.name)

// //     println(person1.age.toString())

// //     println(person1.hashCode())

// //     println(person1 == person2)
   



// //     println("Person1: name=${person1.name}, age=${person1.age}, city=${person1.city}, country=${person1.country}") 
// //     println("Person2: name=${person2.name}, age=${person2.age}, city=${person2.city}, country=${person2.country}") 
// //     println("Person3: name=${person3.name}, age=${person3.age}, city=${person3.city}, country=${person3.country}")  
// // }
// // -------------------------------------------------------------------------
// // inheritance
// // open class A(val name: String){
// //     var email:String ="e@gmail.com"
// // }

// // class B(name: String, val age: Int,email :String) : A(name){
   
// // }

// // fun main() {
// //     val a = A("menna")
// //     val b = B("ali", 25,"email")
// //     println(a.name) 
// //     println(a.email) 
// //     println(b.name) 
// //     println(b.age) 
// //     println(b.email) 
// // }
// // ____________________________________________________


// open class Base(val name: String)

// class Derived : Base {
//     var age: Int

//     constructor(name: String, age: Int) : super(name) {
//         this.age = age
//     }

//     constructor(name: String, age: Int, extra: String) : super(name) {
//         this.age = age
//         println("Extra parameter: $extra")
//     }
// }

// fun main() {
//     val derived1 = Derived("John", 25)
//     println("Name: ${derived1.name}, Age: ${derived1.age}")

//     val derived2 = Derived("Jane", 30, "ExtraInfo")
//     println("Name: ${derived2.name}, Age: ${derived2.age}")
// }
// ____________________________________________________



// open class Fcontact(val name : String)


// class Subcontact:Fcontact{
// var email :String
// var age :Int


// constructor(email :String,name: String, age: Int) : super(name) {
//     this.age = age
//     this.email = email
// }

// constructor(email :String,name: String, age: Int, extra: String) : super(name) {
//     this.age = age
//     this.email = email

//     println("Extra parameter: $extra")
// }
// }


// fun main(){
//     val fcontact=Fcontact("menna")
//     val subcontact1=Subcontact("e@gmail.com","menna",25)
//     val subcontact2=Subcontact("e@gmail.com","menna",25,"any")
  
    
// println(fcontact.name)
// println(subcontact1.email)
// println(subcontact1.age)
// println(subcontact1.name)
// println(subcontact2.email)
// println(subcontact2.age)
// println(subcontact2.name)

// }
// --------------------------------------------------------------------------------------

// open class Parent(val parentName:String){
//     init{
//         println("$parentName")
//     }
// }
// class Child (parentName:String,val childName :String) :Parent(parentName){
//     init{
//         println("$childName")
//     }
// }

// fun main(){
//     val child=Child("Badawy","menna")
// }
// ________________________________________________________________________________________________
// open class Parent{
//    constructor(parentName: String){
//     println("$parentName")
//    }
// }

// class Child : Parent {
//     // val childName: String ="menna"

//     constructor(parentName: String, childName: String) : super(parentName) {
//         // this.childName=childName
//         println("$childName")
//     }
//     // init{
//     //     println("$childName")
//     // }

   
// }

// fun main() {
//     val child1 = Child("parentName", "childName")
// }
// -----------------------------------------------------------------------------------------------

// open class Parent{
//     open val message : String ="MParent"
// }

// class Child:Parent(){
//     override val message : String ="MChild"
// }

// fun main(){
//     val parent=Parent()
//     println(parent.message)
//     val child=Child()
//     println(child.message)

// }


// open class Parent {
//     open fun showMessage() {
//         println("Message from Parent")
//     }
// }

// class Child : Parent() {
//     final override fun showMessage() {
//         println("Message from Child")
//     }
// }

// class GrandChild : Child() {
//     override fun showMessage() {
//         println("Message from GrandChild")
//     }
// }

// fun main() {
//     val parent = Parent()
//     parent.showMessage()  

//     val child = Child()
//     child.showMessage()  
// }

// Abstract class
// واجهة للحيوانات
// فئة مجردة رئيسية
// abstract class Animal {
//     abstract fun makeSound()

//     fun sleep() {
//         println("Zzz")
//     }
// }



// // فئة فرعية ترث من Animal
// class Dog : Animal() {
//     override fun makeSound() {
//         println("Woof")
//     }
// }

// // استخدام
// fun main() {
//     val dog: Animal = Dog()
//     dog.makeSound() // Output: Woof
//     dog.sleep() // Output: Zzz
// }

// // استخدام
// fun main() {
//     val dog: Dog = Dog()
//     dog.makeSound() // Output: Woof
//     dog.play() // Output: Playing fetch
// }



// ____________________________________________________
// fun <T : Number> List<T>.averageList(): Double  {
   
// var sum =0.0
//     for (number in this) {
//         sum += number.toDouble()
//     }

//     return sum / this.size
// }

// fun main() {
//     val numbers = listOf(1, 2, 3, 4, 5, 6.5, 8, 9, 10)
//     val average = numbers.averageList()
//     println("The average is: $average")
// }
// ________________________________________________________________________

// class A{
//     private val phone :String ="01113138839"

//   fun getPhone():String{
//     return phone
//   }
// }

// fun main(){
//     val a = A()
//     println(a.getPhone())
//     println(getPhone())
   
   
  
// }
// ________________________________________________________________________
// companion object{
//     var name:String ="Menna"
//     fun printName(){println(name)}

// }
// fun main(){

// }
// ____________________________________________________
// sealed class Contact {
//     class Email(val email: String) : Contact()
//     class Phone(val phone: String) : Contact()
// }

// fun add(s: Contact) {
//     when (s) {
//         is Contact.Email -> println("Email")
//         is Contact.Phone -> println("Phone")
//     }
// }

// fun main() {
//     val s = Contact.Email("menna@gmail.com")
//     add(s)
// }
// ________________________________________________________________________

// open class Outer {
//   protected val protectedOuterProperty: String = "Protected Outer Property"

//   inner class Inner {
//       fun accessProtectedOuter() {
//           println("Accessing protected outer property: $protectedOuterProperty")
//       }
//   }
// }

// class Subclass : Outer() {
//   fun accessProtectedProperty() {
//       // يمكن الوصول إلى الخاصية المحمية في الكلاس الخارجي المُرثى
//       println("In Subclass, accessing protected property: $protectedOuterProperty")
//   }
// }

// fun main() {
//   val outerInstance = Outer()
//   outerInstance.Inner().accessProtectedOuter()

//   val subclassInstance = Subclass()
//   subclassInstance.accessProtectedProperty()  
// }
// ______________________________________________________________________________________

// abstract class Contact {
//   abstract var allName: String

//   fun phone() {
//       println("01113138839")
//   }
// }

// class Adding(var firstName: String, var lastName: String) : Contact() {
//   override var allName: String
//       get() {
//           return "$firstName $lastName"
//       }
//       set(value) {
//           val names = value.split(" ")
//           firstName = names[0]
//           lastName = names[1]
//       }
// }

// fun main() {
//   val s = Adding("Menna", "Badawy")
//   s.phone()             // Output: 01113138839
//   println(s.allName)    // Output: Menna Badawy
//   s.allName = "New Name"
//   println(s.allName)    // Output: New Name
// }
// _______________________________________________________________________________________

// abstract class Person {
//   abstract val name: String
//   abstract val age: Int

//   fun printDetails() {
//       println("Name: $name, Age: $age")
//   }
// }

// class Student( ) : Person(){
//   override val name: String = "Menna"
//   override val age: Int = 21
// }

// fun main() {
//   val student = Student()
//   student.printDetails()  }


// تعريف كلاس مجرد يحتوي على خاصية مجردة
// abstract class Person {
//   abstract val name: String
//   abstract val age: Int

//   fun printDetails() {
//       println("Name: $name, Age: $age")
//   }
// }

// class Student(override val name: String, override val age: Int) : Person()

// fun main() {
//   val student = Student("Menna", 21)
//   student.printDetails()  // Output: Name: Menna, Age: 21
// }
// ________________________________________________________________________

// class A {
//   var name :String ="menna"
//   class B{
//     fun phone (){
//       println("01113138839")
//     }
//   }
// }

// fun main (){
//   var a = A.B()
//   a.phone()

//   val a2 =A()
//   println(a2.name)
  
// }


// ____________________________________________________
// class A {
//   var name :String ="menna"
//   inner  class B{
//     fun phone (){
//       println("01113138839")
//     }
//   }
// }

// fun main (){
//   var a = A()
//   a.B().phone()
//   println(a.name)
  
// }
// ____________________________________________________
// fun outerFunction() {
//   class LocalClass {
//       fun localFunction() = "Hello from Local Class"
//   }

//   val local = LocalClass()
//   println(local.localFunction()) // Output: Hello from Local Class
// }

// fun main() {
//   outerFunction()
// }
// ______________________________________________________________________
// class A(val name :String)

// fun A.greet(){
//   println("Hello $name")
// }

// fun main (){
//   var a = A("menna")
//   a.greet()
// }
// ________________________________________________________________________
// fun main (){
//   val str = "Hello,5World!"
//   val subStr = str.substring(7, 12)
//   println(subStr) 
  
// }

// abstract class Animal {
//   abstract fun makeSound()
// }

// abstract class Mammal {
//   abstract fun feed()
// }

// class Dog : Animal() {
//   override fun makeSound() {
//       println("Woof")
//   }
// }
// fun main() {
//   val myDog = Dog()
//   myDog.makeSound() // Output: Woof
  
// }

// interface Animal {
//   fun makeSound()
// }

// interface Pet {
//   fun play()
// }

// class Dog : Animal, Pet {
//   override fun makeSound() {
//       println("Woof")
//   }

//   override fun play() {
//       println("The dog is playing")
//   }
// }

// fun main() {
//   val myDog = Dog()
//   myDog.makeSound() 
//   myDog.play() 
// }
// abstract class Animal {
//   val numberOfLegs: Int = 4
//   abstract fun makeSound()
// }

// class Dog : Animal() {
//   override fun makeSound() {
//       println("Woof")
//   }
// }

// fun main() {
//   val myDog = Dog()
//   println(myDog.numberOfLegs) // Output: 4
//   myDog.makeSound() // Output: Woof
// }



// abstract class Animal {
//   abstract fun makeSound() // دالة مجردة بدون تنفيذ

//   fun sleep() { // دالة بتنفيذ فعلي
//       println("The animal is sleeping")
//   }
// }

// class Dog : Animal() {
//   override fun makeSound() {
//       println("Woof")
//   }
// }

// fun main() {
//   val myDog: Animal = Dog()
//   myDog.makeSound() // Output: Woof
//   myDog.sleep() // Output: The animal is sleeping
// }


// interface Animal {
//   val numberOfLegs: Int get() = 4
//   var age: Int
//   fun makeSound()
// }

// class Dog : Animal {
//   override var age: Int = 1
//       set(value) {
//           println("age is $value")
//           field = value
//       }

//   override fun makeSound() {
//       println("Woof")
//   }
// }

// fun main() {
//   val myDog = Dog()
//   println(myDog.numberOfLegs)
//   println(myDog.age)
//   myDog.age = 5
//   println(myDog.age)
//   myDog.makeSound()
// }



// ____________________________________________________
// interface Animal {
//   val numberOfLegs: Int get() = 4
//   var age: Int 
//   fun makeSound()
// }

// interface Mammal{
//   var numberOfEars : Int 
// }


// class Dog : Animal {
//   private var _age: Int =1


//   override var age: Int
//   get() = _age
//       set(value) {
//           println("age is $value")
//           _age = value
//       }

//   override fun makeSound() {
//       println("Woof")
//   }
// }


// class Cat : Animal {
//   private var _age: Int =1


//   override var age: Int
//   get() = _age
//       set(value) {
//           println("age is $value")
//           _age = value
//       }

//   override fun makeSound() {
//       println("Meow")
//   }
// }




// class  Dolphins : Animal,Mammal {

//   override val numberOfLegs: Int get() = 0



//   private var _age: Int =1
//   override var age: Int
//   get() = _age
//       set(value) {
//           println("age is $value")
//           _age = value
//       }



//       private var _numberOfEars : Int =0
//       override var numberOfEars : Int
//       get() = _numberOfEars
//       set(value) {
//           println("numberOfEars is $value")
//            _numberOfEars = value
//       }

//   override fun makeSound() {
//       println("HHHHHHHo")
//   }
  
  
// }





// fun main() {
//   val myDog = Dog()
//   println(myDog.numberOfLegs)
//   println(myDog.age)
//   myDog.age = 5
//   println(myDog.age)
//   myDog.makeSound()

// println("_________________________________________________________")

//   val myCat = Cat()
//   println(myCat.numberOfLegs)
//   println(myCat.age)
//   myCat.age = 10
//   println(myCat.age)
//   myCat.makeSound()
//   println("_________________________________________________________")

// val myDolphins = Dolphins()
//   println(myDolphins.numberOfLegs)
//   println(myDolphins.age)
//   myDolphins.age = 20
//   println(myDolphins.age)
//   myDolphins.makeSound()
// }


// enum class Direction {
//   NORTH, SOUTH, EAST, WEST
// }

// fun main() {
//   val direction = Direction.NORTH
//   when (direction) {
//       Direction.NORTH -> println("Going North")
//       Direction.SOUTH -> println("Going South")
//       Direction.EAST -> println("Going East")
//       Direction.WEST -> println("Going West")
//   }
// }

// enum class VehicleType(val maxSpeed:Int,val wheels:Int){
//    CAR(200,4), MOTORCYCLE(180,2), TRUCK(120,6)


// }

// fun main(){
//   for(vehicleType in VehicleType.values()){
// println("Vehicle: ${vehicleType.name}, Max Speed:${vehicleType.maxSpeed} km/h , Wheels:${vehicleType.wheels}")
//   }
// } 



