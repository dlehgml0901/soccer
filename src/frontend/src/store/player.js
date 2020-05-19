const state = {
    userid: '',
    password: ''
}
const actions = {
    login ({commit}){
        commit('login')
    },
    join ({commit}){
        commit('join')
    }
}
const mutations = {
    login (){
        alert('로그인성공')
    },
    join (){
        alert('회원가입 완료')
    }
}
const getters = {

}
export default {
    name: 'player',
    namespace: true,
    state,
    actions,
    mutations,
    getters
}