<template>
    <div id="#Sidebar-left" class="left">
        <ul>
            <li class="none" v-for="content in contents" v-bind:key="content.id">
                <popup-anchor :text="content.name" :contents-key="content.contentKey"/>
            </li>
        </ul>
    </div>
</template>

<script>
import PopupAnchor from './../../components/popupAnchor.vue'
export default {
    name: "Sidebar-left",
    data: function() {
        return {
            contents: [
                {
                    id: 1,
                    contentKey: "subContent1",
                    name: "Cafe"
                },
                {
                    id:2,
                    contentKey: "subContent2",
                    name: "Cofee  & Goods"
                },
                {
                    id: 3,
                    contentKey: "subContent3",
                    name: "Company"
                }
            ]
        }
    },
    components: {
        PopupAnchor
    }
}
</script>

<style scoped>
.left {
    height: 100%;
    width: 5%;
    top: 20;
    float: left;
    background-color: bisque;
}
.none{
    list-style: none;
}
</style>

