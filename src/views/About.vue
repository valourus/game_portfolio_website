<template>
  <div class="about">
    <HelloWorld msg="kek"/>
  </div>
</template>
<script lang="ts">
import HelloWorld from '@/components/HelloWorld.vue';
import Vue from 'vue';
import Component from 'vue-class-component';

@Component({
  components: {
    HelloWorld,
  }
})

export default class About extends Vue {}
</script>
