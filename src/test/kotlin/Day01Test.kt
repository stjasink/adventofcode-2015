import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun part1Test1() {
        val input = """
            (())
        """.trimIndent().split('\n')

        val answer = Day01().part1(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part1Test2() {
        val input = """
            ()()
        """.trimIndent().split('\n')

        val answer = Day01().part1(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part1Test3() {
        val input = """
            (((
        """.trimIndent().split('\n')

        val answer = Day01().part1(input)
        assertEquals(3L, answer)
    }

    @Test
    fun part1Test4() {
        val input = """
            (()(()(
        """.trimIndent().split('\n')

        val answer = Day01().part1(input)
        assertEquals(3L, answer)
    }

    @Test
    fun part2Test1() {
        val input = """
            )
        """.trimIndent().split('\n')

        val answer = Day01().part2(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part2Test2() {
        val input = """
            ()())
        """.trimIndent().split('\n')

        val answer = Day01().part2(input)
        assertEquals(5L, answer)
    }
}
