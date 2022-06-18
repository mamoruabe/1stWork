import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.text.*;


class HowTo extends Stage{

	//フィールド
	VBox vb1;
	Label[] lb;
	String[] st;
	ThisKeyEvent ke;
	Scene scene;
	
	public HowTo(){
	
		ke = new ThisKeyEvent();
		st = new String[5];
		lb = new Label[5];
		
		st[0] = "～操作説明～";
		st[1] = "上下キーで選択肢を選び､";
		st[2] = "SPACEを押すと決定します。";
		st[3] = "選択肢を選びなおすことはできません。";
		st[4] = "左上には、自分のステータスが出ています。";
	
		setTitle("操作説明");
		setWidth(700);
		setHeight(300);

		for(int i=0;i<5;i++){
			lb[i] = new Label(st[i]);
			lb[i].setFont(new Font(30));
		
		}
		
		vb1 = new VBox();
		vb1.getChildren().addAll(lb);
		
		scene = new Scene(vb1);		
		
		setScene(scene);
		
	
	}
}