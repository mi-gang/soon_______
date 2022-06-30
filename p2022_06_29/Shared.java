package p2022_06_29;

public class Shared {
    public static void main( String[] args ) {
    
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number);			// 3
        //									정적 필드로 접근
        
        sc1.number++;	
        System.out.println("sc1.number = " + sc1.number);			// 4
        
        StaticCount sc2 = new StaticCount();
        System.out.println("sc2.number = " + sc2.number);	// heap이 아니라 static 메모리이기때문에 가장 마지막에 저장된 값을 계속 저장하고 있음
        															// 4
        
        sc2.number++;
        System.out.println("sc2.number = " + sc2.number);			// 5
        
        StaticCount.number++;
        System.out.println(StaticCount.number);
    }
}
            
        
        
        