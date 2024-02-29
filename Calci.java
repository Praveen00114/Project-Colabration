interface Calci{
 int getSum(int n1,int n2);
}
class divimpl implements Calci{
   public int getSum(int n1,int n2){
        return n1/n2;
    }
}
class SubCalsi implements Calci{
    public int getSum(int n1, int n2) {
        int res = n1-n2;
        return res;
    };
}

class multicalsi implements calci{
public int getsum(int n1,int n2);
return n1*n2;
}

