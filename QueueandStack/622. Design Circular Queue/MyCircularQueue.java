class MyCircularQueue {

		int[] queue;
		int head;
		int tail;
		int size;

		/** Initialize your data structure here. Set the size of the queue to be k. */
		public MyCircularQueue(int k) {
			queue = new int[k];
			Arrays.fill(queue, -1);
			head = -1;
			tail = -1;
			size = k;
		}

		/**
		 * Insert an element into the circular queue. Return true if the operation is
		 * successful.
		 */
		public boolean enQueue(int value) {

			if (isFull()) {
				return false;
			}

			if (isEmpty()) {
				queue[0] = value;
				head = 0;
				tail = 0;
				return true;
			} else {
				if (tail == size - 1) {
					tail = 0;
					queue[0] = value;
				} else {
					queue[tail + 1] = value;
                    tail = tail + 1;
				}
			}
			return true;
		}

		/**
		 * Delete an element from the circular queue. Return true if the operation is
		 * successful.
		 */
		public boolean deQueue() {
			if (isEmpty()) {
				return false;
			}

			if (tail == head) {
				queue[head] = -1;
				tail = -1;
				head = -1;
			} else {
				if (head == size - 1) {
					queue[head] = queue[0];
					head = 0;
				} else {
					queue[head] = queue[head + 1];
					head = head + 1;
				}
			}

			return true;
		}

		/** Get the front item from the queue. */
		public int Front() {
			if (!isEmpty()) {
				return queue[head];
			} else {
				return -1;
			}

		}

		/** Get the last item from the queue. */
		public int Rear() {
			if (!isEmpty()) {
				return queue[tail];
			} else {
				return -1;
			}
		}

		/** Checks whether the circular queue is empty or not. */
		public boolean isEmpty() {
			if (head == -1 && tail == -1) {
				return true;
			}
			return false;
		}

		/** Checks whether the circular queue is full or not. */
		public boolean isFull() {
			if (isEmpty()) {
				return false;
			} else if (head <= tail && (tail - head + 1 == size)) {
				return true;
			} else if (head > tail && (tail - head + 1) == 0) {
				return true;
			}
			return false;
		}
	}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */