<template>
  <div align="center">
    <h2>게시글 읽기</h2>
    <board-read v-if="board" :board="board"/>
    <p v-else>로딩중 ...</p>
    <router-link :to="{ name: 'BoardModifyPage', params: { boardNo } }">
      수정
    </router-link>
    <button @click="onDelete">Delete</button>
    <router-link :to="{ name: 'BoardListPage' }">
      목록
    </router-link>
  </div>
</template>

<script>
import BoardRead from '@/components/BoardRead'
import { mapState, mapActions } from 'vuex'
import axios from 'axios'

export default {
  name: 'BoardReadPage',
  props: {
    boardNo: {
      type: String,
      required: true
    }
  },
  computed: {
    ...mapState([
      'board'
    ])
  },
  created () {
    console.log('BoardReadPage created(): ' + this.boardNo)
    this.fetchBoard(this.boardNo)
      .catch(err => {
        alert(err.response.data.message)
        this.$router.push()
      })
  },
  methods: {
    ...mapActions([
      'fetchBoard'
    ]),
    onDelete () {
      const { boardNo } = this.board
      axios.delete(`http://localhost:7777/boards/${boardNo}`)
        .then(() => {
          alert('Delete Success')
          this.$router.push({ name: 'BoardListPage' })
        })
        .catch(err => {
          alert(err.response.data.message)
        })
    }
  },
  components: {
    BoardRead
  }
}
</script>
