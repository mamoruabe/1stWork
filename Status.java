public class Status {

	int HP;//体力
	int MP;//魔法
	int ATK;//物理攻撃力
	int MATK;//魔法攻撃力
	int DEF;//物理防御力
	int MDEF;//魔法防御力
	int ATKATR;//攻撃属性
	
	/* ATKATRについて
	
		ATKATRは攻撃の特性。
		0は物理打撃
		1は物理刺突
		2は物理斬撃
		3は魔法攻撃
		4～9は特殊攻撃。精神など（後で細かく設定）
	*/
	
	
	
	int[] weekATK;//弱点攻撃を数値に変換
	int[] weekATR;//弱点属性を数値に変換
	int[] attackATR;//攻撃属性を数値に変換
	
	/* ATRについて
		
		属性。以下設定番号
		10が炎
		11が水
		12が風
		13が土
		14が雷
		モンスターごとに弱点、攻撃属性
		を設定している。
	*/
	
	//便利なcount変数
	int countATK = 0;
	int countATR = 0;
	int countAtkAtr = 0;
	
	public Status(){
	
		HP = 0;
		MP = 0;
		ATK = 0;
		MATK = 0;
		DEF = 0;
		MDEF = 0;
		ATKATR = 0;
		weekATK = new int[9];
		weekATR = new int[9];
		attackATR = new int[9];
	
	}

	public void setStatus(int[] sts){
	
		HP = sts[0];
		MP = sts[1];
		ATK = sts[2];
		MATK = sts[3];
		DEF = sts[4];
		MDEF = sts[5];
	
	}
	
	//WeekATKのセッター
	public void setWeekATK(int[] K){
		for(int i=0;i<K.length;i++){
			if(countATK>8){
				System.out.println("これ以上弱点はセットできません");
			}
			else{
				weekATK[countATR] = K[i];
				countATR++;
			}
		}
	}
	
	public void setWeekATK(int K){
		if(countATK>8){
			System.out.println("これ以上弱点はセットできません");
		}
		else{
			weekATK[countATR] = K;
			countATR++;
		}
	}

	//WeekATRのセッター
	public void setWeekATR(int[] R){
		for(int i=0;i<R.length;i++){
			if(countATR>8){
				System.out.println("これ以上弱点はセットできません");
			}
			else{
				weekATK[countATR] = R[i];
				countATR++;
			}
		}
	}

	public void setWeekATR(int R){
		if(countATR>8){
			
			System.out.println("これ以上弱点はセットできません");
			
		}
		else{
			weekATK[countATR] = R;
			countATR++;
		}
	}
	
	public void setAttackATR(int[] atkatr){
		for(int i=0;i<atkatr.length;i++){
			if(countAtkAtr>8){
				System.out.println("これ以上攻撃属性はセットできません");
			}
			else{
				attackATR[countAtkAtr] = atkatr[i];
			}
		}
	}
	
	public void setATKATR(int atkatr){ATKATR = atkatr;}
	
	public void setHP(int hp){HP = hp;}
	
	public int getHP(){return HP;}
	
	public void setMP(int mp){MP = mp;}
	
	public int getMP(){return MP;}
	
	public int getATK(){return ATK;}
	
	public int getMATK(){return MATK;}
	
	public int getDEF(){return DEF;}
	
	public int getMDEF(){return MDEF;}
	
	public int getATKATR(){return ATKATR;}
	
	public int[] getWeekATK(){return weekATK;}
	
	public int[] getWeekATR(){return weekATR;}
	
	public int[] getAttackATR(){return attackATR;}
	
	public int getWeekATK(int i){return weekATK[i];}
	
	public int getWeekATR(int i){return weekATR[i];}
	
	public int getAttackATR(int i){return attackATR[i];}

	

}