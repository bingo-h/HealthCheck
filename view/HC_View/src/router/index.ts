import {createRouter, createWebHistory} from 'vue-router'
import Login from '@/views/Login.vue'
import Register from '@/views/Register.vue'
import Index from '@/views/Index.vue'
import Order from '@/views/Order.vue'
import Hospitals from '@/views/Hospitals.vue'
import SelectProject from "@/views/SelectProject.vue";
import SelectDate from "@/views/SelectDate.vue";
import OrderConfirm from "@/views/OrderConfirm.vue";
import OrderSuccess from "@/views/OrderSuccess.vue";
import ViewOrders from "@/views/ViewOrders.vue";
import ViewReports from "@/views/ViewReports.vue";
import Personal from "@/views/Personal.vue";
import ResetPassword from "@/views/ResetPassword.vue";

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
            path: '/order',
            name: 'Order',
            component: Order
        },
        {
            path: '/personal',
            name: 'Personal',
            component: Personal
        },
        {
            path: '/hospitals',
            name: 'Hospitals',
            component: Hospitals
        },
        {
            path: '/selectproject',
            name: 'SelectProject',
            component: SelectProject
        },
        {
            path: '/selectdate',
            name: 'SelectDate',
            component: SelectDate
        },
        {
            path: '/orderconfirm',
            name: 'OrderConfirm',
            component: OrderConfirm
        },
        {
            path: '/ordersuccess',
            name: 'OrderSuccess',
            component: OrderSuccess
        },
        {
            path: '/vieworders',
            name: 'ViewOrders',
            component: ViewOrders
        },
        {
            path: '/viewreports',
            name: 'ViewReports',
            component: ViewReports
        },
        {
            path: '/resetpassword',
            name: 'ResetPassword',
            component: ResetPassword
        }
    ]
})

export default router
