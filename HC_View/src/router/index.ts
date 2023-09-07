import { createRouter, createWebHistory } from 'vue-router'
import Login from '@/views/Login.vue'
import Register from '@/views/Register.vue'
import Index from '@/views/Index.vue'
import Book from '@/views/Book.vue'
import Viewreport from '@/views/Viewreport.vue'
import Me from '@/views/Me.vue'
import Hospitals from '@/views/Hospitals.vue'
import Selectpj from '@/views/Selectpj.vue'

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
      component: Book
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
      path: '/selectpj',
      name: 'Selectpj',
      component: Selectpj
    }
  ]
})

export default router
