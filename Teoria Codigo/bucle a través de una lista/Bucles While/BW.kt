fun main()
{

   val IPF = listOf(2, 4, 1, 3)
   var tInvitados = 0
   var indice = 0

   while(indice < IPF.size)
   {
     
    tInvitados += IPF[indice]
     
     indice++

   }

   println("Total de invitados: ${tInvitados}")

}

