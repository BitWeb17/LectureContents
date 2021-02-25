import {
  FETCH_BOARD_LIST,
  FETCH_BOARD
} from './mutation-types'

export default {
  // for Board
  [FETCH_BOARD_LIST] (state, boards) {
    state.boards = boards
  },
  [FETCH_BOARD] (state, board) {
    state.board = board
  },
  // for Test
  increment (state) {
    state.count++
  }
}
