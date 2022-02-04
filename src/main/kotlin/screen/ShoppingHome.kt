package screen

import LINE_DIVIDER
import extensions.getNotEmptyString

class ShoppingHome {
    /*
        쇼핑몰 프로그램의 시작 위치
     */
    fun start() {
        showWelcomeMessage()

        showCategories()
    }


    // 인삿말 출력 함수
    fun showWelcomeMessage() {
        // 1)인삿말 출력
        println("안녕하세요, Shopmall에 오신 것을 환영합니다.")
        println("쇼핑을 계속 하시려면 이름을 입력해 주세요: ")


        // 2) 사용자 이름 입력받기
        val name = readLine().getNotEmptyString()       // 화면에서 사용자 입력받기


        // 3) 입력받은 사용자 이름 출력, """ 3개는 이 안에 있는 내용 그대로 표시하라는 뜻
        println(
            """     
            감사합니다. 반갑습니다. $name 님
            원하시는 카테고리를 입력해 주세요.
            $LINE_DIVIDER
            """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()

        shoppingCategory.showCategories()
    }

}