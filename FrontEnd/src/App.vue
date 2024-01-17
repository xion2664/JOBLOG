<template>
  <div>
    <h1>준비중입니다</h1>
    <RouterLink class="link" :to="{ name:'Home' }">Home</RouterLink>
    <RouterLink class="link" :to="{ name:'Login' }">Login</RouterLink>

  </div>

  <div class="main-content">
    <RouterView/>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from 'vue-router';

</script>

<style>

</style>