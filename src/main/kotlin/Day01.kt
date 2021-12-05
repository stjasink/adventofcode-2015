import common.Solver
import common.runAndTime
import common.loadInput

fun main() {
    val input = loadInput("day-01.txt")
    val solver = Day01()
    runAndTime(solver, input)
}

class Day01 : Solver {

    override fun part1(input: List<String>): Long {
        val numUps = input.first().count { it == '(' }.toLong()
        val numDowns = input.first().count { it == ')' }.toLong()
        return numUps - numDowns
    }

    override fun part2(input: List<String>): Long {
        var currentFloor = 0
        input.first().forEachIndexed { index, char ->
            if (char == '(') {
                currentFloor += 1
            } else if (char == ')') {
                currentFloor -= 1
            }
            if (currentFloor == -1) {
                return index.toLong() + 1
            }
        }
        return 0L
    }
}
