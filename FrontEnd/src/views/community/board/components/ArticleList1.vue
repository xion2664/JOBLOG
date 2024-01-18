<template>
    <div>
        <table>
            <colgroup>
                <col style="width: 50px;">
                <col style="width: 800px;">
                <col style="width: 75px;">
                <col style="width: 75px;">
                <col style="width: 75px;">
                <col style="width: 75px;">
            </colgroup>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                    <th>좋아요</th>
                    <th>댓글</th>
                    <th>조회수</th>
                </tr>
            </thead>

        </table>

        <br>
        
        <ArticleListItem1/>
        <br>
        <ArticleListItem1/>

    </div>
</template>

<script setup>
import ArticleListItem1 from "./items/ArticleListItem1.vue";

</script>

<style scoped>
    th {
        border-bottom: 1px black solid;
    }
</style>