public class Wood extends Weapon{

	String st1;
	int k;
	int[] n;
	
	public Wood(){
	
		super();
		
		st1 = "木の棒";
		k = 1;
		int[] N = {1,0};
		n = N;
		setAll(st1,k,n);
	
	}

}
