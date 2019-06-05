package main

fun main() {
    println("Hello World!")

    println("x".kak())
    println("aaa".appendX("kkkkkkkk"))
}


fun String.kak(): String {
    return this + " main.kak!!!"
}


fun String.appendX(s: String): String {
    return "$this $s"
}

