public class Fibo {


    public static void main(String [] args){
        int a = 1, b = 1, n=10, fibresul;
        System.out.print(a + " " + b + " ");
        for(int i = 0; i < n; i++){
            fibresul = a + b;
            a = b;
            b = fibresul;
            System.out.print(fibresul + " ");
        }
    }

}
