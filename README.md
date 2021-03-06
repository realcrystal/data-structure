# 다시보는 자료구조 (Data Structure Review)
자료구조 과제 복습.

## 01 Array
생성자 IntArrays(n) : 크기가 n인 정수 배열을 생성하고 n/2개의 원소를 랜덤한 값으로 초기화  
add(x) : 배열의 마지막 원소 다음 인덱스 위치에 x를 삽입한다. 이미 배열이 가득 차 있으면 크기가 2배인 배열을 생성해서 복사한 후 삽입한다.  
remove(x) : x가 배열 내의 원소이면 삭제하고 빈칸을 다음 원소들을 이동시켜 채운다.   
print() : 배열의 원소를 프린트한다.

## 02 AbstractDataType
ADT -> 인터페이스 -> 클래스 -> 객체  
## 03 LinkedList
insertLast(x) : x를 리스트의 맨 마지막 원소로 삽입한다.
insertFirst(x) : x를 리스트의 맨 앞의 원소로 삽입한다.
contain(x) : 리스트에 값이 x인 노드 존재 여부를 반환한다.
print() : 순서대로 리스트의 원소를 출력한다.  
## 04 BigInt
multiplyOne(x) : x가 한자리 양의 정수일 때. 곱하기를 수행하여 그 결과를 저장한 BigInt 객체를 리턴.  
multply(x) : x가 임의의 자리수의 양의 정수일 때, 곱하기를 수행하여 그 결과를 저장한 BigInt 객체를 리턴.  
## 05 Stack
리스팅 5.10(JAVA를 이용한 자료구조, 홍릉과학)에 구현된 LinkedStack 클래스에 다음의 메소드를 추가하였다.
reverse() : 스택에 있는 원소의 순서를 거꾸로 바꾼다.  
removeSecond() : top으로부터 두 번째 원소가 존재할 경우 이를 제거하여 반환한다.  
toString() : 스택의 원소들을 프린트한다.  
*이번 프로젝트부터 junit을 이용한 테스트를 사용한다.*
## 06 Queue
FIFO  
배열, 연결 리스트로 큐를 구현한다.  
ArrayQueue: 정적 크기 -> 삽입, 삭제에 제약이 있다.  
LinkedQueue: 동적 크기-> 삽입, 삭제가 비교적 자유롭다.  
