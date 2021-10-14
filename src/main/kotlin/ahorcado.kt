fun main(){
    var lista  = mutableListOf<Char>('a','h','o','r','c','a','d','o')
    var lista2 = mutableListOf<Char>('_','_','_','_','_','_','_','_')
    var letras = arrayListOf<Char>()

    var flag=false
    var cont=0


    while (flag==false){

        var intento= readCharFromKeyboard()

        if (letras.contains(intento)){
            println("Ya has metido esa letra")
        }

            repeat(lista.size) {



                if (lista[it] == intento){
                    lista2[it]=intento
                    cont++
                }else{

                    letras.add(intento)
                }

            }
        if(cont==8){
            flag=true
        }


        println(lista2)


    }

}

fun readCharFromKeyboard(): Char {
    var result: Char?
    do {
        val selectedOption = readLine()
        result = if (selectedOption?.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}



