import java.lang.NumberFormatException

var receta = ""
var exit = 1

fun main(args: Array<String>){
    showMenu()
}
fun showMenu(){
    do {
        println("\n:: Bienvenido a Recipe Maker ::\n\n")
        println("Seleciona la opción deseada:")
        println("1. Hacer una receta.")
        println("2. Ver mis recetas.")
        println("3. Salir")
        var response: Int?
        try {
            response = readLine()?.toInt() ?: 3
        }catch (nfe: NumberFormatException){
            response = 3
        }
        when(response){
            1 -> createRecipe()
            2 -> showRecipe()
            3 -> exit = 0
        }
        println("Tu respuesta fue: $response")
    }while (exit.equals(1))
}

fun createRecipe(){
    println(":: CREACIÓN DE RECETA ::")
    var finished = false
    do {
    println("Ingrese el ingrediente:")
    println("1. Agua")
    println("2. Leche")
    println("3. Carne")
    println("4. Verduras")
    println("5. Frutas")
    println("6. Cereal")
    println("7, Huevos")
    println("8. Aceite")
    var response: Int? = readLine()?.toInt() ?: 0
    when(response){
        1 -> receta += "\n Agua"
        2 -> receta += "\n Leche"
        3 -> receta += "\n Carne"
        4 -> receta += "\n Verduras"
        5 -> receta += "\n Frutas"
        6 -> receta += "\n Cereal"
        7 -> receta += "\n Huevos"
        8 -> receta += "\n Aceite"
    }
    println("Tu respuesta fue $response")
    println("¿Deseas añadir otro ingrediente a la reseta? (Si / No)")
    var añadirIngrediente: String? = readLine()
        if(añadirIngrediente?.toLowerCase().equals("no")){
            finished = true
        }
    }while (!finished)

}
fun showRecipe(){
    if(receta.equals("")){
        println(":: No haz creado una receta todavía. Porfavor créela antes de entrar a esta opción ::")
    }else {
        println(":: Su receta es la siguiente: :: \n$receta\n")
    }
}