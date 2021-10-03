fun main(){

}

// Jeśli interfejs posiada metodę bez body to wtedy musimy ją override w klasie
// w której ją implementujemy

interface Person1111{
    fun bar()
    fun foo(){}
}

class Child : Person1111 {
    override fun bar() {
        TODO("Not yet implemented")
    }

}

//You can declare properties in interfaces. A property declared in an
// interface can either be abstract or provide implementations for accessors

