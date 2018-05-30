class Car(private var weight: Double, private var size: Int) {

    var isNew: Boolean = true
        get() {
            return field
        }
        set(value) {
            field = value
        }
}