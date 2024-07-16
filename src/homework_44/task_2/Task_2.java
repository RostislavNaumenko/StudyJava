package homework_44.task_2;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/*
* Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
* */

public class Task_2 {
    public static void main(String[] args) {
        File path = new File("src/homework_44/task_2");
        Optional<File> optionalFile = Arrays.stream(Objects.requireNonNull(path.listFiles()))
                .filter(file1 -> file1.getName().equals("text.txt"))
                .findFirst();


        if (optionalFile.isPresent()) {
            File file = optionalFile.get();
            File lessThen2000 = new File(path, "less.txt");
            File moreThen2000 = new File(path, "more.txt");
            lessThen2000.delete();
            moreThen2000.delete();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 FileWriter writerLess = new FileWriter(lessThen2000, true);
                 FileWriter writerMore = new FileWriter(moreThen2000, true)){

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                   int num = parserForNumbers(line);
                    if(num > 2000){
                        writerMore.write(line + "\n");
                    }else {
                        writerLess.write(line + "\n");
                    }

                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private static int parserForNumbers(String line) {
        String[] strings = line.split(":");
        return Integer.valueOf( strings[1]);
    }
}
