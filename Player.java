public class Player{

	String name;//�v���C���[�l�[��
	int HP;//�̗�
	int MaxHP;
	int MP;//����
	int MaxMP;
	int ATK;//�����U����
	int MATK;//���@�U����
	int DEF;//�����h���
	int MDEF;//���@�h���
	int Lv;//���x��
	int Ex;//�o���l
	Weapon wp;
	
	//�R���X�g���N�^
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
	
	//�Z�b�^�[�ƃQ�b�^�[
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

	//LvUp�֐��p�̊֐�
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
	
	//atk��damage
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
