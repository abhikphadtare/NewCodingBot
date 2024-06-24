public class stringex {
    public static void split() {
        String str = "Abhishek, Aditya, Aakash, Aarush";
        String[] arr = str.split(", ");
        for (String s : arr) { // for-each loop
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        String str = "   aBHishek   "; 
        String str2 = "AbHiShEk"; 

        System.out.println(str.trim());
        System.out.println(str2.charAt(str2.length() - 1));

        char[] ch = str2.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

      
    }
}