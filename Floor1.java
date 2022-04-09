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
		
		st1[0] = "進む";
		st1[1] = "戻る";
		st1[2] = "調べる";
		st1[3] = "持ち物";
		setSelect(sl,st1);
		setFloor("1階層");
	
	}
	
	
	//コマンド選択後のメソッド
	
	//プレイヤーフォワード
	//進む
	public void PLFW(){
	
	
		est = plr.getName()+"は前進した。";	
		point++;
		this.addAni(est,0);
		//AniPlay(3);
	
	}
	
	//プレイヤーバックワード
	//戻る
	public void PLBW(){
	
		est = plr.getName()+"は後退した。";
		point--;
		this.addAni(est,0);
		AniPlay(3);
	
	}
	//プレイヤーサーチ
	//調べるコマンド
	public void PLSR(){
	
		if(point==0){
		
			setImage("msbg3.png");
			est = "入り口に立っています。";
			this.addAni(est,0);
			AniPlay(3);
		
		}
	
	}
	
	//チェックバッグ
	//持ち物
	public void CHBG(){
	
		
	
	}
	
	public void setPoint(int pt){point = pt;}
	
	public int getPoint(){return point;}
	
	public boolean getK(){return k;}

}