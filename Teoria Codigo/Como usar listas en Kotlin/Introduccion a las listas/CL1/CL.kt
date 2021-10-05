fun main()
{
    val numeros = listOf(1, 2, 3, 4, 5, 6)

    println("Lista: ${numeros}")
    println("Tamaño : ${numeros.size}")
    println("Primer elemento: ${numeros[0]}")
    println("Segundo elemento: ${numeros[1]}")
    println("Ultimo indice: ${numeros.size -1}")
    println("Ultimo elemento: ${numeros[numeros.size -1]}" )
    println("Primero: ${numeros.first()}")
    println("Ultimo: ${numeros.last()}")
    
    println("Existe el 4? ${numeros.contains(4)}")
    println("Existe el 7? ${numeros.contains(7)}")


}