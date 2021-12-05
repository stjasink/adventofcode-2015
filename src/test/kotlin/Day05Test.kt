import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day05Test {

    @Test
    fun part1Test1() {
        val input = """
            ugknbfddgicrmopn
        """.trimIndent().split('\n')

        val answer = Day05().part1(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part1Test2() {
        val input = """
            aaa
        """.trimIndent().split('\n')

        val answer = Day05().part1(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part1Test3() {
        val input = """
            jchzalrnumimnmhp
        """.trimIndent().split('\n')

        val answer = Day05().part1(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part1Test4() {
        val input = """
            haegwjzuvuyypxyu
        """.trimIndent().split('\n')

        val answer = Day05().part1(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part1Test5() {
        val input = """
            dvszwmarrgswjxmb
        """.trimIndent().split('\n')

        val answer = Day05().part1(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part2Test1() {
        val input = """
            qjhvhtzxzqqjkmpb
        """.trimIndent().split('\n')

        val answer = Day05().part2(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part2Test2() {
        val input = """
            xxyxx
        """.trimIndent().split('\n')

        val answer = Day05().part2(input)
        assertEquals(1L, answer)
    }

    @Test
    fun part2Test3() {
        val input = """
        """.trimIndent().split('\n')

        val answer = Day05().part2(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part2Test4() {
        val input = """
            uurcxstgmygtbstg
        """.trimIndent().split('\n')

        val answer = Day05().part2(input)
        assertEquals(0L, answer)
    }

    @Test
    fun part2Test5() {
        val input = """
            ieodomkazucvgmuy
        """.trimIndent().split('\n')

        val answer = Day05().part2(input)
        assertEquals(0L, answer)
    }
}
