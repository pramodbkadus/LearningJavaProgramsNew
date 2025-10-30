package ex_17_OOPs;

public class Lab165_Cats_OOPs {
    public static void main(String[] args) {

        Cat c23 = new Cat();
        Cat c24 = new Cat("Lucy");

        System.out.println(c23.name);
        System.out.println(c24.name);

        c24.running();
    }

    static class Cat{
        String name;

        Cat(){
            name = "Kitty";
        }

        Cat(String nameParam){
            this.name = nameParam;
        }

        void running(){
            System.out.println("Who is running -> " + this.name );
        }
    }
}
