<script lang="ts">
import {defineComponent, reactive, toRefs} from 'vue'
import Footer from "@/components/Footer.vue";
import axios from "axios";
import {getSessionStorage} from "@/common";

export default defineComponent({
  name: "ViewOrders",
  components: {Footer},
  setup(props, ctx) {

    const state = reactive({
      orders: [],
      date: getSessionStorage("date")
    })

    init()

    function init() {
      axios.post('order/getall', getSessionStorage('user'))
          .then((response) => {
            console.log(response.data)
            state.orders = response.data
          })
          .catch((error) => {
            console.log(error)
          })
    }

    function OrderCancel(order: any) {
      let YoN = confirm("确认取消预约吗？")
      if (YoN)
        axios.post('order/del', order)
            .then((response) => {
              if (response.data > 0) {
                alert("取消成功!");
                init()
              }
              else {
                alert("取消失败!");
              }
            })
      }

    return {
      ...toRefs(state),
      OrderCancel
    }
  },
})
</script>

<template>
  <div class="wrapper">
    <header>
      <i class="fa fa-angle-left" onclick="history.go(-1)"></i>
      <p>我的预约</p>
      <div></div>
    </header>
    <div class="top-ban"></div>

    <ul>
      <li v-for="order in orders" :key="order.orderId">
        <div class="left">
          <p>{{ order.orderDate }}</p>
          <p>{{ order.project.name }}</p>
        </div>
        <div v-if="order.orderDate > date" class="right" @click="OrderCancel(order)">
          取消预约
        </div>
      </li>
    </ul>

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

/*********************** ul ***********************/
ul {
  width: 86vw;
  margin: 0 auto;
}

ul li {
  width: 100%;
  height: 14vw;
  border-bottom: solid 1px #EEE;

  display: flex;
  justify-content: space-between;
  align-items: center;
}

ul li .left {
  user-select: none;
  cursor: pointer;
}

ul li .left p:first-child {
  color: #555;
  font-size: 3.3vw;
}

ul li .left p:last-child {
  color: #333;
  font-size: 4.2vw;
  font-weight: 600;
}

ul li .right {
  font-size: 4vw;
  color: #E6A23C;
}
</style>
