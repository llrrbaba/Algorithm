package cn.rocker;

/**
 * 二分查找
 * @author: rocker_pg@163.com
 * @create: 2020/10/28 1:25 下午
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15};
        System.out.println(rank(18, arr));
    }

    public static int rank(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
