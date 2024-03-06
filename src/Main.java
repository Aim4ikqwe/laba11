import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = { new Student(18, "Уханов А.А", "+79053677326",2, "Программирование",2022),
                new Student(20, "Лапицкий Д.В","7922877326", 4, "Бухгалтерское дело", 2020 ),
                new Student(19,"Ермохин Д.Е","79048507420", 3,"Программирование", 2021)
        };
        for (Student student : students){
            System.out.println(student.FIO + " Возраст: " + student.getAge());
        }
        System.out.println("Студенты факультета программирования");
        for (Student student : students){
            if (student.Facultet == "Программирование"){
                System.out.println(student.FIO);
            }
        }
        System.out.println("Студенты поступившие после 2021 года");
        for ( Student student : students){
            if ( student.getDateOfInvite() > 2021){
                System.out.println(student.FIO);
            }
        }
    }
}
class Person{
    private int Age;
    public String FIO;
    public String Number;
    Person(int Age, String FIO, String Number){
        this.Age = Age;
        this.FIO = FIO;
        this.Number = Number;
    }
    int getAge(){
        return Age;
    }
}
class Student extends Person{
    public int Course;
    public String Facultet;
    private int DateOfInvite;
    Student(int Age, String FIO, String Number, int Course, String Facultet, int DateOfInvite) {
        super(Age, FIO, Number);
        this.Course = Course;
        this.Facultet = Facultet;
        this.DateOfInvite = DateOfInvite;
    }
    int getDateOfInvite(){
        return DateOfInvite;
    }

}