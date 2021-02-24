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
      <router-link :to="{ name: 'BoardListPage' }"
                   class="nav-link" active-class="active">
        Board
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
  },
  beforeCreate: function () {
    console.log("Home Before Create: ")
  },
  created: function () {
    console.log("Home Created: ")
  },
  beforeMount: function () {
    console.log("Home Before Mount: ")
  },
  mounted: function () {
    console.log("Home Mounted: ")
  },
  beforeUpdate: function() {
    console.log("Home Before Update: ")
  },
  updated: function () {
    console.log("Home Updated: ")
  },
  beforeDestroy: function () {
    console.log("Home Before Destroy: ")
  },
  destroyed: function () {
    console.log("Home Destroyed: ")
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