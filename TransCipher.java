import java.util.*;

class TransCipher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text");
        String pl = sc.nextLine();
        sc.close();

        // Remove spaces from the input string
        String s = "";
        s=pl.replaceAll(" ","");

        System.out.println(s); // Print the string without spaces

        int k = s.length();
        int l = 0;
        int col = 4; // Number of columns in the transposed matrix
        int row = s.length() / col;
        char ch[][] = new char[row][col];

        // Fill the matrix with characters from the string
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (l < k) {
                    ch[i][j] = s.charAt(l);
                    l++;
                } else {
                    ch[i][j] = '#';
                }
            }
        }

        // Transpose the matrix
        char trans[][] = new char[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = ch[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(trans[i][j]);
            }
        }
        System.out.println();
    }
}
