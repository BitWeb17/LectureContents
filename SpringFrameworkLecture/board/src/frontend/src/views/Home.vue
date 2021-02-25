<template>
  <div class="home">
    <!-- <img alt="Vue logo" src="../assets/logo.png"> -->
    <div id="header">
      <router-link :to="{ name: 'Home' }"
                   class="nav-link"
                   active-class="active">
        홈
      </router-link>
      <router-link :to="{ name: 'About' }"
                   class="nav-link"
                   active-class="active">
        소개
      </router-link>
      <router-link :to="{ name: 'Test' }"
                   class="nav-link"
                   active-class="active">
        테스트
      </router-link>
      <router-link :to="{ name: 'BoardListPage' }"
                   class="nav-link"
                   active-class="active">
        게시판
      </router-link>
      <h2>This is an Home Page</h2>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'
/* eslint-disable no-unused-vars */
import store from '../store'
import Vue from 'vue'
// import cookies from 'vue-cookies'

import { mapState, mapGetters, mapActions } from 'vuex'

// Vue.use(cookies)

export default {
  name: 'Home',
  data: function () {
    return {
      message: 'Vue Test Message'
    }
  },
  components: {
  }
}
</script>

<style scoped>
div {
  border: 1px solid #ccc;
}

#header {
  padding: 15px;
  margin-bottom: 15px;
  margin: 5px 5px;
}
</style>
