package edu.unionfind.quickunion;

/**
 * Created by Svetlana on 28.01.2017.
 */
public class WeightedQuickUnion extends QuickUnion {

    protected int[] size;

    public WeightedQuickUnion(int N) {
        super(N);
        size = new int[N];
        for(int i = 0; i < N; i++){
            size[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot == qRoot) {
            return;
        }
        if (size[pRoot] < size[qRoot]) {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        } else {
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }
    }
}
