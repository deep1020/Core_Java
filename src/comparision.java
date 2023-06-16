public class comparision {
    public static void main(String[] args) {
        Integer a=1000,b=1000;
        Integer c=100,d=100;
        System.out.println((a==b) +" "+(c==d));  // a.equals(b) -> true
    }
}
//    Comparing objects in Java should be evaluated using Object1.equals(object2)
//        If two objects are pointing to different references, they are not equal in terms of "==".
//        1000 == 1000 is false
//        But, they are equal in terms of object1.equal(object2)
//        However, IntegerCache.java caches all Integer objects between -128 and +127
//        Therefore, Object Integer values in the range given above would be returned from the Cache.
//        100 == 100 is true
