
public class SumAverage {

  public static int sum(int lowerBound, int upperBound) {
    int sum1 = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      sum1 += i;
    }
    return sum1;
  }

  public static int sum(int[] numbers) {
    int SumArray = 0;
    for (int i : numbers) {
      SumArray += i;
    }
    return SumArray;
  }

  public static double average(int lowerBound, int upperBound) {

    double Average = 0.0;
    while (true) {
      Average = (lowerBound + upperBound) / 2.0;
      return Average;
    }
  }
    public static double average ( int[] numbers){
      double sum = 0.0;
      int i = 0;
      do{
        sum += numbers[i];
        i++;
      } while (i < numbers.length);

      return sum/i;
    }
  }
