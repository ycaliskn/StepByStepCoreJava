package day16Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception02 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        //satirSatirOku();

        satirSatirOku2();






    }

    public static void satirSatirOku() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src/main/java/day16Abstraction/File1.txt"));

        String str=br.readLine();
        while (str!=null){
            System.out.println(str);
            str=br.readLine();
        }
    }

    public static void satirSatirOku2()  {
        BufferedReader br= null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/day16Abstraction/File1.txt"));

        String str=br.readLine();
        while (str!=null){
            System.out.println(str);
            str=br.readLine();
        }

        } catch (FileNotFoundException e) {
            System.out.println("Adres bilgisi hatalı veya adreste dosya bulunmuyor...."+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayan chracter mevcut...."+e.getMessage());
        }


    }
}
