package home_work_6.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Alias {
    public static String getRandomAlias() {
        List<String> alias = new ArrayList<>(100);
        alias.add("Макс");
        alias.add("Бейли");
        alias.add("Чарли");
        alias.add("Бадди");
        alias.add("Рокки");
        alias.add("Джейк");
        alias.add("Джек");
        alias.add("Тоби");
        alias.add("Коди");
        alias.add("Бустер");
        alias.add("Герцог");
        alias.add("Купер");
        alias.add("Райли");
        alias.add("Харлей");
        alias.add("Биар");
        alias.add("Такер");
        alias.add("Мерфи");
        alias.add("Лаки");
        alias.add("Оливер");
        alias.add("Сэм");
        alias.add("Оскар");
        alias.add("Тедди");
        alias.add("Уинстон");
        alias.add("Сэмми");
        alias.add("Расти");
        alias.add("Шэдоу");
        alias.add("Гизмо");
        alias.add("Бэнтли");
        alias.add("Зевс");
        alias.add("Джексон");
        alias.add("Бакстер");
        alias.add("Бандит");
        alias.add("Гас");
        alias.add("Самсон");
        alias.add("Мило");
        alias.add("Руди");
        alias.add("Луи");
        alias.add("Хантер");
        alias.add("Кейси");
        alias.add("Рокко");
        alias.add("Спаркли");
        alias.add("Джоуи");
        alias.add("Бруно");
        alias.add("Бо");
        alias.add("Дакота");
        alias.add("Максимус");
        alias.add("Ромео");
        alias.add("Бумер");
        alias.add("Люк");
        alias.add("Генри");
        alias.add("Белла");
        alias.add("Люси");
        alias.add("Молли");
        alias.add("Дэйзи");
        alias.add("Мэгги");
        alias.add("Софи");
        alias.add("Сэди");
        alias.add("Хлоя");
        alias.add("Бейли");
        alias.add("Лола");
        alias.add("Зое");
        alias.add("Эбби");
        alias.add("Джинджер");
        alias.add("Рокси");
        alias.add("Грейси");
        alias.add("Коко");
        alias.add("Саша");
        alias.add("Лили");
        alias.add("Анджел");
        alias.add("Принцесс");
        alias.add("Эмма");
        alias.add("Энни");
        alias.add("Рози");
        alias.add("Рубин");
        alias.add("Лейди");
        alias.add("Мисси");
        alias.add("Лилли");
        alias.add("Мия");
        alias.add("Кэти");
        alias.add("Зои");
        alias.add("Мэдисон");
        alias.add("Стелла");
        alias.add("Пенни");
        alias.add("Бель");
        alias.add("Кейси");
        alias.add("Саманта");
        alias.add("Холли");
        alias.add("Лекси");
        alias.add("Лулу");
        alias.add("Бренди");
        alias.add("Жасмин");
        alias.add("Шелби");
        alias.add("Сэнди");
        alias.add("Рокси");
        alias.add("Пеппер");
        alias.add("Хайди");
        alias.add("Луна");
        alias.add("Дикси");
        alias.add("Ханни");
        alias.add("Дакота");
        Random random = new Random();
        return alias.get(random.nextInt(100));
    }
}
