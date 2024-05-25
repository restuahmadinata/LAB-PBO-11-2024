package tp9;

import javafx.animation.TranslateTransition;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.awt.Desktop;
import java.net.URI;


public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void showWithTransition() {
        show();
        TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), stage.getScene().getRoot());
        slideIn.setFromX(800);
        slideIn.setToX(0);
        slideIn.play();
    }

    public void show() {
        VBox layout = new VBox(20);
        layout.setId("layout");
        
        Text title = new Text("APP JAVA SEDERHANA");
        title.setId("title");

        Text subtitle = new Text("ラジナータ & ミライに関する情報");
        subtitle.setId("subtitle");
        subtitle.setTextAlignment(TextAlignment.CENTER);

        Text line = new Text("_________________________________________________________");
        line.setId("line");

        Button btnToProfile = new Button("GO TO PROFILE");
        btnToProfile.setId("profileButton");

        Button susButton = new Button("TUTORIAL GANTENG!");
        susButton.setId("tombolAneh");
        susButton.setOnAction(v -> {
            try {
                Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ?si=WPMit5ZcFGH29ZfY"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnToProfile.setOnAction(v -> {
            ProfileScene profileScene = new ProfileScene(stage);
            profileScene.showWithTransition();
        });

        layout.getChildren().addAll(title, subtitle, line, btnToProfile, susButton);
        Scene scene = new Scene(layout, 1000, 500);
        Image icon = new Image("/images/icon.png");
        stage.getIcons().add(icon);
        scene.getStylesheets().add("/styles/home.css");
        stage.setScene(scene);
        stage.show();
    }
}
