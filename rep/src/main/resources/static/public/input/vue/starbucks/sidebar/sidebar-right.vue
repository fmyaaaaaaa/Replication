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
                    name: "Starbucks Rewards™"
                },
                {
                    id: 2,
                    name: "Starbucks Card™"
                },
                {
                    id: 3,
                    name: "Mobile StarbucksCard"
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
                    name: "Starbucks eGift"
                },
                {
                    id: 7,
                    name: "My Starbucks"
                },
                {
                    id: 8,
                    name: "Coffee Seminar"
                },
                {
                    id: 9,
                    name: "How to Starbucks"
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

