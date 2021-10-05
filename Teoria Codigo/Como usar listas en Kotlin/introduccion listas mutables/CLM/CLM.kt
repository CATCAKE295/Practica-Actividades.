
fun main()
{

   val entradas: MutableList<String> = mutableListOf() 
   val AgregarI = listOf("ravioli", "lasagna", "fettuccine")

   println("Entradas: $entradas")
   println("Agregar Fideos: ${entradas.add("Fideos")}")
   println("Entradas: $entradas")
   println("Agregar Spaguetti: ${entradas.add("Spaguetti")}")
   println("Entradas: $entradas")
   println("Agregar listas: ${entradas.addAll(AgregarI)}")
   println("Entradas: $entradas")
   println("Remover Spaguetti: ${entradas.remove("Spaguetti")}")
   println("Entradas: $entradas")
   println("Remover primer elemento: ${entradas.removeAt(0)}")
   println("Entradas: $entradas")
   entradas.clear()
   println("Entradas: $entradas")
   println("Esta vacia la lista?:${entradas.isEmpty()}")
}