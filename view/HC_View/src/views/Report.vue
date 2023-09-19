<script lang="ts">
import {defineComponent} from 'vue'

export default defineComponent({
  name: "Report"
})
</script>

<template>
  <!-- 总容器 -->
  <div class="wrapper">
    <header>
      <i class="fa fa-angle-left" onclick="history.go(-1)"></i>
      <p>体检报告</p>
      <div></div>
    </header>

    <nav>
      <div class="active">总检结论</div>
      <div>报告详情</div>
    </nav>

    <div class="top-ban"></div>

    <div class="nav-content-item">
      <div class="item">
        <div class="title">异常项</div>
        <ul>
          <li>
            <div class="indications">
              <div class="left">
                <div>异</div>
                <p>收缩压</p>
              </div>
              <div class="right">
                <p>149</p>
                <p>正常值范围：&lt;140</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <div>异</div>
                <p>白细胞计数</p>
              </div>
              <div class="right">
                <p>3.56 10^9/L</p>
                <p>正常值范围：4-10</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="item">
        <div class="title">一、尊敬的顾客，您本次体检结论如下：</div>
        <ul>
          <li class="conclusion-title">1、超重</li>
          <li class="conclusion-title">2、血压增高</li>
          <li class="conclusion-title">3、血常规异常</li>
        </ul>
      </div>
      <div class="item">
        <div class="title">二、尊敬的顾客，您本次体检建议信息日下：</div>
        <ul>
          <li class="conclusion-content">
            <h3>1、超重</h3>
            <p>
              您的体重指标属超重。体内脂肪过度增加，使体重超过正常范围，可引起高血压、高血脂、糖尿病、冠心病以及免疫功能降低等并发症。
              建议: 合理膳食，以低盐、低脂、高纤维为原则；三餐定时，不吃零食；根据自身情况适量运动，以消耗体内脂肪，维持正常体重。
            </p>
          </li>
          <li class="conclusion-content">
            <h3>2、血压增高</h3>
            <p>
              此次检测血压增高，已经达到高血压的诊断标准，建议就诊心血管内科进一步明确高血压诊断，积极控制好血压。低盐、低脂、低胆固醇饮食。
              戒烟酒，避免情绪激动，长期过度紧张工作或劳累，保存心境平和，保证充足睡眠。定期到医院系统复查，预防并发症。
            </p>
          </li>
          <li class="conclusion-content">
            <h3>3、血常规异常</h3>
            <p>
              此次检测白细胞减少，将会导致免疫功能的下降。建议就诊做进一步诊断。
              同时注意：胆固醇高不要吃油的，甜的，多吃水果和蔬菜，多吃富含蛋白质的食物，如牛奶和豆奶。注意锻炼，坚持每天三次，超过10分钟，中等强度，每周锻炼不少于5次。
            </p>
          </li>
        </ul>
      </div>
    </div>

    <div class="nav-content-item">
      <div class="item">
        <div class="title">一般检测</div>
        <ul>
          <li>
            <div class="indications">
              <div class="left">
                <div>异</div>
                <p>收缩压</p>
              </div>
              <div class="right">
                <p>149</p>
                <p>正常值范围：&lt;140</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>舒张压</p>
              </div>
              <div class="right">
                <p>90</p>
                <p>正常值范围：&lt;90</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>身高</p>
              </div>
              <div class="right">
                <p>177.00 cm</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>体重</p>
              </div>
              <div class="right">
                <p>80 kg</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="item">
        <div class="title">血常规</div>
        <ul>
          <li>
            <div class="indications">
              <div class="left">
                <div>异</div>
                <p>白细胞计数</p>
              </div>
              <div class="right">
                <p>3.56 10^9/L</p>
                <p>正常值范围：4-10</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>红细胞压值</p>
              </div>
              <div class="right">
                <p>47.4 %</p>
                <p>正常值范围：36-50</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>淋巴细胞计数百分比</p>
              </div>
              <div class="right">
                <p>19.03 %</p>
                <p>正常值范围：18.3-47.9</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>单核细胞计数百分比</p>
              </div>
              <div class="right">
                <p>8.00 %</p>
                <p>正常值范围：4.2-15.2</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>嗜酸性粒细胞计数百分比</p>
              </div>
              <div class="right">
                <p>1.20 %</p>
                <p>正常值范围：0.2-7.6</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="item">
        <div class="title">尿常规</div>
        <ul>
          <li>
            <div class="indications">
              <div class="left">
                <p>尿白细胞</p>
              </div>
              <div class="right">
                <p>- /ul</p>
                <p>正常值范围：-</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>尿亚硝酸盐</p>
              </div>
              <div class="right">
                <p>-</p>
                <p>正常值范围：阴性</p>
              </div>
            </div>
          </li>
          <li>
            <div class="indications">
              <div class="left">
                <p>尿液酸碱度</p>
              </div>
              <div class="right">
                <p>6.0</p>
                <p>正常值范围：5.5-6.5</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="item">
        <div class="title">妇科检查</div>
        <ul>
          <li class="indications">
            <div class="indications-type-4">
              <div>
                <p>盆腔检查</p>
              </div>
              <div>
                <p>
                  盆腔检查结果内容，盆腔检查结果内容，盆腔检查结果内容，盆腔检查结果内容，盆腔检查结果内容，盆腔检查结果内容，盆腔检查结果内容。
                </p>
              </div>
            </div>
          </li>
          <li class="indications">
            <div class="indications-type-4">
              <div>
                <p>乳腺检查</p>
              </div>
              <div>
                <p>正常</p>
              </div>
            </div>
          </li>
          <li class="indications">
            <div class="indications-type-4">
              <div>
                <p>子宫检查</p>
              </div>
              <div>
                <p>正常</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
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
  height: 31.7vw;
}

