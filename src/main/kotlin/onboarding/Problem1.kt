package onboarding
fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    // calcuateMax ; pobi, crong 각각에서 반복되므로 함수로 분리한다;
    //4. calcuateMax를 이용해 pobi, crong 각각의 max값을 반환한다
    val pobiMax:Int = maxOf(calcuateMax(pobi[0]),calcuateMax(pobi[1]))
    val crongMax:Int = maxOf(calcuateMax(crong[0]),calcuateMax(crong[1]))
    //5. 4의 결과를 비교하고 return한다

    //1 :  포비 승 , 2 크롱 승, 0 : 무승부, -1 : 예외
    if(pobiMax > crongMax){
        return 1
    }else if (pobiMax < crongMax){
        return 2
    }else{
        return 0
    }
    return -1
}

//페이지 번호를 입력받고
//연산결과 큰 숫자를 반환하는 함수
fun calcuateMax(num:Int):Int{
    //1. 입력값(int)의 길이만큼 자릿값들 리스트 형태로 저장한다"
    val pages:String = num.toString()
    //"2. 1에서 구한 리스트에서 loop를 돌며"
    //3. +, x 연산을 한다"
    var tmpAddPage:Int = 0
    var tmpMultiPage:Int = 1
    for(page in pages){
        val tmpPage:Int = page.digitToInt()
        tmpAddPage += tmpPage
        tmpMultiPage *= tmpPage
    }
    return maxOf(tmpAddPage,tmpMultiPage)
}



