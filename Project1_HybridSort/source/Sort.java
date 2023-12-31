package Project1_HybridSort.source;

public class Sort {

    //Stores the key comparisons
    public static long keyComparisons = 0;
    //Stores our given S;
    public static int S = 1;

    //Wrapper function only
    public static void mergeSortInPlace(int[] arr, int start, int end, boolean ascending)
    {
        //Reset our key comparisons to be 0
        Sort.keyComparisons = 0;
        MergeSort.mergeSortInPlace(arr,start,end);
        //Print out key comparisons
        //String mode = ascending ? "[Ascending Merge Sort] " : "[Descending Merge Sort] ";
        //System.out.println(mode + "Key Comparisons: " + keyComparisons);
    }

    public static int[] mergeSortAuxiliary(int[] arr, int start, int end)
    {
        //Reset our key comparisons to be 0
        Sort.keyComparisons = 0;
        int[] sorted = MergeSort.mergeSortAuxiliary(arr,start,end);
        //System.out.println("[Aux MS] Key Comparisons: " + keyComparisons);
        return sorted;
    }
    public static void hybridSortInPlace(int[] arr, int start, int end)
    {
        Sort.keyComparisons = 0;
        HybridSort.hybridSortInPlace(arr, start, end);
        //String mode = ascending ? "[Ascending Insertion Sort] " : "[Descending Insertion Sort] ";
        System.out.println("Key Comparisons: " + keyComparisons);

    }

    public static int[] hybridSortAuxiliary(int [] arr, int start, int end)
    {
        Sort.keyComparisons = 0;
        int[] sorted = HybridSort.hybridSort(arr,start,end);
        //System.out.println("Key Comparisons: " + keyComparisons);
        return sorted;
    }

    public static void insertionSort(int[] arr, boolean ascending)
    {
        Sort.keyComparisons = 0;
        if(ascending)
            InsertionSort.insertionSortAscending(arr);
        else
            InsertionSort.insertionSortDescending(arr);

        //Print out key comparisons
        String mode = ascending ? "[Ascending Insertion Sort] " : "[Descending Insertion Sort] ";
        System.out.println(mode + "Key Comparisons: " + keyComparisons);
    }

}
