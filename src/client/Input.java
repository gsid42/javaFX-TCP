package client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

import java.awt.Desktop;



public class Input extends Application{
	private TextField ipAddress = new TextField();
	private TextField port = new TextField();
	private TextField fileName = new TextField();
	private Button upload = new Button("Upload");
	private Button send = new Button("Send");

	//gs
	private Desktop desktop = Desktop.getDesktop();
	final FileChooser fileChooser = new FileChooser();
	final DirectoryChooser dirChooser = new DirectoryChooser();
	final Button fileOpen = new Button("Select a file..");
	

	
 @Override
 public void start(final Stage stage){
	 //gs
	 fileOpen.setOnAction(
	            new EventHandler<ActionEvent>() {
	                @Override
	                public void handle(final ActionEvent e) {
	                    File file = fileChooser.showOpenDialog(stage);
	                    if (file != null) {
	                        System.out.println(file.getPath() );
	                        fileName.setText(file.getPath());
	                    }
	                }
	            });
	 
	 //create a pane
	 GridPane pane = new GridPane();
	
	 pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
	 pane.setHgap(5.5);
	 pane.setVgap(5.5);
	
	 //place nodes and define button action
	 
	 //gs
	 pane.add(fileName,0,0);
	 pane.add(fileOpen,1,0);
	 
	 pane.add(new Label("IP Address"), 0,1);
	 pane.add(ipAddress, 1, 1);
	 pane.add(new Label("Port"), 0, 2);
     pane.add(port, 1, 2);	
     pane.add(upload, 0, 3);
     pane.add(send, 1, 3);
     pane.setAlignment(Pos.CENTER);
     GridPane.setHalignment(upload,HPos.LEFT);
     GridPane.setHalignment(send, HPos.RIGHT);
     send.setOnAction(new SendHandler());
     upload.setOnAction(new UploadHandler());
     Scene scene = new Scene(pane,400,250);
     stage.setTitle("Front Page");
     stage.setScene(scene);
     stage.show();

     
 } 
       class SendHandler implements EventHandler<ActionEvent> {
    	   //after the button send is clicked

		@Override
		public void handle(ActionEvent event) {
			System.out.println("Send button clicked");
			String ip = ipAddress.getText();
			String pr = port.getText();
	
		}
		}
		class UploadHandler implements EventHandler<ActionEvent>{
		   // after the upload button is clicked
			
			@Override
			public void handle(ActionEvent e){
				System.out.println("Start to upload");
				
			
		
		}
			}
	

}



 		

	
	
	
     

     

