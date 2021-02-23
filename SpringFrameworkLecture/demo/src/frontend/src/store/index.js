import Vue from 'vue'
import Vuex from 'vuex'

import states from "@/store/states";
import actions from "@/store/actions";
import mutations from "@/store/mutations";

Vue.use(Vuex)

export default new Vuex.Store({
  states,
  mutations,
  actions,
  //getters
})
