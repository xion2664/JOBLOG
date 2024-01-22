<template>
    <div class="second-nav">
        <RouterLink :to="{ name: 'ApplicantBoard' }"> <div>취준게시판</div></RouterLink> |

        <RouterLink :to="{ name: 'EmployeeBoard' }"> <div>현직게시판</div> </RouterLink> |
        <div>QnA게시판</div>
    </div>
    <div>
        <h3>QnA 게시판</h3>

    </div>
</template>

<script setup>

</script>

<style scoped>
  .second-nav {
    display: flex;
    justify-content: flex-start;
    width: 1344px;
    gap: 20px;
  }

</style>