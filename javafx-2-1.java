package javaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Form extends Application {

	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage window) throws Exception {
		
		window.setTitle("Form 1");
	
		Button btnSave=new Button("Save");
		btnSave.setOnAction(e->{
			
			int x=20;
			int y=40;
			
			System.out.println(x+y);
		});
		
		StackPane layout=new StackPane();
		
		layout.getChildren().add(btnSave);

		Scene scene=new Scene(layout,300,300);
		
		window.setScene(scene);
		window.show();
	}

}
