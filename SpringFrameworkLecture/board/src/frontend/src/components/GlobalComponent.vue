<template>
  <button @click="addCounter">{{ counter }}</button>
</template>

<script>
export default {
  name: "GlobalComponent",
  // GlobalComponent 연결시 initial-counter
  props: ['initialCounter'],
  data: function () {
    return {
      counter: this.initialCounter
    }
  },
  methods: {
    addCounter () {
      this.counter++
    }
  }
}
</script>

<style scoped>

</style>