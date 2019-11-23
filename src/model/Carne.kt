package model

open class Carne(recetas:MutableList<String>):IIngrediente, AIngrediente(){
    var listaCarne = listOf<String>("Pescado","Pollo","Chuleta","Pato")
    var opcion:Int=-1
    init {
        do{
            for((index,cosa) in listaCarne.withIndex()){
                println("${index+1} .- $cosa")
            }
            println("5 .- Salir")
            println("Escoger una opcion")
            try{
                opcion= readLine()!!.toInt()
            }catch(e: Exception){
                println("Vuelva a ingresar un numero")
            }
            when(opcion){
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCarne.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCarne.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCarne.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCarne.get(3)}")
            }
        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "kilos"
    }
}
