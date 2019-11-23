package model

interface IIngrediente {

    fun asignarCantidad():Int{
        var cantidad:Int=-1
        var opcion:String=""
        do {
            println("Ingrese la cantidad")
            try{
                cantidad= readLine()!!.toInt()
            }catch(e:Exception){
                println("Vuelva a ingresar una cantidad")
            }
        }while (opcion.equals("s") || opcion.equals("S"))
        return cantidad
    }

}