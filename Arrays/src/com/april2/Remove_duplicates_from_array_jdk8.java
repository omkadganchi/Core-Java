package com.april2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicates_from_array_jdk8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		List<Integer> uniqueNum = numbers.stream().distinct().collect(Collectors.toList());
		
		//stream() - convert list to stream
		//distinct() - only unique elements can retained
		//collect(Collectors.toList()) - collects the result back in the list 
		
			System.out.println(uniqueNum);
		
	}

}
