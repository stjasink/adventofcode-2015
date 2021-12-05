import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day03Test {

    @Test
    fun part1Test1() {
        val input = """
            >
        """.trimIndent().split('\n')

        val answer = Day03().part1(input)
        assertEquals(2L, answer)
    }

    @Test
    fun part1Test2() {
        val input = """
            ^>v<
        """.trimIndent().split('\n')

        val answer = Day03().part1(input)
        assertEquals(4L, answer)
    }

    @Test
    fun part1Test3() {
        val input = """
            ^v^v^v^v^v
        """.trimIndent().split('\n')

        val answer = Day03().part1(input)
        assertEquals(2L, answer)
    }

    @Test
    fun part2Test1() {
        val input = """
            ^v
        """.trimIndent().split('\n')

        val answer = Day03().part2(input)
        assertEquals(3L, answer)
    }

    @Test
    fun part2Test2() {
        val input = """
            ^>v<
        """.trimIndent().split('\n')

        val answer = Day03().part2(input)
        assertEquals(3L, answer)
    }

    @Test
    fun part2Test3() {
        val input = """
            ^v^v^v^v^v
        """.trimIndent().split('\n')

        val answer = Day03().part2(input)
        assertEquals(11L, answer)
    }

}
