package main.sort;

import java.util.ArrayList;
import java.util.List;

public class SortList {
	private List<Integer> value;
	private long sortingTime;

	public SortList(List<Integer> input) {
		this.value = new ArrayList<>(input);
	}

	public void insertionSort() {
		this.value = SortAlgo.insertionSort(value);
	}

	public void bubbleSort() {
		this.value = SortAlgo.bubbleSort(value);
	}

	public void selectionSort() {
		this.value = SortAlgo.selectionSort(value);
	}

	public void shellSort(int diff) {
		long startTime = System. currentTimeMillis();
		this.value = SortAlgo.shellSort(value, diff);
		long endTime = System. currentTimeMillis();
		this.sortingTime = endTime - startTime;
	}

	public int get(int index) {
		return this.value.get(index);
	}

	public long sortingTime() {
		System.out.println("経過時間:" + sortingTime + "ミリ秒");
		return sortingTime;
	}


}
