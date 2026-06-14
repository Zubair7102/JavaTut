package Streams_Java8_Tut.StreamsTut;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        /* A Parallel Stream is a Stream that processes data using multiple threads simultaneously instead of a single thread. */
        /* A Type of Stream that enables parallel processing of elements
        * Allowing multiple threads to process parts of stream simultaneously
        * this can significantly improve performances for large data sets
        * workload is distributed across multi[ple threads
         */
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x-> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(x-> factorial(x)).toList();
        List<Long> factorialList1 = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with Stream " + (endTime - startTime) + " ms");

         startTime = System.currentTimeMillis();
         factorialList = list.parallelStream().map(x-> factorial(x)).toList();
         factorialList1 = list.parallelStream().map(ParallelStream::factorial).toList();
         endTime = System.currentTimeMillis();
        System.out.println("Time taken with Parallel Stream " + (endTime - startTime) + " ms");
    }

    private static long factorial(int n)
    {
        long result = 1;
        for(int i =2; i<=n; i++)
        {
            result += i;
        }
        return result;
    }
}
