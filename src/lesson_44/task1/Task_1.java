package lesson_44.task1;

import java.io.*;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        File path = new File("src/lesson_44/task1");
        for (int i = 1; i <= 10; i++) {
            // Укажите имя файла и путь (если нужно)
            String fileName = "test"+i+".txt";
            // Создание объекта File
            File file = new File(path, fileName);

            try(FileWriter writer = new FileWriter(file)) {
                // Создание нового файла
                file.createNewFile();
                writer.write("Java" + i);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        File[] files = path.listFiles();

        for (File file : files){
            if(file.isFile()){
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line;
                    line = bufferedReader.readLine();
                    if(line.equals("Java7")){
                        System.out.println(file.getName());
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while reading the file.");
                    e.printStackTrace();
                }
            }
        }


    }
}

