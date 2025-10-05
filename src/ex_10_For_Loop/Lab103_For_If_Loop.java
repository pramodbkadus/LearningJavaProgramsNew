package ex_10_For_Loop;

public class Lab103_For_If_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(i >= 18){
                System.out.println("Eligible to vote");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
    }
}
