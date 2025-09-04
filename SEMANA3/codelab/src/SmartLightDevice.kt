class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(deviceName, deviceCategory) {

    override val deviceType = "Smart Light"
    private var brightnessLevel by RangeRegulator(2, 0, 100)

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name is turned on. Brightness: $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    fun decreaseBrightness() {
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel.")
    }
}
