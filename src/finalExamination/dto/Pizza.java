package finalExamination.dto;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Pizza {
    private final String TITLE;
    private final String DESCRIPTION;
    private final String[] INGREDIENTS;

    public Pizza(String TITLE, String description, String[] INGREDIENTS) {
        this.TITLE = TITLE;
        DESCRIPTION = description;
        this.INGREDIENTS = INGREDIENTS;
    }

    public String cookPizza() {
        StringBuilder stringBuilder = new StringBuilder();
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("HH:mm:ss");
        stringBuilder.append(this.TITLE).append("\n")
                .append("1: ").append("Приступили к приготовлению в ")
                .append(simpleDateFormat.format(new Date())).append("\n");
        sleep(3000);
        stringBuilder.append("2: ").append("Пицца в печи ")
                .append(simpleDateFormat.format(new Date())).append("\n");
        sleep(3000);
        stringBuilder.append("3: ").append("Пицца упаковывается ")
                .append(simpleDateFormat.format(new Date())).append("\n");
        sleep(1000);
        stringBuilder.append("4: ").append("Пицца готова ")
                .append(simpleDateFormat.format(new Date()));
        return stringBuilder.toString();
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int titleSize = this.TITLE.length();
        int descriptionSize = this.DESCRIPTION.length();
        int ingredientsSize = 0;

        for (String ingredient : this.INGREDIENTS) {
            ingredientsSize += ingredient.length();
        }

        int[] sizes = {titleSize, descriptionSize, ingredientsSize};
        Arrays.sort(sizes);
        int maxLength = sizes[2];

        int startTitle = (maxLength - titleSize) / 2;
        int startDescription = (maxLength - descriptionSize) / 2;
        int startIngredients = (maxLength - ingredientsSize) / 2;

        for (int i = 0; i < startTitle; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(this.TITLE).append("\n");

        for (int i = 0; i < startDescription; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(this.DESCRIPTION).append("\n");

        for (int i = 0; i < startIngredients; i++) {
            stringBuilder.append(" ");
        }
        for (int i = 0; i < this.INGREDIENTS.length; i++) {
            stringBuilder.append(this.INGREDIENTS[i]);
            if (i != (this.INGREDIENTS.length - 1)) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }
}
