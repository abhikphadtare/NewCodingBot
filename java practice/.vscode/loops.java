
public class loops {
    public static void main(String[] args) {
        System.out.println("Aaryan"); 
        
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i + ". Aaryan");
        }

    
        int i = 0;
        while (i < 100) {
            if(i % 2 != 0) { 
                i++;
                continue; 
            }
           
            if(i == 50) {
                break; 
            }
            i++; 
        }

       
        int j = 0;
        do {
          
            j++;
        } while(j < 0);


    }
}
