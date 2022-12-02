public class Avatar {
    int posx;
    int posy;
    int dx;
    int dy;
    int height;
    int width;
    String role;
    String power;
    String weakness;
    String name;
    public Avatar(){
        posx = 400;
        posy = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }

    public Avatar(int pPosX, int pPosY, int pDx, int pDy, int pHeight, int pWidth, String pPower, String pRole, String pWeakness, String pName){
        posx = pPosX;
        posy = pPosY;
        dx = pDx;
        dy = pDy;
        height = pHeight;
        width = pWidth;
        role = pRole;
        power = pPower;
        weakness = pWeakness;
        name = pName;
    }
    public void print(){
        System.out.println("The " + role + " " + name + " can " + power + " and their weakness is " + weakness);
        System.out.println("They are at the location (" + posx + "," + posy + ").");
    }
}
