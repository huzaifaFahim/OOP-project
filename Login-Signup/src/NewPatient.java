import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NewPatient extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	Stage stage;
	Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		stage.setTitle("Add New Patient");

		Label lbl_patient = new Label("Patient ID");
		TextField txt_patient = new TextField();

		Label lbl_name = new Label("Name");
		TextField txt_name = new TextField();

		Label lbl_father = new Label("Father Name");
		TextField txt_father = new TextField();

		Label lbl_gender = new Label("Gender");
		ToggleGroup rb_gp = new ToggleGroup();
		RadioButton rb_male = new RadioButton("Male");
		RadioButton rb_female = new RadioButton("Female");
		rb_male.setToggleGroup(rb_gp);
		rb_female.setToggleGroup(rb_gp);

		Label lbl_date = new Label("Date of Birth");
		DatePicker dob = new DatePicker();

		Label lbl_doctor = new Label("Doctor Name");
		ComboBox<String> dr_names = new ComboBox<>();
		dr_names.setPromptText("Select");
		dr_names.getItems().add("Dr. Muhammad Ajmal");
		dr_names.getItems().add("Dr. Riaz Naviwala");
		dr_names.getItems().add("Dr. Muhammad Farooq");
		dr_names.getItems().add("Dr. Fahim");
		dr_names.getSelectionModel().getSelectedItem();
		

		Button btn_save = new Button("Save");
		Button btn_cancel = new Button("Cancel");
		
		Label lbl_disease = new Label("Disease History");
		TextArea txt_disease = new TextArea();
//		Label lbl_description = new Label("Description");
//		TextArea txt_description = new TextArea();
		
		GridPane gp = new GridPane();
		gp.setHgap(20);
		gp.setVgap(20);

		gp.add(lbl_patient, 1, 1);
		gp.add(lbl_name, 1, 2);
		gp.add(lbl_father, 1, 3);
		gp.add(lbl_gender, 1, 4);
		gp.add(lbl_date, 1, 5);
		gp.add(lbl_doctor, 1, 6);
		
		gp.add(txt_patient, 2, 1);
		gp.add(txt_name, 2, 2);
		gp.add(txt_father, 2, 3);
		gp.add(rb_male, 2, 4);
		gp.add(rb_female, 2, 4);
		gp.setMargin(rb_female, new Insets(0, 0, 0, 70));
		gp.add(dob, 2, 5);
		gp.add(dr_names, 2, 6);
		gp.add(btn_save, 2, 9);
		gp.add(btn_cancel, 2, 9);
		gp.setMargin(btn_cancel, new Insets(0, 0, 0, 70));
		gp.add(lbl_disease, 1, 7);
		gp.add(txt_disease, 2, 7);
//		gp.add(lbl_description, 5, 3);
//		gp.add(txt_description, 5, 4);
		
		scene = new Scene(gp, 1000, 600);
		stage.setScene(scene);
		stage.show();

	}

}
