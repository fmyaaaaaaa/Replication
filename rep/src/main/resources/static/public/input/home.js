import Vue from 'vue';
import Home from './vue/starbucks/home.vue'
import store from './vue/store'

 new Vue({
    store,
    render: h => h(Home)
 }).$mount('#starbucks')
