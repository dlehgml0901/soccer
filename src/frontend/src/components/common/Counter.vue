<template>
    <div>
        <h1>카운터</h1>
        <div>{{ count }}</div>
        <div @click="counter" class="btn operator">클릭수 올리기</div>
        <div @click="reset" class="btn operator">초기화</div>
    </div>
</template>

<script>
    export default {
        data () {
            return {
                count: 0
            }
        },
        methods: {
            counter() {
                this.count++
            },
            reset(){
                this.count = 0
            }
        }
    }
</script>

<style scoped>

</style>