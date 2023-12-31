package Project1_HybridSort.source;

public class HybridSort {

    public static void hybridSortInPlace(int[] arr, int start, int end)
    {
        //This is a trivial case (just 1 element, so no sorting required)
        if(start == end)
        {
            return;
        }
        // 0 indexed size
        int size = end - start + 1;
        //If size < S , we do insertion
        if(size <= Sort.S)
        {
            //We conduct insertion sort from start to end?
            InsertionSort.insertionSortInRangeIP(arr, start, end);

        }
        else // > S, so we do merge
        {
            //We conduct merge sort
            int mid = (start + end) / 2;
            hybridSortInPlace(arr, start, mid);
            hybridSortInPlace(arr, mid + 1, end);
            MergeSort.mergeAscendingInPlace(arr, start, mid, end);
        }
    }

    public static int[] hybridSort(int[] arr, int start, int end)
    {
        //Means at least 2 elements
        if(start < end)
        {
            //0 indexed size
            int size = end - start + 1;
            //Create a new array
            int[] sortedArr = new int[size];
            if(size <= Sort.S)
            {
                sortedArr = InsertionSort.insertionSortInRangeAux(arr, start, end);
                return sortedArr;
            }
            //Else we can run typical merge sort
            int mid = (start + end) / 2;
            int lSize = mid - start + 1;
            int rSize = end - mid;
            int[] left = new int[lSize];
            left = hybridSort(arr,start, mid);
            int[] right = new int[rSize];
            right = hybridSort(arr, mid+1, end);
            sortedArr = MergeSort.mergeAscendingAuxiliary(left,right,lSize,rSize);
            return sortedArr;
        }
        return new int[]{arr[start]};
    }
}
