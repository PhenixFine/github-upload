import java.util.Scanner

enum class Rainbow() {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, NULL;

    companion object {
        fun sendRainbow(color: String): Rainbow {
            for (enum in Rainbow.values()) {
                if (enum.toString() == color.toUpperCase()) return enum
            }
            return NULL
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = Rainbow.sendRainbow(input.next())

    println(color.name != "NULL")
}