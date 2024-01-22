<template>
    <div class="container">
        <div class="header">
            <input type="text" placeholder="제목을 입력하세요" class="header-text">
        </div>
        <textarea placeholder="본문 내용을 입력하세요" class="main-text"></textarea>
        <button class="submit">글쓰기</button>
    </div>
</template>

<script setup>
  // Your script content
</script>

<style scoped>
  .container {
    display: flex;
    flex-direction: column;
    width: 100%;
    margin: 0 auto;
    padding: 10px;
  }

  .header {
    width: 100%;
    margin-bottom: 10px; /* Optional, for spacing */
  }

  .header-text {
    width: 100%;
    padding: 10px;
    box-sizing: border-box; /* To include padding in width */
  }

  .main-text {
    width: 100%;
    padding: 10px;
    box-sizing: border-box; /* To include padding in width */
    min-height: 150px; /* Optional, for initial height */
  }

  .submit {
    margin-left: auto;
  }

</style>
