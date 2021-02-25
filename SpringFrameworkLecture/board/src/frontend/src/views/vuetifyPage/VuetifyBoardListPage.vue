<template>
  <div align="center">
    <h2>뷰티파이 기반 게시판</h2>
    <!-- Vuetify Form 배치 -->
    <vuetify-board-list-page-form :list-array="pageArray"/>
  </div>
</template>

<script>
import VuetifyBoardListPageForm from "@/components/vuetify/VuetifyBoardListPageForm";
import axios from "axios";

export default {
  name: "VuetifyBoardListPage",
  components: {
    VuetifyBoardListPageForm
  },
  data () {
    return {
      pageArray: []
    }
  },
  created () {
    axios.get('http://sample.bmaster.kro.kr/contacts')
      .then(res => {
        this.pageArray = res.data.contacts
      })
      .catch(err => {
        console.log(err)
      })
  }
}
</script>

<style scoped>

</style>