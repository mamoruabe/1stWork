import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;

class GameEnd1 extends Stage{

	//�t�B�[���h
	VBox vb1 ;
	Label lb1 ;
	Label lb2 ;
	Label lb3 ;
	ThisKeyEvent ke;
	Scene scene;
	
	public GameEnd1(Window wnd){
	
		ke = new ThisKeyEvent();
		
	
		setTitle("�m�F");
		initOwner(wnd);
		setWidth(700);
		setHeight(400);

		lb1 = new Label("������łāA�Q�[�����I�����܂��B");

		lb2 = new Label("OK�Ȃ�ENTER�A");
		lb3 = new Label("������Ȃ�SPACE�������Ă��������B");
		
		lb1.setFont(new Font(30));
		lb2.setFont(new Font(30));
		lb3.setFont(new Font(30));
		
		//VBox�̐ݒ�
		vb1 = new VBox();
		
		vb1.getChildren().addAll(lb1,lb2,lb3);
		vb1.setPrefSize(100,100);
		
		scene = new Scene(vb1);		
		
		setScene(scene);
		
	
	}
	
}
