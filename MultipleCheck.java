class MultipleCheck {
    int m, n;

    MultipleCheck(int m, int n) {
        this.m = m;
        this.n = n;
    }

    boolean isMultiple() {
        return m % n == 0;
    }

    public static void main(String[] args) {
        MultipleCheck mc = new MultipleCheck(20, 5);
        System.out.println("Is multiple: " + mc.isMultiple());
    }
}
