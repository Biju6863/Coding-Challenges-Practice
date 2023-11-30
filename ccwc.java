import java.io.File;
class ccwc {
    public static void main(String[] args) {
        String a = args[0];
        File file = new File(args[1]);
        Long Print_Length = file.length();

        

        System.out.println(" "+Print_Length+" "+args[1]);
    }
    
}
