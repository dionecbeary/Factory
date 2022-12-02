public class Pet {
    String name;
    String owner;
    int age;
    String animal;
    boolean common;

    public void print(){
        System.out.println(name + " is " + owner + "'s " + animal + ".");
        System.out.println(name + " is " + age + " years old. It is " + common + " that " + name + " is a common pet.");
    }
}
//    Pet fluffy = new Pet();
//        fluffy.name = "Fluffy";
//                fluffy.animal = "goldfish";
//                fluffy.owner = "Lyn";
//                fluffy.age = 2;
//                fluffy.common = true;
//                fluffy.print();
//
//                Pet chunky = new Pet();
//                chunky.name = "Chunky";
//                chunky.animal = "dog";
//                chunky.owner = "Bonnie";
//                chunky.age = 7;
//                chunky.common = true;
//                chunky.print();
//
//                Pet bessie = new Pet();
//                bessie.name = "Bessie";
//                bessie.animal = "snake";
//                bessie.owner = "Claudie";
//                bessie.age = 4;
//                bessie.common = false;
//                bessie.print();
