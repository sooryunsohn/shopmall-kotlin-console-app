fun main(args: Array<String>) {
 
    // 1)인삿말 출력
    println("안녕하세요, Shopmall에 오신 것을 환영합니다.")
    println("쇼핑을 계속 하시려면 이름을 입력해 주세요: ")


    // 2) 사용자 이름 입력받기
    val name = readLine()       // 화면에서 사용자 입력받기


    // 3) 입력받은 사용자 이름 출력, """ 3개는 이 안에 있는 내용 그대로 표시하라는 뜻
    println("""     
        감사합니다. 반갑습니다. $name 님
        원하시는 카테고리를 입력해 주세요.
        *** ===========================***
    """.trimIndent())




    /*
    1) 상품 카테고리 표시
    2) 사용자 입력받기
    3) 사용자가 잘못된 값 입력처리
     */

    val categories = arrayOf("패션", "전자기기", "반려동물용품")
    for (category in categories) {
        println(category)
    }
    println("==> 장바구니로 이동하시려면 '#' 을 입력해 주세요.")


    // 카테고리 입력받기
    var selectedCategory = readLine()


    // 사용자가 올바른 값을 입력할때까지  입력을 반복 처리
    while (selectedCategory.isNullOrBlank()) {
        println("값을 입력해 주세요.")
        selectedCategory = readLine()
    }

    if (selectedCategory == "#") {
        // TODO (1) 장바구니로 이동
    } else {
        // TODO (2) 카테고리 상품 목록 보여주기
        // TODO (3) 카테고리 목록에 없는 경우 처리
    }



}