<template>
  <v-app>
    <v-app-bar app clipped-right color="blue" black>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer">
      </v-app-bar-nav-icon>
      <v-spacer></v-spacer>
      <slot name="menubar"></slot>
    </v-app-bar>

    <v-navigation-drawer v-model="drawer" app>
      <v-list dense>
        <v-list-item @click.stop="left = !left">
          <v-list-item-action>
            <v-icon>mdi-exit-to-app</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title @click="home">홈으로</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <v-list dense>
        <v-list-item @click.stop="left = !left">
          <v-list-item-action>
            <v-icon>mdi-exit-to-app</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title @click="category">카테고리별 분류 보기</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <v-list dense>
        <v-list-item @click.stop="left = !left">
          <v-list-item-action>
            <div>>>></div>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title @click="suggest">당신을 위한 추천</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <v-list dense>
        <v-list-item @click.stop="left = !left">
          <v-list-item-action>
            <v-icon>mdi-exit-to-app</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title @click="savednews()">스크랩한 기사 보기</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-container>
      <v-content id="content">
        <slot name="content" class="font"></slot>
      </v-content>
    </v-container>

    <v-footer app color="blue" class="white--text">
      <v-spacer></v-spacer>
      <span>&copy; 크롤링 프로젝트</span>
    </v-footer>
  </v-app>
</template>

<script>
import router from "@/router";

export default {
  name: "Layout",
  data: () => ({
    drawer: false,
    left: false
  }),
  methods: {
    home () {
      (window.location.pathname !== '/') ?
          router.push('/') : router.go(0)
    },
    category () {
      (window.location.pathname !== '/crawlCategory') ?
          router.push('/crawlCategory') : router.go(0)
    }
  }
}
</script>

<style scoped>

</style>