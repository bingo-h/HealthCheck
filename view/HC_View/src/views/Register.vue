<template>
  <div class="wrapper">
    <header>
      <i class="fa fa-angle-left" onclick="history.go(-1)"></i>
      <p>注册</p>
      <div></div>
    </header>
    <div class="top-ban"></div>
    <h1>欢迎注册</h1>
    <table>
      <tr>
        <td>手机号码</td>
        <td><input type="text" v-model.trim="user.userId" @blur="isExists" placeholder="请输入手机号码"></td>
      </tr>
      <tr>
        <td>真实姓名</td>
        <td><input type="text" v-model.trim="user.realName" placeholder="真实姓名便于查看体检报告"></td>
      </tr>
      <tr>
        <td>生日</td>
        <td><input type="date" v-model.trim="user.birthday"></td>
      </tr>
      <tr>
        <td>性别</td>
        <td>
          <input type="radio" value="1" v-model.trim="user.sex">男
          <input type="radio" value="0" v-model.trim="user.sex">女
        </td>
      </tr>
      <tr>
        <td>身份证号</td>
        <td><input type="text" v-model.trim="user.identityCard" placeholder="请输入身份证号" @blur="isExistCid"></td>
      </tr>
      <tr>
        <td>密码</td>
        <td><input type="password" v-model.trim="user.password" placeholder="请输入密码"></td>
      </tr>
      <tr>
        <td>确认密码</td>
        <td><input type="password" v-model.trim="confirmPassword" placeholder="请再次输入密码"></td>
      </tr>
    </table>
    <div class="btn" @click="register">完成</div>
  </div>
</template>

<script lang="ts">
import {reactive, toRefs} from 'vue'
import {useRouter} from 'vue-router'
import axios from 'axios'
import {checkIdCard, checkNumber, checkPassword} from "@/check";

axios.defaults.baseURL = 'http://localhost:8080/hc'

export default {
  props: ['Register'],
  setup() {
    const router = useRouter();
    const state = reactive({
      user: {
        userId: '',
        password: '',
        realName: '',
        sex: '1',
        identityCard: '',
        birthday: '',
        userType: "1"
      },
      confirmPassword: ''
    });

    function register() {

      if (state.user.userId == '') {
        alert('手机号不能为空');
        return;
      }
      if (!checkNumber(state.user.userId)) {
        state.user.userId = ''
        return;
      }
      if (state.user.password == '') {
        alert('密码不能为空');
        return;
      }
      if (!checkPassword(state.user.password)) {
        return;
      }
      if (state.user.realName == '') {
        alert('姓名不能为空');
        return;
      }
      if (state.user.birthday == '') {
        alert('生日不能为空');
        return;
      }
      if (state.user.identityCard == '') {
        alert('身份证号不能为空');
        return;
      }
      if (!checkIdCard(state.user.identityCard)) {
        state.user.identityCard = ''
        return;
      }
      if (state.confirmPassword != state.user.password) {
        alert('两次输入密码不一致');
        return;
      }

      axios.post('user/register', state.user)
          .then((response) => {
            if (response.data == 0) {
              alert("注册失败");
            } else {
              alert("注册成功，请登录")
              router.push('/login')
            }
          }).catch((error) => {
        console.log(error)
      })
    }

    function isExists() {
      axios.post('user/exist', state.user)
          .then((response) => {
            if (response.data == "ERROR") {
              alert("手机号已注册");
              state.user.userId = '';
            }
          })
          .catch((error) => {
            console.log(error)
          });
    }

    function isExistCid() {
      axios.post('user/exist_cid', state.user)
          .then((response) => {
            if (response.data == "ERROR") {
              alert("该身份证号已注册过账号，请登录")
              state.user.identityCard = ''
            }
          })
          .catch((error) => {
            console.log(error)
          });
    }

    return {
      ...toRefs(state),
      register,
      isExists,
      isExistCid
    }
  },
}

</script>

<style scoped>
/*********************** 总容器 ***********************/
.wrapper {
  width: 100%;
  height: 100%;
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

/*********************** 标题部分 ***********************/
h1 {
  font-size: 7.4vw;
  font-weight: 500;
  box-sizing: border-box;
  padding: 0 3.6vw;
  margin-top: 6vw;
}

/*********************** common样式 ***********************/
.top-ban {
  width: 100%;
  height: 15.7vw;
}

/*********************** table ***********************/
table {
  width: 92.8vw;
  margin: 0 auto;
  margin-top: 5vw;
  border-collapse: collapse;

  font-size: 4.2vw;
}

table tr td {
  height: 12vw;
  border-bottom: solid 1px #DDD;
}

table tr td input {
  border: none;
  outline: none;
}

/*********************** btn ***********************/
.btn {
  width: 92.8vw;
  margin: 0 auto;
  height: 12vw;
  margin-top: 8vw;
  background-color: #137E92;
  border-radius: 2vw;
  color: #FFF;
  font-size: 5vw;
  text-align: center;
  line-height: 12vw;

  user-select: none;
  cursor: pointer;
}
</style>
