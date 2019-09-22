package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        create several students and teachers

        student s1 = new student("1df34578901", "Paul","1234567","SE");

        student s2 = new student("vshau12345","Jam","0987654","EE");

        Teacher t1 = new Teacher("mall6478912","Malado",890);
        Teacher t2 = new Teacher("baf83612561","Balogun", 419);

//     Create array "university", print names and validate ids if possible

       Person [] university = {t1, t2,new Teacher("mall6478912", "Malado", 890),
       s1, s2};
        System.out.println("NAME _________ PERSONALID_______");
//        for (int i=0; i<Person.length; i++)
//        for (Box r : boxes) {
//            System.out.println(r);
//        }
        for (Person p : university){
        System.out.println(p);
        }

    }
}
