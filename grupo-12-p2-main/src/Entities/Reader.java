package Entities;

import Entities.HashTag;
import Entities.Tweet;
import Entities.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public void readCSV(String file_path) {
        try (BufferedReader br = new BufferedReader(new FileReader(file_path))) {
            String line;

            // Read the header
            String header = br.readLine();
            String[] headerColumns = header.split(",");

            // Process each line of the CSV file
            while ((line = br.readLine()) != null) {
                String[] data = splitCSVLine(line);

                // Process the data for each row
                for (int i = 0; i < data.length; i++) {
                    System.out.println(headerColumns[i] + ": " + data[i]);
                }

                System.out.println(); // Print an empty line to separate rows
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] splitCSVLine(String line) {
        List<String> fields = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean withinQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '\"') {
                withinQuotes = !withinQuotes;
            } else if (c == ',' && !withinQuotes) {
                fields.add(field.toString().trim()); // Trim the value before adding it
                field.setLength(0); // Reset the StringBuilder
            } else {
                field.append(c);
            }
        }

        fields.add(field.toString().trim()); // Trim the last value

        return fields.toArray(new String[0]);
    }
}





