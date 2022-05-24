class JaggedArray2 {
    public static void main(String[] args) {
        int r = 5;
        int arr[][] = new int[r][];
        System.out.print("\n\n");

        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i * 2 + 1];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
        }

        System.out.println("2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.print("\n\n");

    }
}
