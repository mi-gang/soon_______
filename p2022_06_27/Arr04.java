package p2022_06_27;

public class Arr04 {

  public static void main(String[] args) {
   
	  
	//				c	국    	  영	    수  				r
    int [][]score = { { 85,  60,  70},   // 0 행		1번 학생
				      { 90,  95,  80},   // 1 행		2번 학생
				      { 75,  80, 100},   // 2 행		3번 학생
                      { 80,  70,  95},   // 3 행		4번 학생
				      {100,  65,  80}    // 4 행		5번 학생
					};
    
    int [] subject = new int[3]; 			// 과목 총점 저장 (1차원 배열 또는 변수에 저장할 수 있음)
    int [] student = new int[5]; 			// 학생 총점 저장
    										// 값은 자동으로 0으로 초기화 	//	subject[0]=0, student[0]=0;
    int  r, c;  
	    
    
    System.out.println("각 과목별 총점구하기 ");
    for(c = 0; c < 3 ; c++){ 				// 과목         
      for(r = 0; r < 5 ; r++){ 				// 학생      
        subject[c] += score[r][c];   		// subject[c] = subject[c] + score[r][c];
        //sum과 같은 역할
      }
      System.out.println(subject[c]);  
    }

    
    System.out.println("학생별 총점구하기");
    for(r = 0; r < 5 ; r++){    			// 학생      
      for(c = 0; c < 3 ; c++){  			// 과목    
        student[r] += score[r][c];  		// student[r] = student[r] + score[r][c];
      }
      System.out.println(student[r]);
    }

  }//main() end
}// class end        