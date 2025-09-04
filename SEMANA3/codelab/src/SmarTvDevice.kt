class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(deviceName, deviceCategory) {

    override val deviceType = "Smart TV"
    private var speakerVolume by RangeRegulator(2, 0, 100)
    private var channelNumber by RangeRegulator(1, 1, 200)

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Volume: $speakerVolume, Channel: $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun decreaseSpeakerVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel changed to $channelNumber.")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel changed to $channelNumber.")
    }
}
