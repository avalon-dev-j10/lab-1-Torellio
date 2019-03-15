package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    private String city;
    private String street;
    private String home;
    private String kv;
    
    public Address(String city, String street, String home, String kv) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.kv = kv;
    }
    
    public String getAddress() {
        return city + ", " + street + ", " + home + ", " + kv;
    }
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