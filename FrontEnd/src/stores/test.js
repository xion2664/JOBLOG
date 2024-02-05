import { ref } from "vue";
import { defineStore } from "pinia";
import axios from "axios";

export const testStore = defineStore('test', () => {
    const token = ref('')

    const logIn = function () {
        const params = new URLSearchParams(window.location.search);
        const accessToken = params.get("accessToken");
        const router = useRouter();
    
        if (accessToken) {
        // 쿠키에 accessToken 저장
        document.cookie = `accessToken=${accessToken}; path=/; Secure;`;
        token.value = `accessToken=${accessToken}; path=/; Secure;`
        // URL에서 accessToken 제거
        history.pushState(null, "", window.location.pathname);
        }
    
        router.replace("/");
    }

    return {
        logIn,
        token
    }
})