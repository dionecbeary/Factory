public class Sport {
    int players;
    int record;
    String name;

    public Sport( int pPlayers, int pRecord, String pName){
     name = pName;
     players = pPlayers;
     record = pRecord;
    }
    public void print(){
        System.out.println(name + " has " + players + " players with a record of " + record);
    }
    public void rateing(){
        if(record > 10){
            System.out.println("This is a good season.");
        }
        else{
            System.out.println("This is a sad season.");
        }
    }
}
