<template>
  <div align="center">
    <h2>게시판 수정</h2>
    <board-modify-form v-if="board" :board="board" @submit="onsubmit"/>
    <p v-else>로딩중 ... </p>
  </div>
</template>

<script>
export default {
  name: "BoardModifyPage"
}
</script>

<style scoped>

</style>