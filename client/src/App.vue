<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div>
	<transition name="page fade"  enter-active-class="animated fadeInDown" leave-active-class="animated fadeOutDown">
    <router-view/>
	</transition>
  </div>
</template>

<style lang="stylus">
@import "https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.css"

#app
  font-family 'Avenir', Helvetica, Arial, sans-serif
  -webkit-font-smoothing antialiased
  -moz-osx-font-smoothing grayscale
  text-align center
  color #2c3e50

#nav
  padding 30px
  a
    font-weight bold
    color #2c3e50
    &.router-link-exact-active
      color #42b983
body {
    background: rgb(233, 233, 233);
    font-family:Arial, Helvetica, sans-serif;
  }
  html, body {
    height: calc(100% - 50px);
  }

  #app {
    background #fff;
    width 50%;
    padding 30px;
    border-radius 10px;
    margin 50px auto 0 auto;
    height calc(60% - 50px);
  }

.page {
    position fixed;
    width inherit;
  }
  
</style>
