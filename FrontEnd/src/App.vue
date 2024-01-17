<template>
  <header><NavBar/></header>

  <div class="main-content">
    <RouterView/>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from 'vue-router';
import NavBar from './views/home/components/NavBar.vue';
</script>

<style>
  header, .main-content {
    max-width: 1920px;
    margin: 0 auto; /* This will center your header and main content */
    padding: 0px 288px;
    box-sizing: border-box;
    border-bottom: 1px solid #D9D9D9;
  }

  header {
    display: flex;
    height: 100px;
    align-items: center;
    justify-content: center;
  }

  .main-content {
    width: 100%;
    display: flex;
    flex-direction: column;
  }
</style>