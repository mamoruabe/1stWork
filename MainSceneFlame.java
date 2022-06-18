import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.scene.input.KeyEvent;
import java.io.*;
import javafx.util.Duration;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.util.Duration;

public class MainSceneFlame{

	Label[] sl = new Label[4];

	Label[] pl = new Label[4];
	
	int slX;
	int slY;
	int plX;
	int plY;
	
	int esLX;
	int esLY;

	
	Label floor;

	Polygon choice;
	
	Group plGp;
	Group slGp;
	Group mainGP;
	
	Pane root;

	VBox vb1;
	Scene scene;
	Image img;
	Player plr = new Player();
	
	BackgroundImage bimg ;
	Background bg ;
	
	String[] st1 = new String[4];
	Label[] eventString = new Label[4];
	ANI[] ani = new ANI[4];

	
	public MainSceneFlame(String str){
		
		esLX = 165;
		esLY = 375;
	
//		Slaim sm1 = new Slaim();
//		sm1.setL((576/2)-(sm1.GSizeW/2),20);
	
		//選択肢の枠
		Rectangle rect1 = new Rectangle(20, 370, 120, 150);
		rect1.setStroke(Color.BLACK);
		rect1.setArcWidth(20);
		rect1.setArcHeight(20);
		rect1.setFill(null);
		
		//テキストの欄
		Rectangle rect2 = new Rectangle(160, 370, 560, 150);
		rect2.setStroke(Color.BLACK);
		rect2.setArcWidth(20);
		rect2.setArcHeight(20);
		rect2.setFill(null);
		
		//プレイヤー情報欄
		Rectangle rect3 = new Rectangle(20, 10, 120, 150);
		rect3.setStroke(Color.BLACK);
		rect3.setArcWidth(20);
		rect3.setArcHeight(20);
		rect3.setFill(null);
		
		//階層情報欄
		Rectangle rect4 = new Rectangle(160, 10, 560, 25);
		rect4.setStroke(Color.BLACK);
		rect4.setArcWidth(20);
		rect4.setArcHeight(20);
		rect4.setFill(null);
		
		//選択の三角マーク
		//Double []d = new Double[]{0.0, 0.0, 100.0, 0.0, 50.0, 70.0};
		Double []d = new Double[]{0.0, 0.0, 0.0, 20.0, 14.0, 10.0};
		choice = new Polygon();
		//choice.setRotate(270);
		choice.getPoints().addAll(d);
		choice.setLayoutX(35);
		choice.setLayoutY(380);
		choice.setFill(Color.BLACK);
		
		plX = 30;
		plY = 20;
		
		//プレイヤーの情報
		for(int i=0;i<pl.length;i++){
			pl[i] = new Label();
			pl[i].setFont(new Font(20));
			pl[i].setLayoutX(plX);
			pl[i].setLayoutY(plY+(32*i));
		}
		
		//階層情報
		floor = new Label();
		floor.setFont(new Font(20));
		floor.setLayoutX(440);
		floor.setLayoutY(8);

		slX = 55;
		slY = 376;
		
		
		for(int i=0;i<4;i++){
		
			eventString[i] = new Label("");
			eventString[i].setFont(new Font(30));
			eventString[i].setLayoutX(esLX);
			eventString[i].setLayoutY(esLY+(32*i));
			ani[i] = new ANI(eventString[i]);
			
		}
		
	
		
		//選択肢枠の文字
		for(int i=0;i<sl.length;i++){
		
			sl[i] = new Label();
			sl[i].setLayoutY(slY+(32*i));
			
		}
		
		//配置をそれぞれのGroup変数に代入
		plGp = new Group();
		plGp.getChildren().addAll(pl);
		
		slGp = new Group();
		slGp.getChildren().addAll(sl);
		
		
		
		mainGP = new Group();
		mainGP.getChildren().addAll(rect1,rect2,rect3,rect4,choice,plGp,slGp,floor);
		mainGP.getChildren().addAll(eventString);
		
		
		root = new Pane(mainGP);
		setImage(str);

		
		scene = new Scene(root);
	
	}
	public void setSelect(Label[] lb,String[] str){
	
		for(int i=0;i<4;i++){
			lb[i].setText(str[i]);
			lb[i].setFont(new Font(20));
			lb[i].setLayoutX(slX);
		}
	
	}
	
	public Scene getScene(){
	
		return scene;
	
	}
	
	public Polygon getChoice(){
	
		return choice;
	
	}
	
	public void setImage(String str){
	
		try{
			 img = new Image(str);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("読み込み失敗");
		}

		bimg = new BackgroundImage(img,null,null,null,null);
		bg = new Background(bimg);
		root.setBackground(bg);

	
	}
	
	public void setPlr(Player PLR){
	
		plr = PLR;
		pl[0].setText(plr.getName());
		pl[1].setText("Lv:"+plr.getLv());
		pl[2].setText("HP:"+plr.getHP());
		pl[3].setText("MP:"+plr.getMP());

	}
	
	public void setFloor(String str){
	
		floor.setText(str);
	
	}
	
	public Player getPLR(){return plr;}
	
	public void clearAnimation(){
		for(int i=0;i<4;i++){ani[i]=null;}
	}
	public void addAni(String str,int point){
	
		eventString[point].setText(str);
		ani[point] = new ANI(eventString[point]);
	
	}
	
	public void AniPlay(int n){
		SequentialTransition animation = new SequentialTransition();
		
		switch(n){
			case 0:
				animation.getChildren().addAll(ani[0],ani[1],ani[2],ani[3]);
				break;
			case 1:
				animation.getChildren().addAll(ani[0],ani[1],ani[2]);
				break;
			case 2:
				animation.getChildren().addAll(ani[0],ani[1]);
				break;
			case 3:
				animation.getChildren().addAll(ani[0]);
				break;
		}
		animation.play();
	}
	
	public void setPoint(int pt){}
	
}


//animation実装クラス

class ANI extends Transition{

	Label lb1 ;
	String est;


	public ANI(Label eventString){
	
		super();
		lb1 = eventString;
		est = lb1.getText();
		lb1.setText("");
		setCycleDuration(Duration.millis(200));
		
	
	}

	@Override
	public void interpolate(double frac){
		
		final int length = est.length();
		final int n = Math.round(length*(float)frac);
		lb1.setText(est.substring(0,n));
		
/*			if(n==length){
				this.stop();
			}
*/		


	
	}

}
