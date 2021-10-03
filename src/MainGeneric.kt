// ZADANIA
// 1. Stworzyć prostą klasę generyczną która pozwala na

fun main(){

    var boks = Box(123)
    var boks2 = Box("dasdasdas")
    boks.value
    boks2.value

}

class Box<T>(t: T) {
    var value = t
}