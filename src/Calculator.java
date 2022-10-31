import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1,number2;
        String operator;
        Scanner scanner=new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        number1=scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        number2=scanner.nextDouble();


        System.out.println("Operatörü tuşlayınız:");
        operator=scanner.next();

        switch (operator){
            case "+":
                System.out.println("Toplam:" + (number1+number2));
                break;
            case "-":
                System.out.println("Fark:" + (number1-number2));
                break;
            case "*":
                System.out.println("Çarpım:" + (number1*number2));
                break;
            case "/":
                System.out.println("Bölüm:" + (number1/number2));
                break;
        }

    }
}
