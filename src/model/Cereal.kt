package model

open class Cereal(recetas:MutableList<String>):IIngrediente, AIngrediente(){
    var listaCereal = listOf<String>("Avena","Trigo","Maiz","Arroz")
    var opcion:Int=-1
    init {
        do{
            for((index,cosa) in listaCereal.withIndex()){
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
                1->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCereal.get(0)}")
                2->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCereal.get(1)}")
                3->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCereal.get(2)}")
                4->recetas.add("${asignarCantidad()} ${cantidad()} : ${listaCereal.get(3)}")
            }
        }while(opcion.compareTo(5)<0)
    }

    override fun cantidad(): String {
        return "bolsas"
    }
}