<template>
    <div id="contents">
        <div class="main">
            <div v-if="this.$store.getters.getContentState('mainContent').isShow"></div>
        </div>
        <div v-if="this.$store.getters.getContentState('subContent1').isShow" class="sub">
            <Cafe v-if="this.$store.getters.getContentState('subContent1').isShow"></Cafe>
            <!-- <div v-if="this.$store.getters.getContentState('subContent2').isShow">Sub Content2</div>
            <div v-if="this.$store.getters.getContentState('subContent3').isShow">Sub Content3</div> -->
        </div>
    </div>
</template>

<script>
import Page from './../page/page.vue';
import Cafe from './subbody/cafe.vue'
export default {
    name: "contents",
    data: function () {
        return this.$store.state.contents
    },
    mounted: function () {
        console.log(this.$store.getters.getCurrentContent)
        console.log(this.$store.getters.getContentState('mainContent').isShow)
    },
    components: {
        Page,
        Cafe
    }
}
</script>


<style scoped>
.sub{
    background-color: #333333;
    color: #EEEEEE;
    width: 600px;
    height: 760px;
    float: left;
    padding-top: 20px;
    padding-left: 30px;
    padding-right: 30px;

}
.none{
    display: none;
}
</style>
