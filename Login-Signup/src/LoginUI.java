import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	Scene scene;
	Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;

		Text txt_heading = new Text("Login");
		txt_heading.setStyle("-fx-font-size: 18px");

		Label lbl_email = new Label("Email");
		TextField txt_email = new TextField();

		Label lbl_password = new Label("Password");
		PasswordField pass = new PasswordField();

		Button login = new Button();
		login.setText("Login");

		Button signup = new Button();
		signup.setText("Signup");
		signup.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				SignUpUI signup = new SignUpUI();
				try {
					signup.start(new Stage());
//					Scene scene1 = new Scene(signup, 600, 600);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		GridPane gp = new GridPane();
		gp.setVgap(20);
		gp.setHgap(20);

		gp.add(txt_heading, 0, 0);
		gp.add(lbl_email, 3, 4);
		gp.add(lbl_password, 3, 5);

		gp.add(txt_email, 4, 4);
		gp.add(pass, 4, 5);
		gp.add(login, 4, 6);
		gp.add(signup, 4, 6);
		gp.setMargin(signup, new Insets(0, 0, 0, 60));
//		HBox hBox = new HBox(10);
//		hBox.setPadding(new Insets(10));
//		hBox.getChildren().addAll(login, signup);
//		gp.add(hBox, 4, 6);

		scene = new Scene(gp, 600, 600);
		stage.setScene(scene);
		stage.show();
	}

}
