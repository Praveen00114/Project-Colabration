interface Calci{
void int getSum(int n1,int n2);
}
class SubCalsi implements Calci{
    public int getSum(int n1, int n2) {
        int res = n1-n2;
        return res;
    };
}



