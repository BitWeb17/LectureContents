import {
    FETCH_BOARD_LIST,
    FETCH_BOARD
} from './mutation-types'

import axios from "axios";

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/boards')
            .then(res => {
                commit(FETCH_BOARD_LIST, res.data)
            })
    },
    fetchBoard ({ commit }, boardNo) {
        console.log('fetchBoard ' + commit + ', boardNo = ' + boardNo)

        return axios.get(`http://localhost:7777/boards/${boardNo}`)
            .then(res => {
                commit(FETCH_BOARD, res.data)
            })
    }
}