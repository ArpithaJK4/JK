

public class Strong {
	
	
	
	public static void main(String[]args){
 
		int no=145;
		int sum=0;
		int copy=no;
		 while(no!=0){
			 int rem=no%10;
			 
	
		 int  fact=1;
		 for(int i=rem; i>1;i--){
			 fact=fact*i;
		 }
	sum=sum+fact;
	no=no/10;}
	if(sum==copy){
		System.out.println("strong number");
	}
	else{
		System.out.println("not a Strong number");
	}
	}
}