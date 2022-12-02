public class RunMyProgram {
    public static void main(String[] args) {
        Avatar joker = new Avatar();
        joker.name = "Joker";
        joker.print();
        Avatar harley = new Avatar();
        harley.name = "Harley";
        harley.power = "weapons";
        harley.role = "villain";
        harley.weakness = "Joker";
        harley.print();
        Avatar superman = new Avatar();
        superman.power = "flight";
        superman.role = "hero";
        superman.weakness = "kryptonite";
        superman.posy = 500;
        superman.name = "Superman";
        superman.print();

        Avatar starfire = new Avatar(330, 200, 15, 20, 170, 300, "starbolt blast", "hero", "too many powers", "Starfire");
        starfire.print();

        Avatar catwoman = new Avatar(290,400,30,20,40,20,"stealing","villain","shiny things","Catwoman");
        catwoman.print();
    }
}
