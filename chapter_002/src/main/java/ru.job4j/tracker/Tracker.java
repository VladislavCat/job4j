package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Получение списка всех заявок
     * @return
     */
    public Item[] findAll() {
        Item[] arrayWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item name = items[index];
            if (name != null) {
                arrayWithoutNull[size] = name;
                size++;
            }
        }
        arrayWithoutNull = Arrays.copyOf(arrayWithoutNull, size);
        return arrayWithoutNull;
    }

    /**
     * Получение списка всех заявок отсортированного по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key){
        Item[] resultName=new Item[100];
        int size = 0;
        for(int i=0; i<position; i++){
             if(key.equals(resultName[i].getName())){
                 resultName[size]=resultName[i];
                 size++;
             }
         }
        resultName =  Arrays.copyOf(resultName, size);
        return resultName;
    }

    /**
     * Получение заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item[] resultId = new Item[100];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (id.equals(resultId[i].getId())) {
                resultId[size] = items[i];
            } else {
                resultId[size]=null;
            }
        } return resultId[size];
    }
        /**
         * Метод генерирует уникальный ключ для заявки.
         * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
         * @return Уникальный ключ.
         */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}