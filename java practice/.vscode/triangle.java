public class triangle {
    public static void main(String[] args) {
        int n = 5;  

        for (int i = 1; i <= n; i++) {  
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
