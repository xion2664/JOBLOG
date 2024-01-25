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
          <h1>자기소개서</h1>
        <div class="header-right">
          <button @click="toggleModal"><h1>+</h1></button>
        </div>
        <hr>
      </div>
      <div class="essay-list">
        <div v-if="resumeList.length > 0">
        자소서 나올 곳
        </div>
        <div v-else class="empty-essay"> 
          <p>아직 자기소개서를 작성하지 않으신 것 같아요!</p>
          <p>자기소개서 문항을 하나 작성해볼까요?</p>
        </div>
      </div>
    </div>
  </div>

  <div v-if="showModal" class="modal">
    <div class="modal-content">
      <h2>새 항목 작성</h2>
      <div>
      <label for="category">카테고리:</label>
      <input type="text" id="category" v-model="newEssay.category">
      <button v-if="!showAdd" @click="toggleShowAdd">추가</button>
      <button v-if="showAdd" @click="toggleShowAdd">취소</button>

      <div v-if="showAdd" class="add-category">
        <input type="text" placeholder="카테고리를 추가하세요">
      </div>
      </div>
      <label for="question">질문:</label>
      <input type="text" id="question" v-model="newEssay.question">

      <label for="answer">답변:</label>
      <textarea id="answer" v-model="newEssay.answer"></textarea>
      <div>{{ newEssay.answer.length }}자</div>
      <div class="modal-buttons">
        <button @click="testing">제출</button>
        <button @click="toggleModal">닫기</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref, computed, onMounted } from 'vue';
import { useApplicationStore } from '@/stores/application';

const applicationStore = useApplicationStore()

const resumeList = applicationStore.resumeList
console.log(applicationStore.resumeList)
const showModal = ref(false);
const toggleModal = function() {
  showModal.value = !showModal.value
  console.log(showModal.value)
}

const newEssay = ref({
  category: '',
  question: '',
  answer: ''
})

const submitEssay = () => {
  // Logic to handle essay submission
  // After submission:
  showModal.value = false
  // Reset form or handle post-submission logic
}

const submitEssay2 = function() {
  axios({
    method: 'put', 
    url: `notyet`,
    headers: {
      Authorization: `Token`
    },
    data: {
      question: newEssay.value.question,
      answer: newEssay.value.answer
    }
  })
  
}

const category = ref({
  categoryName: ''
})

const showAdd = ref(false)
const toggleShowAdd = function() {
  showAdd.value = !showAdd.value
}

const submitCategory = function() {
  axios({
    method: 'put', 
    url: `notyet`,
    headers: {
      Authorization: `Token`
    },
    data: {
      question: newEssay.value.question,
      answer: newEssay.value.answer
    }
  })
  
}

const testing = function() {
  console.log(newEssay.value)
}
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

  .empty-essay {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 500px;
    font-size: 24px;
  }

  .modal {
    position: fixed;
    top: 10%;
    width: 1100px;
    height: 700px;
    background-color: rgba(0, 0, 0, 0.5);
    display: flex;
    align-items: center;
    justify-content: center;
    z-index: 1;
  }

  .modal-content {
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    display: flex;
    flex-direction: column;
    width: 1000px;
    height: 600px;
  }

  .modal-content textarea {
    resize: none;
    width: 994px;
    height: 200px
  }

  .modal-buttons {
    margin-left: auto;
  }
  .modal-content h2 {
    margin-top: 0;
  }
</style>