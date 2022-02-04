package extensions

/*
    사용자 입력값 처리 클래스
 */

// 카테고리명 입력시
fun String?.getNotEmptyString(): String{
    var input = this        // this 는 입력된 Nullable String
    while(input.isNullOrBlank()) {      // 입력값이 Null 혹은 공백이면 잘못된 입력.
        println("값을 입력해 주세요.")
        input = readLine()
    }
    return input.trim()     // trim: 입력값의 앞뒤 공백 제거

}


// 상품 번호 입력 시, int 타입으로 변환가능 여부
fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()    // 앞뒤 공백 자르고 input에 저장
    while(input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해 주세요: ")
        input = readLine()
    }

    return input.toInt()


}