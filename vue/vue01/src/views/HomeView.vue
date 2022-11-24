<template>
  <div class="home">

    <img alt="Vue logo" src="../assets/logo.png">
    <el-button>{{ msg }}</el-button>
    <HelloWorld :msg="msg"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  data(){
    return{
      msg: "Hello world!"
    }
  },
  components: {
    HelloWorld
  }
}
</script>
