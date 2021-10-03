// 1. Napisać dwie klasę shape (2 metody: open draw, fill). Następnie sprawdzamy czy możemy
// dziedziczyć

// 2. Napisać klasę Person (base) wraz z parametrem p: Int
// dziedzimy Person w klasie Mag. Co musimy zrobić z parametrem p z konstruktora z klasy bazowej

// 3. Napisać właściwość którą można nadpisać o raz taką którą nie można nadpisać.

// 4. Czy val posiada set?

fun main(){


    val kolo = Circle()
    kolo.draw()
}

// classes in Kotlin have a common superclass Any
// Any has three methods: equals(), hashCode(), and toString().
// Thus, these methods are defined for all Kotlin classes.

open class Person(p: Int)
class Mag(p: Int) : Person(p)

// If the derived class has a primary constructor, the base class can
// (and must) be initialized in that primary constructor according to its parameters.



// Kotlin requires explicit modifiers for overridable members and overrides:*/
open class Person111(p: Int){
    open fun metoda(){}
    fun metoda2(){}
}

class Mag1(p: Int) : Person111(p){

}

// W klasie Circle jeśli dziedziczymy po draw to musimy dać keyword override
// po metodzie fill nie możemy dziedziczyć ponieważ nie ma open, więc domyślnie jest final

open class Shape {
    open fun draw() {
        println("Pięknie działa")
    }
    fun fill() {}

    open val vertexCount: Int = 0
    val vertexCountB: Int = 10
}


class Circle() : Shape() {
    override open fun draw(){
        println("Pięknie działa 2")
    }


        override val vertexCount = 4

}


