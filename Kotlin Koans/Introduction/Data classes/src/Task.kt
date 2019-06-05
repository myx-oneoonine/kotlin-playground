data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun kak() {
    val xx = Person("a", 10)
    xx.age
    xx.name
}

