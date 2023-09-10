import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import 'font-awesome/css/font-awesome.min.css'

const app = createApp(App)

app.use(router)

app.mount('#app')

router.beforeEach((to, from, next) => {
    let user = sessionStorage.getItem('user');
    if (user != '') {
        if (to.path == '/' || to.path == '/login' || to.path == '/register' || to.path == '/index' 
        || to.path == '/order' || to.path == '/viewreport' || to.path == '/me' || to.path == '/hospitals'
        || to.path == '/selectproject' || to.path == '/selectdate' || to.path == '/orderconfirm' ||
        to.path == '/ordersuccess') {
            next()
        } else {
            router.push('/login')
        }
    } else {
        next();
    }
})