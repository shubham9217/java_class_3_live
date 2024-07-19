package class3_programs;

public class lab_004 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
       // int result = course+GST;
      int result =course+(int)GST; //explicit narrowing
        System.out.println(result);

        float result1 = course + GST; // implicit widening
        System.out.println(result1);
    }
}
