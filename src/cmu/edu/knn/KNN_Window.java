/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmu.edu.knn;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zimo
 */
public class KNN_Window extends javax.swing.JFrame {

    /**
     * Creates new form KNNJFrame
     */
    public KNN_Window() {
        initComponents();
//        ArrayList<DataSet> train = new ArrayList<DataSet>();
//        ArrayList<DataSet> test = new ArrayList<DataSet>();
//        
//    public ArrayList<DataSet> getTrainSet() {
//            return train;
//        }
//    public void setTrainSet(ArrayList<DataSet> train) {
//        
//    } 
//    public ArrayList<DataSet> getTestSet() {
//        return test;
//    }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        knnPanel = new javax.swing.JPanel();
        trainFile = new javax.swing.JButton();
        testFile = new javax.swing.JButton();
        inputK = new javax.swing.JTextField();
        trainPath = new javax.swing.JTextField();
        testPath = new javax.swing.JTextField();
        predictFile = new javax.swing.JButton();
        predictPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayPanel = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        kValue = new javax.swing.JTextField();
        predict = new javax.swing.JButton();
        plotPoint = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setTitle("KNN-zimoz");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        knnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("KNN Algorithm"));
        knnPanel.setToolTipText("KNN Algorithm");

        trainFile.setText("Choose File");
        trainFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainFileActionPerformed(evt);
            }
        });

        testFile.setText("Choose File");
        testFile.setToolTipText("");
        testFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testFileActionPerformed(evt);
            }
        });

        inputK.setToolTipText("");
        inputK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKActionPerformed(evt);
            }
        });

        trainPath.setText("Train File Path");
        trainPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainPathActionPerformed(evt);
            }
        });

        testPath.setText("Test File Path");
        testPath.setToolTipText("");
        testPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testPathActionPerformed(evt);
            }
        });

        predictFile.setText("Choose Location");
        predictFile.setToolTipText("");
        predictFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictFileActionPerformed(evt);
            }
        });

        predictPath.setText("Prediction File Path");
        predictPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictPathActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose train file:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Enter K:");

        jLabel3.setText("Choose test file:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Save prediction to:");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout knnPanelLayout = new javax.swing.GroupLayout(knnPanel);
        knnPanel.setLayout(knnPanelLayout);
        knnPanelLayout.setHorizontalGroup(
            knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(knnPanelLayout.createSequentialGroup()
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(knnPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(knnPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(29, 29, 29)
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(knnPanelLayout.createSequentialGroup()
                        .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(predictPath, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainPath, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testPath, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(predictFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(testFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trainFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(knnPanelLayout.createSequentialGroup()
                        .addComponent(inputK, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        knnPanelLayout.setVerticalGroup(
            knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(knnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainFile)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testFile)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(knnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(predictPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(predictFile))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        displayPanel.setColumns(20);
        displayPanel.setRows(5);
        displayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Prediction Rseult"));
        displayPanel.setFocusable(false);
        jScrollPane2.setViewportView(displayPanel);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        kValue.setText("K Value");
        kValue.setFocusable(false);

        predict.setText("Predict");
        predict.setToolTipText("");
        predict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictActionPerformed(evt);
            }
        });

        plotPoint.setText("Plot");
        plotPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plotPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotPointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(knnPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(predict, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kValue)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plotPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(knnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(kValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(clear)
                        .addGap(37, 37, 37)
                        .addComponent(predict)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(plotPoint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)))
                .addGap(41, 41, 41))
        );

        knnPanel.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("KNN Algorithm");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trainFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Only csv", new String[]{"csv"});
        chooser.setFileFilter(filter);
        chooser.setSelectedFile(new File("/home/zimo/workspace/KNN-zimoz/resources/IrisTrain.csv"));
        int f = chooser.showOpenDialog(this);
        String trainset = chooser.getSelectedFile().getAbsolutePath();
        
        if(f == JFileChooser.APPROVE_OPTION) {
        System.out.println("You chose to open this file: " + trainset);
        
        }
        
        trainPath.setText(trainset);
        
        ArrayList<DataSet> train = new ArrayList<DataSet>();
       
    }//GEN-LAST:event_trainFileActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        inputK.setText("");
        trainPath.setText("");
        testPath.setText("");
        kValue.setText("");
        predictPath.setText("");
        displayPanel.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void trainPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainPathActionPerformed

    private void inputKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKActionPerformed
        int k = Integer.parseInt(inputK.getText());
        kValue.setText("k = " + k);
        System.out.println("You chose to set the k = " + k);
    }//GEN-LAST:event_inputKActionPerformed

    private void testFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Only csv", new String[]{"csv"});
        chooser.setFileFilter(filter);
        chooser.setSelectedFile(new File("/home/zimo/workspace/KNN-zimoz/resources/IrisTest.csv"));
        int f = chooser.showOpenDialog(this);
        
        
        if(f == JFileChooser.APPROVE_OPTION) {
        System.out.println("You chose to open this file: " +
        chooser.getSelectedFile().getName());         
        }
        testPath.setText(chooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_testFileActionPerformed

    private void predictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictActionPerformed
        System.out.println("Strating prediction...");
	//String input = KNN.getInput("Enter the value of k: ");
	int k = Integer.parseInt(inputK.getText());
	//System.out.println("Please use "+ k + " nearest neignbors to predict the Species");
	Reader reader = new Reader();
				
	ArrayList<DataSet> train = reader.readDataFile(trainPath.getText());
//        System.out.println(train);
       
	ArrayList<DataSet> test = reader.readDataFile(testPath.getText());
//        System.out.println(test);
        
        System.out.println("Write file");
	KNN.writeFile(predictPath.getText(), k, train, test);
        
//        InputStream stream = Reader.class.getClassLoader().getResourceAsStream(predictPath.getText());
        InputStream stream = null;
        try {
            stream = new FileInputStream(predictPath.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
	BufferedReader display;
        InputStreamReader disfile = null;
        try {
                disfile = new InputStreamReader(stream, "utf-8");
            
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            Logger.getLogger(KNN_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (disfile != null){
                display = new BufferedReader(disfile);
                String line = display.readLine();
                System.out.println(line);
                while ((line = display.readLine()) != null){
                displayPanel.setText(displayPanel.getText()+ "\r\n" + line);
            }
        }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(KNN_Window.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KNN_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
		  
    }//GEN-LAST:event_predictActionPerformed

    private void predictFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictFileActionPerformed
       JFileChooser chooser = new JFileChooser();
        
       int f = chooser.showSaveDialog(this);
       
       if(f == JFileChooser.APPROVE_OPTION) {
        System.out.println("You chose to save this file to: " +
        chooser.getSelectedFile().getName());         
        }
       
       
       String pre=null;
       
       pre = chooser.getSelectedFile().getAbsolutePath();
       predictPath.setText(pre);
       
       
    }//GEN-LAST:event_predictFileActionPerformed

    private void testPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testPathActionPerformed

    private void predictPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_predictPathActionPerformed

    private void plotPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotPointActionPerformed
//        close();
        this.setAlwaysOnTop(false);
        Reader reader = new Reader();		
	
        KNN_plot plot = new KNN_plot(reader.readDataFile(trainPath.getText()),
                reader.readDataFile(testPath.getText()));
        plot.setVisible(true);
             
    }//GEN-LAST:event_plotPointActionPerformed

    
//    public void close(){
//        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KNN_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KNN_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KNN_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KNN_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        ArrayList<DataSet> train = new ArrayList<DataSet>();
        ArrayList<DataSet> test = new ArrayList<DataSet>();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KNN_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton clear;
    private javax.swing.JTextArea displayPanel;
    private javax.swing.JTextField inputK;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField kValue;
    private javax.swing.JPanel knnPanel;
    private javax.swing.JButton plotPoint;
    private javax.swing.JButton predict;
    private javax.swing.JButton predictFile;
    private javax.swing.JTextField predictPath;
    private javax.swing.JButton testFile;
    private javax.swing.JTextField testPath;
    private javax.swing.JButton trainFile;
    private javax.swing.JTextField trainPath;
    // End of variables declaration//GEN-END:variables
}