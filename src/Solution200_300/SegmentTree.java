package Solution200_300;

public class SegmentTree {
	public int start;
	public int end;
	public int sum;
	public SegmentTree left;
	public SegmentTree right;
	public SegmentTree () {}
	public SegmentTree (int start, int end) {
		this.start = start;
		this.end = end;
		this.sum = sum;
		this.left = null;
		this.right = null;
	}
}
