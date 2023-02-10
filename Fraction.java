
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        return (topN*1.0/btmN)+"";
    }
    public void addFraction(Fraction f){
        if(btmN==f.btmN){
            topN+=f.topN;
        }else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        Fraction j = new Fraction();Fraction k = new Fraction();
        j.btmN = btmN;j.topN = topN;
        k.topN = x.topN;k.btmN = x.btmN;
        j.LowestTermFrac();k.LowestTermFrac();
        return j.topN%k.topN == 0 && j.btmN%k.btmN == 0;
    }
    public void LowestTermFrac(){
        int x=topN, y=btmN, z;
        while(y!=0){
            z = y;y = x%y;
            x = z;
        }
        topN /= x;btmN /= x;
    }
}
