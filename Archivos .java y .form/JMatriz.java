/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;



/**
 *
 * @author Ives
 */
public class JMatriz extends javax.swing.JFrame {
    
     DefaultTableModel stQ= new DefaultTableModel();

    /**
     * Creates new form JMatriz
     */
    public JMatriz() {
        initComponents();
         String [] estados = new String []{"TOKEN","ESTADO","ACEPT"};
        stQ.setColumnIdentifiers(estados);
        tblStatus.setModel(stQ);
        
      
        matrizT objM = new matrizT();
        int TamañoC = 0;
        
        try{
        FileReader lector = new FileReader("C:\\Users\\Ives\\Documents\\NetBeansProjects\\Tabla\\src\\tabla\\texto.txt");
       BufferedReader contenido = new BufferedReader(lector);
       
       String contentM ="";
      String filePath= "C:\\Users\\Ives\\Documents\\NetBeansProjects\\Tabla\\src\\tabla\\texto.txt";
      contentM = new String ( Files.readAllBytes(Paths.get(filePath)));
      
      objM.FillMatriz(contentM);
        
        } catch (Exception e){
        }
        
        int sizeV=objM.RetornarSize();
        int h=0;
        
        for (int i=0;i<sizeV; i++){
         
           stQ.addRow(new Object[]{      
       
           objM.retornarWord(i,0),objM.retornarQ(i,1), objM.retornarST(i,2) 
                   
           });
           
           }
          
        
      
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatus = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrar();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }

    void mostrar(){
    new JMatriz().setVisible(true);
    }
    
    void limpiartabla(){
    }
    
    void cerrar(){
        //System.exit(1);
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStatus;
    // End of variables declaration//GEN-END:variables
}