package solution400_500;

class Node {
	public int i;
	public int j;
	public int val;
	public Node(int i, int j, int val) {
		this.i = i;
		this.j = j;
		this.val = val;
	}
	public boolean compare(Node n) {
		if (this.val > n.val) {
			return true;
		}
		return false;
	}
}

public class AdancedMinHeap {
	public Node[] a;
	public int size;
	public AdancedMinHeap(int len) {
		a = new Node[len];
		this.size = 0;
	}
	public void siftUp (int k) {
		while (k >= 0) {
			int parent = k;
			if (k % 2 == 0 && (k - 2 ) / 2 >= 0 && this.a[(k - 2) / 2].compare(this.a[parent])) {
				parent = (k - 2) / 2;
			}
			if (k % 2 == 1 && (k - 1 ) / 2 >= 0 && this.a[(k - 1) / 2].compare(this.a[parent])) {
				parent = (k - 1) / 2;
			}
			if (parent == k) {
				break;
			}
			Node temp = a[parent];
			a[parent] = a[k];
			a[k] = temp;
			
			k = parent;
		}
	}
	public void siftDown (int k) {
		while (k < this.size) {
			int smallest = k;
			if (k * 2 + 1 < this.size && !this.a[k * 2 + 1].compare(this.a[smallest])) {
				smallest = k * 2 + 1;
			}
			if (k * 2 + 2 < this.size && !this.a[k * 2 + 2].compare(this.a[smallest])) {
				smallest = k * 2 + 2;
			}
			if (smallest == k) {
				break;
			}
			Node temp = a[smallest];
			a[smallest] = a[k];
			a[k] = temp;
			
			k = smallest;
			
		}
	}
	
	public void add (Node v) {
		this.a[this.size] = v;
		this.size ++;
		siftUp (this.size - 1);
	}
	
	public Node pop () {
		if (this.size > 0) {
			Node temp = this.a[0];
			this.a[0] = this.a[this.size - 1];
			this.a[this.size - 1] = temp;
			this.size --;
			siftDown(0);
			return temp;
		}
		return null;
	}
}
