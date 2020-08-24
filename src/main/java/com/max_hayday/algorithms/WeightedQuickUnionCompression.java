package com.max_hayday.algorithms;

public class WeightedQuickUnionCompression {
    private int[] id;
    private int[] sz;

    /**
     * set id of each object to itself
     * (M array accesses)
     *
     * @param N
     */
    public WeightedQuickUnionCompression(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    /**
     * chase parent pointers until reach root
     * (depth of i array accesses)
     *
     * @param i
     * @return
     */
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    /**
     * check if p and q have same root
     * (depth of p and q array accesses)
     *
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * change root of p to point to root of q
     * (depth of p and q array accesses)
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }

    }
}
