<template>
  <form @submit.prevent="onsubmit">
    <h3>게시판 글쓰기</h3>
    <table>
      <tr>
        <td>Title</td>
        <td>
          <input type="text" v-model="title"/>
        </td>
      </tr>
      <tr>
        <td>Writer</td>
        <td>
          <input type="text" v-model="writer"/>
        </td>
      </tr>
      <tr>
        <td>Content</td>
        <td>
          <textarea v-model="content"></textarea>
        </td>
      </tr>
    </table>

    <div>
      <button type="submit">등록하기</button>
      <router-link :to="{ name: 'BoardListPage' }">
        취소
      </router-link>
    </div>
  </form>
</template>

<script>
export default {
  name: "BoardRegisterForm",
  data () {
    return {
      title: '',
      writer: '',
      content: ''
    }
  },
  methods: {
    onsubmit () {
      const { title, writer, content } = this
      this.$emit('submit', { title, writer, content })
    }
  }
}
</script>

<style scoped>

</style>