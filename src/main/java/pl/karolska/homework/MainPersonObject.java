package pl.karolska.homework;

public class MainPersonObject {

    public static void main( String[] args ) {

        PersonObject person1 = new PersonObject("Pablo", "Picasso",  1881);
        PersonObject person2 = new PersonObject("Salvador", "Dali",  1904);
        PersonObject person3 = new PersonObject("Oscar-Claude", "Monet",  1840);
        PersonObject person4 = new PersonObject("Leonardo", "da Vinci",  1452);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


    }

}
