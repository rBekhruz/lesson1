/////////////////////////////////////////
//       code                          //
//              by                     //
//                    Bekhruz          //
/////////////////////////////////////////

//ООП

import java.lang.Exception
import java.util.Stack

//Book

//1
//fun main() {
////    val str: Student = Student() // пустой конструктор
////    str.name = "Behruz"
////    println(str.name)
//
//    val book1: Book = Book()
//    book1.year = 2009
//
//    val book2: Book = Book()
//    book2.year = 2011
//
//    val book3: Book = Book()
//    book3.year = 2010
//
//    val book4: Book = Book()
//    book4.year = 2009
//
//    val book5: Book = Book()
//    book5.year = 2009
//
//    val book6: Book = Book()
//    book6.year = 2022
//
//    val book7: Book = Book()
//    book7.year = 2000
//
//    val book8: Book = Book()
//    book8.year = 1999
//
//    val book9: Book = Book()
//    book9.year = 2000
//
//    val book10: Book = Book()
//    book10.year = 2003
//
//    val book11: Book = Book()
//    book11.year = 2006
//
//    val book12: Book = Book()
//    book12.year = 2013
//
//    val book13: Book = Book()
//    book13.year = 2019
//
//    val book14: Book = Book()
//    book14.year = 2004
//
//    val book15: Book = Book()
//    book15.year = 2009
//
//    val book16: Book = Book()
//    book16.year = 2010
//
//    val book17: Book = Book()
//    book17.year = 2007
//
//    val book18: Book = Book()
//    book18.year = 2021
//
//    val book19: Book = Book()
//    book19.year = 2020
//
//    val book20: Book = Book()
//    book20.year = 2001
//
//    val listOfBooks = listOf<Book>(book1, book2, book3)
//
//    var s = 0
//
//    for(book in listOfBooks){
//        if(book.year != null) {
//            if(book.year!! >= 2010) {
//                s ++
//
//            }
//        }
//
//    }
//
//
//        println("Вышло с 2010 года: $s книг")
//
//
////    for (int i=0; i<listOfBooks.length; i++) {
////        if (listOfBooks[i].year >= 2010) {
////            //.....
////        }
////    }
//}
//
////class Student {
////    var name: String? = null
////    var surname: String? = null
////    var age: Int? = null
////    var course: String? = null
////}
//
//class Book {
//    var year: Int? = null
//}


//2
//fun main() {
//    val book1: Book = Book()
//    book1.author = "Ислом Нуридинов"
//    book1.zhanr = "Научная Фантстика"
//
//    val book2: Book = Book()
//    book2.author = "Гульнора Нуридинова"
//    book2.zhanr = "Мистика"
//
//    val book3: Book = Book()
//    book3.author = "Хуршед Джаборов"
//    book3.zhanr = "Драма"
//
//    val listOfBooks = listOf<Book>(book1, book2, book3)
//
//    for (book in listOfBooks){
//        if(book.zhanr == "Научная Фантстика"){
//            println(book.author)
//        }
//    }
//
//}
//
//class Book {
//    var author: String? = null
//    var zhanr: String? = null
//}


//3
//fun main() {
//    val book1: Book = Book()
//    book1.pereplet = "Не мягкий переплёт"
//
//    val book2: Book = Book()
//    book2.pereplet = "Не мягкий переплёт"
//
//    val book3: Book = Book()
//    book3.pereplet = "Не мягкий переплёт"
//
//    val listOfBooks = listOf<Book>(book1, book2, book3)
//
//    for (book in listOfBooks){
//        if(book.pereplet != "Не мягкий переплёт"){
//            println("Есть такие книги")
//            return
//        } else {
//            println("Нету таких книг")
//            return
//        }
//    }
//
//}
//
//class Book {
//    var pereplet: String? = null
//}


//4
//fun main() {
//    val book1: Book = Book()
//    book1.name = "Детский сад"
//    book1.translate = "Ru..."
//    book1.age_min = 6
//
//    val book2: Book = Book()
//    book2.name = "100 дней и одна ночь"
//    book2.translate = "En..."
//    book2.age_min = 12
//
//    val book3: Book = Book()
//    book3.name = "Самый богатый человек в Вавилоне"
//    book3.translate = "Tjk..."
//    book3.age_min = 18
//
//    val listOfBooks = listOf<Book>(book1, book2, book3)
//
//    for (book in listOfBooks){
//        if(book.translate == "Ru..." && book.age_min == 6) {
//            println(book.name)
//            break
//        } else {
//            println("Нет книг с переводом на Русский язык и исключительно для детей 6 лет")
//            break
//        }
//    }
//
//}
//
//class Book {
//    var name: String? = null
//    var translate: String? = null
//    var age_min: Int? = null
//}

//----------------------------------------------------------------------------------------------------------------------

