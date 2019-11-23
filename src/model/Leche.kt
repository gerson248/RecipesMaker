package model

open class Leche(recetas:MutableList<String>): IIngrediente, AIngrediente(){
    var listaLeche = listOf<String>("Yogurt","Leche fresca","Mantequilla","Leche condesada")
    var opcion:Int=-1
    //var volumen:Int=-1
    init {
        do{
            for((index,cosa) in listaLeche.withIndex()){
                println("${index+1} .- $cosa")
            }
            println("5 .- Salir")
            println("Escoger una opcion")
            try{
                opcion= readLine()!!.toInt()
            }catch(e: Exception){
                println("Vuelva a ingresar un numero")
            }
            //volumen = asignarCantidad()
            when(opcion){
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaLeche.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaLeche.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaLeche.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaLeche.get(3)}")
            }
        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "mililitros"
    }
}