public class Operators {
    public static boolean isOdd(int n){
        return n%2 !=0;
    }
    public static boolean isName(String name){
       return name!=null && name.length()>3;
    }
    public static void main(String[] args) {
        int total = 17;
        int count = 4;

        System.out.println("wrong: "+ total/count);
        System.out.println("correct: "+ (double)total/count);
        System.out.println("is 3 odd? " + isOdd(3));
        System.out.println("is -3 odd? " + isOdd(-3));

        System.out.println("is null a valid name? " + isName(null));
        System.out.println("is 'John' a valid name? " + isName("John"));
        System.out.println("is 'Joe' a valid name? " + isName("Joe"));
    }
}
