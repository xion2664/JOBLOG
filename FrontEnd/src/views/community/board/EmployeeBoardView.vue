<template>
    <div class="second-nav">
        <RouterLink :to="{ name: 'ApplicantBoard' }"> <div>취준게시판</div></RouterLink> |
        <div>현직게시판</div> |
        <RouterLink :to="{ name: 'QnABoard' }"><div>QnA게시판</div></RouterLink>

    </div>
    <div>
        <h1>현직자 게시판</h1>

    </div>
    <div>
        <ArticleList2/>
    </div>
</template>

<script setup>
import { RouterLink } from 'vue-router';
import ArticleList2 from './components/ArticleList2.vue';
</script>

<style scoped>
  .second-nav {
    display: flex;
    justify-content: flex-start;
    width: 1344px;
    gap: 20px;
  }
</style>