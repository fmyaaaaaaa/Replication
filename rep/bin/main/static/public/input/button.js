var vm = new Vue({
　el: '#b-button',
    data: {
        loggedInButton: 'ログイン済みのため購入できます。',
        canBuy: true
    }
})

window.vm = vm
