import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day06Test {

    @Test
    fun part1Test1() {
        val input = """
            turn on 0,0 through 999,999
        """.trimIndent().split('\n')

        val answer = Day06().part1(input)
        assertEquals(1_000_000L, answer)
    }

    @Test
    fun part2Test1() {
        val input = """
            turn on 0,0 through 0,0
        """.trimIndent().split('\n')

        val answer = Day06().part2(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part2Test2() {
        val input = """
            toggle 0,0 through 999,999
        """.trimIndent().split('\n')

        val answer = Day06().part2(input)
        assertEquals(2_000_000L, answer)
    }
}
