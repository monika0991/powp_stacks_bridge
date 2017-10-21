package Stacks;

import edu.kis.vh.stacks.IStackCollecting;

public class StackArray implements IStackCollecting {

	private int[] ITEMS = new int[12];

	public int total = -1;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackCollecting#push(int)
	 */
	@Override
	public void pushElement(int i) {
		if (!full())
			ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackCollecting#isEmpty()
	 */
	@Override
	public boolean empty() {
		return total == -1;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackCollecting#isFull()
	 */
	@Override
	public boolean full() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackCollecting#top()
	 */
	@Override
	public int top() {
		if (empty())
			return -1;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackCollecting#pop()
	 */
	@Override
	public int pop() {
		if (empty())
			return -1;
		return ITEMS[total--];
	}

}
