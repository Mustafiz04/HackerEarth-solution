import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc =  new Scanner(System.in);
        long d = sc.nextLong();
        long oc = sc.nextLong();
        long of = sc.nextLong();
        long od = sc.nextLong();
        long cs = sc.nextLong();
        long cb = sc.nextLong();
        long cm = sc.nextLong();
        long cd = sc.nextLong();
        long on =  online(d,oc,of,od);
        long off = taxi(d,cs,cb,cm,cd);
        if(on <= off){
            System.out.println("Online Taxi");
        }else{
            System.out.println("Classic Taxi");
        }
    }
    
    public static long online(long d, long oc, long of, long od){
        return oc + (d-of)*od;
    }
    
    public static long taxi(long d, long cs, long cb, long cm, long cd){
        return cb + (d/cs)*cm + d*cd;
    }
}
