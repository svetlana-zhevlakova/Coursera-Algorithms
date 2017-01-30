package edu.unionfind.quickunion.extra;

import edu.unionfind.quickunion.WeightedQuickUnion;

import java.util.Arrays;

/**
 * Created by Svetlana on 28.01.2017.
 */
public class QUWithFindMax extends WeightedQuickUnion {

    protected int[] maximum;

    public QUWithFindMax(int N) {
        super(N);
        maximum = new int[N];
        for(int i = 0; i < N; i++){
            maximum[i] = i;
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
            if (maximum[pRoot] > maximum[qRoot]) {
                maximum[qRoot] = maximum[pRoot];
            }
        } else {
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
            if (maximum[qRoot] > maximum[pRoot]) {
                maximum[pRoot] = maximum[qRoot];
            }
        }
    }

    public int getMaximumOfComponent(int element) {
        return maximum[root(element)];
    }
}
