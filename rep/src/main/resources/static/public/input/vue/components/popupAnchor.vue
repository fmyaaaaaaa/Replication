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
            const currentContent = this.$store.getters.getCurrentContent.name;
            this.$store.commit('changeContentState', { contentsKey: currentContent })
            this.$store.commit('changeContentState', { contentsKey: this.contentsKey })
        }
    }
}
</script>
