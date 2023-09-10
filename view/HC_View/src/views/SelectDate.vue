<script lang="ts">
import {defineComponent, reactive, toRaw, toRefs} from 'vue'
import Footer from "@/components/Footer.vue";
import router from "@/router";
import {useRoute} from "vue-router";
import axios from "axios";
import {state} from "vue-tsc/out/shared";

export default defineComponent({
  name: "SelectDate",
  computed: {
    state() {
      return state
    }
  },
  setup() {
    const date = new Date()
    const route = useRoute()
    const state = reactive({
      calendar: [],
      hpId: route.query.hpId,
      smId: route.query.smId,
      year: date.getFullYear(),
      month: date.getMonth() + 1,
      day: date.getDay()
    })

    function init() {
      axios.post('calendar/getcalendar', {hpId: state.hpId, smId: state.smId, year: state.year, month: state.month})
          .then((response) => {
            state.calendar = toRaw(response.data)

            for (let i = 0; i < state.calendar.length; i++) {
              if (state.calendar[i].date != null)
                state.calendar[i].day = parseInt(state.calendar[i].date.substring(8))
              state.calendar[i].selected = 0
            }
            console.log(state)
          })
          .catch((error) => {
            console.log(error)
          })
    }

    init()

    function selectDay(day: any) {
      for (let i = 0; i < state.calendar.length; i++) {
        state.calendar[i].selected=0
      }
      day.selected = 1
    }

    return {
      ...toRefs(state),
      selectDay
    }
  },
  components: {Footer}
})
</script>

<template>
  <div class="wrapper">
    <header>
      <i class="fa fa-angle-left" onclick="history.go(-1)"></i>
      <p>选择体检日期</p>
      <div></div>
    </header>
    <div class="top-ban"></div>

    <section>
      <div class="date-box">
        <i class="fa fa-caret-left"></i>
        <p>{{ year + "年" + month + "月" }}</p>
        <i class="fa fa-caret-right"></i>
      </div>
      <table>
        <tr>
          <th>日</th>
          <th>一</th>
          <th>二</th>
          <th>三</th>
          <th>四</th>
          <th>五</th>
          <th>六</th>
        </tr>
      </table>
      <ul>
        <li v-for="cd in calendar" :key="cd.date">
          <p :class="{fontcolor:cd.remain!=null && (cd.remain > 0 || cd.day > day), pselect:cd.selected==1}"
             @click="selectDay(cd)">{{ cd.day }}</p>
          <p>{{ cd.remain != null && (cd.remain > 0 || cd.day > day) ? "余" + cd.remain : "" }}</p>
        </li>
      </ul>
    </section>

    <div class="bottom-btn">
      <div></div>
      <div onclick="location.href='confirmorder.html'">下一步</div>
    </div>

    <div class="bottom-ban"></div>
    <Footer></Footer>
  </div>
</template>

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

/*********************** section ***********************/
section {
  width: 82vw;
  margin: 0 auto;
  margin-top: 12vw;
}

section .date-box {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-size: 4.5vw;
  font-weight: 600;
}

section .date-box p {
  color: #000;
}

section .date-box i {
  color: #999;
  user-select: none;
  cursor: pointer;
}

section table {
  width: 100%;
  font-size: 3.8vw;
}

section table tr th {
  text-align: center;
  font-weight: 600;
  line-height: 12vw;
}

section ul {
  width: 100%;
  display: flex;
  flex-wrap: wrap;
}

section ul li {
  width: 14.28%;
  height: 12vw;
  font-weight: 600;
  color: #999;
}

section ul li p:first-child {
  width: 6vw;
  height: 6vw;
  margin: 0 auto;
  border-radius: 3vw;

  display: flex;
  justify-content: center;
  align-items: center;

  font-size: 4.2vw;

  user-select: none;
  cursor: pointer;
}

section ul li p:last-child {
  font-size: 3vw;
  font-weight: 300;
  text-align: center;
  user-select: none;
}

.fontcolor {
  color: #333;
}

.pselect {
  background-color: #FB902B;
  color: #FFF;
}

/*********************** bottom-btn ***********************/
.bottom-btn {
  width: 100%;
  height: 12vw;
  background-color: #FFF;

  position: fixed;
  left: 0;
  bottom: 14.2vw;

  display: flex;
}

.bottom-btn div:first-child {
  flex: 2;
}

.bottom-btn div:last-child {
  flex: 1;
  background-color: #117C94;
  text-align: center;
  line-height: 12vw;
  font-size: 5vw;
  color: #FFF;

  user-select: none;
  cursor: pointer;
}
</style>
