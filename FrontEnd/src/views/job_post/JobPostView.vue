<template>
    <div class="header">
        <div>
            <h1>취업 공고</h1>
        </div>
        <div>
            <RouterLink class="to-diary" :to="{ name:'Home' }"><h4>스크랩 공고 모아보기</h4></RouterLink>
        </div>
    </div>
</template>

<script setup>

</script>

<style scoped>
  .header {
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .to-diary {
    position: relative;
    left: 50%;
  }
</style>