public class Slaim extends Monster{

	//固有のステータスセット
	private int watk = 1;//物理,斬撃弱点
	private int[] watr = {10,14};//炎、雷弱点
	private int atkatr = 0;//物理打撃攻撃、属性なし
	
	//各種ステータス
	//HP,MP,ATK,MATK,DEF,MDEFの順
	private int[] SlaimSts ={8,0,4,0,0,2};
	
	Slaim(){
	
		super("スライム","slaim1.png");

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

	//固有のステータスセット
	private int watk = 1;//物理,斬撃弱点
	private int[] watr = {10,14};//炎、雷弱点
	private int atkatr = 0;//物理打撃攻撃、属性なし
	
	//各種ステータス
	//HP,MP,ATK,MATK,DEF,MDEFの順
	private int[] SlaimSts ={12,0,3,0,0,3};
	
	Goburin(){
	
		super("ゴブリン","slaim1.png");

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