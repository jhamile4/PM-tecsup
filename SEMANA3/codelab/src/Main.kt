fun main() {
    val myTv = SmartTvDevice("Living Room TV", "Entertainment")
    val myLight = SmartLightDevice("Bedroom Light", "Lighting")
    val home = SmartHome(myTv, myLight)

    home.printStatus()

    home.turnOnTv()
    home.changeTvVolume(true)
    home.changeTvChannel(true)
    home.printStatus()

    home.turnOnLight()
    home.changeLightBrightness(true)
    home.printStatus()

    home.turnOffTv()
    home.turnOffLight()
    home.printStatus()
}
