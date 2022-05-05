//package sample;
//
//import javafx.animation.Animation;
//import javafx.animation.Transition;
//import javafx.application.Application;
//import javafx.geometry.Rectangle2D;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.KeyCode;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//
//public class Tank{
//    private  final Image IMAGE = new Image(getClass().getResourceAsStream("player.png"));
//    private Integer offsetX = 250;
//    private Integer offsetY = 450;
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        final ImageView imageView = new ImageView(IMAGE);
//        imageView.setViewport(new Rectangle2D(offsetX, offsetY, IMAGE.getWidth(), IMAGE.getHeight()));
//        imageView.setOnKeyPressed(event -> {
//            if(event.getCode() == KeyCode.LEFT) {
//                imageView.setLayoutX(offsetX += 5);
//            }
//        });
////    }
//}
