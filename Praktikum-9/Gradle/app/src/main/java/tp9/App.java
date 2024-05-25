package tp9;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
   @Override
   public void start(Stage stage) {
      stage.setTitle("Mirai");

      HomeScene initialScene = new HomeScene(stage);
      initialScene.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}