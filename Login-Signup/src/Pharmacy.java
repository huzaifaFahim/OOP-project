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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pharmacy extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	Stage stage;
	Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		stage.setTitle("DRUG STORE");
		
		Text txt_heading = new Text();
		txt_heading.setText("PHARMACY\n");
		txt_heading.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
		txt_heading.setFill(Color.BLACK);

		Label lbl_medicineSN = new Label("Medicine Serial No");
		TextField txt_medicineSN = new TextField();
		
		Label lbl_medicine = new Label("Medicine Name");
		TextField txt_medicine = new TextField();

		Label lbl_company = new Label("Company Name");
		ComboBox<String> company_names = new ComboBox<>();
		company_names.setPromptText("Select");
		company_names.getItems().add("Getz Pharma");
		company_names.getItems().add("Abbott");
		company_names.getItems().add("Sanofi");
		company_names.getItems().add("GSK");
		company_names.getItems().add("Sami Pharma");
		company_names.getSelectionModel().getSelectedItem();
		
		Label lbl_manufacture = new Label("Date of Manufacture");
		DatePicker manufacture_date = new DatePicker();
		
		Label lbl_expiry = new Label("Date of Expiry");
		DatePicker expiry_date = new DatePicker();
		
		Label lbl_quantity= new Label("Quantity");
		ComboBox<Integer> quantityNo = new ComboBox<>();
		quantityNo.setPromptText("Add");
		quantityNo.getItems().add(1);
		quantityNo.getItems().add(2);
		quantityNo.getItems().add(3);
		quantityNo.getItems().add(4);
		quantityNo.getItems().add(5);
		quantityNo.getValue();
		
		Button b1 = new Button();
		b1.setText("Purchase");

		HBox h1 = new HBox(20, lbl_medicineSN);
		HBox h2 = new HBox(20, lbl_medicine);
		HBox h3 = new HBox(20, lbl_company);
		HBox h4 = new HBox(20, lbl_manufacture);
		HBox h5 = new HBox(20, lbl_expiry);
		HBox h6 = new HBox(20, lbl_quantity);
		
		VBox v1 = new VBox(30,h1,h2,h3,h4,h5,h6);
		
		HBox h7 = new HBox(20, txt_medicineSN);
		HBox h8 = new HBox(20, txt_medicine);
		HBox h9 = new HBox(20, company_names);
		HBox h10 = new HBox(20,manufacture_date);
		HBox h11 = new HBox(20, expiry_date);
		HBox h12 = new HBox(20, quantityNo);
		HBox h13 = new HBox(20,b1);
		h13.setMargin(b1, new Insets(0, 0, 0, 100));
		
		VBox v2 = new VBox(20,h7,h8,h9,h10,h11,h12,h13);
		
		HBox h14 = new HBox(20, v1, v2);
		h14.setAlignment(Pos.CENTER);

		HBox h15 = new HBox(txt_heading);
		VBox v3 = new VBox(h15,h14);
		h15.setAlignment(Pos.CENTER);
	
		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {

				String data = "";

				data += "\nMedicine Serial No: " + txt_medicineSN.getText() + "\n";
				data += "Medicine Name: " + txt_medicine.getText() + "\n";
				data += "Company Name: " + company_names.getSelectionModel().getSelectedItem() + "\n";

				data += "Date Of Manufacture: " + manufacture_date.getValue() + "\n";
				data += "Date Of Expiry: " + expiry_date.getValue() + "\n";
				
				data += "Quantity: " + quantityNo.getSelectionModel().getSelectedItem() + "\n";

				Alert a = new Alert(AlertType.INFORMATION);
				a.setContentText("\t\t\t\tMedicines Purchased\n" + data);
				a.show();
				
			}
		});
		
		v3.setStyle("-fx-background-color: lightblue");
		
		scene = new Scene(v3, 400, 400);
		stage.setScene(scene);
		stage.show();
		
	}

}
