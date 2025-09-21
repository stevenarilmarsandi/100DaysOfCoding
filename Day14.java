package pkg1_steven;

public class steven {
    public static void main(String[] args) {
        String Byte = "1";
        String Short = "2";
        String Int = "12";
        String Long = "123";
        String Float = "12.3";
        String Double = "123.3";
        String Char = "s";
        String Boolean = "true";

        byte b = Byte.parseByte(strByte);
        short s = Short.parseShort(strShort);
        int i = Integer.parseInt(strInt);
        long l = Long.parseLong(strLong);
        float f = Float.parseFloat(strFloat);
        double d = Double.parseDouble(strDouble);
        char c = strChar.charAt(0); // ambil karakter pertama dari string
        boolean bool = Boolean.parseBoolean(strBoolean);

        
        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : " + c);
        System.out.println("boolean : " + bool);
    }
}
