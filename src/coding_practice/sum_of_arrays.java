package coding_practice;

public class sum_of_arrays {
    public static void main(String[] args) {
        int[] array={40,10,20,40};

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
