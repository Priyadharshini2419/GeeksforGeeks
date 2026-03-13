class GfG {

    static int st[];

    static void build(int v, int tl, int tr, int arr[]) {

        if (tl == tr) {
            st[v] = arr[tl];
            return;
        }

        int tm = (tl + tr) / 2;

        build(2 * v, tl, tm, arr);
        build(2 * v + 1, tm + 1, tr, arr);

        st[v] = Math.min(st[2 * v], st[2 * v + 1]);
    }

    public static int[] constructST(int arr[], int n) {

        st = new int[4 * n];

        build(1, 0, n - 1, arr);

        return st;
    }

    static int query(int v, int tl, int tr, int l, int r) {

        if (r < tl || tr < l)
            return Integer.MAX_VALUE;

        if (l <= tl && tr <= r)
            return st[v];

        int tm = (tl + tr) / 2;

        int left = query(2 * v, tl, tm, l, r);
        int right = query(2 * v + 1, tm + 1, tr, l, r);

        return Math.min(left, right);
    }

    public static int RMQ(int st[], int n, int l, int r) {

        return query(1, 0, n - 1, l, r);
    }
}