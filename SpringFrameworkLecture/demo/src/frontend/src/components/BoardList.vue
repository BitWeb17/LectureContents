<template>
  <div>
    <h3>게시판 보기</h3>
    <router-link :to="{ name: 'BoardReadPage',
                        params: { boardNo: 1 } }">
      게시글 보기
    </router-link>
  </div>
</template>

<script>
export default {
  name: "BoardList"
}
</script>

<style scoped>

</style>