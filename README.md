## ✅ 가상 SSD ##
### 요구사항 
-  Read 명령어와 Write 명령어
      > W  3  0x1298CDEF  ->  3 번 LBA 영역에 값 0x1298CDEF 를 저장(nand.txt 파일에 저장.)<br>
      >  R  2  ->  result.txt파일이 2번 LBA값 내용으로 교체됨. 
- LBA 단위는 4 Byte
-  LBA 0 ~ 99 까지 100 칸을 저장
  <br>
  
## ✅ Test Shell Application
SSD를 테스트할 수 있는 프로그램.


#### 사용 가능 명령어
- write
- read
- exit
- help
- fullwrite
- fullread
#### 유의사항
- 매개변수 유효성 검사. LBA와 값 범위 제한
- 없는 명령어 입력 시 "INVALID COMMAND"출력
