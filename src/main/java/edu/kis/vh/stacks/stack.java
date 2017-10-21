package edu.kis.vh.stacks;

import Stacks.StackList;

public class stack {

	private StackList stackList = new StackList();

	public stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}

	public stack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}

}
