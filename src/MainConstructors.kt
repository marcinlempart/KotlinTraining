// ZADANIA
// 1. Stworzyć


fun main (){
    val person1 = Person1("Marcin")
    person1.name
    person1.printInfo()

    val person2 = Person2("Marcin")
    person2.printInfo()

    val person3 = Person3("Marcin", 23)
    val person4 = Person4("Marcin", 23)
    println("Person4: ${person4.age}")

    val person5 = Person5("Marcin", "Lempart", 33)
    person5.name

    val student = Person6("Marcin", 32)
    println("Id student${student.id}")

}


class Person1(val name: String){

    fun printInfo(){
        println("printInfo: name: $name")
    }
    // init blok pojawia się po tym jak pojawi się primary konstruktor
    // We can also access class fields in this place.
    //A class can have one or more init blocks.
    init{
        println("To jest init blok Person1")
    }
}

// Jeśli wcześniej zainicjalizujemy w konstruktorze jakąś właściwość to nie
// musimy wtedy w konstruktorze objać tej wartości

class Person2 (val name: String, val age: Int = 16){
    fun printInfo(){
        println("name: $name")
    }
}

// Tutaj będziemy mieli dostęp tylko do name poprzez personName
class Person3 (name: String, age: Int){
    val personName = name
}

//Niezależnie od tego czy zastosujemy var czy val to uzyskamy taką
// możliwość że zostanie stworzona właściwość i będziemy mieli do niej dostęp
// inicjalizujemy poprzez konstruktor w nazwie klasy

class Person4 (var name: String, var age: Int = 16){
    fun printInfo(){
        println("name: $name")
    }
}

//In a Kotlin class, we can also declare one or more secondary constructors.
// Secondary constructors are prefixed with the constructor keyword

// tworząc secondary contructor trzeba się odwołać do konstruktora primary

class Person5(val name: String){

    constructor(name2: String, surname: String) : this(name2)
    constructor(name2: String, surname: String, age: Int) : this(name2)
}


class Person6 (var name3: String) {

    init{
        println("Student has got a name as $name3")
    }

    var id : Int =-1
    constructor(sectionName: String, id: Int): this(sectionName) {
        this.id= id
    }
}




