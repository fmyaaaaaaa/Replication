<template>
    <div id="#Sidebar-left" class="sidebar">
        <div class="left">
            <ul>
                <li v-for="content in contents" v-bind:key="content.id">
                    <popup-anchor :text="content.name" :contents-key="content.contentKey"/>
                </li>
            </ul>
        </div>
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

<style lang="scss" scoped>
.sidebar {
    .left {
        font-size: 15px;
        height: 800px;
        width: 120px;
        float: left;
        padding-left: 0%;
        background-color: white;
    }
    * ul {
        list-style: none;
        padding-left: 15px;
    }
    * li {
        margin-bottom: 25px;
    }
}
</style>

