import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;

class GameEnd1 extends Stage{

	//フィールド
	VBox vb1 ;
	Label lb1 ;
	Label lb2 ;
	Label lb3 ;
	ThisKeyEvent ke;
	Scene scene;
	
	public GameEnd1(Window wnd){
	
		ke = new ThisKeyEvent();
		
	
		setTitle("確認");
		initOwner(wnd);
		setWidth(700);
		setHeight(400);

		lb1 = new Label("塔からでて、ゲームを終了します。");

		lb2 = new Label("OKならENTER、");
		lb3 = new Label("続けるならSPACEを押してください。");
		
		lb1.setFont(new Font(30));
		lb2.setFont(new Font(30));
		lb3.setFont(new Font(30));
		
		//VBoxの設定
		vb1 = new VBox();
		
		vb1.getChildren().addAll(lb1,lb2,lb3);
		vb1.setPrefSize(100,100);
		
		scene = new Scene(vb1);		
		
		setScene(scene);
		
	
	}
	
}
