package ex_29_Generics;

public class Lab224_Generics_Part1 {
    public static void main(String[] args) {
        temp_sum_t(10,10);
        temp_sum_t(10.34, 10.45);

    }

//    static Integer temp_sum_t(Integer a, Integer b){
//        return a+b;
//    }
//
//    static Double temp_sum_t(Double a, Double b){
//        return a+b;
//    }

    //By using Generics
    static <T> T temp_sum_t(T a, T b){
        return null;
    }

}
