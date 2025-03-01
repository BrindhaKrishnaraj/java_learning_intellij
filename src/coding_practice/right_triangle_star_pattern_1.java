package coding_practice;

public class right_triangle_star_pattern_1 {
    public static void main(String[] args) {
        int[][] matrix=new int[5][5];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

