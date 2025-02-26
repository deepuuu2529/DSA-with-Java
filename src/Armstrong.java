package src;

public class Armstrong {
        public static void main(String[] args) {
            System.out.print("Three Digit Armstrong numbers are :  ");
            for (int i = 100; i < 1000; i++) {
                if(isArmstrong(i)){
                    System.out.print(i + " ");
                }

            }


        }
        static boolean isArmstrong(int n){
            int sum=0;
            int original = n;
            while (n > 0){
                int rem = n % 10;
                n/=10;
                sum += rem*rem*rem;

            }
            return original == sum;
        }
}

