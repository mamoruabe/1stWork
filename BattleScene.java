import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.util.Duration;


public class BattleScene extends MainSceneFlame{

	Monster ms;
	MainSceneFlame msf;
	SequentialTransition animation;
	String est;
	boolean k = false;
	int LX;
	int LY;
	
	
	public BattleScene(){
	
		super("bsbg1.png");
		est = null;
		animation = null;
		LX = 165;
		LY = 375;
		
		
		st1[0] = "��������";
		st1[1] = "�܂ق�";
		st1[2] = "�ڂ�����";
		st1[3] = "�ɂ���";
		setSelect(sl,st1);
		setFloor("!!BATTLE!!");
		
		
	
	}
	
	public void setMonster(Monster MS){
	
		ms = MS;
		ms.setL(400,120);
//		ms.setADAni(ms.getVB(),400,120);
		mainGP.getChildren().add(ms.getVB());
	
	}
	
	public void setMs(MainSceneFlame msn){msf = msn;}
	
	public MainSceneFlame getMs(){return msf;}
	
	public Monster getMonster(){return ms;}
	
	
	public Animation getAni(int point){return ani[point];};
	
		//�u���������v���[�g
	public void Attack(){
		
			Status Mstatus = ms.getStatus();
			int[] plrATK = plr.attackWp();
			int[] plrDEF = plr.getDEF();
			int weekCount = 1;
			int Maxloop = 0;
			
				Maxloop=Mstatus.weekATR.length;
			
			for(int i=1;i>plrATK.length;i++){
			
				for(int j=0;j>Maxloop;j++){
				
					if(plrATK[i]==Mstatus.getWeekATR(j)){weekCount++;}
				
				}
			
			}
				Maxloop=Mstatus.weekATK.length;
				
			for(int i=1;i>plrATK.length;i++){
			
				for(int j=0;j>Maxloop;j++){
				
					if(plrATK[i]==Mstatus.getWeekATK(j)){weekCount++;}
				}
			
			}

			
			int Damege = plrATK[0]*weekCount;
			
			
			Mstatus.setHP(Mstatus.getHP()-Damege);

			System.out.println("Damege is "+Damege+".\n"+ms.getName()+"'s HP is"+ms.getHP());


			String log1 = plr.getName()+"�̂��������I";
			
			String log2 = ms.getName()+"��"+Damege+"�̃_���[�W�I�I";
			
			//�A�j���[�V�����쐬

			addAni(log1,0);
			addAni(log2,1);
//			ms.setADAni(ms.getVB(),this.slX,this.slY);
//			Animation MSani = ms.getMsAniDMG();
			
			//�A�j���[�V�����Z�b�g
//			ParallelTransition plT = new ParallelTransition(MSani,getAni(0),getAni(1));
//			SequentialTransition seqT = new SequentialTransition(plT);
			
//			seqT.play();
		
	}
	
//	�����X�^�[�̍U��
	public void MonsterAttack(){
	
			Status Mstatus = ms.getStatus();
			int[] plrATK = plr.attackWp();
			int[] plrDEF = plr.getDEF();
			int defNum = -1;
			int weekCount = 1;
			int Maxloop = 0;
			String log1="";
			String log2="";
			
			for(int i=0;i<9;i++){
			
				if(Mstatus.getAttackATR(i)<2){defNum = 0;}
				else if(Mstatus.getAttackATR(i)>=2){defNum = 1;}
			
			}
			
			if(defNum!=-1){
			//defNum�Ń`�F�b�N
				System.out.println("defNum ="+defNum);
				
				
				int Damage = Mstatus.getATK()+Mstatus.getMATK()-plrDEF[defNum];
				System.out.println(ms.getName()+" have "+Mstatus.getATK()+" power");
				System.out.println("Damage is "+Damage);
				
				if(Damage<0){Damage = 0;}
				log1 = ms.getName()+"�̍U���I�I";
				log2 = plr.getName()+"��"+Damage+"�̃_���[�W�I";
				plr.setHP(plr.getHP()-Damage);
				setPlr(plr);
			}
			
			else{
			
				System.out.println("miss");
				log1 = ms.getName()+"�̍U���I�I";
				log2 = "�������A�O��Ă��܂����I�I";
			
			}
			
			addAni(log1,2);
			addAni(log2,3);


	
	}
	
	public boolean checkPLRHP(){
	
		
	
	}
}
