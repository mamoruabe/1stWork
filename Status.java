public class Status {

	int HP;//�̗�
	int MP;//���@
	int ATK;//�����U����
	int MATK;//���@�U����
	int DEF;//�����h���
	int MDEF;//���@�h���
	int ATKATR;//�U������
	
	/* ATKATR�ɂ���
	
		ATKATR�͍U���̓����B
		0�͕����Ō�
		1�͕����h��
		2�͕����a��
		3�͖��@�U��
		4�`9�͓���U���B���_�Ȃǁi��ōׂ����ݒ�j
	*/
	
	
	
	int[] weekATK;//��_�U���𐔒l�ɕϊ�
	int[] weekATR;//��_�����𐔒l�ɕϊ�
	int[] attackATR;//�U�������𐔒l�ɕϊ�
	
	/* ATR�ɂ���
		
		�����B�ȉ��ݒ�ԍ�
		10����
		11����
		12����
		13���y
		14����
		�����X�^�[���ƂɎ�_�A�U������
		��ݒ肵�Ă���B
	*/
	
	//�֗���count�ϐ�
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
	
	//WeekATK�̃Z�b�^�[
	public void setWeekATK(int[] K){
		for(int i=0;i<K.length;i++){
			if(countATK>8){
				System.out.println("����ȏ��_�̓Z�b�g�ł��܂���");
			}
			else{
				weekATK[countATR] = K[i];
				countATR++;
			}
		}
	}
	
	public void setWeekATK(int K){
		if(countATK>8){
			System.out.println("����ȏ��_�̓Z�b�g�ł��܂���");
		}
		else{
			weekATK[countATR] = K;
			countATR++;
		}
	}

	//WeekATR�̃Z�b�^�[
	public void setWeekATR(int[] R){
		for(int i=0;i<R.length;i++){
			if(countATR>8){
				System.out.println("����ȏ��_�̓Z�b�g�ł��܂���");
			}
			else{
				weekATK[countATR] = R[i];
				countATR++;
			}
		}
	}

	public void setWeekATR(int R){
		if(countATR>8){
			
			System.out.println("����ȏ��_�̓Z�b�g�ł��܂���");
			
		}
		else{
			weekATK[countATR] = R;
			countATR++;
		}
	}
	
	public void setAttackATR(int[] atkatr){
		for(int i=0;i<atkatr.length;i++){
			if(countAtkAtr>8){
				System.out.println("����ȏ�U�������̓Z�b�g�ł��܂���");
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