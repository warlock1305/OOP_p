package labs;

import people.Person;
import people.Student;
import people.Teacher;

import java.util.ArrayList;

public class L4t1 {
    public static void printDepartment(ArrayList<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }

    public static void main(String[] args){
        Person Pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person Esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(Pekka);
        System.out.println(Esko);

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());

        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student Olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            Olli.study();
        }
        System.out.println( Olli );

        ArrayList   <Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );


        printDepartment(people);

    }
}
