package model

open class Fruta(recetas:MutableList<String>):IIngrediente, AIngrediente(){
    var listaFruta = listOf<String>("Naranja","Mandarina","Lima","PLatano")
    var opcion:Int=-1
    init {
        do{
            for((index,cosa) in listaFruta.withIndex()){
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
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaFruta.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaFruta.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaFruta.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaFruta.get(3)}")
            }
        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "gramos"
    }
}