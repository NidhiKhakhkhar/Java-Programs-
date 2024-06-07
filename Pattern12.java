public class Pattern12{
    public static void pattern(int N){
        int space = 2*(N-1);

        for(int i=0;i<N;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
            space-=2;
        }
    } 
    public static void main(String[] args){
        int N = 5;
        pattern(N);
    }
}