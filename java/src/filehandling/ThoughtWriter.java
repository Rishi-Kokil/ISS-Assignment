package filehandling;

import java.io.*;
import java.util.Scanner;

public class ThoughtWriter {
    private static final String FILE_NAME = "thoughts.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Thought Writer ===");
            System.out.println("1. Write (Overwrite)");
            System.out.println("2. Append");
            System.out.println("3. Read File");
            System.out.println("4. Clear File");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter your thoughts to overwrite the file:");
                    String overwriteData = sc.nextLine();
                    writeToFile(overwriteData, false);
                    break;
                case 2:
                    System.out.println("Enter your thoughts to append to the file:");
                    String appendData = sc.nextLine();
                    writeToFile(appendData, true);
                    break;
                case 3:
                    System.out.println("\n--- Reading File ---");
                    readFile();
                    break;
                case 4:
                    clearFile();
                    System.out.println("File cleared successfully.");
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    public static void writeToFile(String text, boolean append) {
        try (FileWriter writer = new FileWriter(FILE_NAME, append)) {
            writer.write(text + System.lineSeparator());
            System.out.println("Thoughts saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean isEmpty = true;
            while ((line = reader.readLine()) != null) {
                isEmpty = false;
                System.out.println(line);
            }
            if (isEmpty) {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
