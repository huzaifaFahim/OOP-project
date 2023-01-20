import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class SignUpUI extends Application {

	Scene scene;
	Stage stage;
	LoginUI login = new LoginUI();

	String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;

		Text txt_heading = new Text("Sign-Up");
		txt_heading.setStyle("-fx-font-size: 18px");

		Label lbl_firstName = new Label("First Name");
		TextField txt_fName = new TextField();

		Label lbl_lastName = new Label("Last Name");
		TextField txt_lName = new TextField();

		Label lbl_dob = new Label("Date Of Birth");
		ComboBox cmb_date = new ComboBox<>();
		cmb_date.setPromptText("Date");
		for (int i = 1; i <= 31; i++) {
			cmb_date.getItems().add(i);
		}

		ComboBox cmb_month = new ComboBox<>();
		cmb_month.setPromptText("Month");
		for (int i = 0; i < month.length; i++) {
			cmb_month.getItems().add(month[i]);
		}

		ComboBox cmb_year = new ComboBox<>();
		cmb_year.setPromptText("Year");
		for (int i = 1990; i <= 2023; i++) {
			cmb_year.getItems().add(i);
		}

		Label lbl_email = new Label("Email");
		TextField txt_email = new TextField();

		Label lbl_password = new Label("Password");
		PasswordField pass = new PasswordField();

		Label lbl_rePassword = new Label("Re-Enter Password");
		PasswordField rePass = new PasswordField();

		Button btn_signup = new Button();
		btn_signup.setText("SignUp");
		btn_signup.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

			}
		});

		Button btn_login = new Button();
		btn_login.setText("Login");
		btn_login.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				LoginUI login = new LoginUI();
				try {
					login.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		GridPane gp = new GridPane();
		gp.setVgap(20);
		gp.setHgap(20);

		gp.add(txt_heading, 0, 0);
		gp.add(lbl_firstName, 1, 1);
		gp.add(lbl_lastName, 1, 2);
		gp.add(lbl_dob, 1, 3);
		gp.add(lbl_email, 1, 4);
		gp.add(lbl_password, 1, 5);
		gp.add(lbl_rePassword, 1, 6);

		gp.add(txt_fName, 2, 1);
		gp.add(txt_lName, 2, 2);
		gp.add(cmb_date, 2, 3);
		gp.add(cmb_month, 2, 3);
		gp.add(cmb_year, 2, 3);
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(10));
		hBox.getChildren().addAll(cmb_date, cmb_month, cmb_year);
		gp.add(hBox, 2, 3);
		gp.add(txt_email, 2, 4);
		gp.add(pass, 2, 5);
		gp.add(rePass, 2, 6);
		gp.add(btn_signup, 2, 7);
		gp.add(btn_login, 2, 7);
		gp.setMargin(btn_signup, new Insets(0, 0, 0, 60));
//		HBox buttons = new HBox(10);
//		hBox.setPadding(new Insets(10));
//		hBox.getChildren().addAll(btn_login, btn_signup);
//		gp.add(buttons, 2, 7);

		scene = new Scene(gp, 600, 600);
		stage.setScene(scene);
		stage.show();
	}

}
