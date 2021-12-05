import common.Solver
import common.runAndTime
import common.loadInput
import org.apache.commons.codec.digest.DigestUtils

fun main() {
    val input = loadInput("day-04.txt")
    val solver = Day04()
    runAndTime(solver, input)
}

class Day04 : Solver {

    override fun part1(input: List<String>): Long {
        val seed = input.first()
        for (i in 0 .. 1_000_000_000) {
            val source = seed + i.toString()
            val hash = DigestUtils.md5Hex(source)
            if (hash.startsWith("00000")) {
                return i.toLong()
            }
        }
        return 0L
    }

    override fun part2(input: List<String>): Long {
        val seed = input.first()
        for (i in 0 .. 1_000_000_000) {
            val source = seed + i.toString()
            val hash = DigestUtils.md5Hex(source)
            if (hash.startsWith("000000")) {
                return i.toLong()
            }
        }
        return 0L
    }
}
