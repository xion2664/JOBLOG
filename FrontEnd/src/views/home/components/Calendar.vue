<template>
  <h2>나의 취준 일정</h2>
    <div class="container">
      <div class="calendar">
        <img src="@/assets/img/home/icon/diary-mini.svg" alt="diary-svg" class="icon">
      </div>
      <div class="calendar-schedule">
        <div class="schedule-header">
          오늘의 일정
        </div>
      </div>
    </div>
</template>

<script setup>

</script>

<style scoped>
  .container {
    display: grid;
    grid-template-columns: 2.3fr 1fr;
    height: 500px;
    border: solid 1px black;
    margin-bottom: 10px;
    padding: 0px;
    gap: 10px;
  }

  .calendar, .calendar-schedule {
    border: 1px black solid;
    border-radius: 8px;
  }
  .icon {
    width: 25px;
    height: 25px;
  }
</style>