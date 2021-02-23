<template>
  <div align="center">
    <h2>게시판 글쓰기</h2>
    <board-register-form/>
  </div>
</template>

<script>
import BoardRegisterForm from "@/components/BoardRegisterForm";

export default {
  name: "BoardRegisterPage",
  components: {
    BoardRegisterForm
  }
}
</script>

<style scoped>

</style>