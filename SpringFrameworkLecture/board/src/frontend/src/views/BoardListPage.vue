<template>
  <div id="board">
    <h2>Board List</h2>
    <router-link :to="{ name: 'BoardRegisterPage' }">
      글쓰기
    </router-link>
    <board-list :boards="boards"/>
  </div>
</template>

<script>
import BoardList from '@/components/BoardList'
import { mapState, mapActions } from 'vuex'

export default {
  name: 'BoardListPage',
  components: {
    BoardList
  },
  computed: {
    ...mapState(['boards'])
  },
  mounted () {
    this.fetchBoardList()
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  }
}

</script>
