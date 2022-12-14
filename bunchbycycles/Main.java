package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    // Iterationg through cycles array
    for(int i=0; i<cycles.length; i++) {
      if(cycles[i] < 410) {
        // incrementing low count
        counts.lowCount += 1;
      }
      else if(cycles[i] >= 410 && cycles[i] <=909) {
        // incrementing medium count
        counts.mediumCount += 1;
      }
      else {
        // incrementing high count
        counts.highCount += 1;
      }
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    // Printing out the low, medium and high counts from the object 'counts'
    System.out.println("low count = " + counts.lowCount + "\n" + "medium count = " + counts.mediumCount + "\n" + "high count = " + counts.highCount);
    assert(counts.lowCount == 2) : "lowCount test passed";
    assert(counts.mediumCount == 3) : "mediumCount test passed";
    assert(counts.highCount == 1) : "highCount test passed";
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
