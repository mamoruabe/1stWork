public class Player{

	String name;//プレイヤーネーム
	int HP;//体力
	int MaxHP;
	int MP;//魔力
	int MaxMP;
	int ATK;//物理攻撃力
	int MATK;//魔法攻撃力
	int DEF;//物理防御力
	int MDEF;//魔法防御力
	int Lv;//レベル
	int Ex;//経験値
	Weapon wp;
	
	//コンストラクタ
	public Player(){
	
		name = null;
		HP = 10;
		MP = 5;
		ATK = 3;
		MATK = 1;
		DEF = 2;
		MDEF = 2;
		Lv = 1;
		Ex = 0;
		
		wp =new Weapon();
		
	
	}
	
	//セッターとゲッター
	public void setName(String NAME){name = NAME;}
	
	public String getName(){return name;}
	
	public void setHP(int hp){HP = hp;}
	
	public int getHP(){return HP;}

	public void setMP(int mp){MP = mp;}

	public int getMP(){return MP;}

	public void setWp(Weapon WP){wp = WP;}

	public int[] getDEF(){
	
		int[] DEFALL = {DEF,MDEF};
		
		return DEFALL;
	
	}

	//LvUp関数用の関数
	public void addEx(){
	
		
	
	}
	public void LvUp(){
	
		MaxHP = MaxHP+MaxHP;
		MaxMP = MaxMP+MaxMP;
		HP = MaxHP;
		MP =MaxMP;
		Lv++;
	
	}
	
	public int getLv(){
	
		return Lv;
	
	}
	
	//atkとdamage
	public int[] attackWp(){
	
		int[] atr = wp.getWatr();
	
		int[] atk = new int[atr.length+1];
		
		atk[0] = ATK*Lv+wp.getWatk();
		
		
		for(int i=1;i<atk.length;i++){
		
			atk[i] = atr[i-1];
		
		}
		
		return atk;
	
	}
	

}
