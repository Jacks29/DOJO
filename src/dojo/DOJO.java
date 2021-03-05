/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

        import java.util.Scanner;
        import java.io.FileInputStream;
        import java.io.EOFException;
        import java.io.IOException;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.util.StringTokenizer;
        

public class DOJO {
   
    public static void main(String args[]) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\alves\\Desktop\\Java\\DOJO\\src\\dojo\\input.txt")), StandardCharsets.UTF_8);
        
        content = content.replaceAll("([ \t]*\\/\\/.*)", "");
        content = content.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "");
        StringTokenizer st = new StringTokenizer(content,"\\r?\\n|\\r");
        while (st.hasMoreElements()) {
            crunchifyPrint("StringTokenizer Output: " + st.nextElement());
         }
        System.out.println(st);
        
    }
    private static void crunchifyPrint(String print) {
        System.out.println(print);
    }
    
    
}
      
