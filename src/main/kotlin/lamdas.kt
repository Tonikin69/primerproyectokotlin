fun main(){
    { println("hola")}()
    var decirhola = { println("hello")}
    decirhola()
    var deciralgo = {algo : String, otracosa : Int -> println("Digo $algo $otracosa")}
    deciralgo("boom!",69)
}