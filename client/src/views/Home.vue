<template>
  <div class="home">
    <img src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div>
</template>

<script lang="ts">
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import Vue from 'vue';
import Component from 'vue-class-component';

@Component({
  components: { 
    HelloWorld,
  }
})

export default class Home extends Vue {}
</script>
