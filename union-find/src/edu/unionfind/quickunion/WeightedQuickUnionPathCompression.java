package edu.unionfind.quickunion;

/**
 * Created by Svetlana on 28.01.2017.
 */
public class WeightedQuickUnionPathCompression extends WeightedQuickUnion {

    public WeightedQuickUnionPathCompression(int N) {
        super(N);
    }

    @Override
    public int root(int element) {
        while (element != id[element])
        {
            id[element] = id[id[element]];
            element = id[element];
        }
        return element;
    }
}
