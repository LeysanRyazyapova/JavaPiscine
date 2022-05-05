package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Main extends Application {

    private  final Image IMAGE = new Image(getClass().getResourceAsStream("../resources/player.png"));
    private Integer offsetX = 250;
    private Integer offsetY = 450;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        final ImageView imageView = new ImageView(IMAGE);
        primaryStage.setWidth(IMAGE.getWidth());
        primaryStage.setHeight(IMAGE.getHeight());
        imageView.setViewport(new Rectangle2D(offsetX, offsetY, IMAGE.getWidth(), IMAGE.getHeight()));
        imageView.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.LEFT) {
                imageView.setLayoutX(offsetX += 5);
            }
        });
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
