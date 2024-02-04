<script setup>
import { onMounted } from "vue";
import QnAList from "./components/QnAList.vue";
import { useCommunityStore } from "@/stores/community";

onMounted(() => {});
</script>

<template>
  <div class="community-container">
    <div class="title-space">
      <div class="title">
        <h1>Q&A 게시판</h1>
        <p>현직자와 취준생 간의 궁금한 이야기</p>
      </div>
      <div class="sub">
        <div class="search">
          <input type="text" placeholder="검색어를 입력하세요" />
          <a><i class="fa-solid fa-magnifying-glass pointer"></i></a>
        </div>
        <RouterLink :to="{ name: 'QnACreate' }">
          <a class="edit-btn clickable-btn">질문 작성하기</a>
        </RouterLink>
      </div>
    </div>
    <QnAList />
  </div>
</template>

<style scoped>
.title-space {
  display: flex;
  justify-content: space-between;
  padding: 50px 0;
}
.title-space .title h1 {
  margin-bottom: 5px;
  font-weight: 900;
}

.title-space .sub {
  display: flex;
  align-items: center;
  gap: 10px;
}

.search {
  padding: 0 20px 0 10px;
  border: 1px solid var(--border-gray);
  border-radius: 10px;
}
.search input {
  border: none;
}
</style>
