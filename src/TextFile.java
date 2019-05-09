import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

public class TextFile {

	public static void readFromFile() {
		String file = "countries.txt";
		Path filePath = Paths.get(file);

		File f = filePath.toFile();
		BufferedReader br = null;
		try {
			// FileReader fr = new FileReader(f);
			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				// this is grabbing the next line of data
				line = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found...");

		} catch (IOException e) {
			System.out.println("Something crazy happened -- call someone who can help!");

		}
	}

	public static void writeToFile(LinkedList<Country> country) {
		String fileName = "countries.txt";
		Path path = Paths.get(fileName);

		File file = path.toFile();
		PrintWriter output = null;

		try {
			// the FileOutputStream takes 2 params in the constructor
			// the second param is optional and if not included assumed false -- so it will
			// overwrite the file
			// if true is used, it will add additional data to the end of the file (append)
			output = new PrintWriter(new FileOutputStream(file, false));
			
			
			for (Country s : country) {
				output.println(s);
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("Yoooo, I don't know what's going on -- contact someone!");
		} finally {

			output.close();
		}
	}

	public static void writeToFile() {
		ArrayList<Country> peeps = new ArrayList<>();
		// peeps.add(new Country("Flora", 21));
		peeps.add(new Country("Nick", 25));
		peeps.add(new Country("Adam", 23));
		peeps.add(new Country("Finny", 22));

		String fileName = "countries.txt";
		Path path = Paths.get(fileName);

		File file = path.toFile();
		PrintWriter output = null;

		try {
			// the FileOutputStream takes 2 params in the constructor
			// the second param is optional and if not included assumed false -- so it will
			// overwrite the file
			// if true is used, it will add additional data to the end of the file (append)
			output = new PrintWriter(new FileOutputStream(file, true));

			for (Country s : peeps) {
				output.println(s);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Yoooo, I don't know what's going on -- contact someone!");
		} finally {

			output.close();
		}
	}

	//
	//
	// Makes a file with a specified name
	public static void createOurFile(String fileName) {
		// String fileName = "test.txt";

		// Path path = Paths.get("resources", fileName);
		Path path = Paths.get(fileName);

		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("Welcome to,");
			} catch (IOException e) {

				System.out.println("OOPS! Something went terribly wrong!");
			}
		} else {
			System.out.println("Welcome to,");
		}

	}
	//
	//
	// Makes a folder in project
	public static void createDir(String path) {
		String dirPath = path;

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {
			try {
				Files.createDirectories(folder);
				System.out.println("The folder was created successfully!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Something went wrong with the folder creation");
			}

		} else {
			System.out.println("The folder already exists!");
		}
	}
}
