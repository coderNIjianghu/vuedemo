<template>
  名称：<input type = "text" v-model="articleName" placeholder="请输入文章名称"/>
  <br/>
  作者：<input type="password" v-model="authorName" placeholder="请输入作者姓名">
  <br/>
  <button v-on:click="updateClick(articleName,authorName)">保存修改</button>
</template>

<script>
export default {
  name: 'BlogUpdate',
  data:{
  }
}
</script>

<style scoped>

</style>
