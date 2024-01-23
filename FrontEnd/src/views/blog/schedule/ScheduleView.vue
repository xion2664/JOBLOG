<template>
  <div class="links">
    <div>나의 캘린더</div> |
    <RouterLink :to="{ name:'BlogJournal' }">다이어리 목록</RouterLink> |
    <RouterLink :to="{ name:'BlogApplication' }">이력서/자소서</RouterLink>
  </div>
  <div class="blog-schedule">
      <div>
          <h1>취준로그</h1>
      </div>
      <div class="calendar-container">
        <div class="calendar">
            달력 들어갈 자리
        </div>
        <div class="schedule">
            일정 들어갈 자리
        </div>
      </div>
  </div>
</template>

<script setup>
import { RouterLink } from 'vue-router';
</script>

<style scoped>
  .blog-schedule {
    display: grid;
    grid-template-rows: 1fr 9fr;
    width: 1344px;
    height: 600px;
    gap: 10px;
  }

  .calendar-container {
    display: grid;
    grid-template-columns: 7fr 3fr;
    gap: 20px;
  }

  .calendar {
    border: 1px solid black;
    border-radius: 8px;
  }

  .schedule {
    border: 1px solid black;
    border-radius: 8px;
  }

  .links {
    display: flex;
    gap: 5px;
  }
</style>