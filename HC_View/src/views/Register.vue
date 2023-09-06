<template>
    <div>
        register
    </div>
</template>

<script lang="ts">
import { reactive, toRefs } from 'vue'
import { useRouter } from 'vue-router'
import { setSessionStorage } from '@/common';
import axios from 'axios'
axios.defaults.baseURL = 'http://localhost:8080/hc'

export default {

}

</script>

<style></style>
