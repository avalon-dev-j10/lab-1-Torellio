package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.*;

public class Main {

    public static void main(String args[]) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person("Иван");
        Person smith = new Person("John");
        
        Passport ivanovPassport = new Passport(ivanov.getName(), "Иванов", "Иванович");
        Passport smithPassport = new Passport(smith.getName(), "Smith", null, "Edvard");
        
        ivanov.setPassport(ivanovPassport);
        smith.setPassport(smithPassport);

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        
        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        
        
        Address address_1 = new Address("SPB", "Nevskiy", "33", "11");
        Address address_2 = new Address("SPB", "Nevskiy", "33", "12");
        
        ivanov.setAddress(address_1);
        smith.setAddress(address_2);
        
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();
        
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        
        System.out.println(ivanovFullName);
        System.out.println(smithFullName);
        System.out.println(ivanovAddress);
        System.out.println(smithAddress);
        
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
