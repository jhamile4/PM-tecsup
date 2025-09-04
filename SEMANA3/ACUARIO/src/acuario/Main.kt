package acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70 // cambia el alto recalculando
    acuario7.imprimirTamano()
}

fun probarHerencia() {
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val t = Tiburon()
    val p = PezPayaso()
    println("Tiburón color: ${t.color}")
    t.comer()
    println("Pez payaso color: ${p.color}")
    p.comer()
}

fun demoDispositivos() {
    val calentador = Calentador("Calentador X")
    val bomba = BombaDeAgua("Bomba Y")
    calentador.encender()
    println(calentador.estado())
    println(bomba.estado())
    bomba.encender()
    println(bomba.estado())
}

fun main() {
    construirAcuario()
    probarHerencia()
    crearPeces()
    demoDispositivos()
}

