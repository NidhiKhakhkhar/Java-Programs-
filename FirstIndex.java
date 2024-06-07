import java.util.Scanner;

public class FirstIndex {
    public int firstIndexOfString(String haystack , String needle ){
        int index = haystack.indexOf(needle);
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter haystack string : ");
        String haystack = sc.next();
        System.out.print("\nEnter needle string : ");
        String needle = sc.next();
        sc.close();
        FirstIndex fi = new FirstIndex();
        System.out.println("Output : " + fi.firstIndexOfString(haystack, needle));

    }
}
