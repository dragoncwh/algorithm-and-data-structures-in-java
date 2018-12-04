package algorithms;

import java.util.List;

public class MergeSort {
  // public static  <E extends Comparable> void mergeSortGeneric(List<E> list) {
  //
  // }

  public static void mergeSortIntArray(int[] arr) {
    mergeSortIntArray(arr, 0, arr.length - 1, new int[arr.length]);
  }

  private static void mergeSortIntArray(int[] arr, int l, int r, int[] buff) {
    if (l >= r) {
      return;
    }
    int mid = l + (r - l) / 2;
    mergeSortIntArray(arr, l, mid, buff);
    mergeSortIntArray(arr, mid + 1, r, buff);
    mergeIntArray(arr, l, mid, r, buff);
  }

  private static void mergeIntArray(int[] arr, int l, int m, int r, int[] buff) {
    for (int i = l; i <= r; i++) {
      buff[i] = arr[i];
    }
    int i = l, j = m + 1, writeIdx = l;
    while (i <= m && j <= r) {
      arr[writeIdx++] = buff[i] <= buff[j] ? buff[i++] : buff[j++];
    }
    while (i <= m) {
      arr[writeIdx++] = buff[i++];
    }
    while (j <= r) {
      arr[writeIdx++] = buff[j++];
    }
  }
}
