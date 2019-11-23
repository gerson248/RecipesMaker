package model

open class Huevo(recetas:MutableList<String>):IIngrediente, AIngrediente(){
    var listaHuevo = listOf<String>("Huevo codorniz","Huevo gallina","Huevo avestruz","Huevo duro")
    var opcion:Int=-1
    init {
        do{
            for((index,cosa) in listaHuevo.withIndex()){
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
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaHuevo.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaHuevo.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaHuevo.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaHuevo.get(3)}")
            }
        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "kilo"
    }
}