import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFxApp extends Application {

            @Override
            public void start(Stage primaryStage) throws Exception {
                // controls
                Text text = new Text("This is  JavaFX text.");
               Text text1 = new Text("What should I do with the window?");
                Button button = new Button("My Button");

                TextField tx = new TextField();
                Label label = new Label("My First Label");
                ProgressBar progressBar = new ProgressBar(1);
                progressBar.setProgress(1);
                ColorPicker colorPicker = new ColorPicker();
                Color value = colorPicker.getValue();
                PasswordField psf = new PasswordField();
                DatePicker datePicker = new DatePicker();
                CheckBox chxbx = new CheckBox();
                Region region = new Region();

                // Layouts
                VBox vbox = new VBox(button, tx, progressBar,colorPicker,psf,datePicker,chxbx,region);
                HBox hbox = new HBox(text1,text, vbox);

                // Put 1 layout into your Scene
                Scene scene = new Scene(hbox, 1080, 720);





                // Setup scene into stage
                primaryStage.setTitle("My First JavaFX App");
                primaryStage.setScene(scene);
                primaryStage.show();
            }

        }


