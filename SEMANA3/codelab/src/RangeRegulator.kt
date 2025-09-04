import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(
    initialValue: Int, private val minValue: Int, private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    private var fieldValue = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int = fieldValue

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        fieldValue = value.coerceIn(minValue, maxValue)
    }
}
