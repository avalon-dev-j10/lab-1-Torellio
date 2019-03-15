package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    
    private Passport passport;
    private Address address;
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public Person(String name, String surname, String patronymic) {
        this(name, surname);
        this.patronymic = patronymic;
    }
    
    public Person(String name, String surname, String patronymic, String secondName) {
        this(name, surname, patronymic);
        this.secondName = secondName;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setPassport(Passport passport) {
        this.passport = passport;
    }
    
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        String fullName;
        
        if ((patronymic == null) && (secondName == null)) {
            fullName = name + " " + surname;
        }
        else if ((patronymic == null) && (secondName != null)) {
            fullName = name + " " + secondName.substring(0,1) + ". " + surname;
        }
        else {
            fullName = name + " " + surname + " " + patronymic;
        }
        
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.getAddress();
    }
}