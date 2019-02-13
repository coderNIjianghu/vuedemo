<template>
  <div>
    <blog-header></blog-header>
    <hr/>
    <div>
      这是首页，嘻嘻嘻。
    </div>
    <hr/>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
import BlogHeader from './BlogHeader'
import BlogFooter from './BlogFooter'
export default {
  name: 'BlogIndex',
  components: { BlogHeader, BlogFooter},
  comments: { BlogHeader, BlogFooter }
}
</script>

<style scoped>
</style>
