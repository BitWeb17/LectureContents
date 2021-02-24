<template>
  <div align="center">
    <h2>게시판 글쓰기</h2>
    <board-register-form @submit="onsubmit"/>
  </div>
</template>

<script>
import BoardRegisterForm from "@/components/BoardRegisterForm";
import axios from 'axios'

export default {
  name: "BoardRegisterPage",
  components: {
    BoardRegisterForm
  },
  methods: {
    onsubmit (payload) {
      console.log('BoardRegisterPage onSubmit()')
      const { title, content, writer } = payload
      axios.post('http://localhost:7777/boards',
          { title, content, writer})
      .then(res => {
        console.log(res)
        alert('등록이 잘 되었습니다.')
        this.$router.push({
          name: 'BoardReadPage',
          params: { boardNo: res.data.boardNo.toString() }
        })
      })
    }
  },
  beforeCreate: function () {
    console.log("BoardRegisterPage Before Create: ")
  },
  created: function () {
    console.log("BoardRegisterPage Created: ")
  },
  beforeMount: function () {
    console.log("BoardRegisterPage Before Mount: ")
  },
  mounted: function () {
    console.log("BoardRegisterPage Mounted: ")
  },
  beforeUpdate: function() {
    console.log("BoardRegisterPage Before Update: ")
  },
  updated: function () {
    console.log("BoardRegisterPage Updated: ")
  },
  beforeDestroy: function () {
    console.log("BoardRegisterPage Before Destroy: ")
  },
  destroyed: function () {
    console.log("BoardRegisterPage Destroyed: ")
  }
}
</script>

<style scoped>

</style>