/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

        import java.io.IOException;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.util.Arrays;
        

public class DOJO {
   
    public static void main(String args[]) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\alves\\Desktop\\Java\\DOJO\\src\\dojo\\input.txt")), StandardCharsets.UTF_8);
        
        content = content.replaceAll("([ \t]*\\/\\/.*)", "");
        content = content.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "");
        String lines[] = content.split("\\r?\\n");

        System.out.println(Arrays.toString(lines));
        
    }
    
    
}
      
