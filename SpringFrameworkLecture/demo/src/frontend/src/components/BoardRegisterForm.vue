<template>
  <div>
    <h3>글쓰기 형식</h3>
    <button type="submit">등록</button>
    <router-link :to="{ name: 'BoardListPage' }">
      취소
    </router-link>
  </div>
</template>

<script>
export default {
  name: "BoardRegisterForm"
}
</script>

<style scoped>

</style>