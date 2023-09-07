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
      <li v-for="pj in projects">
        <div class="item">
          <div class="item-left" onclick="location.href='selectdate.html'">
            <h3>男士套餐</h3>
            <p>普通男士客户-基础套餐</p>
          </div>
          <div class="item-right">
            <p>详情</p>
            <i class="fa fa-angle-down"></i>
          </div>
        </div>
        <div class="item-content">
          <table>
            <tr>
              <th>检查项目</th>
              <th>检查内容</th>
              <th>检查意义</th>
            </tr>
            <tr>
              <td>一般检查</td>
              <td>血压、身高、体重、腰围、臀围。</td>
              <td>通过仪器测定人体基本健康指标。</td>
            </tr>
            <tr>
              <td>血常规</td>
              <td>
                血常规24项: 中性粒细胞计数绝对值、红细胞压值、血小板比容、单核细胞计数百分比、平均血小板体积、
                大血小板比例、嗜碱性粒细胞计数百分比、平均血红蛋白含量等。
              </td>
              <td>
                临床三大常规检测之一，是最基本的血液检验。通过观察血细胞的数量变化及形态分布，从而判断血液状况及相关疾病。
              </td>
            </tr>
            <tr>
              <td>尿常规</td>
              <td>
                尿维生素C测定、尿比重测定、尿液酮体测定、尿胆红素测定、尿亚硝酸盐测定、尿液颜色、尿白细胞计数、尿蛋白定性、
                尿液镜检、尿葡萄糖测定、尿液隐血、尿液酸碱度、尿液清晰度、尿胆原。
              </td>
              <td>临床三大常规检测之一，可反映机体的代谢状况，是很多疾病诊断的重要指标。</td>
            </tr>
          </table>
        </div>
      </li>
      <li>
        <div class="item">
          <div class="item-left" onclick="location.href='selectdate.html'">
            <h3>男士套餐</h3>
            <p>普通男士客户-脑血管系统</p>
          </div>
          <div class="item-right">
            <p>详情</p>
            <i class="fa fa-angle-down"></i>
          </div>
        </div>
        <div class="item-content">
          <table>
            <tr>
              <th>检查项目</th>
              <th>检查内容</th>
              <th>检查意义</th>
            </tr>
            <tr>
              <td>一般检查</td>
              <td>血压、身高、体重、腰围、臀围。</td>
              <td>通过仪器测定人体基本健康指标。</td>
            </tr>
            <tr>
              <td>血常规</td>
              <td>
                血常规24项: 中性粒细胞计数绝对值、红细胞压值、血小板比容、单核细胞计数百分比、平均血小板体积、
                大血小板比例、嗜碱性粒细胞计数百分比、平均血红蛋白含量等。
              </td>
              <td>
                临床三大常规检测之一，是最基本的血液检验。通过观察血细胞的数量变化及形态分布，从而判断血液状况及相关疾病。
              </td>
            </tr>
            <tr>
              <td>尿常规</td>
              <td>
                尿维生素C测定、尿比重测定、尿液酮体测定、尿胆红素测定、尿亚硝酸盐测定、尿液颜色、尿白细胞计数、尿蛋白定性、
                尿液镜检、尿葡萄糖测定、尿液隐血、尿液酸碱度、尿液清晰度、尿胆原。
              </td>
              <td>临床三大常规检测之一，可反映机体的代谢状况，是很多疾病诊断的重要指标。</td>
            </tr>
          </table>
        </div>
      </li>
      <li>
        <div class="item">
          <div class="item-left" onclick="location.href='selectdate.html'">
            <h3>男士套餐</h3>
            <p>普通男士客户-肝病检查</p>
          </div>
          <div class="item-right">
            <p>详情</p>
            <i class="fa fa-angle-down"></i>
          </div>
        </div>
        <div class="item-content">
          <table>
            <tr>
              <th>检查项目</th>
              <th>检查内容</th>
              <th>检查意义</th>
            </tr>
            <tr>
              <td>一般检查</td>
              <td>血压、身高、体重、腰围、臀围。</td>
              <td>通过仪器测定人体基本健康指标。</td>
            </tr>
            <tr>
              <td>血常规</td>
              <td>
                血常规24项: 中性粒细胞计数绝对值、红细胞压值、血小板比容、单核细胞计数百分比、平均血小板体积、
                大血小板比例、嗜碱性粒细胞计数百分比、平均血红蛋白含量等。
              </td>
              <td>
                临床三大常规检测之一，是最基本的血液检验。通过观察血细胞的数量变化及形态分布，从而判断血液状况及相关疾病。
              </td>
            </tr>
            <tr>
              <td>尿常规</td>
              <td>
                尿维生素C测定、尿比重测定、尿液酮体测定、尿胆红素测定、尿亚硝酸盐测定、尿液颜色、尿白细胞计数、尿蛋白定性、
                尿液镜检、尿葡萄糖测定、尿液隐血、尿液酸碱度、尿液清晰度、尿胆原。
              </td>
              <td>临床三大常规检测之一，可反映机体的代谢状况，是很多疾病诊断的重要指标。</td>
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
  props: ["Selectpj"],
  setup() {
    const router = useRouter()
    const state = reactive({
      projects: []
    })

    init()

    function init() {
      console.log(getSessionStorage("user").sex)
      axios.post('project/select', {type: getSessionStorage("user").sex})
          .then((response) => {
            console.log(response.data)
            state.projects = response.data
          })
          .catch((error) => {
            console.log(error)
          })
    }

    return {
      ...toRefs(state),
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