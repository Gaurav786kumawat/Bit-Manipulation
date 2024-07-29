// ! Check if number is odd or even.
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         int num = 152;
//         checkEvenOdd(num);
//     }

//     public static void checkEvenOdd(int num){
//         int bitMask = 1;
//         if((num & bitMask) == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }

// ! Get i'th Bit :-
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         int num = 10;
//         int i = 3;
//         int answer = get_i_th_Bit(num , i);
//         System.out.println(answer);
//     }

//     public static int get_i_th_Bit(int num , int i){
//         int bitMask = 1 << i;
//         if((num & bitMask)==0){
//             return 0;
//         } 
//         else{
//             return 1;
//         }
//     }
// }

// ! Set i'th Bit :-
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         System.out.println(set_i_th_Bit(10,2));
//     }

//     public static int set_i_th_Bit(int num , int i){
//         int bitMask = 1 << i;
//         return num | bitMask;
//     }
// }

// ! Clear i'th Bit :-
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         System.out.println(clearIthBit(10,1));
//     }
//     public static int clearIthBit(int num , int i){
//         int bitMask = ~(1 << i);
//         return num & bitMask;
//     }
// }

// ! Update i'th Bit :-
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         System.out.println(updateithBit(10,2,1));

//     }

//     public static int clearIthBit(int num , int i){
//         int bitMask = ~(1 << i);
//         return num & bitMask;
//     }

//     public static int updateithBit(int num , int i, int newBit){
//         int n = clearIthBit(num,i);
//         int bitMask = newBit << i;
//         return n | bitMask;
//     }
// }


// ! Swap two numbers without using third variable 
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;

//         a = a ^ b;
//         b = b ^ a;
//         a = a ^ b;

//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// ! Add 1 to an integer using Bit Manipulation ( Hint : try using bitwise NOT operator).
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         int num = 15;
//         System.out.println(-(~num));
//     }
// }

// ! Convert uppercase to lowercase using bits.
// public class Questions_BitManipulation {
//     public static void main(String[] args) {
//         for(char ch='A'; ch<='Z'; ch++){
//             System.out.print((char)(ch | ' ') + " ");
//         }
//     }
// }

