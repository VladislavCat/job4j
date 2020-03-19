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
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

        /**
         * Удаление заявки
         */
    public boolean delete(String id) {
            int index = this.indexOf(id);
            if (index == -1) {
                return false;
            }
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            return true;
        }
    public boolean replace(String id, Item item){
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        item.setId(id);
        items[index] = item;
        return true;
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
        for(int i=0; i< position; i++){
             if(key.equals(items[i].getName())){
                 resultName[size]=items[i];
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
        Item rsl = null;
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                rsl = items[i];
                break;
            }
        } return rsl;
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