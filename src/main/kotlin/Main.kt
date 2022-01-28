import screen.ShoppingHome

/*
(1) main함수 -> Class 함수
(2) 화면별 클래스 분리 -> 홈, 카테고리화면
(3) 선택한 카테고리 상품목록 표시
*/

fun main(args: Array<String>) {
 
   val shoppingHome = ShoppingHome()        // ShoppingHome에 내용 있는거 호출하기위한 객체.
   shoppingHome.start()                     // 호출 실행


}