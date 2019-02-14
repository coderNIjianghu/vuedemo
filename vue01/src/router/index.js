import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import BlogLogin from '@/components/BlogLogin'
import BlogIndex from '@/components/BlogIndex'
import BlogUpdate from '../components/BlogUpdate'
Vue.use(Router)
export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/index',
      name: 'BlogIndex',
      component: BlogIndex
    },
    {
      path: '/manage',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'BlogLogin',
      component: BlogLogin
    },
    {
      path: '/add',
      name: 'BlogUpdate',
      component: BlogUpdate
    }
  ]
})
