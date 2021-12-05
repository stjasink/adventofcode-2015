import common.Solver
import common.runAndTime
import common.loadInput

fun main() {
    val input = loadInput("day-06.txt")
    val solver = Day06()
    runAndTime(solver, input)
}

class Day06 : Solver {

    override fun part1(input: List<String>): Long {
        val grid = Array(1000) { Array(1000) { false } }
        val pattern = Regex("([\\w ]*) (.*),(.*) through (.*),(.*)")

        input.forEach { line ->
            val matchResult = pattern.matchEntire(line) ?: throw IllegalStateException("No match")
            val (instruction, startX, startY, endX, endY) = matchResult.groupValues.drop(1)

            for (x in startX.toInt()..endX.toInt()) {
                for (y in startY.toInt() .. endY.toInt()) {
                    when (instruction) {
                        "turn off" -> grid[x][y] = false
                        "turn on" -> grid[x][y] = true
                        "toggle" -> grid[x][y] = !grid[x][y]
                    }
                }
            }
        }

        return grid.map { line -> line.count { it } }.sum().toLong()
    }

    override fun part2(input: List<String>): Long {
        val grid = Array(1000) { Array(1000) { 0 } }
        val pattern = Regex("([\\w ]*) (.*),(.*) through (.*),(.*)")

        input.forEach { line ->
            val matchResult = pattern.matchEntire(line) ?: throw IllegalStateException("No match")
            val (instruction, startX, startY, endX, endY) = matchResult.groupValues.drop(1)

            for (x in startX.toInt()..endX.toInt()) {
                for (y in startY.toInt() .. endY.toInt()) {
                    when (instruction) {
                        "turn off" -> if (grid[x][y] > 0) grid[x][y] = grid[x][y] - 1
                        "turn on" -> grid[x][y] = grid[x][y] + 1
                        "toggle" -> grid[x][y] = grid[x][y] + 2
                    }
                }
            }
        }

        return grid.sumOf { line -> line.sum().toLong() }
    }
}
