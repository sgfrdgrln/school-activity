

import java.util.Arrays;
import java.util.List;

// lower bounded wildcards - restricts the unknown type or a super type of that type.
// wildcard character ("?") followed by the "super" keyword and its lower bound.
// ex: (List<? super Integer> listName) // for lower bound
// ex: (List<?> listName) // for unbounded wildcard it can be used to represent any type
// ex: (List<? extends Number> listName) // for upper bounded wildcard has a "extends" keyword

class Wildcards {
	public static void main(String[] args)
	{
		// Lower Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list1);

		// Number list
		List<Number> list2 = Arrays.asList(8, 9, 10, 11);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list2);

        // String list
        List<String> list3 = Arrays.asList("Bob", "John", "Karl", "Mike");

        // Double list
        List<Double> list4 = Arrays.asList(2.2, 1.1, 10.2, 13.5);

        // String list object is being passed
		printOnlyStringClassorSuperClass(list3);
        printAnyList(list3);
        printAnyList(list2);
        printAnyNumberList(list1);
        printAnyNumberList(list4);
	}

	public static void printOnlyIntegerClassorSuperClass(
		List<? super Integer> list)
	{
        System.out.println("lower bounded wildcard: "+list);
	}
    public static void printOnlyStringClassorSuperClass(
		List<? super String> list)
	{
        

		System.out.println("lower bounded wildcard: "+list);
	}
    public static void printAnyList(List<?> list) {
        System.out.print("unbounded wildcard: ");
        for(Object l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
    public static void printAnyNumberList(List<? extends Number> numberList) {
        System.out.print("upper bounded wildcard: ");
        for(Number n : numberList) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
