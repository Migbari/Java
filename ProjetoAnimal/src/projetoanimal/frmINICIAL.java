
package projetoanimal;

import javax.swing.JFrame;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


public class frmINICIAL extends JFrame {

    /**
     * Creates new form frmINICIAL
     */
    public frmINICIAL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 214, 71, -1));

        jLabel1.setText("MAMÍFERO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, -1));

        jLabel2.setText("RÉPTEIS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 54, -1, -1));

        jLabel3.setText("PEIXES:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 86, -1, -1));

        jLabel4.setText("AVES:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 118, -1, -1));

        jLabel5.setText("INSETOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 150, -1, -1));

        jLabel6.setText("ANFÍBIOS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 182, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 154, 14));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 156, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 179, 14));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 106, 14));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 20));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 230, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        
        /*Mamíferos*/
        String[] Nome_Especie = {"Leão", "Homem"};
        String Resultado = "";
              
        Mamiferos animalMamifero = new Mamiferos();
        animalMamifero.setNome_Especie(Nome_Especie);
           
                
        for (int i = 0; i<=animalMamifero.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalMamifero.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalMamifero.getNome_Especie()[i];
        }
        this.jLabel7.setText(Resultado);
        
        Class<? extends Mamiferos> classeMamifero = animalMamifero.getClass();
        Method[] metodosMamifero = classeMamifero.getDeclaredMethods();
                
        String retornoNomesMetodos = "";
        List<String> nomesMetodos;
        
        retornoNomesMetodos = classeMamifero.getName() + "\n";
        for (int i = 0; i <= metodosMamifero.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + "\n" + metodosMamifero[i].getName();
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        
        /*Répteis*/
        String[] Nome_EspecieReptil = {"Serpente", "Crocodilo"};
        Resultado = "";
        
        Repteis animalRepteis = new Repteis();
        animalRepteis.setNome_Especie(Nome_EspecieReptil);
                
        for (int i = 0; i<=animalRepteis.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalRepteis.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalRepteis.getNome_Especie()[i];
        }
        this.jLabel8.setText(Resultado);  
        
        /*Esse bloco aos demais - Início*/
        Class<? extends Repteis> classeRepteis = animalRepteis.getClass();
        Method[] metodosRepteis = classeRepteis.getDeclaredMethods();
        
        retornoNomesMetodos = retornoNomesMetodos + "\n\n" + classeRepteis.getName() + "\n\n";
        for (int i = 0; i <= metodosRepteis.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + metodosRepteis[i].getName() + "\n";
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        jTextArea1.setText(nomesMetodos.toString());
        /* - Fim */
        
        /*Peixes*/
        String[] Nome_EspeciePeixes = {"Salmão", "Sam Peter"};
        Resultado = "";
        
        Peixe animalPeixes = new Peixe();
        animalPeixes.setNome_Especie(Nome_EspeciePeixes);
                
        for (int i = 0; i<=animalPeixes.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalPeixes.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalPeixes.getNome_Especie()[i];
        }
        this.jLabel9.setText(Resultado); 
        
        Class<? extends Peixe> classePeixes = animalPeixes.getClass();
        Method[] metodosPeixes = classePeixes.getDeclaredMethods();
        
        retornoNomesMetodos = retornoNomesMetodos + "\n\n" + classePeixes.getName() + "\n\n";
        for (int i = 0; i <= metodosPeixes.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + metodosPeixes[i].getName() + "\n";
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        jTextArea1.setText(nomesMetodos.toString());
        
         /*Aves*/
        String[] Nome_EspecieAves = {"Pombo", "Galinha"};
        Resultado = "";
        
        Aves animalAves = new Aves();
        animalAves.setNome_Especie(Nome_EspecieAves);
                
        for (int i = 0; i<=animalAves.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalAves.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalAves.getNome_Especie()[i];
        }
        this.jLabel10.setText(Resultado); 
        
        Class<? extends Aves> classeAves = animalAves.getClass();
        Method[] metodosAves = classeAves.getDeclaredMethods();
        
        retornoNomesMetodos = retornoNomesMetodos + "\n\n" + classeAves.getName() + "\n\n";
        for (int i = 0; i <= metodosAves.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + metodosAves[i].getName() + "\n";
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        jTextArea1.setText(nomesMetodos.toString());
        
        /*Insectos*/
        String[] Nome_EspecieInsetos = {"Piolho", "Gafanhoto"};
        Resultado = "";
        
        Insectos animalInsetos = new Insectos();
        animalInsetos.setNome_Especie(Nome_EspecieInsetos);
                
        for (int i = 0; i<=animalInsetos.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalInsetos.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalInsetos.getNome_Especie()[i];
        }
        this.jLabel11.setText(Resultado); 
        
         Class<? extends Insectos> classeAnfibios = animalInsetos.getClass();
        Method[] metodosInsetos = classeAnfibios.getDeclaredMethods();
        
        retornoNomesMetodos = retornoNomesMetodos + "\n\n" + classeAnfibios.getName() + "\n\n";
        for (int i = 0; i <= metodosInsetos.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + metodosInsetos[i].getName() + "\n";
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        jTextArea1.setText(nomesMetodos.toString());
        
        /*Anfíbio*/
        String[] Nome_EspecieAnfibios = {"Rã", "Cobra-Cega"};
        Resultado = "";
        
        Anfibios animalAnfibios = new Anfibios();
        animalAnfibios.setNome_Especie(Nome_EspecieAnfibios);
                
        for (int i = 0; i<=animalAnfibios.getNome_Especie().length-1; i++)
        {
            if (i == 0)
               Resultado = animalAnfibios.getNome_Especie()[i];
            else
               Resultado = Resultado + ", " + animalAnfibios.getNome_Especie()[i];
        }
        this.jLabel12.setText(Resultado);              
        
         Class<? extends Anfibios> classeAnfibio = animalAnfibios.getClass();
        Method[] metodosAnfibios = classeAnfibio.getDeclaredMethods();
        
        retornoNomesMetodos = retornoNomesMetodos + "\n\n" + classeAnfibio.getName() + "\n\n";
        for (int i = 0; i <= metodosAnfibios.length-1; i++)
            retornoNomesMetodos = retornoNomesMetodos + metodosAnfibios[i].getName() + "\n";
        
        nomesMetodos = Arrays.asList(retornoNomesMetodos + "\n");
        jTextArea1.setText(nomesMetodos.toString());
               
    }//GEN-LAST:event_btnIniciarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmINICIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmINICIAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}