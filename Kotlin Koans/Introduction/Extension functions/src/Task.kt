fun Int.r(): RationalNumber {
    println("aaa".appendX("kkkkkkkk"))
    return RationalNumber(this, 1)
}


fun Pair<Int, Int>.r(): RationalNumber {
    return RationalNumber(first, second)
}

data class RationalNumber(val numerator: Int, val denominator: Int)

fun x() {
    val a: Pair<Int, Int> = Pair(1, 2)
    a.r()

    val i = 1;
    i.r()
}

fun String.kak(): String {
    return this + " kak !!!"
}

fun String.appendX(s: String): String {
    return "$this $s"
}