
public class Opr06_02 {

	public static void main(String[] args) {
		
		int a=10;
		
		//1. 단순 출력 : a에 10을 더한 값을 화면에만 출력해서 보여줌
		System.out.println( a + 10 ); //20 
		System.out.println( a ); //여전히 10
		
		//2. 값 갱신 : a에 10을 더한 값을, 다시 a자신에게 저장함 
		a = a + 10;
	  //10 = 10 + 10; 
	  //10 =  20; 
	  //20 
		
		//3. 복합 대입연산자 : a = a + 10 과 완벽하게 동일한 짧은 표현!
		a += 10;
	//	a = a + 10;
	//	20 = 20 + 10;
	//  20 =   30;
	//   30
		System.out.println(a); //20에 10이 더해져서 30이 됨
		

	}

}
