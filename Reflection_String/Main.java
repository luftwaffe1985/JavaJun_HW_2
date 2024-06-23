package Reflection_String;

public class Main {
    /**
     * Класс ObjectCreator добавляет поддержку аннотации RandomDate (по аналогии с
     * Random):
     * 1. Аннотация обрабатывается только над полями типа java.util.Date
     * 2. Проверка, что min < max
     * 3. В поле, помеченном аннотацией, вставляется рандомная дата,
     * UNIX-время которой находится в диапазоне [min, max)
     *
     * 4. *** Добавить поддержку для типов Instant, ...
     * 5. *** Добавить атрибут Zone и поддержку для типов LocalDate, LocalDateTime
     */
    /**
     * Примечание:
     * Unix-время - количество милисекунд, прошедших с 1 января 1970 года по UTC-0.
     */
    // ПРИМЕЧАНИЕ: Заставить аннотацию ставиться только над полями

    public static void main(String[] args) throws Exception {

        Class<MyDate> myDateClass = MyDate.class;
        System.out.println("\n" + "Get a random date: ");
        System.out.println(ObjectCreator.createObj(myDateClass).getMyDate());
    }
}