//Student
//Method-1
//fun main() {
//    val islom = Student(
//        "Islom",
//        "Nuridinov",
//        "",
//        -1,
//        "Мужчина",
//        "MSU",
//        3,
//        "-",
//        listOf(
//            Predmet("Algebra", true),
//            Predmet("Geometry", false)),
//        400
//    )
//
//    islom.fullName()
//}
//
//class Student(
//    val name: String,
//    val surname: String,
//    val secondName: String,
//    val age: Int,
//    val sex: String,
//    val univer: String,
//    val cource: Int,
//    val facultet: String,
//    val listOfPredmets: List<Predmet>,
//    val stipendiya: Int
//) {
//    fun fullName() {
//        println("$name $surname $secondName")
//    }
//}
//
//class Predmet(val name:String, val form: Boolean)


//2
//fun main() {
//    val islom = Student(
//        "Islom",
//        "Nuridinov",
//        "",
//        -1,
//        "Мужчина",
//        "MSU",
//        3,
//        "-",
//        listOf(
//            Predmet("Algebra", true),
//            Predmet("Geometry", false)),
//        400
//    )
//
//    islom.talk()
//}
//
//class Student(
//    val name: String,
//    val surname: String,
//    val secondName: String,
//    val age: Int,
//    val sex: String,
//    val univer: String,
//    val cource: Int,
//    val facultet: String,
//    val listOfPredmets: List<Predmet>,
//    val stipendiya: Int
//) {
//    fun talk() {
//        println("Сообщение")
//    }
//}
//
//class Predmet(val name:String, val form: Boolean)


//3
//fun main() {
//    val islom = Student(
//        "Islom",
//        "Nuridinov",
//        "----",
//        -1,
//        "Мужчина",
//        "MSU",
//        3,
//        "-",
//        listOf(
//            Predmet("Algebra", true),
//            Predmet("Geometry", false)),
//        400
//    )
//
//    islom.aboutMe()
//}
//
//class Student(
//    val name: String,
//    val surname: String,
//    val secondName: String,
//    val age: Int,
//    val sex: String,
//    val univer: String,
//    val cource: Int,
//    val facultet: String,
//    val listOfPredmets: List<Predmet>,
//    val stipendiya: Int
//) {
//    fun aboutMe() {
//        println("$name\n$surname\n $secondName\n $age \n$sex \n$univer \n$cource \n$facultet \n$stipendiya")
//        for(predmet in listOfPredmets)
//            println("${predmet.name} ${predmet.form}")
//    }
//}
//
//class Predmet(val name:String, val form: Boolean)

//----------------------------------------------------------------------------------------------------------------------

//Student
//1
//fun main() {
//    val std1: Student = Student()
//    std1.faculitet = "юридический"
//
//    val std2: Student = Student()
//    std2.faculitet = "медецынский"
//
//    val std3: Student = Student()
//    std3.faculitet = "медецынский"
//
//    val listOfBooks = listOf<Student>(std1, std2, std3)
//    var s = 0
//
//    for (book in listOfBooks){
//        if(book.faculitet == "медецынский")
//            s ++
//    }
//
//    println(s)
//
//}
//
//class Student {
//    var faculitet: String? = null
//}


//2
//fun main() {
//    val std1: Student = Student()
//    std1.sex = "мужской"
//
//    val std2: Student = Student()
//    std2.sex = "мужской"
//
//    val std3: Student = Student()
//    std3.sex = "мужской"
//
//    val listOfBooks = listOf<Student>(std1, std2, std3)
//    var b = 0
//    var g = 0
//
//    for (book in listOfBooks) {
//        if (book.sex == "мужской") {
//            b++
//
//        } else {
//            g++
//
//        }
//    }
//
//    println(b)
//    println(g)
//
//}
//
//class Student {
//    var sex: String? = null
//}



//3
//fun main() {
//
//    val islom = Student(
//        "Islom",
//        listOf(
//            Predmet("Algebra", true),
//            Predmet("Geometry", false)),
//        400
//    )
//    val bekhruz = Student(
//        "Bekhruz",
//        listOf(
//            Predmet("Computer Scince", true),
//            Predmet("English", false)),
//            200
//    )
//3
//    val tekhronshoh = Student(
//        "Tekhronshoh",
//        listOf(
//            Predmet("Math", true),
//            Predmet("pc", false)),
//        400
//    )
//
//    val students = listOf<Student>(islom, bekhruz, tekhronshoh)
//
//    for(student in students)
//        if(student.stipendiya < 400)
//            student.aboutMe()
//}
//
//class Student(
//    val name: String,
//    val listOfPredmets: List<Predmet>,
//    val stipendiya: Int
//) {
//    fun aboutMe() {
//        println("$name")
//    }
//
//}
//
//class Predmet(val name:String, val form: Boolean)



//4
//fun main() {
//    val std1: Student = Student()
//    std1.faculitet = "юридический"
//
//    val std2: Student = Student()
//    std2.faculitet = "медецынский"
//
//    val std3: Student = Student()
//    std3.faculitet = "Механико - математический"
//
//    val listOfBooks = listOf<Student>(std1, std2, std3)
//    var s = 0
//
//    for (book in listOfBooks) {
//        if (book.faculitet == "Механико - математический")
//            s++
//    }
//    println(s)
//}
//
//class Student {
//    var faculitet: String? = null
//}

