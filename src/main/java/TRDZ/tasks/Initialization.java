package TRDZ.tasks;

import java.util.Arrays;

public class Initialization {

    protected static Person[] Persons;
    //Перечни рандоматизации
    private static final String[] names = {"Александр","Алексей","Борис","Владимир","Владислав","Григорий"};
    private static final String[] family = {"Савученко","Козлоченко","Сидрченко","Моноченко","Волдоченко","Чешушилов","Вислоухов","Грозный"};
    private static final String[] othces = {"Дмитриевич","Михайлович","Иванович"};
    private static final String[] jobes = {"Программист","Бугалтер","Дизайнер","Маркетолог","Разнорабочий"};
    private static final String[] mail = {"blabla","blublu","peperu","dojodu","fufufu"};
    private static final String[] mailend = {"@mail.ru","@mail.com","@sumail.ru","@sumail.com"};

    public static void main(String[] args) {
        Persons = new Person[6];
        String[] isMailExist = new String[Persons.length-1];
        String newmail;
    //region Версия заполнения данных класса №1
        Persons[0] = new Person("Красовов Августинов Петрович","Директор","BigBoss@gold.ru",88005553535L,499999,41);
    //endregion
    //region Версия заполнения данных класса №2
        for (int i = 1; i < Persons.length; i++) {
            Persons[i] = new Person();
            Persons[i].set_FIO(family[(int)(Math.random()*family.length)]+" "+names[(int)(Math.random()*names.length)]+" "+othces[(int)(Math.random()*othces.length)]);
            Persons[i].set_Job(jobes[(int)(Math.random()*jobes.length)]);
            Persons[i].set_Age(21+(int)(Math.random()*40));
            Persons[i].set_Payment(15000+(int)(Math.random()*1000)*100);
            do {//while(Arrays.asList(isMailExist).contains(newmail));
                //получение нового уникального почтового ящика
                newmail = mail[(int) (Math.random() * mail.length)] + mailend[(int) (Math.random() * mailend.length)];
                } while(Arrays.asList(isMailExist).contains(newmail));
            isMailExist[i-1]=newmail;
            Persons[i].set_Mail(newmail);
            Persons[i].set_Contact((int)(7+Math.random()*2),(int)(Math.random()*999), (int)(Math.random()*10000000));
            }
    //endregion
    //region Вывод данных по условию
        for (Person person : Persons) { //Идем по всем сотрудникам
            if (person.get_Age()>40) {person.Show();}    //Выводим тех кто старше 40 лет
            }
    //endregion
        }
}
