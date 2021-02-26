import {
  FETCH_BOARD_LIST,
  FETCH_BOARD,
  FIND_ONE,
  CRAWL_START
} from './mutation-types'

import axios from 'axios'
import router from "@/router";

export default {
  async crawlFind ({ commit }, category) {
    axios.get('http://localhost:7777/' + `${category}`)
        .then(({ data }) => {
            commit(CRAWL_START, data)
            if (window.location.pathname !== '/crawlCategory') {
                router.push('/crawlCategory')
            }
        })
  },
  async crawlFindOne ({ commit }, newsNo) {
    axios.get('http://localhost:7777/news/' + `${newsNo}`)
      .then(({ data }) => {
        commit(FIND_ONE, data)
        router.push('/crawlCategory/news')
      })
  },
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
        console.log('fetchBoard - res: ' + res.data)
        commit(FETCH_BOARD, res.data)
      })
  },
  generateRandomNumber ({ commit }) {
      axios.get('http://localhost:7777/random')
          .then((res) => {
              console.log('res = ' + parseInt(res.data.randNumber))
              commit('successGenerateRandomNumber',
                  parseInt(res.data.randNumber))
          })
  }
}
