public class PC7MultiplicationTable {
    public static void main(String[] args) {
        
        int num = 10;
        for (int i = 1; i <= num ; i ++){
            for (int j =1 ; j<=num; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}