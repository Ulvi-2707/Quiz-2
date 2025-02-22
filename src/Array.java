import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

//        6.1.	Array-də əsas əməliyyatlar:
//        Məsələ 1:
//        İstifadəçidən 5 ədəd daxil edin və bu ədədlərin toplamını və orta qiymətini
//        hesablayan bir proqram yazın.


//        int[] arr = new int[5];
//        int sum = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter number");
//            arr[i] = sc.nextInt();
//
//            sum = sum + arr[i];
//
//        }
//        double average = (double) sum / arr.length;
//
//        System.out.println("The sum is: " + sum);
//        System.out.println("The average is: " + average);


//        Məsələ 2:
//        İstifadəçidən 10 ədəd daxil edin və bu ədədlərin ən böyüyünü və ən kiçiyini tapın.
//
//        int[] arr = new int[10];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 numbers: " );
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" Number " + (i + 1) + ": ");
//            arr[i] = sc.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("The maximum number is " + max);
//        System.out.println("The minimum number is " + min);


//        Məsələ 3:
//        İstifadəçidən 7 ədəd daxil edin və daxil olunan ədədlərin
//        cüt olanlarını tapın və ekrana yazdırın.

//        int[] arr = new int[7];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 7 elements: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Even numbers are: " );
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//
//                System.out.print(arr[i] + " ");
//            }
//
//        }


//        Məsələ 4:
//        Bir massiv yaradın (məsələn, int[] numbers = {1, 2, 3, 4, 5}) və
//        həmin massivdəki bütün ədədlərin kvadratlarını hesablayıb ekrana yazdırın.


//        int[] numbers = {8,20,9,7,5};
//        for (int i = 0; i < numbers.length; i++) {
//
//            System.out.print(numbers[i] * numbers[i] + " ");
//        }


//        6.2.	Array-in tərsinə çevrilməsi:
//        Məsələ 1:
//        İstifadəçidən 5 ədəd alın və bu ədədləri tərsinə yazdıran bir proqram yazın. (Məsələn, 1, 2, 3, 4,
//        5 daxil edildikdə, nəticə 5, 4, 3, 2, 1 olacaq.)

//        int[] numbers = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 numbers: ");
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Number " + i + ": ");
//            numbers[i] = sc.nextInt();
//        }
//        System.out.print("Result: ");
//        for (int i = numbers.length -1; i >= 0; i--) {
//            System.out.print( numbers[i] + " ");
//        }


//        Məsələ 2:
//        İstifadəçidən bir ədəd daxil edin və 1-dən həmin ədədə qədər olan bütün ədədlərin
//        tərs sırada massivə əlavə edildiyi bir proqram yazın.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = n - i;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//

//        Məsələ 3:
//        Bir massiv yaradın və həmin massivdəki ədədlərin tərsinə çevrilmiş halını ekrana yazdırın.
//        (Array-in tərsinə çevrilməsi üçün əlavə bir massiv yaradılmasın.)
//
//        int[] arr = {1,2,3,4,5};
//        int[] reversed = new int[arr.length];
//        for (int i = arr.length -1; i >= 0; i--) {
//            reversed[i] = arr[arr.length - i -1];
//        }
//        System.out.println(Arrays.toString(reversed));


//        Məsələ 4:
//        İstifadəçidən 6 ədəd daxil edin və bu ədədləri tərsinə sıralayıb ekrana yazdırın.
//        (Bunun üçün for dövrəsi və ya başqa bir üsul istifadə edin.)

//        int[] arr = new int[6];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 6 number : ");
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter number " + (i + 1) + " : ");
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > temp) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                    break;
//                }
//
//            }
//            System.out.println(temp);
//        }

//        6.3. Array ilə axtarış:
//        Məsələ 1:
//        İstifadəçidən 10 ədəd daxil edin və həmin massivdə istənilən bir ədədin olub olmadığını tapın.
//        Əgər varsa, "Ədəd tapıldı" mesajını, yoxdursa "Ədəd tapılmadı" mesajını yazdırın.

//        int[] arr  = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter elements of array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter element " + (i + 1) +": ");
//             arr[i] = sc.nextInt();
//         }
//        System.out.println("Enter number: ");
//         int number = sc.nextInt();
//         boolean flag = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == number) {
//                 flag = true;
//                 break;
//             }
//        }
//         if (flag) {
//             System.out.println("Element found  " + number);
//         }
//         else {
//             System.out.println("Element not found");
//         }
//

//        Məsələ 2:
//        Bir massivdəki tək ədədləri tapın və ekrana yazdırın.
//        (İstifadəçi tərəfindən daxil edilmiş ədəd massivinə görə işləsin.)

//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//
//            System.out.println("Enter the size of the array: ");
//            int n = sc.nextInt();
//
//            if (n <= 0) {
//                System.out.println("Invalid input");
//                continue;
//            }
//
//            int[] arr = new int[n];
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            System.out.println("Odd numbers are: ");
//            for (int j : arr) {
//                if (j % 2 != 0) {
//                    System.out.print(j + " ");
//                }
//            }
//        }



//        Məsələ 3:
//        Bir massivdə və ya növbəti ən böyük və ən kiçik ədədi tapın.
//        Məsələn, əgər massivdə 3, 5, 7, 9 ədədləri varsa, ən kiçikdən sonra ən kiçik olan 5 olmalıdır.


//        int[] arr = new int[10];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 numbers: " );
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" Number " + (i + 1) + ": ");
//            arr[i] = sc.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        if (max == (max-1) && min == (min +1)) {
//            System.out.println("The next maximum number is " + (max -2));
//            System.out.println("The next minimum number is " + (min +2));
//        }
//        System.out.println("The maximum number is " + max);
//        System.out.println("The next maximum number is " + (max -1));
//        System.out.println("The minimum number is " + min);
//        System.out.println("The next minimum number is " + (min +1));
//        return;

//        Məsələ 4:
//        İstifadəçidən 10 ədəd daxil edin və bu ədədlərdən yalnız unikal olanları tapın
//        (təkrarlanan ədədləri nəzərə almayın).

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Enter 10 numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter number " + (i +1) + ": ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Unique numbers: ");
//        boolean isUnique;
//        for (int i = 0; i < arr.length; i++) {
//            isUnique = true;
//                for (int j = 0; j < i; j++) {
//            if (arr[i] == arr[j]) {
//                isUnique = false;
//                break;
//            }
//        } if (isUnique) {
//                System.out.print(arr[i] + " ");
//            }
//        }


    }
}
