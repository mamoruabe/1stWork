import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.text.*;


class HowTo extends Stage{

	//�t�B�[���h
	VBox vb1;
	Label[] lb;
	String[] st;
	ThisKeyEvent ke;
	Scene scene;
	
	public HowTo(){
	
		ke = new ThisKeyEvent();
		st = new String[5];
		lb = new Label[5];
		
		st[0] = "�`��������`";
		st[1] = "�㉺�L�[�őI������I�Ѥ";
		st[2] = "SPACE�������ƌ��肵�܂��B";
		st[3] = "�I������I�тȂ������Ƃ͂ł��܂���B";
		st[4] = "����ɂ́A�����̃X�e�[�^�X���o�Ă��܂��B";
	
		setTitle("�������");
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