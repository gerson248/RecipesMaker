package model

open class Aceite(recetas:MutableList<String>):IIngrediente, AIngrediente(){
    var listaAceite= listOf<String>("Aceite de maiz","Aceite de oliva","Aceite de girasol","Aceite de canola")
    var opcion:Int=-1
    init {
        do{
            for ((index, cosa) in listaAceite.withIndex()) {
                println("${index+1} .- $cosa")
            }
            println("5 .- Salir")
            println("Escoger una opcion")
            try{
                opcion= readLine()!!.toInt()
            }catch (e: Exception){
                println("Vuelva a ingresar un numero")
            }

            when(opcion){
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaAceite.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaAceite.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaAceite.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaAceite.get(3)}")
            }

        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "litros"
    }
}