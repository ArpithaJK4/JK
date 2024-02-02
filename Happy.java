

public class Happyno {
	
	
	
	public static void main(String[]args){
  int no=80;
  while(no>9){
	  no=num(no);
  }
  if(no==7||no==1){
	  System.out.println("happy number");
  }else{
	  System.out.println("not a happy number");
  }

}

	private static int num(int no) {
		 int sum=0;
		
		 while(no!=0){
			 int rem=no%10;
			 sum=sum+rem*rem;
			 no=no/10;
			 
		 }
			return sum;
	}
}
