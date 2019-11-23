import model.*
import java.lang.Exception

var exit=1
var recetas: MutableList<String> = ArrayList()

fun main(args: Array<String>){
    println(":: Bienvenidos a recipe Maker")
    menuPrincipal()
}

fun menuPrincipal(){

    var opcion =-1
    val menu: String = """
        Selecciona la Opcion deseada
        1.- Hacer una receta
        2.- Ver mis recetas
        3.- Salir
    """.trimIndent()

    do{
        println(menu)
        try {
            opcion = readLine()!!.toInt()
        }catch(e: Exception){
            println("Vuelva a ingresar un numero ")
        }
        when (opcion){
            1->makeRecipe()
            2->viewRecipe()
            3->println("Esta saliendo del programa ...")
        }

    }while(opcion.compareTo(3)<0)
}

fun makeRecipe(){
    //val listaIngredientes = listOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    //var ingredientes: String=""
    //var agua = Agua()
    var valor:Int=-1
    var listaGeneral = """
        Selecione un grupo
         1.- Agua
         2.- Leche
         3.- Carne
         4.- Verduras
         5.- Frutas
         6.- Cereal
         7.- Huevos
         8.- Aceite
         9.- Salir
    """.trimIndent()

    /*for((index,cosa) in listaIngredientes.withIndex()){
        println("${index + 1} .- $cosa")
        println("9 .- salir")
    }*/
    /*try{
        valor= readLine()!!.toInt()
    }catch (e: Exception){
        println("Vuelva a ingresar un numero ")
    }
    if(valor.compareTo(9)>0){
        println("Ingrese un numero que este en la lista")
    }
    else {
        ingredientes = listaIngredientes.get(valor)
    }
    return ingredientes*/
    do{
        println(listaGeneral)
        println("Escoger un grupo (Escribir el numero)")
        try{
            valor= readLine()!!.toInt()
        }catch(e: Exception){
            println("Vuelva a ingresar un numero")
        }
        when(valor){
            1-> Agua(recetas)
            2-> Leche(recetas)
            3-> Carne(recetas)
            4-> Verdura(recetas)
            5-> Fruta(recetas)
            6-> Cereal(recetas)
            7-> Huevo(recetas)
            8-> Aceite(recetas)
        }
    }while(valor.compareTo(9)<0)
}

fun viewRecipe(){
    println("Ingredientes de la receta :")
    recetas.forEach{
        println("$it")
    }
    println("  ")
}