import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

class MultiplyTimeInterval(var timeInterval: TimeInterval, var number: Int)

operator fun TimeInterval.times(number: Int): MultiplyTimeInterval = MultiplyTimeInterval(this, number)
operator fun MyDate.plus(multiplyTimeInterval: MultiplyTimeInterval) = addTimeIntervals(multiplyTimeInterval.timeInterval, multiplyTimeInterval.number)

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
