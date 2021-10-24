package main.sort;

import java.util.ArrayList;
import java.util.List;

public class SortAlgo {

	public static List<Integer> insertionSort(List<Integer> input) {
		System.out.println("<--- ソート開始 --->");
		System.out.println(input);
		List<Integer> sortTargetList = new ArrayList<Integer>(input);

		for (int index = 1; index < sortTargetList.size(); index++) {
			int currentSortingTarget = sortTargetList.get(index);
			int alreadySortedListIndex = index - 1;
			while (alreadySortedListIndex >= 0 && sortTargetList.get(alreadySortedListIndex) > currentSortingTarget) {
				sortTargetList.set(alreadySortedListIndex + 1, sortTargetList.get(alreadySortedListIndex));
				alreadySortedListIndex--;
			}
			sortTargetList.set(alreadySortedListIndex + 1, currentSortingTarget);
			System.out.println(sortTargetList);
		}
		System.out.println("<--- ソート終了 --->");
		return sortTargetList;
	}

	public static List<Integer> bubbleSort(List<Integer> input) {
		System.out.println("<--- ソート開始 --->");
		System.out.println(input);
		List<Integer> sortTargetList = new ArrayList<Integer>(input);
		boolean shouldContinueSort = true;
		for (int i = 0; shouldContinueSort; i++) {
			shouldContinueSort = false;
			for (int j = sortTargetList.size() - 1; j >= i + 1; j--) {
				if(sortTargetList.get(j) < sortTargetList.get(j-1)) {
					int greater = sortTargetList.get(j-1);
					int less = sortTargetList.get(j);
					sortTargetList.set(j, greater);
					sortTargetList.set(j-1, less);
					shouldContinueSort=true;
					System.out.println(sortTargetList);
				}
			}
		}

		System.out.println("<--- ソート終了 --->");
		return sortTargetList;
	}

	public static List<Integer> selectionSort(List<Integer> input) {
		System.out.println("<--- ソート開始 --->");
		System.out.println(input);
		List<Integer> sortTargetList = new ArrayList<Integer>(input);
		for (int i = 0; i < sortTargetList.size()-1; i++) {
			int minValueIndex = i;
			for (int j = i; j < sortTargetList.size(); j++) {
				if(sortTargetList.get(j) < sortTargetList.get(minValueIndex)) {
					minValueIndex = j;
				}
			}
			int currentSortTarget = sortTargetList.get(i);
			int minValue = sortTargetList.get(minValueIndex);
			sortTargetList.set(i, minValue);
			sortTargetList.set(minValueIndex, currentSortTarget);
			System.out.println(sortTargetList);
		}

		System.out.println("<--- ソート終了 --->");
		return sortTargetList;
	}
}
