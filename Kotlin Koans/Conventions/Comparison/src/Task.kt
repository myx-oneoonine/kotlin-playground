data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(date2: MyDate) = when {
        year != date2.year -> year - date2.year
        month != date2.month -> month - date2.month
        dayOfMonth != date2.dayOfMonth -> dayOfMonth - date2.dayOfMonth
        else -> 0
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2