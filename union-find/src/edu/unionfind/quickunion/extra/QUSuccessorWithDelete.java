package edu.unionfind.quickunion.extra;

import edu.unionfind.quickunion.QuickUnion;
import edu.unionfind.quickunion.WeightedQuickUnion;
import edu.unionfind.quickunion.WeightedQuickUnionPathCompression;

import java.util.Arrays;

/**
 * Created by Svetlana on 28.01.2017.
 */
public class QUSuccessorWithDelete {

    private QuickUnion qu;

    public QUSuccessorWithDelete(int N) {
        qu = new QuickUnion(N);
    }

    public void remove(int element){
        qu.union(element, element +1);
    }

    public int successor(int elemet){
        System.out.println(Arrays.toString(qu.id));
        return qu.root(elemet + 1);
    }
}
