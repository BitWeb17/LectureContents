<template>
  <div id="board">
    <h2>Board List</h2>
    <router-link :to="{ name: 'BoardRegisterPage' }">
      새로운 글쓰기
    </router-link>
    <!-- boards 값은 가져왔는데
         웹에서 렌더링 하는 속도보다 느리게 처리되서 -->
    <board-list :boards="boards"/>
  </div>
</template>

<script>
import BoardList from "@/components/BoardList";
import { mapState, mapActions } from 'vuex';
//import { mapActions } from 'vuex';

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
    console.log("BoardListPage Before Create: " + this.boards)
  },
  created() {
    console.log("BoardListPage created(): ")

    this.fetchBoardList()
    .then(res => {
      console.log(res)
    })
  },
  // 실제로 async와 await를 사용했지만 병렬로 돌아가는 루틴이 완화되지 않았음
  // 왜 ? 이미 나누어져 있는 루틴이기 때문에 그러함
  /*
  created: function () {
    console.log("BoardListPage Created: " + this.boards)

    let $vm = this;

    $vm.fetchBoardList()
  },
   */
  beforeMount: function () {
    console.log("BoardListPage Before Mount: " + this.boards)
  },
  mounted() {
    console.log("BoardListPage Mounted: " + this.boards)
  },
  beforeUpdate: function() {
    console.log("BoardListPage Before Update: " + this.boards)
  },
  updated: function () {
    console.log("BoardListPage Updated: " + this.boards)
  },
  beforeDestroy: function () {
    console.log("BoardListPage Before Destroy:" + this.boards)
  },
  destroyed: function () {
    console.log("BoardListPage Destroyed: " + this.boards)
  }
}
</script>

<style scoped>
#board {
  color: deepskyblue;
}
</style>