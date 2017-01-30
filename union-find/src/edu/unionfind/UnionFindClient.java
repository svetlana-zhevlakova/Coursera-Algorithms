package edu.unionfind;


import edu.unionfind.quickfind.QuickFind;
import edu.unionfind.quickfind.QuickFindCorrupted;
import edu.unionfind.quickunion.QuickUnion;
import edu.unionfind.quickunion.extra.QUSuccessorWithDelete;
import edu.unionfind.quickunion.extra.QUWithFindMax;

/**
 * Created by Svetlana_Zhevlakova on 1/25/2017.
 */
public class UnionFindClient
{
	public static void main(String[] args)
	{
		UnionFind quickfind = new QuickFind(10);
		unite(quickfind);
		//quickfind.print();

		UnionFind quickFindCorrupted = new QuickFindCorrupted(10);
		unite(quickFindCorrupted);
		//quickFindCorrupted.print();

		UnionFind quickUnion = new QuickUnion(10);
		unite(quickUnion);
		//quickUnion.print();

		UnionFind quWithFindMax = new QUWithFindMax(10);
		unite(quWithFindMax);
		//quWithFindMax.print();
		//System.out.println(((QUWithFindMax)quWithFindMax).getMaximumOfComponent(2));

		QUSuccessorWithDelete quSuccessorWithDelete = new QUSuccessorWithDelete(10);
		quSuccessorWithDelete.remove(2);
		quSuccessorWithDelete.remove(4);
		quSuccessorWithDelete.remove(5);
		quSuccessorWithDelete.remove(0);
		System.out.println(quSuccessorWithDelete.successor(4));
		System.out.println(quSuccessorWithDelete.successor(0));

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
