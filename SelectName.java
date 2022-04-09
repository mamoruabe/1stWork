import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.scene.input.KeyEvent;

public class SelectName {

	Label lb1;
	Label lb2;
//	Label lb3;
	
	String txt;
	String st1;
	String st2;
	
	Button btn1;
	TextField tf1;
	
	ThisKeyEvent ke = null;
	Player plr;
	
	Scene scene;
	
	public SelectName(){
	
		//label��textfield�ݒ�
		st1 = "�v���C���[������͂��Ă��������B";
		lb1 = new Label(st1);
		lb1.setFont(new Font(30));
		lb1.setLayoutX(10);
		lb1.setLayoutY(100);
		
		
		st2 = "���܂�����ENTER�L�[�������Ă�";
		lb2 = new Label(st2);
		lb2.setFont(new Font(30));
		lb2.setLayoutX(10);
		lb2.setLayoutY(220);
		
		tf1 = new TextField("�v���C���[1");
		
		
		//�v���C���[�l�[�����͗����C�A�E�g
		tf1.setFont(new Font(30));
		tf1.setLayoutX(10);
		tf1.setLayoutY(150);
		
		Group gp = new Group();
		gp.getChildren().addAll(lb1,tf1,lb2);
		
		
		scene = new Scene(gp);
	}
	
	public Scene getScene(){
	
		return scene;
	
	}
	
	public String getInputString(){
	
		txt = tf1.getText();
		return txt;
	
	}
	
	
/*	public void CheckWinRun(Stage stage){
	
		txt = getInputString();
		Window wnd = stage;
		cw = new CheckWin(wnd,stage,NextS,txt,ke,plr);
		cw.show();
		//play();
	}
*/	
	//checkwin��OK�������ƃV�[������
/*	public void play(){
	
		boolean check = true;
		boolean n = true;
		
		while(n){
		
			check = cw.check;
			
			if(check==false){
			
				ke.NameSelectEnd(stage);
				n = false;
			
			}
		
		}
		
		
	
	}
*/
}

class CheckWin extends Stage{

	//�t�B�[���h
	VBox vb1 ;
	Label lb1 ;
	Label lb2 ;
	Label lb3 ;
	String st1;
	ThisKeyEvent ke;
	Scene scene;
	
	public CheckWin(Window wnd,String str){
	
		ke = new ThisKeyEvent();
		st1 = str;
	
		setTitle("�m�F");
		initOwner(wnd);
		setWidth(700);
		setHeight(400);

		lb1 = new Label(st1+"�ł�낵���ł����H");

		lb2 = new Label("OK�Ȃ�ENTER�A");
		lb3 = new Label("�ς���Ȃ�SPACE�������Ă��������B");
		
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
	
	public void setPlrName(Player plr){
	
		plr.setName(st1);
	
	}
	
}
