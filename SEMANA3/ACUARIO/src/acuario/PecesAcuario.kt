package acuario



// Clase abstracta Pez
abstract class Pez {
    abstract val color: String
}

// Interfaz con acción común a los peces
interface AccionPez {
    fun comer()
}

// Tiburón implementa Pez y AccionPez
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() = println("cazar y comer peces")
}

// Pez Payaso implementa Pez y AccionPez
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() = println("comer algas")
}
