package main

class Version(val major: Int, val minor: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major) {
            val x = this.major - other.major
            println("1 $x")
            return x
        } else if (this.minor != other.minor) {
            val x = this.minor - other.minor
            println("2 $x")
            return x
        } else return 0
    }
}

fun main() {
    val versionRange = Version(1, 11)..Version(1, 30)

    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
}