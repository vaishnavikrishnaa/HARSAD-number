import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//HARSAD NUMBER HEHEHEHE
//eg: 156~1+5+6=12 hence if 156/12 ==0 then it is a harsad number
int n;
int originalnumber;
int sum=0;

        do{
                System.out.println("Enter a number: ");
n = scanner.nextInt();
originalnumber = n;
sum += (n % 10);
n/=10;//removes the last digit from n
        if(originalnumber%sum==0){
        System.out.println("The number is HARSAD number");
            }else{
                    System.out.println("The number is not a HARSAD number");
            }
                    }while (n!=0);



        scanner.close();
}
        }
