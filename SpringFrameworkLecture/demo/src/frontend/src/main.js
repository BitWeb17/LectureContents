import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';
import cookies from "vue-cookies";

Vue.config.productionTip = false
Vue.use(cookies)

new Vue({
  router,
  store,
  vuetify,
  cookies,
  render: h => h(App)
}).$mount('#app')
