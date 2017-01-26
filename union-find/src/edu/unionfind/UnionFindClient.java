package edu.unionfind;

import edu.unionfind.quickfind.QuickFindCorrupted;
import edu.unionfind.quickfind.QuickFind;
import edu.unionfind.quickunion.QuickUnion;

/**
 * Created by Svetlana_Zhevlakova on 1/25/2017.
 */
public class UnionFindClient
{
	public static void main(String[] args)
	{
		UnionFind quickfind = new QuickFind(10);
		unite(quickfind);
		quickfind.print();

		UnionFind quickFindCorrupted = new QuickFindCorrupted(10);
		unite(quickFindCorrupted);
		quickFindCorrupted.print();

		UnionFind quickUnion = new QuickUnion(10);
		unite(quickUnion);
		quickUnion.print();
	}

	private static void unite(UnionFind unionFind)
	{
		unionFind.union(4, 3);
		unionFind.union(3, 8);
		unionFind.union(6, 5);
		unionFind.union(9, 4);
		unionFind.union(2, 1);
		unionFind.union(5, 0);
		unionFind.union(7, 2);
		unionFind.union(6, 1);
	}
}
