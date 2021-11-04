package losjson

fun main(){
    var p1 = Personaje("Antonio",19)
    println(p1.toJson())
    val json1 = "{\"nombre\":\"Rodolfo\",\"edad\":2}"
    val p2 =Personaje.fromJson(json1)

    println(p2)

}