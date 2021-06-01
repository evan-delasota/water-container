class Main {
  public static void main(String[] args) {
    int[] a = {7, 1, 2, 3 , 9};
    System.out.println(mostWater(a));
  }

  public static int mostWater(int[] arr) {
    if (arr.length < 2) {
      return 0;
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; ++i) {
      int curr = arr[i];
      for (int j = i + 1; j < arr.length; ++j) {
        int length = j - i;
        int width = Math.min(arr[j], curr);
        if (length * width > max) {
          max = length * width;
          System.out.println("width: " + width);
          System.out.println("length: " + length);
        }
      }
    }

    return max;
  }
}