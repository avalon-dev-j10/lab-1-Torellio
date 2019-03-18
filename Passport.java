package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
    private String serAndNum;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private Date birthDate;
    private Date dateOfIssue;
    private String whoIssued;
    
    
    public Passport(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public Passport(String name, String surname, String patronymic) {
        this(name, surname);
        this.patronymic = patronymic;
    }
    
    public Passport(String name, String surname, String patronymic, String secondName) {
        this(name, surname, patronymic);
        this.secondName = secondName;
    }
    
    public Passport(String name, String surname, String patronymic, String secondName, Date birthDate, Date dateOfIssue, String whoIssued) {
        this(name, surname, patronymic, secondName);
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.whoIssued = whoIssued;
    }
    
    public String getFullName() {
        
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
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getPatronymic() {
        return patronymic;
    }
    
    public String getSecondName() {
        return secondName;
    }
    
    public String getSerAndNum() {
        return serAndNum;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public Date getDateOfIssue() {
        return dateOfIssue;
    }
    
    public String getWhoIssued() {
        return whoIssued;
    }  
}
