package coding_practice;

public class sorting_array_without_functions {
    public static void main(String[] args) {
        int[] array={98,56,76,34,89,53,11};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }
        System.out.println("Second largest number is " + array[array.length-2]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
