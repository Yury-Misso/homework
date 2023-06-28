package home_work_7;

import home_work_7.api.ISearchEngine;

import java.util.Arrays;
import java.util.List;

public class EasySearch implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        List<Character> characterList = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё',
                'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б',
                'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
                'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь',
                'Э', 'Ю', 'Я', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

        int posision = 0;
        int nextIndex = 0;
        int wordLength = word.length();
        int textLength = text.length();
        long counter = 0;
        //TODO дописать код исключения "мама-мама"
        while (posision != -1) {
            posision = text.indexOf(word, nextIndex);
            nextIndex = posision + wordLength;

            if ((posision == 0)
                    && !characterList.contains(text.charAt(posision + wordLength))) {
                counter++;
            }
            if (posision > 0 && nextIndex <= textLength) {
                if (nextIndex != textLength
                        && !characterList.contains(text.charAt(posision - 1))
                        && !characterList.contains(text.charAt(nextIndex))) {
                    counter++;
                }
                if (!characterList.contains(text.charAt(posision - 1))
                        && (nextIndex == textLength)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
