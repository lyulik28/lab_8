import jdk.nashorn.internal.ir.Symbol;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллкуция. Класс arrayList");
        System.out.println("1. Создание списочного массива объектов ссылочного типа String:");
        List<String> cats = new ArrayList<>(5);
        System.out.println("\t списочный массив cats создан");

        System.out.println("2. Добавление в списочный массив нескольких символьных строк:");
        cats.add("Барсик");
        cats.add("Мурка");
        cats.add("Плюшка");
        cats.add("Тучка");
        System.out.println("\t в списочный массив cats добавлено 4 объекта");

        System.out.println("3. Вывод на экран элементов списочного массива используя цикл for:");
        for(int index = 0; index < cats.size(); index++){
            System.out.println("\t имя кошки № "+(index + 1)+": "+cats.get(index));
        }

        System.out.println("4. Добавление в списочный массив cats на позицию по указанному индексу:");
        cats.add(3, "Вонючка");
        System.out.println("\t в списочный массив cats на позицию 4 добавлен объект Вонючка");

        System.out.println("5. Вывод на экран элементов списочного массива используя цикл for each:");
        for(String cat : cats){
            System.out.println("\t имя кошки "+cat);
        }

        System.out.println("6. Присваивание объекта элементу, который находится в списке на позиции по указанному индексу: ");
        cats.set(1, "Мушка");
        System.out.println("\t элементу, находящемуся в списке на позиции 2, присвоен объект Мушка");

        System.out.println("7. Получение объекта, хранящегося в списочном массиве на позиции по указанному индексу");
        System.out.println("\t теперь по индексу 1: "+cats.get(1));

        System.out.println("7. Получение количества элементов, сдержащихся в данный момент в коллекции  cats");
        System.out.println("\t кол-во элементов: "+cats.size());

        System.out.println("Проверка, содержит ли коллекция объект Вонючка: ");
        if(cats.contains("Вонючка")){
            System.out.println("\t коллекция содержит кошку \"Вонючка\"");
        }
        System.out.println("10. Получение подсписка из списочного массива cats:");
        List<String> subList = cats.subList(1,3);
        System.out.println("\t получен подсписок subList:");
        for(String cat : subList){
            System.out.println("\t\tкошка: "+ cat);
        }
        System.out.println("11. Удаление из подсписка объекта");
        System.out.println("\t до удаления под номером 0:"+subList.get(0));
        subList.remove("Мушка");
        System.out.println("\t после удаления под номером 0: "+subList.get(0));


        System.out.println("Коллекция. Класс LinkedList");
        System.out.println("1. Создание двусвязного списка объектов ссылочного типа String:");
        List<String> animals = new LinkedList<>();
        System.out.println("\t двусвязный список animal создан");

        System.out.println("2. Добавление в двусвязный список несколько символьных строк:");
        animals.add("Лев");
        animals.add("Тигр");
        animals.add("Медведь");
        System.out.println("\t в двусвязный список animals добавлено 3 объекта");

        System.out.println("3. Выполнение прямого перебора коллекции используя iterator:");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println("\tЖивотное: "+iterator.next());
        }

        System.out.println("4. Выполнение обратного перебора коллекции используя ListIterator:");
        ListIterator<String> listIterator = (ListIterator<String>)iterator;
        listIterator.add("Лось");
        while (listIterator.hasPrevious()){
            System.out.println("\tЖивотное: "+listIterator.previous());
        }

        System.out.println("5. Добавление всех элементов коллекции cats (списочный массив ArrayList) в коллекцию animals (двусвязный список LinkedList)");
        animals.addAll(cats);
        for(String animal : animals){
            System.out.println("\t"+animal);
        }

        System.out.println("6. Удаление всех элементов коллекции animals.");
        animals.clear();

        System.out.println("7. Определение, является ли коллекция animals пустой:");
        System.out.println("Коллекция animals является пустой: "+animals.isEmpty());


        System.out.println("Коллекция. Класс HashSet");
        System.out.println("1. Создание множества объектов ссылочного типа String:");
        Set<String> cat = new HashSet<>(5);
        System.out.println("\t множество cat создано");

        System.out.println("2. Добавление в множество несколько символьных строк:");
        cat.add("Барсик");
        cat.add("Мурка");
        cat.add("Плюшка");
        cat.add("Тучка");
        System.out.println("\t в множество cat добавлено 4 объекта");

        System.out.println("3. Вывод на экран элементов отображения используя цикл for:");
        for(String aCat: cat){
            System.out.println("\t имя кошки "+aCat);
        }

        System.out.println("4. Добавление нового элемента, который уже присутствует в множестве:");
        cat.add("Мурка");
        System.out.println("Вывод на экран элементов множества используя цикл for:");
        for(String aCat: cat){
            System.out.println("\t имя кошки "+aCat);
        }

        System.out.println("5. Проверка, содержит ли коллекция объект Тучка:");
        if(cat.contains("Тучка")){
            System.out.println("\t коллекция содержит кошку \"Тучка\"");
        }
        System.out.println("6. Удаление объекта Тучка:");
        cat.remove("Тучка");
        System.out.println("Вывод на экран элементов множества используя цикл for:");
        for(String aCat: cat){
            System.out.println("\t имя кошки "+aCat);
        }

        System.out.println("7.  Получение количества элементов, содержащихся в данный момент в коллекции = "+cat.size());

        System.out.println("9. Удаление всех элементов коллекции cat");
        cat.clear();

        System.out.println("9. Определение, является ли коллекция cat пустой:");
        System.out.println("Коллекция cat является пустой: "+cat.isEmpty());


        System.out.println("Коллекция. Класс HashMap");
        System.out.println("1. Создание множества объектов ссылочного типа String");
        Map<String, String> catMap = new HashMap<>();

        System.out.println("2. Добавление в HashMap несколько символьных строк:");
        catMap.put("1m12","Мурка");
        catMap.put("2t15","Тучка");
        catMap.put("3b16","Барсик");
        catMap.put("4b20","Вонючка");
        System.out.println("\t в HashMap cats добавлено 4 объекта");

        System.out.println("3. Вывод на экран элементов множества используя цикл for:");
        for(Map.Entry<String, String> oneCat : catMap.entrySet()){
            System.out.println("key: "+oneCat.getKey()+ " value: "+oneCat.getValue());
        }

        System.out.println("4. Добавление элемента с ключом 3b16, который уже присутствует в HashMap");
        catMap.put("3b16", "Мурка");
        for(Map.Entry<String, String> oneCat : catMap.entrySet()){
            System.out.println("key: "+oneCat.getKey()+ " value: "+oneCat.getValue());
        }

        System.out.println("5.Вынесение списка всех ключей из HashMap в отдельную коллекцию");
        List<String> keys = new LinkedList<>(catMap.keySet());
        for(String key : keys){
            System.out.println("key = "+key);
        }

        System.out.println("6. Вынесение списка всех значений из HashMap в коллекцию HashSet, а также получение количества уникальных значений:");
        Set<String> values = new HashSet<>(catMap.values());
        System.out.println(values.size());
        for(String value : values){
            System.out.println("value = "+ value);
        }

        System.out.println("7. Проверка, содержит ли коллекция определенный ключ 3b16");
        if(catMap.containsKey("3b16")){
            System.out.println("Содержит ключ 3b16");
        }

        System.out.println("8. Проверка, содержит ли коллекция определенное значение:");
        if(catMap.containsKey("Мурка")){
            System.out.println("Содержит ключ Мурка");
        }

        System.out.println("9. Получение количества элементов, содержащихся в данный момент в коллекции: "+catMap.size());

        System.out.println("10. Удаление из коллекции выбранного объекта по ключу 3b16:");
        catMap.remove("3b16");
        for(Map.Entry<String, String> oneCat : catMap.entrySet()){
            System.out.println("key: "+ oneCat.getKey() + " value: "+ oneCat.getKey());
        }

        System.out.println("11. Удаление из коллекции выбраного объекта по ключу 2t15 и значению Тучка:");
        catMap.remove("2t15", "Тучка");
        for(Map.Entry<String, String> oneCat : catMap.entrySet()){
            System.out.println("key: "+oneCat.getKey()+ " value: "+oneCat.getValue());
        }






    }
}