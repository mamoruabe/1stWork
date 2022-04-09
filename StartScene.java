import javafx.animation.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.scene.control.*;
import javafx.scene.text.*;
import java.nio.file.Paths;

//スタート画面のクラス

public class StartScene {

	//フィールド
	String st1;
	Label gs1; 
	String st2;
	Label gs2;
	Scene scene;
	FadeTransition ft1;
	FadeTransition ft2;
	Image img;
	
	
	public StartScene(){
	
		try{

			img = new Image("bgSample1.png");

		}
		
		catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("読み込み失敗");
		}
		
		
		
	BackgroundImage bimg = new BackgroundImage(img,null,null,null,null);
	Background bg = new Background(bimg);
	
	
		st1 = "GAME START !!";
		st2 = "PRESS TO SPACE";
		
		gs1 = new Label(st1);
		gs2 = new Label(st2);
		
		gs1.setLayoutX(10);
		gs1.setLayoutY(200);

		gs2.setLayoutX(10);
		gs2.setLayoutY(240);
		


		gs1.setFont(new Font(40));
		gs2.setFont(new Font(40));
		
		Group gp = new Group();
		gp.getChildren().addAll(gs1,gs2);
		
		
		ft1 = new FadeTransition(Duration.millis(3000),gp);
		ft1.setFromValue(0.8);
		ft1.setToValue(0.8);
		ft1.setCycleCount(60);
		ft1.setAutoReverse(true);
		
		Pane pane = new Pane(gp);
		
		pane.setBackground(bg);
		
		scene = new Scene(pane);
		
	}
	
	public void play(){
	
		ft1.play();
	
	}
	
	public Scene getScene(){
	
		return scene;
	
	}

}