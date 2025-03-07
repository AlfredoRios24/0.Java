
public class Simple {
    public static void main(String[] args) {
       int num = 21;
        System.out.println("Main Simple " + num);
        byte unByte = 127;
        unByte = 0b01010101;
        System.out.println("Un Byte " + unByte);
        short unShort = 32000;
        int unInt = 101010;
        unInt = 0xFFFF;
        unInt = -unInt;
        unInt = -unInt;
        unInt++;
        System.out.println("unInt " + unInt++);
        long unLong = 2_300_000_000L;
        System.out.println("unLOng " + unLong);
        
        float unFloat = 73829.234F;
        double unDouble = 29272.67;
        System.out.println("UnFloat " + unFloat);
        System.out.println("UnDouble " + unDouble);
        
        char unChar = 'A';
        unChar ='\u9331';
        System.out.println("unChar " + unChar);
        
        boolean unBoolean = true;
        System.out.println("unBoolean " + !unBoolean);
        System.out.println("== " + ( unInt == 65537 && unInt> 32_000));
        String strInt = (unInt == 65537) ? "Iguales" : "No Iguales";
        System.out.println(strInt);
        Object obj = new String("Hola");
        if(obj instanceof String){
            String str = (String) obj;
        }
        
        
        if (unInt == 65537){
            System.out.println("Iguales");
        }else{
            System.out.println("No Iguales");
        }
        char color = 'R';
        String colorName;
        switch(color){
            case 'R':
                colorName="Red";
                break;
            case 'B':
                colorName="Blue";
                break;
            default:
                colorName="NA";                 
        }
        System.out.println(colorName);
        
    }
    
    
    public static void main2(){
       int num = 21;
    }
}
