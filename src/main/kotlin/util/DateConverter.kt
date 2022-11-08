
import java.util.*


class DateConverter {
    fun timeStampFromDate(date: Date): Long {
        return date.time

    }
    fun dateFromTimestamp(timestamp: Long): Date? {
        return Date(timestamp)
    }
}