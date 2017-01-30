package edu.unionfind;

/**
 * Created by Svetlana_Zhevlakova on 1/26/2017.
 */
public abstract class AbstractUnionFind implements UnionFind
{
	public int[] id;

	public AbstractUnionFind(int N)
	{
		id = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
		}
	}

	@Override
	public void print()
	{
		System.out.println(this.getClass());
		for (int i = 0; i < id.length; i++)
		{
			System.out.print(i + "  ");
		}
		System.out.println("\n-----------------------------");
		for (int i = 0; i < id.length; i++)
		{
			System.out.print(id[i] + "  ");
		}
		System.out.println("\n\n");
	}
}
