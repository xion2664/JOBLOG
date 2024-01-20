<template>
    <div class="qna-header">
        <div class="header-left">
            <h4>Q&A 게시판</h4>
            <span>현직자와 취준생 간의 궁금한 이야기</span>
        </div>
        <div class="header-right">
            <input type="text"> 검색기능 
        </div>
    </div>
    <div class="qna-body">

    </div>
</template>

<script setup>

</script>

<style scoped>
  .qna-header { 
    display: grid;
    grid-template-columns: 1fr 1fr;
  }

  .header-left {

  }

  .qna-body {
    display: grid;
    grid-template-rows: 1fr 1fr 1fr 1fr 1fr;
  }
</style>