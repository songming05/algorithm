# Do It 자료구조와 함께배우는 알고리즘 입문 (자바편)
	코딩문제 풀이와 병행할 이론 책 
	구글 docs를 사용할까, md 문법을 연습할까 고민하다가 일단 md 문서로 작성
	(분량이 지나치게 많아지면 추후 옮기는 걸로) 

## 주요 내용 
1. 기본 알고리즘
* 연습문제 5

	아래 코드의 효울이 떨어지는 이유를 설명하세요.
	
```
static int med3 (int a, int b, int c) {
	if((b >= a && c<= a) || (b <= a && c >= a))
		return a;
	else if((a > b && c < b) || (a < b && c > b))
		return b;
	return c;
}
```

* 순서도의 기호로 표현하는 법 익숙해지기 (마름모 : 분기)
* 논리 연산자의 단축평가 (short circuit evaluation)

	왼쪽 결과만으로 정확해지는 경우 오른쪽 연산은 하지 않음
* 드모르간의 법칙 (De Morgan's laws)

	각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다   
	예시 (x, y 는 조건연산)   
	x && y == !(!x || !y)   
	x || y == !(!x && !y)   
	
![Alt text] (/img/De Morgan.PNG)



2. 기본 자료구조

* 자료구조(data structure)

  - 데이터 단위와 데이터 자체 사이의 물리적 또는 논리적인 관계  

배열

	배열이름.clone();   
	배열을 복사할 때는 참조값의 메모리 내용을 복제한다.   
	주사(traverse): 배열의 요소를 하나씩 살펴보는 과정 (기억하기 쉬운예: 주사율)

난수

	컴퓨터가 생성하는 난수(random number)는 진짜 난수인가?   
	java.util.Random 은 48비트의 seed를 사용한다. 만약 seed가 같은 경우 일정한 패턴이 있다.   
	즉, 의사(pseudo)난수라 할 수 있다. 이를 해결하기 위해 seed로 현재시간 값을 주기도한다.  

기수

	2진수, 8진수(0##), 16진수(0x##, 0X##), 10진수. 학창시절 잘 보냈으므로 생략.

String

```
String str = "ABCD";
```

	"ABCD"는 문자열 리터럴(literal)이다. 즉 str은 참조값을 갖는다. 인스턴스가 존재한다.   
	private final char[], private final int 등이 있을 것이고 charAt(),  length() 등으로 사용중일 듯하다.     
	String 과 StringBuffer 를 경우에 맞게 써야하는 이유를 메모리 측면에서 다시 한 번 생각해본다.

소수

	중요하다.. 알고리즘 단골이기도 하고, IDE없이 구현할 수 있을 정도로 익숙해야 할 터이다.   
	홀수만 존재한다는 것, 해당수의 제곱근보다 비교대상 소수값이 크다면 그 수는 소수라는 것, 에라토스테네스의 체... 등
	
	78p..
    
    
    
    
    
    
    
    
    