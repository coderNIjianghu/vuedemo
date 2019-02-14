<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item label="文章名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
    <el-form-item label="文章作者" prop="authorName">
      <el-input v-model="ruleForm.authorName"></el-input>
    </el-form-item>
    <!--<el-form-item label="文章类型" prop="region">-->
      <!--<el-select v-model="ruleForm.region" placeholder="请选择文章类型">-->
        <!--<el-option label="原创" value="shanghai"></el-option>-->
        <!--<el-option label="转载" value="beijing"></el-option>-->
      <!--</el-select>-->
    <!--</el-form-item>-->
    <!--<el-form-item label="是否置顶" prop="delivery">-->
      <!--<el-switch v-model="ruleForm.delivery"></el-switch>-->
    <!--</el-form-item>-->
    <el-form-item>
      <el-button type="primary" @click="updateForm('ruleForm',ruleForm)" v-if="isUpdate">
        更新修改</el-button>
      <el-button type="primary" @click="submitForm('ruleForm',ruleForm)" v-else>
        立即创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: 'BlogUpdate',
  data() {
    return {
      isUpdate: '',
      ruleForm: {
        name: '',
        authorName: '',
        region: '',
        delivery: false
      },
      rules: {
        name: [
          { required: true, message: '请输入文章名称', trigger: 'blur' },
          { min: 1, max: 15, message: '长度在 1 到 15 个字符', trigger: 'blur' }
        ],
        authorName: [
          { required: true, message: '请输入文章作者', trigger: 'blur' },
          { min: 1, max: 15, message: '长度在 1 到 15 个字符', trigger: 'blur' }
        ],
        region: [
          { required: true, message: '请选择文章类型', trigger: 'change' }
        ]
      }
    };

  },
  mounted:function () {
    this.isUpdateTrue();
  },
  methods: {
    submitForm(formName,ruleForm) {
      console.log(ruleForm)
      this.$refs[formName].validate((valid) => {
        if (valid) {
          // alert('submit!');
          this.$axios
            .post('/addArticle',{
              articlename :ruleForm.name,
              articleauthor: ruleForm.authorName
            })
            .then(successResponse =>{
              this.$message({
                message: '添加成功',
                type: 'success'
              });
              this.$router.push({path: '/index'});
              // alert('submit success!');
            })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    updateForm(formName,ruleForm) {
      console.log(ruleForm)
      this.$refs[formName].validate((valid) => {
        if (valid) {
          // alert('submit!');
          this.$axios
            .post('/updateArticle',{
              id:this.$route.query.rowId,
              articlename :ruleForm.name,
              articleauthor: ruleForm.authorName
            })
            .then(successResponse =>{
              //alert('update success!');
              this.$message({
                message: '修改成功',
                type: 'success'
              });
              this.$router.push({path: '/index'});
            })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    isUpdateTrue() {
      this.isUpdate=this.$route.query.isUpdate;
      let rowId = this.$route.query.rowId;
      if (rowId != undefined && rowId != '' && rowId != null){
        this.$axios.get('/getArticleById',{
          params: {
            id:rowId
          }
        }).then(successResponse =>{
          this.ruleForm.name =successResponse.data.data.articlename;
          this.ruleForm.authorName = successResponse.data.data.articleauthor;
        })
      }
    }
  }
}
</script>

<style scoped>

</style>
