package section05;
/*
 *

1번

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
					i	j
   *				0	j < 3 = 3-i
  ***				1 	j < 2 = 3-i
 *****				2	j < 1
*******				3	j
 *****		 		4	
  ***		 		5
   *				6
 
5번 구구단
	 2 x 1 = 2 	3 x 1 = 3	4 x 1 = 4
	 
	 
 */
public class LoopHomeWork {
	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(i < 7/2 +1) {
					
					if(j < 3-i) {
						System.out.println(" ");
					}
				}
				System.out.print("*");
		}
		System.out.println();
		
	}
		
}
}
		

