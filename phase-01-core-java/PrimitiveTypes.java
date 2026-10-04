public class PrimitiveTypes {
    public static void main(String[] args){
        byte byte_Val = 10;
        short short_val = 20;
        int int_val = 30;
        long long_val = 40;
        float float_val = 50.0f;
        double double_val = 60.0;
        char char_val = 'A';
        boolean boolean_val = true;

        System.out.println("byte:" +byte_Val);
        System.out.println("short:" +short_val);
        System.out.println("int:" +int_val);
        System.out.println("long:" +long_val);
        System.out.println("float:" +float_val);
        System.out.println("double:" +double_val);
        System.out.println("char:" +char_val);
        System.out.println("boolean:" +boolean_val);

        int max = Integer.MAX_VALUE;
        System.out.println("Max value before adding 1: "+max);
        max = max + 1;
        System.out.println("Max value after adding 1: "+max);
    }
}
