import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

const store = new Vuex.Store({
    state: {
        contents: [
            { name: "subContent1", isShow: false },
            { name: "subContent2", isShow: false },
            { name: "subContent3", isShow: false }
        ]
    },
    mutations: {
        changeContentState (state, payload) {
            const currentFlag = state.contents.find(content => content.name === payload.contentsKey).isShow;
            state.contents.find(content => content.name === payload.contentsKey).isShow = !currentFlag;
        }
    },
    getters: {
        isShowSubContents: (state) => {
            const isShow = state.contents.find(content => content.isShow)
            return isShow === "undifined" || !isShow ? false : true
        },
        getContentState: (state) => (contentsKey) => {
            return state.contents.find(content => content.name === contentsKey)
        },
        getCurrentContent: (state) => {
            return state.contents.find(content => content.isShow).name
        }
    }
})
export default store;