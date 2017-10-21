package edu.kis.vh.stacks;

public class stackArray {

	private int[] ITEMS = new int[12];

	public int total = -1;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total]; 
	}
	//komentarze

	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}

}
