import common.Solver
import common.runAndTime
import common.loadInput

fun main() {
    val input = loadInput("day-03.txt")
    val solver = Day03()
    runAndTime(solver, input)
}

class Day03 : Solver {

    override fun part1(input: List<String>): Long {
        var x = 0
        var y = 0
        val visited = mutableMapOf<Pair<Int, Int>, Boolean>()
        visited[Pair(0, 0)] = true

        input.first().forEach { direction ->
            when (direction) {
                '<' -> x -= 1
                '>' -> x += 1
                '^' -> y += 1
                'v' -> y -= 1
                else -> throw IllegalStateException("Unknown direction $direction")
            }
            visited[Pair(x, y)] = true

        }

        return visited.count { it.value }.toLong()
    }

    override fun part2(input: List<String>): Long {
        val visited = mutableMapOf<Pair<Int, Int>, Boolean>()

        val santaRoute = input.first().filterIndexed { index, _ -> index % 2 == 0 }
        val roboRoute = input.first().filterIndexed { index, _ -> index % 2 == 1 }

        listOf(santaRoute, roboRoute).forEach { route ->
            var x = 0
            var y = 0
            visited[Pair(0, 0)] = true
            route.forEach { direction ->
                when (direction) {
                    '<' -> x -= 1
                    '>' -> x += 1
                    '^' -> y += 1
                    'v' -> y -= 1
                    else -> throw IllegalStateException("Unknown direction $direction")
                }
                visited[Pair(x, y)] = true
            }
        }

        return visited.count { it.value }.toLong()
    }
}
