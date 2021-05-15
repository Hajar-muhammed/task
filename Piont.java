
package piont;

public class Piont {
    private int x;
     private int y;

     public Piont()
     {
    System.out.println("Point Constructed");
     }

     public void setX(int xx)
     {
     this.x= xx;

     }

     public void setY(int yy)
     {
     this.y= yy;
     }

     public int getX()
     {
     return x;
     }

     public int getY()
     {
     return y;
     }

     public void move(int xd, int yd)
     {
     x= x+xd;
     y=y+yd;

     }

     public String toString()
     {
     return "X=" + x + " Y="+y;
     }

     public static void main(String arg[])
     {
     Piont p1= new Piont();
     Piont p2= new Piont();
     p1.setX(2);
     p1.setY(5);
     p2.setX(3);
     p2.setY(6);
     System.out.println(p1);
     System.out.println(p2);
     p1.move(3,3);
     System.out.println(p1);
     p2.move(-5,3);
     System.out.println(p2);

     }

}
