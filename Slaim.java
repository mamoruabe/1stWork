public class Slaim extends Monster{

	//ÅLÌXe[^XZbg
	private int watk = 1;//¨,aã_
	private int[] watr = {10,14};//Aã_
	private int atkatr = 0;//¨ÅUA®«Èµ
	
	//eíXe[^X
	//HP,MP,ATK,MATK,DEF,MDEFÌ
	private int[] SlaimSts ={8,0,4,0,0,2};
	
	Slaim(){
	
		super("XC","slaim1.png");

		status.setStatus(SlaimSts);
		status.setWeekATK(watk);
		status.setWeekATR(watr);
		status.setATKATR(atkatr);
	}
	
	public void setImage(){
	
		
	
	}



	public int[] attack(){
	
		int[] attack = new int[2];
		
		attack[0] = status.getATK();
		attack[1] = atkatr;
		
		
		return attack;
	
	}
	
	
	public boolean death(){
	
		if(getHP()<0){
		
			return true;
		
		}
		
		else{
		
			return false;
		
		}
	
	}

}

class Goburin extends Monster{

	//ÅLÌXe[^XZbg
	private int watk = 1;//¨,aã_
	private int[] watr = {10,14};//Aã_
	private int atkatr = 0;//¨ÅUA®«Èµ
	
	//eíXe[^X
	//HP,MP,ATK,MATK,DEF,MDEFÌ
	private int[] SlaimSts ={12,0,3,0,0,3};
	
	Goburin(){
	
		super("Su","slaim1.png");

		status.setStatus(SlaimSts);
		status.setWeekATK(watk);
		status.setWeekATR(watr);
		status.setATKATR(atkatr);
	}
	
	public void setImage(){
	
		
	
	}



	public int[] attack(){
	
		int[] attack = new int[2];
		
		attack[0] = status.getATK();
		attack[1] = atkatr;
		
		
		return attack;
	
	}
	
	
	public boolean death(){
	
		if(getHP()<0){
		
			return true;
		
		}
		
		else{
		
			return false;
		
		}
	
	}

}