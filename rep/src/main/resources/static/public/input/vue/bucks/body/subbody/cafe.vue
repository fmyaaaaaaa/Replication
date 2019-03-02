<template>
    <div>
        <Page class="cafe">
            <div slot="header"><a href="./news">news</a></div>
            <div slot="main">
                <ul class="menu">
                    <p class="title">MENU</p>
                    <li v-for="menu in menus" :key="menu.id">
                        <a v-bind:href="menu.href"> {{ menu.title }}</a>
                    </li>
                </ul>
                <ul class="store-info">
                    <p class="title">STORE INFO</p>
                    <li v-for="storeinfo in storeInfos" :key="storeinfo.id">
                        <a v-bind:href="storeinfo.href"> {{ storeinfo.title }}</a>
                    </li>
                </ul>
                <ul class="service">
                    <p class="title">SERVICE</p>
                    <li v-for="service in services" :key="service.id">
                        <a v-bind:href="service.href"> {{ service.title }}</a>
                    </li>
                </ul>
            </div>
        </Page>
    </div>
</template>

<script>
import Page from "./../../page/page.vue";
export default {
    data: function () {
        return {
            menus: [
                {
                    id: 1,
                    title: "季節のおすすめ",
                    href: "./recomendation"
                },
                {
                    id: 2,
                    title: "ドリンクメニュー",
                    href: "./drinkMenu"
                },
                {
                    id: 3,
                    title: "フードメニュー",
                    href: "./foodMenu"
                },
                {
                    id: 4,
                    title: "エネルギー・アレルゲン・原料原産地情報",
                    href: "./variousInfo"
                },
                {
                    id: 5,
                    title: "オーダー・カスタマイズ",
                    href: "./customise"
                }
            ],
            storeInfos: [
                {
                    id: 1,
                    title: "店舗検索",
                    href: "./serchStore"
                },
                {
                    id: 2,
                    title: "コーヒーセミナー",
                    href: "./coffeSminer"
                },
                {
                    id: 3,
                    title: "イベント情報",
                    href: "./eventInfo"
                },
                {
                    id: 4,
                    title: "アルバイト情報",
                    href: "./hiring"
                },
            ],
            services: [
                {
                    id: 1,
                    title: "レプリケーション リワードに参加しよう",
                    href: "./joinReword"
                },
                {
                    id: 2,
                    title: "お支払いは、レプリケーション カードで",
                    href: "./payment"
                },
            ]
        }
    },
    components: {
        Page
    }
}
</script>
<style lang="scss" scoped>
.cafe {
    .title {
        color: grey;
        font-size: 60%;
        margin-bottom: 25px;
    }
    * ul{
        width: 155px;
        height: 200px;
        list-style-type: none;
        font-size: 75%;
        float: left;
        padding-right: 45px;
        padding-left: 0%

    }
    * li {
        margin-bottom: 10px;
    }
    * a{
        color: #EEEEEE;
        text-decoration	: none;
    }
}

</style>
