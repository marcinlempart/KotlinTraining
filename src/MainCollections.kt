// ZADANIA
// 1. Zapisać prostą listę która

fun main(){


    // --------------------- LISTY ----------------------------------------------------------------
    // stworzenie prostej listy do której możemy dodawać nowe elementy
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")
    println(numbers)

    // stworzenie prostej listy do której nie możemy dodawać nowe elementy
    val numbers2 = listOf("one", "two", "three", "four")
    // numbers.add("five") -> nie możemy dodawać

    // In turn, mutable collections aren't covariant; otherwise, this would lead to runtime failures.
    // The read-only collection types are covariant.

    // ------------------------------- SET ---------------------------------------------------------

    // set zapisuje elementy które są unikalne
    // kolejność jest niezdefiniowana
    // Set mogą posiadać tylko jeden null
    // tutaj również posiadamy mutable collections


    val numbers3 = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers3.size}")
    if (numbers3.contains(1)) println("1 is in the set")

    val numbers4 = mutableSetOf<String>("Jeden", "Dwa")

    // ------------------------------ MAPY ---------------------------------------------------------

}
