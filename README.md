# 다시보는 자료구조 (Data Structure Review)
자료구조 과제 복습.

## 01 Array
생성자 IntArrays(n) : 크기가 n인 정수 배열을 생성하고 n/2개의 원소를 랜덤한 값으로 초기화  
add(x) : 배열의 마지막 원소 다음 인덱스 위치에 x를 삽입한다. 이미 배열이 가득 차 있으면 크기가 2배인 배열을 생성해서 복사한 후 삽입한다.  
remove(x) : x가 배열 내의 원소이면 삭제하고 빈칸을 다음 원소들을 이동시켜 채운다.   
print() : 배열의 원소를 프린트한다.

## 02 AbstractDataType
ADT -> 인터페이스 -> 클래스 -> 객체
