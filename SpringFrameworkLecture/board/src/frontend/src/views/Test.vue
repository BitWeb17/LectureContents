<template>
  <div>
    <h1>뷰 테스트 페이지 입니다.</h1>
    <button v-on:click="reverseMsg">Reverse Message</button>
    <p>{{ message }}</p>
    <b>count: {{ this.$store.state.count }}</b><br>
    <b>count^2: {{ this.$store.getters.countSquare }}</b><br>
    <input type="button" @click="increment()" value="increment"/>
  </div>
</template>

<script>
import Vue from 'vue'
import cookies from 'vue-cookies'

Vue.use(cookies)

export default {
  name: "Test",
  data () {
    return {
      message: "안녕 난 뷰야 ~"
    }
  },
  methods: {
    reverseMsg: function () {
      this.message = this.message.split('').reverse().join('')
    },
    increment: function () {
      this.$store.commit('increment')
      this.$cookies.set('value',
          this.$store.state.count, '5s')
    }
  },
  created() {
    this.$store.state.count = this.$cookies.get('value')
  }
}
</script>

<style scoped>

</style>