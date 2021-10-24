package test.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import main.sort.SortAlgo;

class SortAlgorithmTest {
	@Nested
	class 挿入ソートアルゴリズム {
		@Test
		void _3_1の配列をソートすると_1_3の配列になること() {
			List<Integer> input = Arrays.asList(3, 1);
			List<Integer> result = SortAlgo.insertionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
		}

		@Test
		void _5_3_1の配列をソートすると_1_3_5の配列になること() {
			List<Integer> input = Arrays.asList(5, 3, 1);
			List<Integer> result = SortAlgo.insertionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
			assertEquals(5, (int) result.get(2));
		}

		@Test
		void _9_1_2_3_1の配列をソートすると1_1_2_3_9の配列になること() {
			List<Integer> input = Arrays.asList(9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.insertionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(9, (int) result.get(4));
		}

		@Test
		void _3_12_4_5_3_9_1_2_3_1の配列をソートすると1_1_2_3_3_3_4_5_9_12の配列になること() {
			List<Integer> input = Arrays.asList(3, 12, 4, 5, 3, 9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.insertionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(3, (int) result.get(4));
			assertEquals(3, (int) result.get(5));
			assertEquals(4, (int) result.get(6));
			assertEquals(5, (int) result.get(7));
			assertEquals(9, (int) result.get(8));
			assertEquals(12, (int) result.get(9));
		}
	}

	@Nested
	class バブルソートアルゴリズム {
		@Test
		void _3_1の配列をソートすると_1_3の配列になること() {
			List<Integer> input = Arrays.asList(3, 1);
			List<Integer> result = SortAlgo.bubbleSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
		}

		@Test
		void _5_3_1の配列をソートすると_1_3_5の配列になること() {
			List<Integer> input = Arrays.asList(5, 3, 1);
			List<Integer> result = SortAlgo.bubbleSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
			assertEquals(5, (int) result.get(2));
		}

		@Test
		void _9_1_2_3_1の配列をソートすると1_1_2_3_9の配列になること() {
			List<Integer> input = Arrays.asList(9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.bubbleSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(9, (int) result.get(4));
		}

		@Test
		void _3_12_4_5_3_9_1_2_3_1の配列をソートすると1_1_2_3_3_3_4_5_9_12の配列になること() {
			List<Integer> input = Arrays.asList(3, 12, 4, 5, 3, 9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.bubbleSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(3, (int) result.get(4));
			assertEquals(3, (int) result.get(5));
			assertEquals(4, (int) result.get(6));
			assertEquals(5, (int) result.get(7));
			assertEquals(9, (int) result.get(8));
			assertEquals(12, (int) result.get(9));
		}
	}

	@Nested
	class 選択ソートアルゴリズム {
		@Test
		void _3_1の配列をソートすると_1_3の配列になること() {
			List<Integer> input = Arrays.asList(3, 1);
			List<Integer> result = SortAlgo.selectionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
		}

		@Test
		void _5_3_1の配列をソートすると_1_3_5の配列になること() {
			List<Integer> input = Arrays.asList(5, 3, 1);
			List<Integer> result = SortAlgo.selectionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
			assertEquals(5, (int) result.get(2));
		}

		@Test
		void _9_1_2_3_1の配列をソートすると1_1_2_3_9の配列になること() {
			List<Integer> input = Arrays.asList(9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.selectionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(9, (int) result.get(4));
		}

		@Test
		void _3_12_4_5_3_9_1_2_3_1の配列をソートすると1_1_2_3_3_3_4_5_9_12の配列になること() {
			List<Integer> input = Arrays.asList(3, 12, 4, 5, 3, 9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.selectionSort(input);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(3, (int) result.get(4));
			assertEquals(3, (int) result.get(5));
			assertEquals(4, (int) result.get(6));
			assertEquals(5, (int) result.get(7));
			assertEquals(9, (int) result.get(8));
			assertEquals(12, (int) result.get(9));
		}
	}

	@Nested
	class シェルソートアルゴリズム {
		@Test
		void _3_1の配列をソートすると_1_3の配列になること() {
			List<Integer> input = Arrays.asList(3, 1);
			List<Integer> result = SortAlgo.shellSort(input, 4);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
		}

		@Test
		void _5_3_1の配列をソートすると_1_3_5の配列になること() {
			List<Integer> input = Arrays.asList(5, 3, 1);
			List<Integer> result = SortAlgo.shellSort(input, 4);
			assertEquals(1, (int) result.get(0));
			assertEquals(3, (int) result.get(1));
			assertEquals(5, (int) result.get(2));
		}

		@Test
		void _9_1_2_3_1の配列をソートすると1_1_2_3_9の配列になること() {
			List<Integer> input = Arrays.asList(9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.shellSort(input, 4);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(9, (int) result.get(4));
		}

		@Test
		void _3_12_4_5_3_9_1_2_3_1の配列をソートすると1_1_2_3_3_3_4_5_9_12の配列になること() {
			List<Integer> input = Arrays.asList(3, 12, 4, 5, 3, 9, 1, 2, 3, 1);
			List<Integer> result = SortAlgo.shellSort(input, 4);
			assertEquals(1, (int) result.get(0));
			assertEquals(1, (int) result.get(1));
			assertEquals(2, (int) result.get(2));
			assertEquals(3, (int) result.get(3));
			assertEquals(3, (int) result.get(4));
			assertEquals(3, (int) result.get(5));
			assertEquals(4, (int) result.get(6));
			assertEquals(5, (int) result.get(7));
			assertEquals(9, (int) result.get(8));
			assertEquals(12, (int) result.get(9));
		}
	}
}
