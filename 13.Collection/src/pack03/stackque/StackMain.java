package pack03.stackque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
//		last-in-first-out(LIFO) : 후입선출 자료구조
//		사용빈도가 낮음
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(10);
		intStack.push(20);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());

//		first-in-first-out(FIFO) : 선입선출 자료구조
		Queue<Integer> intQueue = new LinkedList<Integer>(); // LinkedList는 interface구조 Queue를 상속받음
		intQueue.offer(10);
		intQueue.offer(20);
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());

//		DEQUE <- 양쪽으로 빼는게 가능한 구조
	}
}
