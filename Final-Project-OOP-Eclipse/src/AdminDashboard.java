import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class AdminDashboard extends Application{
	
//	public static void main(String[] args) {
//		launch(args);
//	}

	Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		Text mainHeading = new Text();
		mainHeading.setText("WELCOME TO HOSPITAL MANAGEMENT SYSTEM\n");
		mainHeading.setFont(Font.font("Helvetica", FontWeight.BOLD, 60));
		mainHeading.setFill(Color.WHITE);
		
		// Rectangle box 1
				addDoctor = new Rectangle();
				addDoctor.setWidth(250);
				addDoctor.setHeight(150);
				addDoctor.setFill(Color.web("#006A89"));
				addDoctor.setStrokeWidth(5);
				addDoctor.setStroke(Color.web("#73D2DD"));
				addDoctor.setArcHeight(20);
				addDoctor.setArcWidth(20);

				Button addDoctorBtn = new Button("");
				addDoctorBtn.setPadding(new Insets(130, 250, 0, 0));
				addDoctorBtn.setStyle("-fx-background-color: transparent;");
				addDoctorBtn.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
//						Doctor firstDoctor = new Doctor();
//						try {
//							firstDoctor.start(stage);
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				});
//				Image pharmacyPic = new Image("images/pharmacy2-01.png");
//				ImageView imagePic1 = new ImageView(pharmacyPic);
//				imagePic1.setFitHeight(50);
//				imagePic1.setFitWidth(60);
				// text box 1
				Text addDoctorText = new Text("ADD DOCTOR");
				StackPane box1 = new StackPane();
				VBox vertical1 = new VBox(10,  addDoctorText);
				vertical1.setAlignment(Pos.CENTER);
				box1.getChildren().addAll(addDoctor, vertical1, addDoctorBtn);
				addDoctorText.setFont(Font.font("Helvetica", FontWeight.MEDIUM, 20));
				addDoctorText.setTextAlignment(TextAlignment.JUSTIFY);
				addDoctorText.setFill(Color.WHITE);
				// Creating a Shadow
				DropShadow shadow1 = new DropShadow();
				shadow1.setOffsetX(5);
				shadow1.setOffsetY(5);
				shadow1.setColor(Color.rgb(20, 20, 20, 0.5));
				addDoctorText.setEffect(shadow1);
				addDoctorText.setEffect(shadow1);
				// Creating a DropShadow when cursor touch the box
				DropShadow shade1 = new DropShadow();
				box1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						box1.setEffect(shade1);
					}
				});
				box1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						box1.setEffect(null);
					}
				});
				// Create a hand cursor on object
				addDoctorBtn.setCursor(Cursor.HAND);
				
				HBox h1 = new HBox(10, box1);
				h1.setAlignment(Pos.CENTER);
			

				VBox layout = new VBox(10,mainHeading, h1);
				layout.setAlignment(Pos.CENTER);
				Scene scene = new Scene(layout, 1000, 1000);
				layout.setStyle("-fx-background-color:#5A8493");

				primaryStage.setTitle("DASHBOARD");
				primaryStage.setScene(scene);
				primaryStage.show();
		
	}

}
