package p2022_06_27;

public class Report_0627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    1. 2차원 배열을 이용해서 5명 학생들의 국어,영어,수학 점수를 저장 했을때, 과목별 총점과 학생별 총점을 출력하는 프로그램을 작성하세요?
//	       (단, 과목명(국어,영어,수학), 학생번호를 출력 하세요)
		// 1차원 배열 사용

		
		  
	    int [][]score = { { 85,  60,  70}, 
					      { 90,  95,  80}, 
					      { 75,  80, 100}, 
	                      { 80,  70,  95},  
					      {100,  65,  80}  
						};
	    
	    int [] subject = new int[3]; 	
	    int [] student = new int[5]; 		
	    									
	    int  r, c;  
		    
	    String[] s1 = {"국어", "수학", "영어"};
	    String[] s2 = {"1번 학생", "2번 학생", "3번 학생", "4번 학생", "5번 학생"};
	    
	    System.out.println("각 과목별 총점구하기 ");
	    for(c = 0; c < 3 ; c++){ 			
	      for(r = 0; r < 5 ; r++){ 		
	        subject[c] += score[r][c];   	

	      }
	      System.out.println(s1[c] + ": " + subject[c]);  
	    }

	    
	    System.out.println("학생별 총점구하기");
	    for(r = 0; r < 5 ; r++){    	  
	      for(c = 0; c < 3 ; c++){  	
	        student[r] += score[r][c];  
	      }
	      System.out.println(s2[r] + ": " + student[r]);
	    }

	}
	
}    