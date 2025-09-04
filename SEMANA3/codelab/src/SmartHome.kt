class SmartHome(
    val tv: SmartTvDevice,
    val light: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        tv.turnOn()
    }

    fun turnOffTv() {
        if (tv.deviceStatus == "on") {
            deviceTurnOnCount--
            tv.turnOff()
        }
    }

    fun changeTvVolume(up: Boolean) {
        if (tv.deviceStatus == "on") {
            if (up) tv.increaseSpeakerVolume() else tv.decreaseSpeakerVolume()
        }
    }

    fun changeTvChannel(next: Boolean) {
        if (tv.deviceStatus == "on") {
            if (next) tv.nextChannel() else tv.previousChannel()
        }
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        light.turnOn()
    }

    fun turnOffLight() {
        if (light.deviceStatus == "on") {
            deviceTurnOnCount--
            light.turnOff()
        }
    }

    fun changeLightBrightness(up: Boolean) {
        if (light.deviceStatus == "on") {
            if (up) light.increaseBrightness() else light.decreaseBrightness()
        }
    }

    fun printStatus() {
        println("\n--- Smart Home Status ---")
        tv.printDeviceInfo()
        light.printDeviceInfo()
        println("Devices currently on: $deviceTurnOnCount\n")
    }
}
