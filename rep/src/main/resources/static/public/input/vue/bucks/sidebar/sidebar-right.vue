<template>
    <div id="Sidebar-right" class="right">
        <ul>
            <a v-for="content in contents" v-bind:key="content.id">
                {{content.name}}
            </a>
        </ul>
    </div>
</template>

<script>
export default {
    name: "Sidebar-right",
    data: function () {
        return {
            contents: [
                {
                    id: 1,
                    name: "Replication Rewards"
                },
                {
                    id: 2,
                    name: "Replication Card"
                },
                {
                    id: 3,
                    name: "Mobile ReplicationCard"
                },
                {
                    id: 4,
                    name: "Online Store"
                },
                {
                    id: 5,
                    name: "Store Search"
                },
                {
                    id: 6,
                    name: "Replication eGift"
                },
                {
                    id: 7,
                    name: "My Replication"
                },
                {
                    id: 8,
                    name: "Coffee Seminar"
                },
                {
                    id: 9,
                    name: "How to Replication"
                }
            ]
        }
    }
}
</script>

<style scoped>
.right{
    width: 5%;
    float: right;
    margin-right: 5%;
}
</style>

