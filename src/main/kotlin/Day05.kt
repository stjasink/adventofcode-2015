import common.Solver
import common.runAndTime
import common.loadInput

fun main() {
    val input = loadInput("day-05.txt")
    val solver = Day05()
    runAndTime(solver, input)
}

class Day05 : Solver {

    override fun part1(input: List<String>): Long {
        val nice = input.filter { string ->
            val hasThreeVowels = string.filter { listOf('a', 'e', 'i', 'o', 'u').contains(it) }.length >= 3
            val hasDoubleLetter = string.split("").windowed(2).filter { it[0] == it[1] }.isNotEmpty()
            val hasBadPair = string.contains(Regex("ab|cd|pq|xy"))
            hasThreeVowels && hasDoubleLetter && !hasBadPair
        }

        return nice.size.toLong()
    }

    override fun part2(input: List<String>): Long {
        val nice = input.filter { string ->
            val hasTwicePair = string.contains(Regex("(..).*\\1"))
            val hasTwiceLetter = string.contains(Regex("(.).\\1"))
            hasTwiceLetter && hasTwicePair
        }

        return nice.size.toLong()
    }
}
