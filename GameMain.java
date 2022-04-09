import java.io.*;
import java.lang.InterruptedException;
import javafx.scene.input.KeyEvent;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

public class GameMain extends Application{

	public static void main(String[] args){
	
		launch(args);
	
	}
	
	public void start(Stage stage)throws Exception{
		
		stage.setTitle("�����ڎw���I�I");
		stage.setWidth(768);
		stage.setHeight(576);
		
		
		//�t�B�[���h
		Player plr = new Player();
		MonsterList msl = new MonsterList();
		StartScene ss = new StartScene();
		SelectName sn = new SelectName();
		Floor1 floor1 = new Floor1();
		BattleScene bs = new BattleScene();
		WeaponList wpl = new WeaponList();
		MSList mslist = new MSList();
		
		Window wnd = stage;
		ThisKeyEvent ke;
		plr.setWp(wpl.getSUDE());
		mslist.addList(floor1);
		
		
		//�_�~�[scene
		String kl = plr.name;
		Label dlb = new Label(kl);
		VBox dammyvb = new VBox(dlb);
		Scene Dammy = new Scene(dammyvb);
		//stage.setScene(scene);
		
		//�V�[�����Ƃ�keyEvent��ݒ�
		//keyevent�͕ʂ̃N���X�Ƃ��Ď���
		ke = new ThisKeyEvent();
		
		ss.getScene().setOnKeyPressed(event ->
										ke.GameStart(event,sn,stage));
										
		sn.getScene().setOnKeyPressed(event ->
										ke.SelectName(event,plr,sn.getInputString(),wnd,stage,floor1));
										
		floor1.getScene().setOnKeyPressed(event ->
										ke.Floor1Key(event,floor1.getChoice(),floor1,stage,bs,wnd));
		
		bs.getScene().setOnKeyPressed(event ->
										ke.BattleScene(event,bs.getChoice(),stage,bs));
		
		
		ss.play();
		stage.setScene(ss.getScene());
		stage.show();
	
	}

}


//KeyEvent��������
class ThisKeyEvent{

	//�t�B�[���h
	String s = null;
	boolean b1 = false;
	boolean b2 = true;
	CheckWin cw;
	Stage ht;
	GameEnd1 ge1;
	MonsterList msl = new MonsterList();
	WeaponList wpl = new WeaponList();

	//�X�^�[�g��ʂ̃L�[�C�x���g
	public void GameStart(KeyEvent e,SelectName sn,Stage stage){
	
		s = e.getCode().toString();
		
		if(s.equals("SPACE")){
		
			stage.setScene(sn.getScene());
			s = null;
		
		}
	}
	
	//�v���C���[�����͉�ʂ̃L�[�C�x���g
	public void SelectName(KeyEvent e,Player plr,String str,Window wnd,Stage stage,Floor1 floor1){
	
		s = e.getCode().toString();
		
		if(s.equals("ENTER")){
		
			cw = new CheckWin(wnd,str);
			cw.show();
			cw.getScene().setOnKeyPressed(event ->CheckWin(event,plr,stage,floor1,cw));
			

			s = null;
		
		}
	}
	
	//�m�F��ʂ̃L�[�C�x���g
	public void CheckWin(KeyEvent e,Player plr,Stage stage,Floor1 floor1,CheckWin cw){
	
		s = e.getCode().toString();
		
		
		cw.setPlrName(plr);
		cw.close();
		
		if(s.equals("ENTER")){
			
			floor1.setPlr(plr);
			stage.setScene(floor1.getScene());
			s = null;
			
			ht = new HowTo();
			ht.show();	
		}
		
	
	}
	
