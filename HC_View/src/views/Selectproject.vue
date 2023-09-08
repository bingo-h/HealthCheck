<template>
  <!-- 总容器 -->
  <div class="wrapper">
    <header>
      <i class="fa fa-angle-left" onclick="history.go(-1)"></i>
      <p>选择体检套餐</p>
      <div></div>
    </header>
    <div class="top-ban"></div>

    <ul class="setmeal">
      <li v-for="project in projects" :key="project.smId">
        <div class="item">
          <div class="item-left" @click="toCalender">
            <h3>{{ project.type === 1 ? '男士套餐' : '女士套餐' }}</h3>
            <p>{{ project.name }}</p>
          </div>
          <div class="item-right" @click="project.isShow = !project.isShow;">
            <p>详情</p>
            <i class="fa fa-angle-down"></i>
          </div>
        </div>
        <div class="item-content" v-if="project.isShow">
          <table>
            <tr>
              <th>检查项目</th>
              <th>检查内容</th>
              <th>检查意义</th>
            </tr>
            <tr v-for="item in project.itemList" :key="item.item.ciId">
              <td>{{ item.item.ciName }}</td>
              <td>{{ item.item.ciContent }}</td>
              <td>{{ item.item.meaning }}</td>
            </tr>
          </table>
        </div>
      </li>
    </ul>

    <div class="bottom-ban"></div>

  </div>
</template>

<script>
import Footer from '@/components/Footer.vue';
import {useRouter} from "vue-router";
import {toRefs, reactive} from "vue"
import {getSessionStorage} from "@/common";
import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8080/hc'

export default {
  props: ["Selectproject"],
  setup() {
    const router = useRouter()
    const state = reactive({
      projects: []
    })

    init()

    function init() {
      axios.post('project/select', {type: getSessionStorage("user").sex})
          .then((response) => {
            console.log(response.data)
            state.projects = response.data
            for (let project in state.projects) {
              project.isShow = false;
            }
          })
          .catch((error) => {
            console.log(error)
          })
    }
    
    return {
      ...toRefs(state)
    }
  },
  components: {
    Footer
  }
}
</script>

<style scoped>
/*********************** 总容器 ***********************/
.wrapper {
  width: 100%;
  height: 100%;
  background-color: #F9F9F9;
}

/*********************** header ***********************/
header {
  width: 100%;
  height: 15.7vw;
  background-color: #FFF;

  position: fixed;
  left: 0;
  top: 0;

  display: flex;
  align-items: center;
  justify-content: space-between;

  box-sizing: border-box;
  padding: 0 3.6vw;
}

header .fa {
  font-size: 8vw;
}

/*********************** footer ***********************/
footer {
  width: 100%;
  height: 14.2vw;
  box-sizing: border-box;
  border-top: solid 1px #E9E9E9;
  background-color: #FFF;

  position: fixed;
  left: 0;
  bottom: 0;
}

footer ul {
  width: 100%;
  height: 14.2vw;
  display: flex;
  align-items: center;
  justify-content: space-around;
}

footer ul li {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;

  font-size: 3vw;
  color: #999;

  user-select: none;
  cursor: pointer;
}

footer ul li .fa {
  font-size: 5vw;
}

/*********************** common样式 ***********************/
.top-ban {
  width: 100%;
  height: 15.7vw;
}

.bottom-ban {
  width: 100%;
  height: 14.2vw;
}

/*********************** setmeal ***********************/
.setmeal {
  width: 100%;
  margin-top: 10vw;
}

.setmeal li {
  width: 92.8vw;
  margin: 0 auto;
  border: solid 1px #EEE;
  border-radius: 1vw;
  box-shadow: 2px 2px 5px rgba(0, 0, 0, .08);
  background-color: #FFF;
  margin-bottom: 3.6vw;
}

.setmeal li .item {
  width: 100%;
  height: 20vw;
  color: #555;

  display: flex;
  align-items: center;
}

.setmeal li .item .item-left {
  flex: 0 0 72vw;
  height: 20vw;
  border-right: solid 1px #EEE;
  box-sizing: border-box;
  padding-left: 12vw;

  display: flex;
  flex-direction: column;
  justify-content: center;

  user-select: none;
  cursor: pointer;
}

.setmeal li .item .item-left h3 {
  font-size: 4.3vw;
  font-weight: 600;
}

.setmeal li .item .item-left p {
  font-size: 4vw;
  margin-top: 1vw;
}

.setmeal li .item .item-right {
  flex: 1;
  display: flex;
  justify-content: center;
  align-items: center;

  user-select: none;
  cursor: pointer;
}

.setmeal li .item .item-right p {
  font-size: 4vw;
  margin-right: 2vw;
}

.setmeal li .item-content {
  /*display: none;*/
  width: 100%;
  background-color: #FFF;
}

.setmeal li .item-content table {
  width: 100%;
  border-collapse: collapse;
  font-size: 4vw;
  color: #555;
}

.setmeal li .item-content table tr {
  display: flex;
}

.setmeal li .item-content table tr td, .setmeal li .item-content table tr th {
  flex: 1;
}

.setmeal li .item-content table tr th {
  text-align: center;
  background-color: #EEE;
  height: 10vw;
  line-height: 10vw;
}

.setmeal li .item-content table tr td {
  border: solid 1px #EFEFEF;
  box-sizing: border-box;
  padding: 2vw;
}
</style>