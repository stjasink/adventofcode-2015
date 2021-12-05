import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day04Test {

    @Test
    fun part1Test1() {
        val input = """
            abcdef
        """.trimIndent().split('\n')

        val answer = Day04().part1(input)
        assertEquals(609043L, answer)
    }

    @Test
    fun part1Test2() {
        val input = """
            pqrstuv
        """.trimIndent().split('\n')

        val answer = Day04().part1(input)
        assertEquals(1048970L, answer)
    }

    @Test
    fun part2Test() {
        val input = """
        """.trimIndent().split('\n')

        val answer = Day04().part2(input)
        assertEquals(0L, answer)
    }
}
