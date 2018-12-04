package algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
  @Test
  public void testMergeSortIntArray() {
    int[] arr = new int[]{8, 2, 1, 6, 7};
    MergeSort.mergeSortIntArray(arr);
    int[] expectedArr = new int[]{1, 2, 6, 7, 8};
    Assert.assertArrayEquals(expectedArr, arr);
  }
}
