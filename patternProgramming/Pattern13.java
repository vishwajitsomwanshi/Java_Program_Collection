package patternProgramming;

public class Pattern13 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int k = 1;
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= column; j+=5)
            {
                    System.out.print(k);

            }
            System.out.println();
            k++;
        }
    }
}

