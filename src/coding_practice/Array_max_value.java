package coding_practice;

public class Array_max_value {
    public static void main(String[] args) {
        int[] array={10,56,35,76,88,96,46,75,89,100};

        int max_value=give_max(array);
        System.out.println(max_value);
    }

    static int give_max(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
