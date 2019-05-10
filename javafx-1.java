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
	public void start(Stage window  /*1. Stage*/) throws Exception {
		
		window.setTitle("Form 1");
		//2. Create controls
		Button save=new Button("Save");
		
		//3. Create layout
		StackPane layout=new StackPane();
		//4. add controls to the layout
		layout.getChildren().add(save);
		//5. Create scene where all controls will appear
		//and add the layout to the scene
		Scene scene=new Scene(layout,300,300);
		
		//6. Set Scene and show the stage/window
		window.setScene(scene);
		window.show();
	}

}
