public class SumaSerie {
    
    public static void main(String[] args) {
        System.out.println(SumaRecursiva(100));
    }

    public static int SumaRecursiva(int n){
        if (n == 0) {return 0;}
        else {
            return n + SumaRecursiva(n-2);
        }
    }
}
