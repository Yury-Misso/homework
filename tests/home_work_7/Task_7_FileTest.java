package home_work_7;

import home_work_7.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class Task_7_FileTest {
    @Test
    public void mainTest1() {
        ISearchEngine engine = new SearchEngineCASE_INSENSITIVE(new RegExSearch());
        StringBuilder stringBuilder = new StringBuilder();
        int count1 = 0;
        int count2 = 0;

        // Либерал.txt : либерал : 21
        // Либерал.txt : под : 3

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/home_work_7/source/Либерал.txt"), "IBM866"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count1 += engine.search(line, "либерал");
                count2 += engine.search(line, "под");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Assertions.assertTrue(count1 == 21 && count2 == 3);
    }
}
