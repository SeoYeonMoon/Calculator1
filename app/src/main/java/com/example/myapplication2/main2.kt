package com.example.myapplication2

fun main() {
    //변수 지정!
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    var operator = '+'

    //sum이라는 이름의 메소드(명령문) 호출!
    sum(num1, num2)
}

fun sum(num1: Int, num2: Int) {
    var result = num1 + num2
    println("num1과 num2의 덧셈결과는 ${result}입니다.")
}

//    if ( + 버튼 누를 때 ) { 두 정수가 더해짐
//        // 덧셈일 때
//    } else if( - 버튼 누를 때 ) { 두 정수가 빼짐
//        // 뺄셈일 때
//    } else if( x 버튼 누를 때 ) { 두 정수가 곱해짐
//        // 곱셈일 때
//    } else if( 나누기 버튼 누를 때 ) { 두 정수가 나누어짐
//        // 나눗셈일 때
//    } else if(  )  {
//       // 나머지 연산일 때
//    } else { 계산이 안되어짐
//    println("계산에 오류가 발생하였습니다.")
//        // 잘못된 연산자 일 때
//    }
//}