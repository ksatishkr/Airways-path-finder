
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SinUP extends javax.swing.JFrame {

    public SinUP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        past = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fill your detail Here... ");

        back.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        back.setText("<<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 153, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forloginpageimage.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Last name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("First name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Password:");

        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
        });

        lname.setBackground(new java.awt.Color(204, 204, 204));
        lname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameKeyPressed(evt);
            }
        });

        user.setBackground(new java.awt.Color(204, 204, 204));
        user.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
        });

        past.setBackground(new java.awt.Color(204, 204, 204));
        past.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        past.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pastKeyPressed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(102, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 102, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        cancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(cancel))
                    .addComponent(past)
                    .addComponent(user)
                    .addComponent(lname)
                    .addComponent(fname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(past, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
                    fname.setText(null);
                    lname.setText(null);
                    
                    user.setText(null);
                    past.setText(null);
    }//GEN-LAST:event_cancelActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

         Airway nf=new Airway();
         nf.setVisible(true);
         nf.pack();
         nf.setLocationRelativeTo(null);
         nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       sinup();
       
    }//GEN-LAST:event_submitActionPerformed
   public void sinup(){
       String s1=fname.getText().trim();
        String s2=lname.getText().trim();
        String s3=user.getText().trim();
        String s4=String.valueOf(past.getPassword()).trim();
        if(s1.length()==0 ||s2.length()==0||s3.length()==0||s4.length()==0){
        }
        else {
            try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airway?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from airwayuser where airwayuser.user='"+user.getText().trim()+"'");
            if( !rs.next()){
                st.execute("insert into airwayuser values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
                JOptionPane.showMessageDialog(this,"New User SinUP !!");
                 Airway nf=new Airway();
                 nf.setVisible(true);
                 nf.pack();
                 nf.setLocationRelativeTo(null);
                 nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.dispose();
                {
                    fname.setText(null);
                    lname.setText(null);
                    user.setText(null);
                    past.setText(null); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Already User Exist!");
            }
            } catch (HeadlessException | SQLException ex) {
              Logger.getLogger(SinUP.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
   }
    private void cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelKeyPressed
         switch(evt.getKeyCode()){
           case 37:submit.requestFocus();
           break;
           case 38:past.requestFocus();
           break;
           case 39:break;
           case 40:break; 
       }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            fname.setText(null);
                    lname.setText(null);
                    
                    user.setText(null);
                    past.setText(null);
        }
                                   

    }//GEN-LAST:event_cancelKeyPressed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
       switch(evt.getKeyCode()){
           case 38:past.requestFocus();
           break;
           case 39:cancel.requestFocus();
           break;
           case 40:break;
           case 37:break;
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            sinup();
       }
    }//GEN-LAST:event_submitKeyPressed

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
      
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(lname.getText().length()==0){
                   lname.requestFocus(); 
                }
        }else{
           if(fname.getText().length()==0){
           switch(evt.getKeyCode()){
          
          case 37:back.requestFocus();
          break;
      }}
        switch(evt.getKeyCode()){
          case 40:lname.requestFocus();
          break;
         
      }
       }  
    }//GEN-LAST:event_fnameKeyPressed

    private void lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(user.getText().length()==0){
                   user.requestFocus(); 
                }
        }else{
        
        switch(evt.getKeyCode()){
          case 38:fname.requestFocus();
          break;
          case 40:user.requestFocus();
          break;
          
      }}
    }//GEN-LAST:event_lnameKeyPressed

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(past.getText().length()==0){
                   past.requestFocus(); 
                }
        }else{
            switch(evt.getKeyCode()){
          case 38:lname.requestFocus();
          break;
          case 40:past.requestFocus();
          break;
          
      }
        }
        switch(evt.getKeyCode()){
          case 38:lname.requestFocus();
          break;
          case 40:past.requestFocus();
          break;
          
      }
    }//GEN-LAST:event_userKeyPressed

    private void pastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pastKeyPressed
         switch(evt.getKeyCode()){
          case 38:user.requestFocus();
          break;
          case 40:submit.requestFocus();
          break;
          
      }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
              sinup();
         }
    }//GEN-LAST:event_pastKeyPressed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           Airway nf=new Airway();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       
      }
      switch(evt.getKeyCode()){
          case 39:fname.requestFocus();
          break;
      }
    }//GEN-LAST:event_backKeyPressed
    
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
            java.util.logging.Logger.getLogger(testcomboboc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testcomboboc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testcomboboc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testcomboboc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SinUP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField past;
    private javax.swing.JButton submit;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
