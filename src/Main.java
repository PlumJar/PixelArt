import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	Pixelator pxlor = new Pixelator();

	public static void main(String[] args) {
<<<<<<< HEAD
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images(*.jpg, *.png, *.tiff, *.bmp)", "jpg",
				"png", "bmp", "tiff");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
		}
=======
		//		try {
		//			Runtime.getRuntime().exec("explorer.exe /select," + "C:/");
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images(*.jpg, *.png, *.tiff, *.bmp)", "jpg", "png", "bmp", "tiff");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);

		if(returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file: " +
					chooser.getSelectedFile().getName());
		}

		//		String fileName = "file.txt";
		//		File inputFile = null;
		//		Scanner sc = null;
		//
		//		try {
		//			inputFile = new File(fileName);
		//			sc = new Scanner(inputFile);
		//			sc.close();
		//		} catch (Exception ex) {
		//			ex.printStackTrace();
		//			System.exit(-1);
		//		}
>>>>>>> 06aa8fa51a6ba4ec42131f983713bd4253fc620e

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Form");
		GridPane gPane = new GridPane();
		Scene scene = new Scene(gPane, 600, 600, Color.DARKGRAY);
		new Canvas(primaryStage, gPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
