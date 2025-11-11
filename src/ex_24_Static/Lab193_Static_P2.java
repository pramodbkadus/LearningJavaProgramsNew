package ex_24_Static;

public class Lab193_Static_P2 {

}

class ATB{
    int phone_np;
    String name;

    static String course_name = "ATB";

    /* Note: 1 -> Non-static member can access static value.
             2 -> Static member cannot access Non-Static values.
     */

    static void markAttendance(){
        System.out.println("Mark Attendance");
//        System.out.println(this.phone_np);
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }
}