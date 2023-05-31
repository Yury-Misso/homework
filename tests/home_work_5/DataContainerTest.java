package home_work_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainerTest {

    private static DataContainer<Integer> dataContainerTtst1 = new DataContainer<>(new Integer[0]);

    @Test
    public void addMethodTest1() {
        Assertions.assertEquals(dataContainerTtst1.add(1), 0);
        Assertions.assertEquals(dataContainerTtst1.add(2), 1);
        Assertions.assertEquals(dataContainerTtst1.add(3), 2);
        Assertions.assertEquals(dataContainerTtst1.add(4), 3);
        Assertions.assertEquals(dataContainerTtst1.add(5), 4);
        System.out.println(dataContainerTtst1);
    }




}
