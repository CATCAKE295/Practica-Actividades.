import kotlin.math.PI
import kotlin.math.sqrt

fun main()
{

   val cabinacuadra = cabinacuadra(6, 50.0)
   val choza = choza(3, 10.0)
   val torre = torre(4, 15.5)


   with(cabinacuadra)
   {    
      println("\nCabina Cuadrada\n============")
      println("Capacidad: ${capacidad}")
      println("Material: ${materialConstructo}")
      println("Hay espacio? ${cuartoDis()}")
      obtenerCuarto()
      println("Area suelo: ${areaSuelo()}")
   }

   with(choza)
   {
      println("\nChoza\n=========")
      println("Capacidad: ${capacidad}")
      println("Material: ${materialConstructo}")
      println("Hay espacio? ${cuartoDis()}")
      obtenerCuarto()
      println("Area suelo: ${areaSuelo()}")
      println("Tamaño Alfombra: ${calcularAlfombraMax()}")


   }

   with(torre)
   {
      println("\nTorre\n=========")
      println("Capacidad: ${capacidad}")
      println("Material: ${materialConstructo}")
      println("Hay espacio? ${cuartoDis()}")
      obtenerCuarto()
      println("Area suelo: ${areaSuelo()}")
      println("Tamaño Alfombra: ${calcularAlfombraMax()}")

   }
  

}

abstract class Morada(private var residentes: Int)
{

   abstract val materialConstructo: String
   abstract val capacidad: Int

   fun cuartoDis(): Boolean
   {

      return residentes < capacidad

   }

   abstract fun areaSuelo() : Double

   fun obtenerCuarto()
   {

       if(capacidad > residentes)
       {
         residentes++
         println("Cuarto Libre!")

       }
       else
       {
            println("No hay espacio ")
       }



   }
  

}

class cabinacuadra(residentes : Int, val largo: Double) : Morada(residentes)
{
   override val materialConstructo = "Madera"
   override val capacidad = 6

   override fun areaSuelo() : Double
   {

       return largo * largo
   }

}


open class choza(residentes: Int, val radio: Double) : Morada(residentes)
{
   override val materialConstructo = "Paja"
   override val capacidad = 4

   override fun areaSuelo() : Double
   {

        return PI * radio * radio

   }

   fun calcularAlfombraMax() : Double
   {
           
      val diametro =2 * radio

      return sqrt(diametro * diametro / 2)

   }

}

class torre(residentes: Int,radio: Double, val pisos: Int = 2) : choza(residentes, radio)
{

   override val materialConstructo = "Piedra"
   override val capacidad = 4 * pisos

   override fun areaSuelo() : Double
   {

        return super.areaSuelo() * pisos
   }
  
}
