import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Physiotherapist extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	Stage stage;
	Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		stage.setTitle("Book An Appointment");

		Text mainHeading = new Text();
		mainHeading.setText("PHYSIOTHERAPIST\n");
		mainHeading.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
		mainHeading.setFill(Color.WHITE);

		Label lbl_patient = new Label("Patient ID");
		lbl_patient.setTextFill(Color.WHITE);
		lbl_patient.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		TextField txt_patient = new TextField();
		txt_patient.setPromptText("Enter Patient ID");

		Label lbl_name = new Label("Name");
		lbl_name.setTextFill(Color.WHITE);
		lbl_name.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		TextField txt_name = new TextField();
		txt_name.setPromptText("Enter Your Name");

		Label lbl_father = new Label("Father Name");
		lbl_father.setTextFill(Color.WHITE);
		lbl_father.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		TextField txt_father = new TextField();
		txt_father.setPromptText("Enter Father Name");

		Label lbl_gender = new Label("Gender");
		lbl_gender.setTextFill(Color.WHITE);
		lbl_gender.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		ToggleGroup rb_gp = new ToggleGroup();
		RadioButton rb_male = new RadioButton("Male");
		RadioButton rb_female = new RadioButton("Female");
		rb_male.setToggleGroup(rb_gp);
		rb_female.setToggleGroup(rb_gp);
		rb_male.setTextFill(Color.BLACK);
		rb_male.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		rb_female.setTextFill(Color.BLACK);
		rb_female.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));

		Label lbl_date = new Label("Date of Birth");
		lbl_date.setTextFill(Color.WHITE);
		lbl_date.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		DatePicker dob = new DatePicker();

		Label lbl_doctor = new Label("Doctor Name");
		lbl_doctor.setTextFill(Color.WHITE);
		lbl_doctor.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		ComboBox<String> dr_names = new ComboBox<>();
		dr_names.setPromptText("Select");
		dr_names.getItems().add("Dr. Sana Komal");
		dr_names.getItems().add("Dr. Mir Shakeel Ahmad");
		dr_names.getItems().add("Dr. Masroor Naqvi");
		dr_names.getItems().add("Dr. Muhammad Usman Khalid.");
		dr_names.getSelectionModel().getSelectedItem();

		Label lbl_disease = new Label("Disease History");
		lbl_disease.setTextFill(Color.WHITE);
		lbl_disease.setFont(Font.font("Helvetica", FontWeight.LIGHT, 20));
		TextArea txt_disease = new TextArea();
		txt_disease.setPromptText("Enter Your Disease");

		Button saveBtn = new Button();
		saveBtn.setText("Save");

		Button cancelBtn = new Button();
		cancelBtn.setText("Cancel");

		Button backBtn = new Button("Go Back");

		HBox h1 = new HBox(lbl_patient);
		HBox h2 = new HBox(lbl_name);
		HBox h3 = new HBox(lbl_father);
		HBox h4 = new HBox(lbl_gender);
		HBox h5 = new HBox(lbl_date);
		HBox h6 = new HBox(lbl_doctor);
		
		VBox labels = new VBox(35,h1,h2,h3,h4,h5,h6);

		HBox h7 = new HBox(txt_patient);
		h7.setMargin(txt_patient, new Insets(0, 0, 8, 0));
		HBox h8 = new HBox(txt_name);
		h8.setMargin(txt_name, new Insets(0, 0, 8, 0));
		HBox h9 = new HBox(txt_father);
		h9.setMargin(txt_father, new Insets(0, 0,8, 0));
		HBox h10 = new HBox(rb_male, rb_female);
		h10.setMargin(rb_male, new Insets(-3, 0, 5, 0));
		h10.setMargin(rb_female, new Insets(-3, 0, 5, 30));
		HBox h11 = new HBox(dob);
		h11.setMargin(dob, new Insets(-8, 0, 0, 0));
		HBox h12 = new HBox(dr_names);
		h12.setMargin(dr_names, new Insets(0, 0, 9, 0));
		
		VBox txtFields = new VBox(35,h7,h8,h9,h10,h11,h12);
		
		VBox disease = new VBox(30, lbl_disease, txt_disease);

		HBox h = new HBox(25, labels, txtFields, disease);
		h.setMargin(disease, new Insets(0, 0, 0, 150));
		
		h.setMargin(txtFields, new Insets(0, 0, 0, 50));
		
		h.setAlignment(Pos.CENTER);
		
		HBox buttons = new HBox(20, saveBtn, cancelBtn);
		buttons.setAlignment(Pos.CENTER);
		
		HBox back = new HBox(50, backBtn);
		HBox heading = new HBox(50, mainHeading);
		heading.setAlignment(Pos.CENTER);
		
		VBox mainVBox = new VBox(back, heading, h, buttons);

		saveBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {

				String info = "";
				String gender = "";

				info = "Patient ID: " + txt_patient.getText() + "\n";
				info += "Patient Name: " + txt_name.getText() + "\n";
				info += "Father Name: " + txt_father.getText() + "\n";

				if (rb_male.isSelected()) {
					gender = "Male";
				} else if (rb_female.isSelected()) {
					gender = "Female";
				} else {
					gender = "";
				}

				info += "Gender: " + gender + "\n";

				info += "Date Of Birth: " + dob.getValue() + "\n";

				info += "Doctor: " + dr_names.getSelectionModel().getSelectedItem() + "\n";

				info += "Disease History: " + txt_disease.getText();

				Alert a = new Alert(AlertType.INFORMATION);
				a.setContentText("Your appointment has been booked successfully!\n\n" + info);
				a.show();
			}
		});

		backBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

			}
		});

		mainVBox.setStyle("-fx-background-color: #90B1D8,#3E7786");

		scene = new Scene(mainVBox, 800, 800);
		stage.setScene(scene);
		stage.show();
	}
}





