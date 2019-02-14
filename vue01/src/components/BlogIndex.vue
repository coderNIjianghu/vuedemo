
<template>
  <div>
  <el-table
    :data="tableData"
    style="width: 60%">
    <el-table-column
      prop="id"
      label="序号"
      width="180">
    </el-table-column>
    <el-table-column
      prop="articlename"
      label="名称"
      width="180">
    </el-table-column>
    <el-table-column
      prop="articleauthor"
      label="作者">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="150">
      <template slot-scope="scope">
        <el-button type="text" @click="open6(scope.row)" size="small">删除</el-button>
        <el-button type="text" @click="open1(true,scope.row.id)" size="small">修改</el-button>
      </template>
    </el-table-column>
  </el-table>

<div @click="open1(false)" id="id1">添加</div>
  </div>

</template>


<script>

import BlogHeader from './BlogHeader'
import BlogFooter from './BlogFooter'
export default {
  name: 'BlogIndex',
  components: { BlogHeader, BlogFooter},
  // comments: { BlogHeader, BlogFooter },
  inject:['reload'],
  data() {
    return {
      tableData: []
    }
  },
  mounted:function() {
    this.getArticleList();
  },
  methods: {
    getArticleList () {
      this.$axios
        .post('/getArticleList',{
        })
        .then(successResponse =>{
          this.tableData = successResponse.data.data
          console.log(successResponse.data.data)
        })
    },
    deleteClick(row) {
      this.$axios
        .get('/deleteById',{
          params :{
            id:row.id
          }
        })
        .then(successResponse =>{
          this.reload()
        })
    },
      open6(row) {
      let _row = row
        this.$confirm('请确认是否删除？', '确认信息', {
          distinguishCancelAndClose: true,
          confirmButtonText: '删除',
          cancelButtonText: '放弃'
        })
          .then(() => {
            this.$message({
              type: 'info',
              message: '删除成功',
            });
            this.deleteClick(_row)
          })
          .catch(action => {
            this.$message({
              type: 'info',
              message: action === 'cancel'
                ? '操作取消'
                : '停留在当前页面'
            })
          });
      },
      open1 (isUpdate,rowId) {
        //传对象
        // row['isUpdate']=isUpdate;
        // this.$router.push({path: '/add',query:row});
        this.$router.push({path: '/add',query:{isUpdate:isUpdate,rowId:rowId}});
      }
  }
}

</script>

<style scoped>
  #id1 {
    float: left;
    margin-top: 10px;
    color: cornflowerblue;
  }
  #id1:hover {
    color: #2c3e50;
  }
</style>
