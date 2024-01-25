<template>
  <SubNav/>

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
import SubNav from '../_component/SubNav.vue';

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

</style>