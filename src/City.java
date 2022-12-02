public class City {
    int pop;
    String continent;
    String name;
    int avgTemp;

    public City(){
        name = "Venice";
        pop = 1000;
        continent = "Ohio";
        avgTemp = 20;
        print();
    }
    public void print(){
        System.out.println("The city " + name + " is in " + continent + ".");
        System.out.println("It has an average temp of " + avgTemp + " degrees and a population of " + pop + " people.");
    }
}
//        City beijing = new City();
//        beijing.name = "Beijing";
//        beijing.pop = 21500000;
//        beijing.avgTemp = 65;
//        beijing.continent = "Asia";
//        beijing.print();
//
//        City venice = new City();
//        venice.print();
//        venice.name = "Venice";
//        venice.pop = 261905;
//        venice.avgTemp = 55;
//        venice.continent = "Europe";
//        venice.print();