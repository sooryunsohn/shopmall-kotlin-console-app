package screen

import LINE_DIVIDER
import data.CartItems
import extensions.getNotEmptyString

/*
    장바구니의 내용을 화면에 출력
 */

class ShoppingCart : Screen() {     // : Screen() 는 ScreenStack 의 Screen 상속. 스택 이용하려고
    private val products = CartItems.products

    fun showCartItems() {
        // 스택에 저장
        ScreenStack.push(this)


        if (products.isNotEmpty()) {
            // 장바구니의 상품 목록 출력
            println(
                products.keys.joinToString (
                    separator = ", \n",
                    prefix = """
                        $LINE_DIVIDER
                        장바구니에 담긴 상품 목록입니다.
                        
                        """.trimIndent()
                ) { product -> "카테고리: ${product.categoryLabel} / 상품명: ${product.name} / 수량: ${products[product]}"

                }

            )


        } else {
            println("""
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent())
        }
        showPreviousScreenOption()
    }

    // 이전 화면으로 돌아가는 기능 구현
    private fun showPreviousScreenOption() {
        println("""
            $LINE_DIVIDER
            이전 화면으로 돌아가시겠습니까? (y/n)
        """.trimIndent())

        when (readLine().getNotEmptyString()) {
            "y" -> {
                // 이전 화면으로 이동.
                moveToPreviousScreen()

            }
            "n" -> {
                // 안 돌아갈때 장바구니 내용 보여주기
                showCartItems()
            }
            else -> {
                // 잘못 입력. 다시입력받기
                println("잘못 입력하였습니다. 다시 입력해 주세요. (y/n)")
                showPreviousScreenOption()
            }
        }


    }


    private fun moveToPreviousScreen() {
        // 1) 스택에서 현재 화면을 popup 시킴..
        ScreenStack.pop()       // 젤 위에있는거 꺼내서 없앰.

        // 2) 현재 스택에서 최상위 클래스 확인 후 show...() 메소드 실행.
        when(val previousScreen = ScreenStack.peek()) {
            is ShoppingCategory -> {
                previousScreen.showCategories()         // selectedCategory 필요.
            }
            is ShoppingProductList -> {
                previousScreen.showProducts()           // selectedCategory 필요.
            }
            is ShoppingCart, is ShoppingHome -> {
                // 아무 일도 하지 않는다....
            }
        }


    }
}