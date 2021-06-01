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

    for (int i = 0; i < arr.height; ++i) {
      int curr = arr[i];
      for (int j = i + 1; j < arr.height; ++j) {
        int height = j - i;
        int width = Math.min(arr[j], curr);
        if (height * width > max) {
          max = height * width;
        }
      }
    }

    return max;
  }
}