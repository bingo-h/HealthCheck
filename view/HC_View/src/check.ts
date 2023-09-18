export function checkNumber(keyStr: any) {
    console.log(keyStr)

    let reg = RegExp(/^[0-9]*$/)

    if (!reg.test(keyStr)) {
        alert("手机号只能输入数字")
        return false
    }

    return true
}

export function checkPassword(keyStr: any) {
    let reg = RegExp(/^\w+$/)

    if (!reg.test(keyStr)) {
        alert("密码只能包含数字、字母、下划线")
        return false
    }

    return true
}

export function checkIdCard(keyStr: any) {
    let reg = RegExp(/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/)

    if (!reg.test(keyStr)) {
        alert("身份证号格式不正确")
        return false
    }

    return true
}
