<template>
  <Layout>
    <template #menubar>
      <v-btn @click="start('society')" text color="black"
             style="padding: 10px; width: 90px">사회</v-btn>
      <v-btn @click="start('politics')" text color="black"
             style="padding: 10px; width: 90px">정치</v-btn>
      <v-btn @click="start('economic')" text color="black"
             style="padding: 10px; width: 90px">경제</v-btn>
      <v-btn @click="start('foreign')" text color="black"
             style="padding: 10px; width: 90px">국제</v-btn>
      <v-btn @click="start('culture')" text color="black"
             style="padding: 10px; width: 90px">문화</v-btn>
      <v-btn @click="start('digital')" text color="black"
             style="padding: 10px; width: 90px">아이티</v-btn>
    </template>
    <template #content>
      <v-simple-table>
        <template v-slot: default>
          <thead>
            <tr>
              <th class="text-left">번호</th>
              <th class="text-left">제목</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="list of lists" :key="list.title">
              <td style="color: gray">{{ list.newsNo }}</td>
              <td><a @click="clickNews(list.newsNo)">
                {{ list.title }}
              </a></td>
            </tr>
          </tbody>
        </template>
      </v-simple-table>
    </template>
  </Layout>
</template>

<script>
import Layout from "@/views/common/Layout";
import { mapState } from 'vuex'

export default {
  name: "CrawlCategoryPage",
  components: { Layout },
  computed: { ...mapState({ lists: state => state.lists })},
  methods: {
    clickNews (newsNo) {
      this.$store.dispatch('crawlFindOne', newsNo)
    },
    start (category) {
      this.$store.dispatch('crawlFind', category)
    }
  }
}
</script>

<style scoped>

</style>