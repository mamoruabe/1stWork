import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.animation.*;

public abstract class Monster{

	//ステータスフィールド
	
	//画像のサイズ。あとで使う
	int GSizeW = 64*3;
	int GSizeH = 64*3;
	

	String name;
	Status status;

	//レイアウト
	VBox vb ;
	Image image;
	Label lb ;
//	PathTransition msAniATK;
//	PathTransition msAniDMG;
	
	
	public Monster(String NAME,String str){
	
		//各種フィールド初期化

		name = NAME;
		status = new Status();

		vb = new VBox();
		image = null;
		lb = new Label("           "+name);
		
//		msAniATK = null;
//		msAniDMG = null;

		
		//画像読み込み
		try{

			image = new Image(str);

		}
		catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("読み込み失敗");
		}
		
		//labelサイズ設定
		lb.setFont(new Font(20));
		
		//画像サイズ設定
		ImageView iv = new ImageView();
		iv.setFitWidth(GSizeW);
		iv.setFitHeight(GSizeH);
		
		iv.setImage(image);
		vb.getChildren().addAll(lb,iv);
		
	}
	
/*	public Animation getMsAniDMG(){
	
		return msAniDMG;
	
	}
*/	
	public  abstract int[] attack();
	
	public abstract boolean death();

	public void Abbility(){}
	
	public String getName(){return name;}
	
	public void setHP(int k){status.setHP(k);}
	
	public int getHP(){return status.getHP();}

	public void setMP(int k){status.setMP(k);}

	public int getMP(){return status.getMP();}
	
	
	public VBox getVB(){
	
		return vb;
	
	}
	
	public void setL(int x,int y){
	
		vb.setLayoutX(x);
		vb.setLayoutY(y);
	
	}
	
/*	public void setADAni(VBox vb,int x,int y){
	
		msAniATK = new MonsterAnimation(vb,x,y,true);
		msAniDMG = new MonsterAnimation(vb,x,y);
	
	}*/
	
	//ステータスのゲッター
	
	public Status getStatus(){return status;}


}

/*
class MonsterAnimation extends Transition{
	private VBox vb;
	private int LayX;
	private int LayY;
	boolean AorD;

	//変数の宣言などを書いていく
	private int count;

	public MonsterAnimation(VBox vb,int x,int y,boolean effect){
		this.vb = vb;
		LayX = x;
		LayY = y;
		AorD = effect;
		
	}
	
	public MonsterAnimation(VBox vb,int x,int y){
		this.vb = vb;
		LayX = x;
		LayY = y;
		AorD = false;
		
	}
	

	@Override
	public void interpolate(double frac){
	
		long time = (long)(frac*10);
		
		if(AorD){
			AMotion(time);
		}
		else{
			DMotion(time);
		}
		
		//if(time>500){}

	}

	//動かす
	public void DMotion(long time){
	
		if(time%9==0){vb.setLayoutX(LayX);}
		if(time%9==1){vb.setLayoutX(LayX+5);}
		if(time%9==2){vb.setLayoutX(LayX+10);}
		if(time%9==3){vb.setLayoutX(LayX+5);}
		if(time%9==4){vb.setLayoutX(LayX);}
		if(time%9==5){vb.setLayoutX(LayX-5);}
		if(time%9==6){vb.setLayoutX(LayX-10);}
		if(time%9==7){vb.setLayoutX(LayX-5);}
		if(time%9==8){vb.setLayoutX(LayX);}

	
	}

	public void AMotion(long time){
	
		if(time%7==0){vb.setLayoutX(LayY);}
		if(time%9==1){vb.setLayoutX(LayY+5);}
		if(time%9==2){vb.setLayoutX(LayY+10);}
		if(time%9==3){vb.setLayoutX(LayY+15);}
		if(time%9==4){vb.setLayoutX(LayY+10);}
		if(time%9==5){vb.setLayoutX(LayY+5);}
		if(time%9==6){vb.setLayoutX(LayY);}

	
	}


}*/