<template>
    <div id="popupAnchor">
        <a @click="onClickAnchor">{{text}}</a>
    </div>
</template>

<script>
export default {
    name: "popupAnchor",
    props: {
        text: String,
        contentsKey: String
    },
    methods: {
        onClickAnchor () {
            const isShowSubContents = this.$store.getters.isShowSubContents;
            if(isShowSubContents) {
                this.$store.commit('changeContentState', { contentsKey: this.$store.getters.getCurrentContent })
            }
            this.$store.commit('changeContentState', { contentsKey: this.contentsKey })
        }
    }
}
</script>
