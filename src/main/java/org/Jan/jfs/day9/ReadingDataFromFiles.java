package org.Jan.jfs.day9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingDataFromFiles {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C://Users//HP//Java-Programs//Jan_2024//src//main//resources//Data.csv"));

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
