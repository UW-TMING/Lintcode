package solution400_500;

public class MinHeap {
	public int[] a;
	public int size;
	public MinHeap (int len) {
		a = new int[len];
		this.size = 0;
	}
	public void siftUp (int k) {
		while (k >= 0) {
			int parent = k;
			if (k % 2 == 0 && (k - 2 ) / 2 >= 0 && this.a[(k - 2) / 2] > this.a[parent]) {
				parent = (k - 2) / 2;
			}
			if (k % 2 == 1 && (k - 1 ) / 2 >= 0 && this.a[(k - 1) / 2] > this.a[parent]) {
				parent = (k - 1) / 2;
			}
			if (parent == k) {
				break;
			}
			int temp = a[parent];
			a[parent] = a[k];
			a[k] = temp;
			
			k = parent;
		}
	}
	public void siftDown (int k) {
		while (k < this.size) {
			int smallest = k;
			if (k * 2 + 1 < this.size && this.a[k * 2 + 1] < this.a[smallest]) {
				smallest = k * 2 + 1;
			}
			if (k * 2 + 2 < this.size && this.a[k * 2 + 2] < this.a[smallest]) {
				smallest = k * 2 + 2;
			}
			if (smallest == k) {
				break;
			}
			int temp = a[smallest];
			a[smallest] = a[k];
			a[k] = temp;
			
			k = smallest;
			
		}
	}
	
	public void add (int val) {
		this.a[this.size] = val;
		this.size ++;
		siftUp (this.size - 1);
	}
	
	public Integer pop () {
		if (this.size > 0) {
			int temp = this.a[0];
			this.a[0] = this.a[this.size - 1];
			this.a[this.size - 1] = temp;
			this.size --;
			siftDown(0);
			return temp;
		}
		return null;
	}
	
	public void printN () {
		for (int i = 0; i < this.size; i ++) {
			System.out.print (this.a[i] + " ");
		}
		System.out.println ();
	}
}
