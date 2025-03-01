package coding_practice;

public class Two_dimensional_array {
    public static void main(String[] args) {

        int[][] array_2d=new int[3][3];
        array_2d[0][0]=90;
        array_2d[0][1]=35;
        array_2d[0][2]=46;
        array_2d[1][0]=13;
        array_2d[1][1]=67;
        array_2d[1][2]=56;
        array_2d[2][0]=76;
        array_2d[2][1]=21;
        array_2d[2][2]=78;

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
