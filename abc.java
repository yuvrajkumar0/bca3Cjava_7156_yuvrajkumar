class rowColumn{

public static void main(String args[]) {

        for(int rows = 5; rows >= 1; rows--) {

            for(int cols = 1; cols <= rows; cols++) {

                System.out.print(cols);
            }

            System.out.println();
        }
    }
}