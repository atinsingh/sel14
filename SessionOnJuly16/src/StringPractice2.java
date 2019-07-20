import java.util.Locale;

public class StringPractice2 {

    public static void main(String[] args) {
        // switch case
        // User is gonna give u country code and you need print country name
        String countryCode = "UK";
        int num1,num2;

        switch (countryCode) {
            case "US"  : {
                System.out.println("United States");
                System.out.println(23);
                System.out.println(21);
            }
            break;
            case "IN"  : {
                System.out.println("India");
            }break;
            case "NZ"  : {
                System.out.println("NZ");
            }break;
            case "AU"  : {
                System.out.println("AU");
            }break;
            case "UK"  : {
                System.out.println("UK");
                break;
            }
            case "XX"  : {
                System.out.println("XX");
            }break;
            default:{
                System.out.println("Not a Valid country code");
            }

        }

        // For loop -->  classic for loop  // forEach loop
        // i++  === i= i+1;
//        for (int i = 0 ; i<2 ; i++) {
//            System.out.println(i);
//        }

//        for (int i  =0 , j = 0 , k = 0 ; i<2 || j <1 && k <1 ; i++ , j++, k++){
//            System.out.println(i + " "+ j);
//        };

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j<3; j++){
                System.out.print(i +""+ j);
            }

        }

        // you need to print eve number between 0 to 50;
        // second do the sum of all even numbers


        int sum = 0;
        for (int i = 0 ; i<=50 ; i= i+2) {
            if(i%2==0){
                System.out.println(i);
                sum = sum +i;
            }
        }
        System.out.println(sum);

        // while
        int i =0 , j = 0, k = 0;
        sum = 0;
//        while ( i<=50 && j<30 || k <=0){
//           if(i%2==0){
//               System.out.println(i);
//               sum = sum+i;
//           }
//           i++;
//           j++;
//        }
        System.out.println("Sum after while "+ sum);

        // no need to write while loop to calculate
        // factorial for a number less than 8
        // print

        // factorial  5  ===> 5*4*3*2*1


        do {
            System.out.println("Inside do while");
            i++;
        }while (i<10);








    }
}
