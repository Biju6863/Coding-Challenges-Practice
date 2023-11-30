import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class Ccwc{
    public static void main(String[] args) throws IOException {
        String a = args[0];
        File file = new File(args[1]);
        int lines =  countLines(file);

        

        System.out.println(" "+lines+" "+args[1]);

         
        }
        private static int countLines(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        }
        }
    }
    

