<template>
  <div class="list-content">
    <QnAListItem />
  </div>
</template>

<script setup>
import QnAListItem from "./items/QnAListItem.vue";
</script>

<style scoped>
.list-content {
  display: flex;
  flex-direction: column;
  height: 800px;
  max-height: 1300px;
}
</style>
