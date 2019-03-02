<template>
    <div>
        <slot></slot>
        <img :src="image_src"/>
        </div>
</template>

<script>
export default {
    data () {
        return {
            image_src: require("./../../../../../../assets/starbucks_image.png")
        }
    },
    mounted: function () {
    }
}
</script>
