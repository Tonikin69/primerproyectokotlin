import kotlin.random.Random

fun main(){
    var lista  = mutableListOf<Char>()
    var letras = arrayListOf<Char>()

    var flag=false
    var flaq2=false
    var flaq3=false
    var flaq4=false
    var cont=0
    var continnt=0
    var letrita=' '


    println("introduce letra a letra tu palabra para el ahorcado e introduce x para no introducir mas")
    while (flaq3==false){
        letrita = readCharFromKeyboard()
        if (letrita!='x'){
            lista.add(letrita)
        } else{
            flaq3=true
        }
    }

    val lista2 = MutableList(lista.size) {
        '_'
    }
    println(lista)
    println(lista2)



    while (flag==false){

        var intento= readCharFromKeyboard()

        if (letras.contains(intento)){
            println("Ya has metido esa letra")
        }

            repeat(lista.size) {

                if (flaq2==false){
                    continnt+=1
                }
                flaq2=true


                if (lista[it] == intento){
                    lista2[it]=intento
                   cont+=1
                }else{


                    letras.add(intento)

                }

            }
        if(cont==lista.size){
            flag=true
            flaq2=false
            flaq4=false
        }


        println(lista2)
        println(cont)




    }
    println("Has utilizado $continnt intentos")
}

fun readCharFromKeyboard(): Char {
    var result: Char?
    do {
        val selectedOption = readLine()
        result = if (selectedOption?.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}



