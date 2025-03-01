package coding_practice;

public class Array_min_value {
    public static void main(String[] args) {
        int[] array={45,32,89,24,79,5,23,67,95,43};

        int result_min=give_min(array);
        System.out.println(result_min);
    }

    static int give_min(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
