package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(int i=0; i<cycles.length; i++) {
      if(cycles[i] < 410) {
        counts.lowCount += 1;
      }
      else if(cycles[i] >= 410 && cycles[i] <=909) {
        counts.mediumCount += 1;
      }
      else {
        counts.highCount += 1;
      }
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
//     System.out.println(counts.lowCount + " " + counts.mediumCount + " " + counts.highCount);
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
