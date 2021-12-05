import common.Solver
import common.runAndTime
import common.loadInput

fun main() {
    val input = loadInput("day-02.txt")
    val solver = Day02()
    runAndTime(solver, input)
}

class Day02 : Solver {

    override fun part1(input: List<String>): Long {
        return input.map {
            val (l, w, h) = it.split("x").map { it.toLong() }
            2*l*w + 2*w*h + 2*h*l + minOf(l*w, w*h, h*l)
        }.sum()
    }

    override fun part2(input: List<String>): Long {
        return input.map {
            val (l, w, h) = it.split("x").map { it.toLong() }
            minOf(2*(l+w), 2*(w+h), 2*(h+l)) + l*w*h
        }.sum()
    }
}
