// 1. Zapisać defaultowe gettery i settery które pojawiają się inicjalizacji
// właściwości klasy

// 2. Napisać klasę w której będzie parametr wiek który nie będzie można przypisać poniżej 0 lat.


fun main(){

    // https://stackoverflow.com/questions/37906607/getters-and-setters-in-kotlin

    val person3 = PersonGet3(10,10)
    val person11 = PersonGet1()
    person11.age = 55
    println(person11.age)
}

// PersonGet1 oraz PersonGet2 to właściwie dwie te same klasy
// tylko że niejawnie wywołyje się get oraz set w przypadku
// gdy nie zdefiniujemy tego jawnie

var author: String = "Frank Herbert"

var author2: String = "Frank Herbert"
    get() {
        return field
    }
    set(value) {
        field = value
    }



class PersonGet1 {
    var name: String = "defaultValue"
    var age: Int = 0
        set(value){
            field = 15
        }
}

class PersonGet2 {
    var name: String = "defaultValue"
    var age: Int =0
        // getter
        get() = field

        // setter
        set(value) {
            if(value > 10)
            field = 5
        }
}

// Konstruktor z dwoma parametrami

class PersonGet3(val zarobki:Int, val prestiz:Int){

    private val wartoscRynkowaGracza: Int
        get()= zarobki * prestiz

    var wartoscRynkowaPrzeciwnika: Int = 0
        set(value){
            field = zarobki * prestiz
        }


}
