package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
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
    private VBox noteContainer;
    private int noteCounter = 1; // Number of notes

    public MainController() {
        // Constructor logic, if needed
    }

    public MainController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void newNoteHandler(ActionEvent event) {
        // Remove the "Press the plus" label
        pressThePlus.setVisible(false);
        TitleTextField.setVisible(true);
        newTextArea.setVisible(true);
        
        // Create a new note entry and add it to the note container
        String noteTitle = "Note " + noteCounter;
        noteCounter++;
        
        // Create a new button for the note
        Button noteButton = new Button(noteTitle);
        
        // Define the action to take when the note button is clicked
        noteButton.setOnAction(e -> {
            
        });
        
        // Add the note button to the note container
        noteContainer.getChildren().add(noteButton);
    }
}
