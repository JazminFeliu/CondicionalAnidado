fun main(args: Array<String>) {
    /*confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima
     alguno de estos mensajes:
     si el promedio es >=7 "promocionado"
     si el promedio es >=4 y <7 "regular"
     si el promedio es <4 "reprobado"
     */

    print("Ingrese la primer nota: ")
    val nota1 = readLine()!!.toInt()

    print("Ingrese la segunda nota: ")
    val nota2 = readLine()!!.toInt()

    print("Ingrese la tercer nota: ")
    val nota3 = readLine()!!.toInt()

    val promedio = (nota1 + nota2 + nota3 )/3
    if(promedio >=7)
        print("Promocionado, su promedio es $promedio  ")
    else
        if(promedio >= 4)
            print("Regular, su promedio es $promedio")
    else
        print("Reprobado, su promedio es $promedio")

}