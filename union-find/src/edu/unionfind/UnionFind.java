package edu.unionfind;

/**
 * Created by Svetlana_Zhevlakova on 1/26/2017.
 */
public interface UnionFind
{
	public boolean connected(int p, int q);
	public void union(int p, int q);
	public void print();
}
