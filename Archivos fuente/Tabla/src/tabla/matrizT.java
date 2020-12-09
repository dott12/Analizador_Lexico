package tabla;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class matrizT {
       
      
      String[][] tokensM=null;
        int ArraySizeM=0;
    
    
    void FillMatriz(String F){
         
      
         ArrayList<String> wordArrayListM = new ArrayList<String>();
        for (String word: F.split(" ")){
        wordArrayListM.add(word);
        }
        
        ArraySizeM = wordArrayListM.size();
 
        tokensM = new String [ArraySizeM][3];
        
        for (int i=0; i<=ArraySizeM;i++){
            tokensM[i][0] = wordArrayListM.get(i);
            
            tokensM[i][1]="q"+i;
            
            if (i==ArraySizeM-1){
            tokensM[i][2]="ACEPTAR";} 
            else {
            tokensM[i][2]="ERROR";}
            
            
        }
        
}
    
    String retornarWord(int i, int j){
    String sW=null;
    sW=tokensM[i][j];
    return sW;}
    
     String retornarQ(int i, int j){
         String sQ=null;
         sQ=tokensM[i][j];
         return sQ;
     }
     
     String retornarST(int i, int j){
         String finalST= null;
         finalST=tokensM[i][j];
         return finalST;
     }
     
     int RetornarSize(){
         
         
     return ArraySizeM;}
    
}
