<template>
  <div class="resume-container">
    <div class="resume-upper">
      <div class="resume-picture">

      </div>
      <div class="personal-info">
        <div class="name">
          <div class="ko-name">
            이름
          </div>
          <div>
            <input type="text">
          </div>
          <div class="en-name">
            영문이름
          </div>
          <div>
            <input type="text">
          </div>
        </div>
        <div class="reg-number">
          <div>주민등록번호</div>
          <div><input type="text"></div>
        </div>
        <div class="numbers">
          <div class="mobile-number">
            H.P
          </div>
          <div><input type="text"></div>
          <div class="home-number">
            Tel.
          </div>
          <div><input type="text"></div>
        </div>
        <div class="email">

        </div>
        <div class="address">

        </div>
      </div>
    </div>
    <div class="section">
      <div class="section-title">학력사항</div>
        <div>
          <table>
            <colgroup>
              <col style="width: 25%;">
              <col style="width: 30%;">
              <col style="width: 30%;">
              <col style="width: 15%;">
            </colgroup>
            <tbody>
              <tr>
                <td>재학기간</td>
                <td>학교</td>
                <td>전공</td>
                <td>구분</td>
              </tr>
            </tbody>
          </table>
        <hr>
      </div>
    </div>
    <div class="section">
      <div class="section-title">경력사항</div>
      <div>
        <table>
          <colgroup>
            <col style="width: 25%;">
            <col style="width: 40%;">
            <col style="width: 20%;">
            <col style="width: 15%;">
          </colgroup>
          <tbody>
            <tr>
              <td>근무기간</td>
              <td>회사/부서</td>
              <td>직위</td>
              <td>담당업무</td>
            </tr>
          </tbody>
        </table>
        <hr>
      </div>
    </div>  
    <div class="section">
      <div class="section-title">교육</div>
      <hr class="thick">
    </div>
    <div class="section">
      <div class="section-title">대외활동</div>
      <hr class="thick">
    </div>
  </div>
</template>

<script setup>

</script>

<style scoped>
  .resume-container {
    display: grid;
    grid-template-rows: repeat(5, 1fr);
    width: 210mm;
    height: 297mm;
    gap: 10px;
  }

  .resume-upper {
    display: grid;
    grid-template-columns: 1fr 3.5fr;
    border: 1px solid black;
  }

  .resume-picture {
    border: 1px solid black;
    padding: 10px;
    box-sizing: border-box;
  }

  .personal-info {
    display: grid;
    grid-template-rows: repeat(5, 1fr);
  }

  .section {
    border-bottom: 1px solid black;
  }

  .section-title {
    border-bottom: 1px solid black;
    padding-bottom: 5px;
    margin-bottom: 5px;
  }

  table {
    width: 100%; /* Table takes the full width of its container */
    border-collapse: collapse; /* Optional: for a cleaner look */
  }
  
  .thick {
    border: 2px;
  }

  .reg-number {
    display: grid;
    grid-template-columns: 1fr 3fr;
  }
  .name, .numbers {
    display: grid;
    grid-template-columns: 1fr 3fr 1fr 3fr;
  }
</style>