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
    int front = 0;
    int tail = arr.length - 1; 

    while (front < tail) {
      int height = tail - front;
      int width = Math.min(arr[tail], arr[front]);
      max = Math.max(max, width * height);
      if (arr[front] > arr[tail]) {
        tail--;
      } else {
        front++;
      }
    }

    return max;
  }
}