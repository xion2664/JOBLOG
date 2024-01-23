<template>
  <div class="links">
    <RouterLink :to="{ name: 'BlogSchedule' }">나의 캘린더</RouterLink> |
    <RouterLink :to="{ name: 'BlogJournal' }">다이어리 목록</RouterLink> |
    <div>이력서/자소서</div>
  </div>

  <div class="application-container">
    <div class="application-left">
      <div class="application-header">
        <div>
          <h1>이력서</h1>
        </div>
        <div class="header-right">
          <h1>+</h1>
        </div>
        <hr>
      </div>
      <div class="application-list">
        이력서 나올 곳
      </div>
    </div>
    <div class="application-right">
      <div class="application-header">
        <div>
          <h1>자기소개서</h1>
        </div>
        <div class="header-right">
          <RouterLink :to="{ name:'EssayCreate' }"><h1>+</h1></RouterLink>
        </div>
        <hr>
      </div>
      <div class="essay-list">
        자소서 나올 곳
      </div>
    </div>
  </div>
</template>

<script setup>

</script>

<style scoped>
  .links {
    display: flex;
    gap: 5px;
  }

  .application-container {
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 10px;
    width: 1344px;
    box-sizing: border-box;
    padding: 20px;
    border: 1px solid black;
    border-radius: 8px;
    margin-top: 20px;
  }

  .application-left, .application-right {
    display: grid;
    grid-template-rows: 1fr 9fr;
    border: 1px solid black;
    border-radius: 8px;
    box-sizing: border-box;
    padding: 40px;
  }

  .application-header {
    display: grid;
    grid-template-columns: 1fr 1fr;
  }

  .header-right {
    margin-left: auto;
  }

  .application-list, .essay-list {
    border: 1px solid black;
    border-radius: 8px;
  }
</style>