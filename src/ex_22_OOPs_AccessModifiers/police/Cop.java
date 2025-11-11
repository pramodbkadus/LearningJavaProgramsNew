package ex_22_OOPs_AccessModifiers.police;

public class Cop {
     public int gun;
     private String iCard;

     public Cop(int bullet){
         this.gun = bullet;
     }

     protected void canIShoot(){
         System.out.println("Yes you can !!");
     }
}
