import {
  FETCH_BOARD_LIST,
  FETCH_BOARD,
  CRAWL_START,
  FIND_ONE
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
  },
  decrement (state) {
    state.count--
  },
  successGenerateRandomNumber (state, payload) {
    state.random = payload
  },
  // for Crawling
  [CRAWL_START] (state, payload) {
    state.lists = payload
  },
  [FIND_ONE] (state, payload) {
    state.news = payload
  }
}
