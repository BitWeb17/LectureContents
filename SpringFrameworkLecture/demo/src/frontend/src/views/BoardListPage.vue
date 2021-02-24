<template>
  <div id="board">
    <h2>Board List</h2>
    <router-link :to="{ name: 'BoardRegisterPage' }">
      새로운 글쓰기
    </router-link>
    <board-list :boards="boards"/>
  </div>
</template>

<script>
import BoardList from "@/components/BoardList";
import { mapState, mapActions } from 'vuex';

export default {
  name: "BoardListPage",
  components: {
    BoardList
  },
  computed: {
    ...mapState(['boards'])
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  },
  beforeCreate: function () {
    console.log("BoardListPage Before Create: ")
  },
  // 실제로 async와 await를 사용했지만 병렬로 돌아가는 루틴이 완화되지 않았음
  // 왜 ? 이미 나누어져 있는 루틴이기 때문에 그러함
  created: async function () {
    console.log("BoardListPage Created: ")

    await this.fetchBoardList()
  },
  beforeMount: function () {
    console.log("BoardListPage Before Mount: ")
  },
  mounted() {
    console.log("BoardListPage Mounted: ")

    //this.fetchBoardList()
  },
  beforeUpdate: function() {
    console.log("BoardListPage Before Update: ")
  },
  updated: function () {
    console.log("BoardListPage Updated: ")
  },
  beforeDestroy: function () {
    console.log("BoardListPage Before Destroy: ")
  },
  destroyed: function () {
    console.log("BoardListPage Destroyed: ")
  }
}
</script>

<style scoped>
#board {
  color: deepskyblue;
}
</style>