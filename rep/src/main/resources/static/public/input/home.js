import Vue from 'vue';
import Home from './vue/bucks/home.vue'
import store from './vue/store'

 new Vue({
    store,
    render: h => h(Home)
 }).$mount('#bucks')
