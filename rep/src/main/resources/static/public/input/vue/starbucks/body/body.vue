<template>
    <div id="contents" class="main">
        <Page v-if="this.$store.getters.getContentState('mainContent').isShow"></Page>
        <p v-if="this.$store.getters.getContentState('subContent1').isShow">Sub Content1</p>
        <p v-if="this.$store.getters.getContentState('subContent2').isShow">Sub Content2</p>
        <p v-if="this.$store.getters.getContentState('subContent3').isShow">Sub Content3</p>
    </div>
</template>

<script>
import Page from './../page/page.vue';
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
        Page
    }
}
</script>


<style scoped>
.main{
    top: 20;
    height: 100%;
    float: left;
    margin-left: 7%;
}

.none{
    display: none;
}
</style>
