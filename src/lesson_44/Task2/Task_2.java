package lesson_44.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Cat", 8, true),
                new Cat("Ann", 3, false),
                new Cat("Smit", 7, true),
                new Cat("Bim", 2, true),
                new Cat("Simka", 5, false)
        ));

        File path = new File("src/lesson_44/Task2");
        path.mkdirs();
        File file = new File(path, "cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writeCatsToFIle(cats, file);

        List<Cat> newCats = readCatsFromFile(file);

        System.out.println(newCats);

    }

    private static List<Cat> readCatsFromFile(File file) {
        List<Cat> catList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                catList.add(parserCatsFromLine(line));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return catList;
    }

    private static Cat parserCatsFromLine(String line) {
        String[] strings = line.split("\\|");
        return new Cat(strings[0], Integer.valueOf(strings[1]), Boolean.valueOf(strings[2]));
    }

    private static void writeCatsToFIle(List<Cat> cats, File file) {
        if (file.exists()) file.delete();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Cat cat : cats) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                String toWrite = cat.getName() +
                        "|"+ cat.getAge() +
                        "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
