package minesweeper.domain.board

data class Position(val x: Int, val y: Int) {

    companion object {
        fun of(x: Int, y: Int): Position = Position(x, y)
    }
}