//------------------------------------------------------------------------------------------------------------------------

//fun main() {
//    val std1: Student = Student()
//    std1.stipendiya = "мужской"
//    std1.listOfPredmets = "мужской"
//
//    val std2: Student = Student()
//    std2.stipendiya = ""
//    std2.listOfPredmets = "мужской"
//
//    val std3: Student = Student()
//    std3.stipendiya = ""
//    std3.listOfPredmets = "мужской"
//
//    val listOfBooks = listOf<Student>(std1, std2, std3)
//    var b = 0
//    var g = 0
//
//    for (book in listOfBooks) {
//        if (book.sex == "мужской") {
//            b++
//
//        } else {
//            g++
//
//        }
//    }
//
//    listOf(
//            Predmet("Algebra", true),
//            Predmet("Geometry", false)),
//        400
//    )
//
//    println(b)
//    println(g)
//
////    std3.age = 15
////    println(std3.age)
//}
//
///*
//    public
//    private
// */
//
//class Student {
//    var stipendiya: String? = null
//    var listOfPredmets: List<Predmet> = listOf()
////    var age: Int = 0
////        set(value) {
////            if(value > 0)
////                field = value
////            else
////                throw Exception("Age must be > 0!")
////        }
//
//}
//
//class Predmet(val name:String, val form: Boolean)


//----------------------------------------------------------------------------------------------------------------------

//Animal

//fun main() {
//    val animal = Animal()
//    animal.food = "food1"
//    animal.location = "location1"
//    animal.nickName = "Dog"
//
//    val dog = Dog()
//    dog.nickName = "Dog2"
//    dog.food = "food2"
//    dog.location = "location2"
//
//    val cat = Cat()
//    cat.nickName = "Dog3"
//    cat.food = "food3"
//    cat.location = "location3"
//
//    val horse = Horse()
//    horse.nickName = "Dog4"
//    horse.food = "food4"
//    horse.location = "location4"
//
//    val list = listOf<Animal>(animal, dog, cat, horse)
//    val veterinar = Veterinar()
//
//    for(animal1 in list)
//        veterinar.treatAnimal(animal1)
//
//}
//open class Animal {
//    var nickName: String = ""
////    val address: String = ""
//    open val sound: String = ""
//    var food: String = ""
//    var location: String = ""
//
//    open fun makeNoise(){
//        println("$nickName гав гав")
//    }
//    open fun eat(){
//        println("$nickName ест")
//    }
//    open fun sleep(){
//        println("$nickName спит")
//    }
//
//}
//class Dog: Animal() {
//    override val sound: String = "Gaf Gaf"
//    override fun makeNoise(){
//        println("Dog гавкает")
//    }
//    override fun eat(){
//        println("Dog ест")
//    }
//
//    override fun sleep() {
//        println("Dog спит")
//    }
//}
//class Cat: Animal() {
//    override val sound: String = "Myau Myau"
//    override fun makeNoise() {
//        println("Cat мяукает")
//    }
//    override fun eat(){
//        println("Cat ест")
//    }
//
//    override fun sleep() {
//        println("Cat спит")
//    }
//}
//
//class Horse: Animal() {
//    override val sound: String = "Иго-го"
//    override fun makeNoise() {
//        println("Horse игогокает")
//    }
//    override fun eat(){
//        println("Horse ест")
//    }
//
//    override fun sleep() {
//        println("Horse sleep")
//    }
//}
//
//class Veterinar(){
//    fun treatAnimal(animal: Animal){
//        println("${animal.location} ${animal.food}")
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//Стек

//fun main(){
//
//}
//
//class Stack {
//    val stackList = mutableListOf<String>()
//
//    fun isEmpty(): Boolean = stackList.size == 0
//
//    fun count(): Int = stackList.size
//
//    fun push(element: String) {
//        stackList.add(element)
//    }
//
//    fun pop() {
//        stackList.removeAt(stackList.size - 1)
//    }
//
//    fun top(): String {
//            return stackList[stackList.size - 1]
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

fun main() {
    val name1 = MyString("Bekhruz")
    name1.printMyString()
}

class MyString {

    private var iString = ""

    constructor(string: String) {
        this.iString = string
    }

    constructor() {
        this.iString = ""
    }

    fun printMyString() {
        println(iString)
    }

    fun count(): Int {
    var s = 0
        for(i in iString){
            s++
        }
        return s
    }

    fun reverse(): String {
        var s = ""
        val lastIndex = MyString(iString).count()
        for(i in lastIndex - 1 downTo 0)
            s += iString[i]
        return s
    }

    fun uppercase(): String {
        var newUpperString = ""
        for(char in iString){
            if(char.code)
        }
    }
}