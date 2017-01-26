package edu.unionfind.quickunion;

import edu.unionfind.AbstractUnionFind;

/**
 * Created by Svetlana_Zhevlakova on 1/26/2017.
 */
public class QuickUnion extends AbstractUnionFind
{
	public QuickUnion(int N)
	{
		super(N);
	}

	@Override
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}

	@Override
	public void union(int p, int q)
	{
		int pRoot = root(p);
		int qRoot = root(q);
		id[pRoot] = qRoot;
	}

	private int root(int element)
	{
		while (element != id[element])
		{
			element = id[element];
		}
		return element;
	}
}
