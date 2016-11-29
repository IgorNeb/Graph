import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by ПартЮА on 29.11.2016.
 */
public class Main extends Application{

    public static void main (String[] arg){
        launch(arg);
    }


    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setMinHeight(450);
        primaryStage.setMinWidth(300);
        primaryStage.show();
    }
}
