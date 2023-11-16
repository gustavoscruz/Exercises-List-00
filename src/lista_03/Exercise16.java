package lista_03;/* Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre. */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth, monthOfBirth;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter the birth day: ");
        dayOfBirth = input.nextInt();

        System.out.print("Enter the birth month: ");
        monthOfBirth = input.nextInt();

        if (dayOfBirth < 1 || dayOfBirth > 31 || monthOfBirth < 1 || monthOfBirth > 12) {
            System.out.println("Invalid date");
        } else if (dayOfBirth == 31 && (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11)) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        } else if (dayOfBirth > 29 && monthOfBirth == 2) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        }
        else {
            //trimester
            if(monthOfBirth >= 1 && monthOfBirth <= 3){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the first trimester");
            }
            else if(monthOfBirth >= 4 && monthOfBirth <= 6){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the second trimester");
            }
            else if(monthOfBirth >= 6 && monthOfBirth <= 9){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the third trimester");
            }
            else {
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the fourth trimester");
            }

        }


        input.close();
    }

}
