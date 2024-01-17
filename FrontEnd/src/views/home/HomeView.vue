<template>
  <!-- 로그인 시 화면 전환되는 메인 페이지를 구현하기 위한 버튼 -->
  <button @click="toggleLogin">로그인 상태 전환인 척하는 버튼</button>

  <div v-if="!isLoggedIn">
  <div class="main-img">
      <img src="../../assets/img/home/main-img-1.png" alt="main img">
  </div>

  <RouterLink :to="{ name: 'Login' }">
      <img src="../../assets/img/home/main-login-img.png" alt="loginbutton" class="login-button-img">
  </RouterLink>
  </div>

  <div v-else class="logged-in-content">
      <p>You are logged in!</p>
  </div>

  <!-- Toggle Button -->
</template>

<script setup>
import { ref } from 'vue'

// 로그인/로그아웃 상태를 대체하는 버튼 및 화면 전환용 로직
// 나중에는 isAuthenticated나, token값 등을 사용하여 버튼 없이 자동 전환
const isLoggedIn = ref(false)

function toggleLogin() {
  isLoggedIn.value = !isLoggedIn.value
}
// ----------------------------------------------------

</script>

<style scoped>
.main-img {
  display: flex;
  width: 1920px;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  z-index: -1;
}
.login-button-img {
  position: relative;
  top: -400px;
  left: 73%;
  transform: translate(-50%, -50%);
}
.logged-in-content {
  /* Styles for logged-in content */
}
</style>
