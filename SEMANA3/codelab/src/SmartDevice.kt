open class SmartDevice(val name: String, val category: String) {
    var deviceStatus: String = "offline"
        protected set

    open val deviceType: String = "Unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    open fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType, status: $deviceStatus")
    }
}
