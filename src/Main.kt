fun main() {
  ejercicio1(); ejercicio2(); ejercicio3();ejercicio4();ejercicio5(); ejercicio6();ejercicio7();ejercicio8();ejercicio9();
    ejercicio10();ejercicio11(); ejercicio12(); ejercicio13();ejercicio14();ejercicio15();ejercicio16();ejercicio17();ejercicio18();ejercicio19();ejercicio20();

}

fun ejercicio1() {
    println("Ingrese el número de filas de la matriz (M): ")
    val M = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas de la matriz (N): ")
    val N = readLine()?.toIntOrNull() ?: return

    val matriz = Array(M) { IntArray(N) }

    // Leer la matriz
    for (i in 0 until M) {
        for (j in 0 until N) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    println("Ingrese el número K para multiplicar la matriz: ")
    val K = readLine()?.toIntOrNull() ?: return

    // Multiplicar la matriz por K
    for (i in 0 until M) {
        for (j in 0 until N) {
            matriz[i][j] *= K
        }
    }

    // Mostrar la matriz resultante
    println("Matriz resultante:")
    for (i in 0 until M) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}
fun ejercicio2() {
    println("Ingrese el tamaño de la matriz cuadrada (P): ")
    val P = readLine()?.toIntOrNull() ?: return

    val matriz = Array(P) { IntArray(P) }

    // Leer la matriz
    for (i in 0 until P) {
        for (j in 0 until P) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Mostrar diagonal principal
    println("Diagonal principal:")
    for (i in 0 until P) {
        print("${matriz[i][i]} ")
    }
    println()

    // Mostrar diagonal secundaria
    println("Diagonal secundaria:")
    for (i in 0 until P) {
        print("${matriz[i][P - i - 1]} ")
    }
    println()

    // Matriz triangular superior
    println("Matriz triangular superior:")
    for (i in 0 until P) {
        for (j in 0 until P) {
            if (i <= j) {
                print("${matriz[i][j]} ")
            } else {
                print("0 ")
            }
        }
        println()
    }

    // Matriz triangular inferior
    println("Matriz triangular inferior:")
    for (i in 0 until P) {
        for (j in 0 until P) {
            if (i >= j) {
                print("${matriz[i][j]} ")
            } else {
                print("0 ")
            }
        }
        println()
    }
}
fun ejercicio3() {
    println("Ingrese el número de filas de la matriz (A): ")
    val A = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas de la matriz (B): ")
    val B = readLine()?.toIntOrNull() ?: return

    val matriz = Array(A) { IntArray(B) }
    val transpuesta = Array(B) { IntArray(A) }

    // Leer la matriz
    for (i in 0 until A) {
        for (j in 0 until B) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Calcular la transpuesta
    for (i in 0 until A) {
        for (j in 0 until B) {
            transpuesta[j][i] = matriz[i][j]
        }
    }

    // Mostrar matriz original
    println("Matriz original:")
    for (i in 0 until A) {
        for (j in 0 until B) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Mostrar matriz transpuesta
    println("Matriz transpuesta:")
    for (i in 0 until B) {
        for (j in 0 until A) {
            print("${transpuesta[i][j]} ")
        }
        println()
    }
}
fun ejercicio4() {
    println("Ingrese el número de filas (N): ")
    val N = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas (M): ")
    val M = readLine()?.toIntOrNull() ?: return

    val matriz = Array(N) { IntArray(M) }

    // Leer la matriz
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // a) Verificar si la matriz es cuadrada
    if (N == M) {
        println("La matriz es cuadrada")
    } else {
        println("La matriz no es cuadrada")
    }

    // b) Calcular el promedio de todos los números
    var sumaTotal = 0
    for (i in 0 until N) {
        for (j in 0 until M) {
            sumaTotal += matriz[i][j]
        }
    }
    val promedioTotal = sumaTotal / (N * M)
    println("El promedio de todos los números es: $promedioTotal")

    // c) Promedio por fila
    println("Promedio por fila:")
    for (i in 0 until N) {
        var sumaFila = 0
        for (j in 0 until M) {
            sumaFila += matriz[i][j]
        }
        val promedioFila = sumaFila / M
        println("Fila $i: Promedio = $promedioFila")
    }

    // d) Promedio por columna
    println("Promedio por columna:")
    for (j in 0 until M) {
        var sumaColumna = 0
        for (i in 0 until N) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna / N
        println("Columna $j: Promedio = $promedioColumna")
    }
}
fun ejercicio5() {
    println("Ingrese el número de filas (N): ")
    val N = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas (M): ")
    val M = readLine()?.toIntOrNull() ?: return

    val matriz = Array(N) { IntArray(M) }

    // Leer la matriz
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Verificar si la matriz es rala
    var esRala = true

    // Verificar filas
    for (i in 0 until N) {
        val cantidadDeUnosFila = matriz[i].count { it == 1 }
        if (cantidadDeUnosFila != 1) {
            esRala = false
            break
        }
    }

    // Verificar columnas
    if (esRala) {
        for (j in 0 until M) {
            var cantidadDeUnosColumna = 0
            for (i in 0 until N) {
                if (matriz[i][j] == 1) {
                    cantidadDeUnosColumna++
                }
            }
            if (cantidadDeUnosColumna != 1) {
                esRala = false
                break
            }
        }
    }

    if (esRala) {
        println("La matriz es rala")
    } else {
        println("La matriz no es rala")
    }
}
fun ejercicio6() {
    println("Ingrese el número de filas (N): ")
    val N = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas (M): ")
    val M = readLine()?.toIntOrNull() ?: return

    val matriz1 = Array(N) { IntArray(M) }
    val matriz2 = Array(N) { IntArray(M) }
    val suma = Array(N) { IntArray(M) }
    val multiplicacion = Array(N) { IntArray(M) }

    // Leer la primera matriz
    println("Ingrese los valores de la primera matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Ingrese el valor para la posición [$i][$j] de la primera matriz: ")
            matriz1[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Leer la segunda matriz
    println("Ingrese los valores de la segunda matriz:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Ingrese el valor para la posición [$i][$j] de la segunda matriz: ")
            matriz2[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Calcular la suma
    for (i in 0 until N) {
        for (j in 0 until M) {
            suma[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    // Mostrar la suma
    println("Matriz suma:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("${suma[i][j]} ")
        }
        println()
    }

    // Calcular la multiplicación
    for (i in 0 until N) {
        for (j in 0 until M) {
            multiplicacion[i][j] = matriz1[i][j] * matriz2[i][j]
        }
    }

    // Mostrar la multiplicación
    println("Matriz multiplicación:")
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("${multiplicacion[i][j]} ")
        }
        println()
    }
}
fun ejercicio7() {
    println("Ingrese el número de filas (N): ")
    val N = readLine()?.toIntOrNull() ?: return
    println("Ingrese el número de columnas (M): ")
    val M = readLine()?.toIntOrNull() ?: return

    var matriz = Array(N) { IntArray(M) }

    // Leer la matriz
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Mostrar matriz original
    println("Matriz original:")
    mostrarMatriz(matriz)

    // a) Eliminar una fila
    println("Ingrese el número de la fila a eliminar (0 a ${N-1}): ")
    val filaEliminar = readLine()?.toIntOrNull() ?: return
    if (filaEliminar in 0 until N) {
        matriz = eliminarFila(matriz, filaEliminar)
        println("Matriz después de eliminar la fila $filaEliminar:")
        mostrarMatriz(matriz)
    } else {
        println("Número de fila inválido.")
    }

    // b) Eliminar una columna
    println("Ingrese el número de la columna a eliminar (0 a ${M-1}): ")
    val columnaEliminar = readLine()?.toIntOrNull() ?: return
    if (columnaEliminar in 0 until M) {
        matriz = eliminarColumna(matriz, columnaEliminar)
        println("Matriz después de eliminar la columna $columnaEliminar:")
        mostrarMatriz(matriz)
    } else {
        println("Número de columna inválido.")
    }

    // c) Insertar una nueva fila
    println("Ingrese el número de la fila donde desea insertar una nueva fila (0 a ${matriz.size}): ")
    val filaInsertar = readLine()?.toIntOrNull() ?: return
    if (filaInsertar in 0..matriz.size) {
        val nuevaFila = IntArray(matriz[0].size) { _ -> 0 } // Fila con ceros
        matriz = insertarFila(matriz, nuevaFila, filaInsertar)
        println("Matriz después de insertar una nueva fila en $filaInsertar:")
        mostrarMatriz(matriz)
    } else {
        println("Número de fila inválido.")
    }

    // d) Insertar una nueva columna
    println("Ingrese el número de la columna donde desea insertar una nueva columna (0 a ${matriz[0].size}): ")
    val columnaInsertar = readLine()?.toIntOrNull() ?: return
    if (columnaInsertar in 0..matriz[0].size) {
        val nuevaColumna = IntArray(matriz.size) { _ -> 0 } // Columna con ceros
        matriz = insertarColumna(matriz, nuevaColumna, columnaInsertar)
        println("Matriz después de insertar una nueva columna en $columnaInsertar:")
        mostrarMatriz(matriz)
    } else {
        println("Número de columna inválido.")
    }
}

// Función para eliminar una fila
fun eliminarFila(matriz: Array<IntArray>, fila: Int): Array<IntArray> {
    return matriz.filterIndexed { index, _ -> index != fila }.toTypedArray()
}

// Función para eliminar una columna
fun eliminarColumna(matriz: Array<IntArray>, columna: Int): Array<IntArray> {
    return Array(matriz.size) { i ->
        matriz[i].filterIndexed { index, _ -> index != columna }.toIntArray()
    }
}

// Función para insertar una fila
fun insertarFila(matriz: Array<IntArray>, nuevaFila: IntArray, posicion: Int): Array<IntArray> {
    return matriz.sliceArray(0 until posicion) + nuevaFila + matriz.sliceArray(posicion until matriz.size)
}

// Función para insertar una columna
fun insertarColumna(matriz: Array<IntArray>, nuevaColumna: IntArray, posicion: Int): Array<IntArray> {
    return Array(matriz.size) { i ->
        matriz[i].sliceArray(0 until posicion) + nuevaColumna[i] + matriz[i].sliceArray(posicion until matriz[i].size)
    }
}

// Función para mostrar la matriz
fun mostrarMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}
fun ejercicio8() {
    println("Ingrese el tamaño de la matriz (N x N): ")
    val N = readLine()?.toIntOrNull() ?: return

    val matriz = Array(N) { IntArray(N) }

    // Leer la matriz
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Mostrar matriz original
    println("Matriz original:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Reemplazar valores
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (matriz[i][j] < 0) {
                matriz[i][j] = 0
            } else if (matriz[i][j] > 0) {
                matriz[i][j] = 9
            }
        }
    }

    // Mostrar la matriz cambiada
    println("Matriz cambiada:")
    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}
fun ejercicio9() {
    println("Ingrese el número de sucursales (N): ")
    val N = readLine()?.toIntOrNull() ?: return

    val ventas = Array(N) { IntArray(12) }

    // Leer las ventas
    for (i in 0 until N) {
        println("Ingrese las ventas para la sucursal $i durante los 12 meses:")
        for (j in 0 until 12) {
            print("Mes ${j+1}: ")
            ventas[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // a) Total de ventas de la compañía
    var totalVentas = 0
    for (i in 0 until N) {
        totalVentas += ventas[i].sum()
    }
    println("Total de ventas de la compañía: $totalVentas")

    // b) Total de ventas por cada sucursal
    for (i in 0 until N) {
        val totalSucursal = ventas[i].sum()
        println("Total de ventas de la sucursal $i: $totalSucursal")
    }

    // c) Sucursal que más vendió durante el año
    var sucursalMayorVenta = 0
    var maxVentas = 0
    for (i in 0 until N) {
        val totalSucursal = ventas[i].sum()
        if (totalSucursal > maxVentas) {
            maxVentas = totalSucursal
            sucursalMayorVenta = i
        }
    }
    println("La sucursal que más vendió fue la sucursal $sucursalMayorVenta con un total de $maxVentas")

    // d) Mes que menos vendió la compañía
    var mesMenorVenta = 0
    var minVentasMes = Int.MAX_VALUE
    for (j in 0 until 12) {
        var totalMes = 0
        for (i in 0 until N) {
            totalMes += ventas[i][j]
        }
        if (totalMes < minVentasMes) {
            minVentasMes = totalMes
            mesMenorVenta = j + 1
        }
    }
    println("El mes que menos vendió la compañía fue el mes $mesMenorVenta con un total de $minVentasMes")
}
fun ejercicio10() {
    println("Ingrese el número de estudiantes (M): ")
    val M = readLine()?.toIntOrNull() ?: return

    val calificaciones = Array(M) { IntArray(6) }

    // Leer las calificaciones
    for (i in 0 until M) {
        println("Ingrese las calificaciones para el estudiante $i:")
        for (j in 0 until 6) {
            print("Materia ${j+1}: ")
            calificaciones[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // a) Nota promedio de cada estudiante
    for (i in 0 until M) {
        val promedioEstudiante = calificaciones[i].average()
        println("El promedio del estudiante $i es $promedioEstudiante")
    }

    // b) Número de estudiantes que aprobaron cada materia
    for (j in 0 until 6) {
        var aprobados = 0
        for (i in 0 until M) {
            if (calificaciones[i][j] >= 60) { // Suponiendo que 60 es la nota mínima para aprobar
                aprobados++
            }
        }
        println("Número de estudiantes que aprobaron la materia ${j+1}: $aprobados")
    }

    // c) Número de estudiantes que reprobaron cada materia
    for (j in 0 until 6) {
        var reprobados = 0
        for (i in 0 until M) {
            if (calificaciones[i][j] < 60) {
                reprobados++
            }
        }
        println("Número de estudiantes que reprobaron la materia ${j+1}: $reprobados")
    }

    // d) Nota promedio de cada materia
    for (j in 0 until 6) {
        var sumaMateria = 0
        for (i in 0 until M) {
            sumaMateria += calificaciones[i][j]
        }
        val promedioMateria = sumaMateria / M
        println("El promedio de la materia ${j+1} es $promedioMateria")
    }
}
fun ejercicio11() {
    println("Ejercicio 11: Horas trabajadas por empleados")
    println("Ingrese el número de empleados (N): ")
    val N = readLine()?.toIntOrNull() ?: return

    val empleados = Array(N) { Triple(0, 0, 0) } // Código, horas normales, horas extras

    // Leer las horas trabajadas
    for (i in 0 until N) {
        println("Ingrese los datos para el empleado $i:")
        print("Código del empleado: ")
        val codigo = readLine()?.toIntOrNull() ?: 0
        print("Horas trabajadas en horario normal: ")
        val horasNormales = readLine()?.toIntOrNull() ?: 0
        print("Horas trabajadas en sobretiempo: ")
        val horasExtras = readLine()?.toIntOrNull() ?: 0

        empleados[i] = Triple(codigo, horasNormales, horasExtras)
    }

    // Calcular y mostrar el informe
    val salarioNormal = 2350
    val salarioExtra = 3500

    for ((codigo, horasNormales, horasExtras) in empleados) {
        val pagoNormal = horasNormales * salarioNormal
        val pagoExtra = horasExtras * salarioExtra
        val total = pagoNormal + pagoExtra

        println("Empleado $codigo:")
        println("Horas normales trabajadas: $horasNormales, Pago: $pagoNormal")
        println("Horas extra trabajadas: $horasExtras, Pago: $pagoExtra")
        println("Pago total: $total")
    }
}
fun ejercicio12() {
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    // Llenar la matriz según la lógica del ejemplo proporcionado en el enunciado
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                matriz[i][j] = 4
            } else if (i == j || i + j == N - 1) {
                matriz[i][j] = 1
            } else {
                matriz[i][j] = 0
            }
        }
    }

    // Mostrar la matriz
    println("Matriz generada:")
    mostrarMatriz(matriz)
}

fun ejercicio13() {
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    // Llenar la matriz según la lógica del ejemplo proporcionado en el enunciado
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                matriz[i][j] = 1
            } else if (i == j || i + j == N - 1) {
                matriz[i][j] = 0
            } else {
                matriz[i][j] = 0
            }
        }
    }

    // Mostrar la matriz
    println("Matriz generada:")
    mostrarMatriz(matriz)
}
fun ejercicio14() {
    println("Ejercicio 14: Generar otra matriz de orden impar N x N")
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    // Llenar la matriz según las reglas del ejercicio 14
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i + j < N) {
                matriz[i][j] = i + j
            } else {
                matriz[i][j] = 0
            }
        }
    }

    // Mostrar la matriz
    println("Matriz generada:")
    mostrarMatriz(matriz)
}
fun ejercicio15() {
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }
    var valor = 1
    var inicio = N - 1
    var fin = 0

    // Llenar la matriz en espiral inversa
    while (inicio >= fin) {
        for (i in fin..inicio) {
            matriz[inicio][i] = valor++
        }
        for (i in inicio - 1 downTo fin) {
            matriz[i][inicio] = valor++
        }
        for (i in inicio - 1 downTo fin) {
            matriz[fin][i] = valor++
        }
        for (i in fin + 1..inicio - 1) {
            matriz[i][fin] = valor++
        }
        inicio--
        fin++
    }

    // Mostrar la matriz generada
    println("Matriz generada en espiral inversa:")
    mostrarMatriz(matriz)


}
fun ejercicio16() {
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }
    var valor = 1

    // Llenar la matriz con valores ascendentes en un patrón especial
    for (i in 0 until N) {
        for (j in 0 until N) {
            matriz[i][j] = valor++
        }
    }

    // Mostrar la matriz generada
    println("Matriz generada con patrón especial:")
    mostrarMatriz(matriz)
}
fun ejercicio17() {
    println("Ejercicio 17: Generar una matriz en zigzag de orden impar N x N (mayor que 3)")
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }
    var valor = 1

    // Llenar la matriz con un patrón zigzag
    for (i in 0 until N) {
        if (i % 2 == 0) {
            for (j in 0 until N) {
                matriz[i][j] = valor++
            }
        } else {
            for (j in N - 1 downTo 0) {
                matriz[i][j] = valor++
            }
        }
    }

    // Mostrar la matriz generada
    println("Matriz generada en zigzag:")
    mostrarMatriz(matriz)
}
fun ejercicio18() {
    println("Ejercicio 18: Generar una matriz en forma de serpiente de orden impar N x N (mayor que 3)")
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }
    var valor = 1

    // Llenar la matriz con un patrón de serpiente
    for (i in 0 until N) {
        for (j in 0 until N) {
            matriz[i][j] = valor++
        }
    }

    // Mostrar la matriz generada
    println("Matriz generada en forma de serpiente:")
    mostrarMatriz(matriz)


}
fun ejercicio19() {

    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    // Llenar la matriz con cuadrados concéntricos
    var valor = 1
    var inicio = 0
    var fin = N - 1
    while (inicio <= fin) {
        for (i in inicio..fin) {
            matriz[inicio][i] = valor
            matriz[fin][i] = valor
            matriz[i][inicio] = valor
            matriz[i][fin] = valor
        }
        valor++
        inicio++
        fin--
    }

    // Mostrar la matriz generada
    println("Matriz generada con cuadrados concéntricos:")
    mostrarMatriz(matriz)
}

fun ejercicio20() {
    println("Ejercicio 20: Generar una matriz con valores consecutivos de orden impar N x N (mayor que 3)")
    println("Ingrese el tamaño de la matriz (N, debe ser impar y mayor que 3): ")
    val N = readLine()?.toIntOrNull() ?: return
    if (N <= 3 || N % 2 == 0) {
        println("N debe ser impar y mayor que 3.")
        return
    }

    val matriz = Array(N) { IntArray(N) }
    var valor = 1

    // Llenar la matriz con valores consecutivos
    for (i in 0 until N) {
        for (j in 0 until N) {
            matriz[i][j] = valor++
        }
    }

    // Mostrar la matriz generada
    println("Matriz generada con valores consecutivos:")
    mostrarMatriz(matriz)
}

