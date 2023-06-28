package home_work_6.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGenerator {
    protected final Random random = new Random();
    private final StringBuilder stringBuilder = new StringBuilder();

    protected String generateRandomStringEng(int targetStringLength) {
        int leftLimit = 65;
        int rightLimit = 122;
        String regex = "[a-zA-Z]+";
        this.stringBuilder.setLength(0);
        int randomLimitedInt = 0;
        targetStringLength = 3 + (int) (this.random.nextFloat() * (targetStringLength - 3));
        for (int i = 0; i < targetStringLength; ) {
            randomLimitedInt = leftLimit + (int) (this.random.nextFloat() * (rightLimit - leftLimit + 1));
            if (String.valueOf(randomLimitedInt).matches(regex)) {
                stringBuilder.append((char) randomLimitedInt);
                i++;
            }
        }
        return stringBuilder.toString();
    }

    protected String generatePassword() {
        int length = 5 + (int) (this.random.nextFloat() * 10);
        return generateRandomString(48, 90, length);
    }

    protected String generateRandomString(int leftLimit, int rightLimit, int targetStringLength) {
        this.stringBuilder.setLength(0);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (this.random.nextFloat() * (rightLimit - leftLimit + 1));
            stringBuilder.append((char) randomLimitedInt);
        }
        return stringBuilder.toString();
    }

    protected String generateFromFile(String pathFile) {
        List<String> listNames = getListFromFile(pathFile);
        return listNames.get(this.random.nextInt(100));
    }

    protected String generateNameByRusChar(int targetStringLength) {
        int length = 3 + (int) (this.random.nextFloat() * (targetStringLength - 3));
        return generateRandomString(1040, 1103, length);
    }

    protected String generateNameByRandomChar(int targetStringLength) {
        int length = 3 + (int) (new Random().nextFloat() * (targetStringLength - 3));
        return generateRandomString(33, 126, length);
    }

    protected List<String> getListFromFile(String pathFile) {
        List<String> listString = new ArrayList<>(100);
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(new File("").getAbsolutePath() + pathFile);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while (true) {
            try {
                if (((line = bufferedReader.readLine()) == null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            listString.add(line);
        }
        return listString;
    }
}
