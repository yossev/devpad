package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private Stage primaryStage;
    @FXML 
    private Button modeButton;
    @FXML
    private ToggleButton ThemeChanger;
    @FXML
    private Pane containerPane;
    @FXML
    private Button newNoteButton;
    @FXML
    private TextArea newTextArea;
    @FXML
    private Label pressThePlus;
    @FXML
    private TextField TitleTextField;
    @FXML
    private Button DeleteButton;
    @FXML
    private Button saveButton;
    private boolean isSaving = false;
    @FXML
    private VBox noteContainer;
    private int noteCounter = 1; // Number of notes
    public MainController() {
        // Constructor logic, if needed
    }

    public MainController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    private String noteTitle = "NewNote";
    @FXML
    public void newNoteHandler(ActionEvent event) {
    	saveButton.setVisible(true);
        // Remove the "Press the plus" label
        pressThePlus.setVisible(false);
        TitleTextField.setVisible(true);
        newTextArea.setVisible(true);
        
        // Create a new note entry and add it to the note container
        noteCounter++;
        
        // Create a new button for the note
        Button noteButton = new Button(noteTitle);
        noteButton.setPrefHeight(35);
        noteButton.setPrefWidth(97);
        
        // Define the action to take when the note button is clicked
        noteButton.setOnAction(e -> {
            openNoteContent(noteTitle);
        });
        
        // Add the note button to the note container
        noteContainer.getChildren().add(noteButton);
    }

	private void openNoteContent(String noteTitle) {
		 
		
	}
	
	@FXML
	private void saveButtonHandler(ActionEvent event){
			saveButton.setVisible(false);
			Path path = Paths.get("D:\\");
    		String fileName = noteTitle + ".txt";
    		Path filePath = path.resolve(fileName);
    		
    	try {
            // Now calling Files.writeString() method
            // with path , content & standard charsets
    		String str = TitleTextField.getText() +"\n-------\n"+  newTextArea.getText();
    		Files.writeString(filePath, str, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File Written");                  				
        }
 
        // Catch block to handle the exception
        catch (IOException ex) {

            System.out.print("Invalid Path");
            System.out.println("A7A");
        }
	} 
}
		

	

