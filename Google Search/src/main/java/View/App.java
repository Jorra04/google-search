package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

//merged




public class App extends Application{
	public static Stage primaryStage;
	public static Scene scene;


	public static void main(String[] args) {
		launch(args);
	}



	@Override
	public void start(Stage stage) throws Exception{
		primaryStage = stage;
		Parent root = FXMLLoader.load(getClass().getResource("/FXMLDocs/searchPage.fxml"));
		
		   
	    scene = new Scene(root, 1130, 800);
	    
		scene.getStylesheets().add(getClass().getResource("/stylesheets/page.css").toExternalForm());
		
	
	    primaryStage.setTitle("Google Search");
	    primaryStage.setScene(scene);
	    primaryStage.setResizable(true);
	    primaryStage.getIcons().add(0,new Image(getClass().getResourceAsStream("/images/googleIcon.png")));
	    primaryStage.show();
	}
	

}