import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.util.Duration;

public class Floor1 extends MainSceneFlame{
	
	String[] st1 = new String[4];
	Label eventString ;
	String est;
	int point ;
	Animation ani;
	boolean k = false;
	
	public Floor1(){

		super("msbg2.png");
		
		point = 0;
		eventString = new Label();
		eventString.setFont(new Font(30));
		eventString.setLayoutX(165);
		eventString.setLayoutY(375);
		
		st1[0] = "�i��";
		st1[1] = "�߂�";
		st1[2] = "���ׂ�";
		st1[3] = "������";
		setSelect(sl,st1);
		setFloor("1�K�w");
	
	}
	
	
	//�R�}���h�I����̃��\�b�h
	
	//�v���C���[�t�H���[�h
	//�i��
	public void PLFW(){
	
	
		est = plr.getName()+"�͑O�i�����B";	
		point++;
		this.addAni(est,0);
		//AniPlay(3);
	
	}
	
	//�v���C���[�o�b�N���[�h
	//�߂�
	public void PLBW(){
	
		est = plr.getName()+"�͌�ނ����B";
		point--;
		this.addAni(est,0);
		AniPlay(3);
	
	}
	//�v���C���[�T�[�`
	//���ׂ�R�}���h
	public void PLSR(){
	
		if(point==0){
		
			setImage("msbg3.png");
			est = "������ɗ����Ă��܂��B";
			this.addAni(est,0);
			AniPlay(3);
		
		}
	
	}
	
	//�`�F�b�N�o�b�O
	//������
	public void CHBG(){
	
		
	
	}
	
	public void setPoint(int pt){point = pt;}
	
	public int getPoint(){return point;}
	
	public boolean getK(){return k;}

}