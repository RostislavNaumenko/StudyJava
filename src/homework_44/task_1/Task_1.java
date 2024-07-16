package homework_44.task_1;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Task_1 {
    public static void main(String[] args) {
        File path = new File("src/homework_44/task_1");
        Optional<File> optionalFile = Arrays.stream(Objects.requireNonNull(path.listFiles()))
                .filter(file1 -> file1.getName().equals("text.txt"))
                .findFirst();


        if (optionalFile.isPresent()) {
            File file = optionalFile.get();
            File copy = new File(path, "copy.txt");
            copy.delete();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 FileWriter writer = new FileWriter(copy, true);) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    writer.write(line + "\n");
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
