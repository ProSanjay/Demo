package bit;

public class Sum {
  public static int summ(int x,int y) {
  
	  while(y!=0) {
		  //to find carry we use and operator
		  int carry=x&y;
		  System.out.println(carry);
		  //now calculate actual sum
		  x=x^y;
		  System.out.println(x);
		  //left shift carry
		  y=carry<<1;
		  System.out.println(y);
		  
	  }
	  return x;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=summ(5,-4);
		System.out.println(result);

	}

}
