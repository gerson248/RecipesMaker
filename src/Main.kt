import java.lang.Exception

fun main(args: Array<String>){
    println(":: Bienvenidos a recipe Maker")
    menuPrincipal()
}

fun menuPrincipal(){
    val recetas: MutableList<String> = ArrayList()
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
            1->recetas.add(makeRecipe())
            2->viewRecipe(recetas)
            3->println("Esta saliendo del programa ...")
        }

    }while(opcion.compareTo(3)<0)
}

fun makeRecipe(): String{
    val listaIngredientes = listOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    var ingredientes: String=""
    var valor:Int=-1
    println("Escoger un ingrediente (Escribir el numero)")
    for((index,cosa) in listaIngredientes.withIndex()){
        println("${index + 1} -> $cosa")
    }
    try{
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
    return ingredientes
}

fun viewRecipe(recetas: List<String>){
    println("Ingredientes de la receta :")
    recetas.forEach{
        println("$it")
    }
    println("  ")
}