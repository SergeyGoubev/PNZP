package exercise2;  

import java.util.Scanner; 

import accumulators.interfaces.IAccumulator;  
import accumulators.impl.*;  

public class Exercise2 {        
    public static void main(String[] args)  
{  
    int n;  
	          
    Scanner console = new Scanner(System.in);  
    System.out.print("Введите размер массива: ");  
    n = console.nextInt();  
	          
    int[] arr = new int[n];  
	          
    System.out.print("\tВведите элементы массива: ");  
    for(int i = 0; i < arr.length; ++i)  
        arr[i] = console.nextInt();  
	          
    IAccumulator accumulator;
	          
    accumulator = new SumAccumulator();  
    System.out.print("\nСумма элементов массива: " + accumulator.fold(arr));  
	          
    accumulator = new MultiplyAccumulator();  
    System.out.println("\nПроизведение элементов массива: " + accumulator.fold(arr));
}  
}  