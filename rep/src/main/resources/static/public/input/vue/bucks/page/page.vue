<template>
    <div class="page-style">
        <header>
            <slot name="header"></slot>
        </header>
        <main>
            <slot name="main"></slot>
        </main>
        <footer>
            <slot name="footer"></slot>
        </footer>
    </div>
</template>

<script>
export default {
    // data () {
    //     return {
    //         image_src: require("./../../../../../../assets/bucks_image.png")
    //     }
    // },
    // mounted: function () {
    // }
}
</script>