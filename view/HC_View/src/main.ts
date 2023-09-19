import './assets/main.css'

import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import 'font-awesome/css/font-awesome.min.css'
import axios from "axios";

const app = createApp(App)

app.use(router)

app.mount('#app')

router.beforeEach((to, from, next) => {
    const token = sessionStorage.getItem("token")
    console.log("main.ts router get token: " + token)

    let user = sessionStorage.getItem('user');
    if (user == '') {
        if (to.path == '/' || to.path == '/login' || to.path == '/register') {
            next()
        } else {
            router.push('/login')
        }
    } else {
        next();
    }
})

axios.defaults.baseURL = "http://localhost:8080/hc"
axios.defaults.withCredentials = true
axios.defaults.headers.common['token'] = sessionStorage.getItem('token')
// axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8'

axios.interceptors.request.use(config => {
    axios.defaults.headers.common['token'] = sessionStorage.getItem("token")

    return config
}, error => {
    return Promise.reject(error)
})

axios.interceptors.response.use(response => {
    return response
}, error => {
    return Promise.reject(error)
})
