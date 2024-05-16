/*1. Create and Write to a File: Write a Java program that prompts the user for a diary
entry, then creates a file named "diary.txt" and writes the current date followed by the
user's entry into this file. Ensure the program checks if the file already exists and
informs the user, to avoid overwriting any previous content*/
package fileManagement;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.Date;

public class Q01_DiaryEntry {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DIARY_FILE = "diary.txt";

    public static void main(String[] args) {
        createAndWriteToDiary();
    }

    // Method to create a new file and write to it
    private static void createAndWriteToDiary() {
        try {
            Path path = Paths.get(DIARY_FILE);
            // Check if file already exists
            if (Files.exists(path)) {
                System.out.println("The diary already exists. New entry will be added.");
            } else {
                System.out.println("Creating a new diary.");
            }
            // Prompt for diary entry
            System.out.print("Enter your diary entry: ");
            String entry = scanner.nextLine();
            // Create content with current date
            String content = new Date() + "\n" + entry + "\n";
            // Write the content to the file, append if file already exists
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Entry added to the diary successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to diary: " + e.getMessage());
        }
    }
}
