package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class RunnerTest {

    @Test
    public void getWordsTest1() {
        String line = "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама вчера мама";
        int actualCount = 12;
        Assertions.assertEquals(Runner.getWords(line).size(), actualCount);
    }

    @Test
    public void getWordsTest2() {
        String line = "привет, как дела! привет,какдела! привет;какдела! как дела!.Что делаешь? Привет-привет Привет -привет  4-х один и 1 бабушка бабушке бабушку";
        int actualCount = 21;
        Assertions.assertEquals(Runner.getWords(line).size(), actualCount);
    }

    @Test
    public void getMapWithCountTest1() {
        String line = "привет, как дела! привет,какдела! привет;какдела! как дела!.Что делаешь? Привет-привет Привет -привет  4-х один и 1 бабушка бабушке бабушку";

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Привет-привет", 1);
        stringIntegerMap.put("один", 1);
        stringIntegerMap.put("бабушке", 1);
        stringIntegerMap.put("привет", 4);
        stringIntegerMap.put("4-х", 1);
        stringIntegerMap.put("дела", 2);
        stringIntegerMap.put("Привет", 1);
        stringIntegerMap.put("какдела", 2);
        stringIntegerMap.put("1", 1);
        stringIntegerMap.put("Что", 1);
        stringIntegerMap.put("как", 2);
        stringIntegerMap.put("бабушка", 1);
        stringIntegerMap.put("и", 1);
        stringIntegerMap.put("делаешь", 1);
        stringIntegerMap.put("бабушку", 1);

        Assertions.assertEquals(Runner.getMapWithCount(line), stringIntegerMap);

    }
}
