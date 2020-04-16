package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.event.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class mainController {

	@FXML
    private AnchorPane mainPane;

    @FXML
    private ImageView googleLogo;

    @FXML
    private TextField query;

    @FXML
    private Button search;
    
    
    public void initialize() {
    
    }
    
    @FXML
    protected void searchWithEnter(KeyEvent event) {
    	if(!event.getCode().equals(KeyCode.ENTER)) return;
    	 query.getStyleClass().add("bad");
    	search();
    }
    
    @FXML
    protected void searchQuery(ActionEvent event) {
    	search();
    }
    
    protected void search() {
    	try {
 		   if(query.getText().length() == 0) return;
 		   
 		   String urlText = "https://www.google.com/search?q=";
 		   
 		   URI uri= new URI(urlText + query.getText());
 		   
 		   java.awt.Desktop.getDesktop().browse(uri);
 		 
 		  } catch (Exception e) {
 			  query.getStyleClass().add("bad");
 		  }
    }
    
}
