package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
    	
        try {
        	Image icon = new Image(getClass().getResourceAsStream("/Assets/icon.png")); // favicon icon image
        	
        	
            FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = loader.load();

            // Create the controller and pass the primary stage
            MainController controller = new MainController(primaryStage); // Referenced the PrimaryStage to the controller
            loader.setController(controller);

            Scene scene = new Scene(root, 1162, 889);
            
            primaryStage.getIcons().add(icon);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Devpad");
            primaryStage.setResizable(false); // unresizable for now
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
