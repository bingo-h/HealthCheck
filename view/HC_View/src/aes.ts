import CryptoJS from "crypto-js"

export default {
    encrypt(word: any, key: any) {
        let keyStr = CryptoJS.enc.Utf8.parse(key)
        let src = CryptoJS.enc.Utf8.parse(word)
        let result = CryptoJS.AES.encrypt(src, keyStr, {
            mode: CryptoJS.mode.ECB,
            padding: CryptoJS.pad.Pkcs7
        })

        return result.toString()
    },

    decrypt(word: any, key: any) {
        let base64 = CryptoJS.enc.Base64.parse(word)
    }
}