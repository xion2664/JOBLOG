<template>
    <div class="second-nav">
        <div>취준게시판</div> |
        <RouterLink :to="{ name: 'EmployeeBoard' }"> <div>현직게시판</div> </RouterLink>
    </div>
    <div>
        <h1>취준생 게시판</h1>

    </div>
    <div>
        <ArticleList1/>
        <br>
    </div>
</template>

<script setup>
import { RouterLink } from 'vue-router';
import ArticleList1 from './components/ArticleList1.vue';
</script>

<style scoped>
  .second-nav {
    display: flex;
    justify-content: flex-start;
    width: 100%;
    gap: 20px;
  }
</style>