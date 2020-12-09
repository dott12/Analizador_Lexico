package tabla;

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
          

public class TipoToken {
    
    
    void LimpiarArchivo(){
    
    try{
        
       File archivo = new File("C:\\Users\\Ives\\Documents\\NetBeansProjects\\Tabla\\src\\tabla\\texto.txt");
     archivo.delete();
       /* FileWriter escribir = new FileWriter(archivo,true);
       
       String s = " ";
       
       escribir.write(s);
       escribir.close();
*/
       } catch(Exception e){
       }}
    
    
    /**************AVERIGUA EL TIPO DE ARCHIVO*************/
    
    String averiguarTipo(String s){
        String tipoVar="";
       
        
       
       boolean isNum = true;
       /////////VALIDACIÒN DE SI ES UN NUMERO
       
       try{
           Double.parseDouble(s);
       } catch (NumberFormatException e) {
       isNum = false;
       }
       
       if (isNum == true){
           
           ///////SI ES UN NUMERO
           tipoVar="NUMERO";
       
       } else {
           
           //////SI NO ES UN NUMERO
           
       tipoVar="nonum";
       }
       
       ///////PROCESO A HACER SI NO ES UN NUMERO
       
       if (isNum == false){
           
           s = s.toUpperCase();
           
        
         
      /********************TOMA LOS DATOS DEL TEXTO CON LOS TOKENS*****/
        
        int ArraySize=0;
        String[][] tokens = null;
        
        
try{
         
       FileReader lector = new FileReader("C:\\Users\\Ives\\Documents\\NetBeansProjects\\Tabla\\src\\tabla\\tipos.txt");
       BufferedReader contenido = new BufferedReader(lector);
       
       
      String content ="";
      String filePath= "C:\\Users\\Ives\\Documents\\NetBeansProjects\\Tabla\\src\\tabla\\tipos.txt";
      content = new String ( Files.readAllBytes(Paths.get(filePath)));
    
      
        ArrayList<String> wordArrayList = new ArrayList<String>();
        for (String word: content.split(" ")){
        wordArrayList.add(word);
        }
        ArraySize = wordArrayList.size();
 
        tokens = new String [ArraySize][2];
         
      for (int i=0;i<wordArrayList.size()*2;i=i+2){
          
          int h=i+1;
           
              tokens[i][0] = wordArrayList.get(i);         
              tokens[i][1] = wordArrayList.get(h); 
              
          h =0;
                    
    // System.out.println(i);
     // System.out.print(tokens[i][0] + " " + tokens[i][1] + " " + "\n" );
      }  
        //System.out.print(tipoVar);
        
       } catch(IndexOutOfBoundsException e){
           /**entra al catch arrrayout of boundary****/
           tipoVar="VARIABLE";
           
           boolean IdValido = true;
           
           char[] aCaracteres= s.toCharArray();
           
           switch (aCaracteres[0]){
               case'0':
               case'1':
               case'2':
               case'3':
               case'4':
               case'5':
               case'6':
               case'7':
               case'8':
               case'9':
               case'+':
               case'-':
               case'*':
               case'/':
               case'%':
               case'=':
               case'&':
               case'$':     
               case'_':      
                       
                   IdValido = false;
           }
           
           if (IdValido == false){
           tipoVar="VAR NO VALIDA";
           }
           
        /***sale del catch arrayoutofboundary****/   
       } catch (Exception e){
   
       }

           
//Validaciòn para ver de cual es cada una 
      for(int k=0;k<ArraySize;k++){
          
          if (s.equals(tokens[k][0])){
          tipoVar=tokens[k][1];
        } // Llave cierre if 
          
      } //Llave de for para verificar

      
            
  /********************FIN TOMA LOS DATOS******/

                   
       } /**FIN DE IF EL ISNUM ES FALSO***/
        
       
        
    return tipoVar;
    }
    
    
}
