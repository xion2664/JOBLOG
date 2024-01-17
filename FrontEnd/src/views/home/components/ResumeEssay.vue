<template>
    <div class="container">
        <h2>작성 중인 자소서/이력서</h2>
        <div class="doc-container">
            <img src="@/assets/img/home/icon/doc-mini.svg" alt="doc" class="icon">
            <p>SSAFY 지원 이력서</p>
        </div>
    </div>
</template>

<script setup>

</script>

<style scoped>
  .container {
    margin-bottom: 10px;
    height: 300px;
    padding: 10px 20px;
    border: solid 1px black;
  }
  .doc-container {
    height: 120px;
    width: 100px;
    background-color: rgba(192, 181, 255, 0.701);
    border-radius: 8px;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    text-align: center;
    padding: 10px; /* Added padding for better spacing */
  }

  .icon {
    height: 80px;
    width: 80px;
    margin-bottom: 10px;
  }

  p {
    margin: 0;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 90%; /* Adjust as needed */
  }
</style>