.bottom-ban {
  width: 100%;
  height: 14.2vw;
}

/*********************** nav ***********************/
nav {
  width: 100%;
  height: 16vw;
  display: flex;
  background-color: #F9F9F9;

  position: fixed;
  left: 0;
  top: 15.7vw;
}

nav div {
  flex: 1;
  height: 14vw;
  box-sizing: border-box;

  text-align: center;
  line-height: 14vw;
  font-size: 4.2vw;
  font-weight: 600;
  color: #555;
}

.active {
  border-bottom: solid 2px #137E92;
  color: #137E92;
}

/*********************** nav-content-item ***********************/
.nav-content-item .item {
  width: 92vw;
  margin: 0 auto;
  margin-top: 3vw;
  margin-bottom: 3vw;
  overflow: hidden;
  border-radius: 3vw;
  background-color: #FFF;
}

.nav-content-item .item .title {
  width: 100%;
  height: 10vw;
  background-color: #7BAFD7;
  line-height: 10vw;
  box-sizing: border-box;
  padding-left: 4vw;
  font-size: 4.2vw;
  color: #FFF;
}

.nav-content-item .item ul {
  width: 100%;
}

/****** 数值型检查项样式 ******/
.nav-content-item .item ul li {
  border-bottom: solid 1px #EEE;
}

.nav-content-item .item ul li:last-child {
  border-bottom: none;
}

.nav-content-item .item ul li .indications {
  width: 100%;
  height: 14vw;
  padding: 0 3vw;
  display: flex;
  align-items: center;
  font-size: 3.2vw;
  color: #333;
}

.nav-content-item .item ul li .indications .left {
  flex: 1;
  display: flex;
}

.nav-content-item .item ul li .indications .left div {
  background-color: #BA634E;
  color: #FFF;
  padding: 0.2vw 0.6vw;
  border-radius: 0.6vw;
}

.nav-content-item .item ul li .indications .left p {
  font-weight: 600;
  margin-left: 2vw;
}

.nav-content-item .item ul li .indications .right {
  flex: 1;
}

.nav-content-item .item ul li .indications .right p:last-child {
  color: #999;
}

/****** 数值型检查项样式 ******/

/****** 描述型检查项样式 ******/
.nav-content-item .item ul li .indications-type-4 {
  width: 100%;
  box-sizing: border-box;
  padding: 0 3vw;

  font-size: 3.2vw;
  color: #333;
}

.nav-content-item .item ul li .indications-type-4 div {
  margin: 5vw 0;
}

.nav-content-item .item ul li .indications-type-4 div:first-child {
  font-weight: 600;
}

.nav-content-item .item ul li .indications-type-4 div:last-child {
  color: #999;
}

/****** 描述型检查项样式 ******/

.nav-content-item .item ul .conclusion-title {
  width: 100%;
  height: 12vw;
  box-sizing: border-box;
  border-bottom: solid 1px #EEE;
  padding: 0 3vw;

  display: flex;
  align-items: center;
  font-size: 4vw;
  color: #555;
}

.nav-content-item .item ul .conclusion-title:last-child {
  border-bottom: none;
}

.nav-content-item .item ul .conclusion-content {
  width: 100%;
  box-sizing: border-box;
  border-bottom: solid 1px #EEE;
  padding: 4vw 3vw;
  font-size: 3.6vw;
  color: #555;
}

.nav-content-item .item ul .conclusion-content:last-child {
  border-bottom: none;
}

.nav-content-item .item ul .conclusion-content h3 {
  font-size: 4vw;
  font-weight: 600;
  margin-bottom: 2vw;
}

.nav-content-item .item ul .conclusion-content p {
  text-indent: 8vw;
}

</style>