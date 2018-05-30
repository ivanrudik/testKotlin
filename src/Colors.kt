enum class Colors(val colorHex: String, val  opasity: Double? = 1.0) {
    WHITE("#1111"),
    BLACK("#2222"),
    GREEN("#3333", 0.5),
    RED(colorHex = "#4444"),
    BLUE("#5555")
}