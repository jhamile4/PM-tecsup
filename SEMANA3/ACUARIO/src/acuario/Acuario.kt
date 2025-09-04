package acuario

import kotlin.math.PI

// Clase principal Acuario
open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    // Volumen en litros
    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) { alto = (valor * 1000) / (ancho * largo) }

    // Forma y cantidad de agua
    open val forma = "rectángulo"
    open var agua: Double = 0.0
        get() = volumen * 0.9

    init {
        println("inicializando acuario")
    }

    // Imprime los datos del acuario
    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm Largo: $largo cm Alto: $alto cm")
        println("Volumen: $volumen l Agua: $agua l (${agua / volumen * 100.0}% lleno)")
    }

    // Constructor secundario: ajusta el alto en función de los peces
    constructor(numeroDePeces: Int) : this() {
        val tanque = (numeroDePeces * 2000 * 1.1).toInt()
        alto = (tanque / (largo * ancho)).toInt()
    }
}

// Subclase para tanque cilíndrico
class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        get() = ((ancho / 2.0) * (largo / 2.0) * alto / 1000.0 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000.0 / PI) / ((ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override var agua: Double = 0.0
        get() = volumen * 0.8

    override val forma = "cilindro"
}
