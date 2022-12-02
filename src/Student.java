public class Student {
    int age;
    int grade;
    String name;
    boolean isBoarder;
    String favSubject;


    public void print(){
        System.out.println("The student " + name + " is " + age + " years old.");
        System.out.println("They are in grade " + grade + ".");
        System.out.println("It is " + isBoarder + " that they are a boarder." );
        System.out.println("Their favourite subject is " + favSubject + "." );
        System.out.println(" ");
    }
}

//    Student elvin = new Student();
//        elvin.age = 10;
//                elvin.name = "Elvin";
//                elvin.grade = 5;
//                elvin.isBoarder = false;
//                elvin.favSubject = "math";
//                elvin.print();
//
//                Student dione = new Student();
//                dione.age = 15;
//                dione.name = "Dione";
//                dione.grade = 10;
//                dione.isBoarder = true;
//                dione.favSubject = "physics";
//                dione.print();