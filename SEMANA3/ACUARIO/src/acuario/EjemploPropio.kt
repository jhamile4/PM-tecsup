package acuario



// Clase abstracta para dispositivos
abstract class Dispositivo(val nombre: String) {
    abstract fun estado(): String
}

// Interfaz con acciones de los dispositivos
interface AccionDispositivo {
    fun encender()
    fun apagar()
}

// Subclase Calentador
class Calentador(nombre: String) : Dispositivo(nombre), AccionDispositivo {
    private var encendido = false

    override fun encender() { encendido = true }
    override fun apagar() { encendido = false }

    override fun estado() = if (encendido) "$nombre encendido" else "$nombre apagado"
}

// Subclase Bomba de Agua
class BombaDeAgua(nombre: String) : Dispositivo(nombre), AccionDispositivo {
    private var encendida = false

    override fun encender() { encendida = true }
    override fun apagar() { encendida = false }

    override fun estado() = if (encendida) "$nombre encendida" else "$nombre apagada"
}
