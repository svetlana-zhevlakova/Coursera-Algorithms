package edu.unionfind.quickfind;

import java.util.Arrays;

import edu.unionfind.AbstractUnionFind;
import edu.unionfind.UnionFind;

/**
 * Created by Svetlana_Zhevlakova on 1/25/2017.
 */
public class QuickFind extends AbstractUnionFind
{
	public QuickFind(int N)
	{
		super(N);
	}

	@Override
	public boolean connected(int p, int q)
	{
		return id[p] == id[q];
	}

	@Override
	public void union(int p, int q)
	{
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
		{
			if (id[i] == pid)
			{
				id[i] = qid;
			}

		}
	}
}
