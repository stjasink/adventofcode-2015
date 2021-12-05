import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day02Test {

    @Test
    fun part1Test1() {
        val input = """
            2x3x4
        """.trimIndent().split('\n')

        val answer = Day02().part1(input)
        assertEquals(58L, answer)
    }

    @Test
    fun part1Test2() {
        val input = """
            1x1x10
        """.trimIndent().split('\n')

        val answer = Day02().part1(input)
        assertEquals(43L, answer)
    }

    @Test
    fun part2Test1() {
        val input = """
            2x3x4
        """.trimIndent().split('\n')

        val answer = Day02().part2(input)
        assertEquals(34L, answer)
    }

    @Test
    fun part2Test2() {
        val input = """
            1x1x10
        """.trimIndent().split('\n')

        val answer = Day02().part2(input)
        assertEquals(14L, answer)
    }
}
