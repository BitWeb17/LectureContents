<template>
  <div class="home">
    <div id="header">
      <router-link :to="{ name: 'Home' }"
                   class="nav-link" active-class="active">
        Home
      </router-link>
      <router-link :to="{ name: 'About' }"
                   class="nav-link" active-class="active">
        About Us
      </router-link>
      <router-link :to="{ name: 'Test' }"
                   class="nav-link" active-class="active">
        Test
      </router-link>
    </div>
    <h1>페이지 홈(Home)</h1>
    <div id="app">
      {{ message }}<br>
    </div>
  </div>
</template>

<script>

/* eslint-disable no-unused-vars */
import store from '../store'
import Vue from 'vue'
import cookies from 'vue-cookies'

Vue.use(cookies)

export default {
  name: 'Home',
  data: function () {
    return {
      message: 'test'
    }
  }
}
</script>

<style scoped>
div {
  border: 1px solid #cccccc;
}
#header {
  padding: 15px;
  margin-bottom: 15px;
  margin: 5px 5px;
}
</style>