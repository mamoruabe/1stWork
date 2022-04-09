public class Weapon {

	
	String name ;
	int watk;
	int[] watr;
	
	
	public Weapon(){
	
		name = "";
		watk = 0;
		watr = null;
	
	}
	
	//セッターとゲッター
	public void setName(String st){name =st;}
	
	public String getName(){return name;}
	
	public void setWatk(int WATK){watk = WATK;}
	
	public int getWatk(){return watk;}

	public void setWatr(int[] WATR){watr = WATR;}
	
	public int[] getWatr(){return watr;}
	
	
	public void setAll(String NAME,int WATK,int[] WATR){
	
		setName(NAME);
		setWatk(WATK);
		setWatr(WATR);
	
	}

	

}