	//�_���W�����P�K��ʂ̃L�[�C�x���g
	public void Floor1Key(KeyEvent e,Polygon choice,Floor1 floor1,Stage stage,BattleScene bs,Window wnd){
		double point = choice.getLayoutY();
		int FloorPoint = 0;
		String s = e.getCode().toString();
		
		if(s.equals("SPACE")){
		
		
			switch((int)point){
			
				case 380:
				
					floor1.PLFW();
					FloorPoint = floor1.getPoint();
					checkEvent(FloorPoint,stage,bs,floor1,wnd);
					break;
					
				case 412:
				
					floor1.PLBW();
					FloorPoint = floor1.getPoint();
					checkEvent(FloorPoint,stage,bs,floor1,wnd);
					break;
					
				case 444:
					
					floor1.PLSR();
					FloorPoint = floor1.getPoint();
					break;
					
				case 476:
					
					floor1.CHBG();
					FloorPoint = floor1.getPoint();
					break;
					
			}

		}
		
		else{ChengeChoice(choice,s,point);}
	}
	

	//�_���W�����}�b�v�ő����C�x���g
	public void checkEvent(int fp,Stage stage,BattleScene bs,MainSceneFlame msf,Window wnd){
	
		if(fp==1){
			
			bs.setPlr(msf.getPLR());
			bs.setMonster(msl.getMonster());
			bs.addAni(msf.getPLR().getName()+"��"+bs.getMonster().getName()+"�ɑ��������B",0);
			stage.setScene(bs.getScene());
			bs.AniPlay(3);
			bs.setMs(msf);
			
		}
		if(fp==-1){
		
			ge1 = new GameEnd1(wnd);
			ge1.show();
			ge1.getScene().setOnKeyPressed(event ->GameEnd1(event,msf,ge1));

		
		}
	
	}

	//gameEnd1�̃L�[�C�x���g
	//������߂ċA��G���h
	public void GameEnd1(KeyEvent e,MainSceneFlame ms,GameEnd1 ge1){
	
		String s = e.getCode().toString();
		
		if(s.equals("ENTER")){
		
			System.exit(0);
		
		}
		
		if(s.equals("SPACE")){
		
			ge1.close();
			ms.setPoint(0);
		
		}
	
	}
	
	

	//�o�g����ʂ̃L�[�C�x���g
	public void BattleScene(KeyEvent e,Polygon choice,Stage stage,BattleScene bs){
		double point = choice.getLayoutY();
		int FloorPoint = 0;
		String s = e.getCode().toString();
		
		if(s.equals("SPACE")){
		
		
			switch((int)point){
			
				case 380:
				
					bs.Attack();
					break;
					
				case 412:
				

					break;
					
				case 444:
					

					break;
					
				case 476:
				
					double n = Math.random();
					int escape = (int)(n*100);
					if(escape>50){
						
						String log1 = bs.getPLR().getName()+"�͓����o�����I�I\n���������؂邱�Ƃɐ��������I";
						stage.setScene(bs.getMs().getScene());
						bs.addAni(log1,0);
						
						

					}
					else{
					
					String log1 = bs.getPLR().getName()+"�͓����o�����I�I";
					String log2 = "�������A��荞�܂�Ă��܂����I�I";
					bs.addAni(log1,0);
					bs.addAni(log2,1);
					System.out.println("�u������v���s");
					
					}
					bs.AniPlay(2);
					break;
										
			}
		
		//��������G�����X�^�[�̍U��
		bs.MonsterAttack();
		bs.AniPlay(0);
		}
		
		else{ChengeChoice(choice,s,point);}
		
	}

	//�I�����̎O�p�}�[�N�ړ����\�b�h
	public void ChengeChoice(Polygon choice,String s,double point){
		if(s.equals("DOWN")) {
		
			if(point == 476) {
				choice.setLayoutY(380);
			}
			
			else {
				choice.setLayoutY(point + 32);
			}
			
		}
		if(s.equals("UP")) {
		
			if(point == 380) {
				choice.setLayoutY(476);
			}
			
			else {
				choice.setLayoutY(point - 32);
			}
			
		}
	}



}
