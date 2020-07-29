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

	this is my remote branch..
	여기서부터 작성
