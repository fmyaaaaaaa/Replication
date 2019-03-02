<template>
    <div id="home">
        <Header/>
        <sidebar-left/>
        <sidebar-right/>
        <Body />
        <page />
    </div>
</template>

<script>
import SidebarLeft from './sidebar/sidebar-left.vue'
import SidebarRight from './sidebar/sidebar-right.vue'
import Header from './header/header.vue'
import Body from './body/body.vue'
import Page from './page/page.vue'

export default {
    name: 'home',
    components: {
        SidebarLeft,
        SidebarRight,
        Header,
        Body,
        Page
    },
    created: function() {
    }
}
</script>

<style>

</style>
