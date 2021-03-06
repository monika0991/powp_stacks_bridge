package Stacks;

/**
 * Opcje Eclipse IDE uzyteczne w wykonaniu zadania 3.1.4:
 * 
 * ctrl+f
 * funkcja podpowiedzi
 * 
 */

public class StackList implements StackCollectingInterface {

	Node last;
	int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return -1;
		return last.value;
	}

	public int pop() {
		if (empty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
