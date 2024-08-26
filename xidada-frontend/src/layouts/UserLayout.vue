<template>
  <div id="userLayout">
    <a-layout style="height: 100vh">
      <a-layout-header class="header">
        <a-space>
          <img class="logo" src="../assets/logo.png" />
          <div>兮答答 AI 答题应用平台</div>
        </a-space>
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>
      <a-layout-footer class="footer">
        <a-space>
          <a href="https://github.com/LLLL1024" target="_blank">程序员兮颜</a>
          <a
            href="https://beian.miit.gov.cn"
            target="_blank"
            class="link-color-2"
            >ICP备案号：赣ICP备2024039351号-1</a
          >
        </a-space>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<script setup lang="ts"></script>

<style scoped>
#userLayout {
  text-align: center;
  background: url("https://gw.alipayobjects.com/zos/rmsportal/FfdJeJRQWjEeGTpqgBKj.png")
    0% 0% / 100% 100%;
}

#userLayout .logo {
  width: 48px;
  height: 48px;
}

#userLayout .header {
  margin-top: 16px;
  font-size: 21px;
}

#userLayout .content {
  margin-bottom: 16px;
  padding: 20px;
}

.footer {
  padding: 16px;
  text-align: center;
  background: #efefef;
}

/* .link-color-1 {
  color: #00c8ff;
} */

.link-color-2 {
  color: #ff0000;
}
</style>
