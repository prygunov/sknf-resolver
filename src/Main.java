public class Main {

    public static void main(String[] args){
        System.out.println("\nЗадание №3:");
        System.out.println("abce" + " f");
        for(int i = 0; i < 16; i++) {
            System.out.println(getSet(i) + " " + getIntFromBool(f(getSet(i))));
        }
    }

    public static int getIntFromBool(boolean b){
        if (b)
            return 1;
        else return 0;
    }

    public static String getSet(int i){
        if (i<2)
            return "000"+Integer.toBinaryString(i);
        else if (i<4)
            return "00"+Integer.toBinaryString(i);
        else if (i<8)
            return "0"+Integer.toBinaryString(i);
        else return Integer.toBinaryString(i);
    }

    private static boolean f(String set) {
        return !getBool(set.charAt(0)) && !getBool(set.charAt(3)) ||
                getBool(set.charAt(0)) && getBool(set.charAt(1)) && getBool(set.charAt(3)) ||
                getBool(set.charAt(0)) && getBool(set.charAt(2)) && getBool(set.charAt(3));
    }

    public static boolean getBool(char i){
        if (i=='1')
            return true;
        else return false;
    }
}

