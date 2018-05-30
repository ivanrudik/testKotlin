import Colors.*
import java.util.*


fun main(args: Array<String>) {

    val binaryRep = TreeMap<Char, String>()

    for (c in 'A'..'z'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryRep[c] = binary
    }

    for ((char, letter) in binaryRep){
        println("$char $letter")
    }
    //println(getFavoriteColor(RED))

}

fun getFavoriteColor(color: Colors) = when (color) {
    BLACK -> "Черный"
    GREEN -> "Зеленый"
    BLUE -> "Синий"
    RED, WHITE-> "Красное&Белый"
    else -> {
        "NONE"
    }
}


fun getSt(): String? {
    return "helpd"
}

fun myFarstFunction()
        : Int {

    return 1;
}

fun myFarstFunction2(a: Long): Int {
    return a.toInt();
}

fun myFarstFunction3() {

}

fun myFarstFunction4(a: Long, b: Int) = a + b