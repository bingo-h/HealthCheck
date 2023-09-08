import { createRouter, createWebHistory } from 'vue-router'
import Login from '@/views/Login.vue'
import Register from '@/views/Register.vue'
import Index from '@/views/Index.vue'
import Order from '@/views/Order.vue'
import Viewreport from '@/views/Viewreport.vue'
import Me from '@/views/Me.vue'
import Hospitals from '@/views/Hospitals.vue'
import Selectproject from "@/views/Selectproject.vue";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Login
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/index',
      name: 'Index',
      component: Index
    },
    {
      path: '/book',
      name: 'Book',
      component: Order
    },
    {
      path: '/viewreport',
      name: 'ViewReport',
      component: Viewreport
    },
    {
      path: '/me',
      name: 'Me',
      component: Me
    },
    {
      path: '/hospitals',
      name: 'Hospitals',
      component: Hospitals
    },
    {
      path: '/selectproject',
      name: 'Selectproject',
      component: Selectproject
    }
  ]
})

export default router
