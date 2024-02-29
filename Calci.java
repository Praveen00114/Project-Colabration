interface Calci{
    void int getSum(int n1,int n2);
}
    class AddCalsi implements Calci{
    public int getSum(int n1, int n2) {
        int ans = n1+n2;
        return ans;
    }
}