package home_work_7;

import org.junit.jupiter.api.Test;

public class RunnerTest {

    @Test
    public void getWordsTest1() {
        String line = "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама вчера мама";
        Runner.getWords(line).forEach(System.out::println);
    }
}
