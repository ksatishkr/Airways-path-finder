
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
public class Login extends javax.swing.JFrame {

  public static String temp="";
    public Login() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ut = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        past = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        maslabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 3));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Here... ");

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plane animation.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("password:");

        ut.setBackground(new java.awt.Color(204, 204, 204));
        ut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                utKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("username:");

        past.setBackground(new java.awt.Color(204, 204, 204));
        past.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        past.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pastKeyPressed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(102, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
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

        cancel.setBackground(new java.awt.Color(51, 255, 51));
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

        maslabel.setBackground(new java.awt.Color(255, 204, 204));
        maslabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user32.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key32.png"))); // NOI18N

        mas.setBackground(new java.awt.Color(255, 204, 204));
        mas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(maslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(past, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(past, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(maslabel)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

        Airway nf=new Airway();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
       loginpage();
        
    }//GEN-LAST:event_submitMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
           loginpage();    
    }//GEN-LAST:event_submitActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        ut.setText(null);
        past.setText(null);
        mas.setText(null);
    }//GEN-LAST:event_cancelActionPerformed

    private void pastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pastKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            loginpage();
        }
        switch(evt.getKeyCode()){
            case 40:submit.requestFocus();
                break;
            case 38:ut.requestFocus();  
            break;
            
            
        }
    }//GEN-LAST:event_pastKeyPressed

    private void utKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utKeyPressed

       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(past.getText().length()==0){
                   past.requestFocus(); 
                }
        }else{
           if(ut.getText().length()==0){
            switch(evt.getKeyCode()){
            case 37:back.requestFocus();
           break;
       }
       }
        switch(evt.getKeyCode()){
           case 40:past.requestFocus();
           break;  
       }
       } 
    }//GEN-LAST:event_utKeyPressed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
       switch(evt.getKeyCode()){
            case 38:past.requestFocus();  
            break;
            case 39:cancel.requestFocus();
            break;
            case 37:break;
            case 40:break;
        }
       if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
           loginpage();
       }
    }//GEN-LAST:event_submitKeyPressed

    private void cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelKeyPressed
        switch(evt.getKeyCode()){
            case 37:submit.requestFocus();  
            break;
            case 38:past.requestFocus();
            break;
            case 39:break;
            case 40:break;
            
        }
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
           ut.setText(null);
           past.setText(null);
           mas.setText(null);
       }
    }//GEN-LAST:event_cancelKeyPressed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
       
            switch(evt.getKeyCode()){
           case 39:ut.requestFocus();
           break;
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Airway nf=new Airway();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
       }
    }//GEN-LAST:event_backKeyPressed

    public void loginpage(){
        try{
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airway?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from airwayuser where airwayuser.user='"+ut.getText().trim()+"' and airwayuser.past='"+past.getText()+"'");
            if(rs.next()){
                mas.setText("Login successfull");
                 AirMap.to.setText(null);
                temp=ut.getText();  
                AirMap g=new AirMap();
                g.setVisible(true);
                g.pack();
                g.setLocationRelativeTo(null);
                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();    
        AirMap.loginmas.setText("You are signed in as "+temp);
        // Add vertex or cities in the air line graph
        g.addCity("ATQ","Amritsar");
        g.addCity("IXU","Aurangabad");
        g.addCity("IXA","Agartala");
        g.addCity("AMD","Ahmedabad");
        g.addCity("AJL","Aizawl");
        g.addCity("BHO","Bhopal");
        g.addCity("IXB","Bagdogra");
        g.addCity("BLR","Bengaluru");
        g.addCity("BBI","Bhubaneswar");
        g.addCity("MAA","Chennai");
        g.addCity("IXC","Chandigarh");
        g.addCity("CJB","Coimbatore");
        g.addCity("DIB","Dibrugarh");
        g.addCity("DED","Deharadun");
        g.addCity("DMU","Dimapur");
        g.addCity("GAY","Gaya");
        g.addCity("GOI","Goa");
        g.addCity("GAU","Guwahati");
        g.addCity("HYD","Hyderabad");
        g.addCity("HMX","Hubli");
        g.addCity("IDR","Indore");
        g.addCity("IMF","Imphal");
        g.addCity("JAI","Jaipur");
        g.addCity("IXJ","Jammu");
        g.addCity("JGA","Jamnagar");
        g.addCity("JDH","Jodhpur");
        g.addCity("CCU","Kolkata");
        g.addCity("CNN","Kannur");
        g.addCity("HJR","Khajuraho");
        g.addCity("COK","Kochi");
        g.addCity("CCJ","Kozhikode");
        g.addCity("LKO","Lucknow");
        g.addCity("IXL","Leh");
        g.addCity("BOM","Mumbai");
        g.addCity("IXM","Madurai");
        g.addCity("IXE","Mangalore");
        g.addCity("NAG","Nagpur");
        g.addCity("NDC","Nanded");
        g.addCity("DEL","Delhi");
        g.addCity("PAT","Patna");
        g.addCity("IXZ","Port Blair");
        g.addCity("PNQ","Pune");
        g.addCity("RPR","Raipur");
        g.addCity("RAJ","Rajkot");
        g.addCity("IXR","Ranchi");
        g.addCity("SXR","Srinagar");
        g.addCity("IXS","Silchar");
        g.addCity("STV","Surat");
        g.addCity("TIR","Tirupati");
        g.addCity("TRV","Thiruvannanthapuram");
        g.addCity("TRZ","Tiruchirappalli");
        g.addCity("UDR","Udaipur");
        g.addCity("VNS","Varanasi");
        g.addCity("BDQ","Vadodara");
        g.addCity("VGA","Vijayawada");
        g.addCity("VTZ","VisakhaPatnam");
        // Add edges or air ways in the graph From Amritsar
        g.connectCity("ATQ","BOM");
        g.connectCity("ATQ","DEL");
        g.connectCity("ATQ","PAT");
        g.connectCity("ATQ","NDC");
        
        // Add edges or air ways in the graph From Aurangabad
        g.connectCity("IXU","BOM");
        g.connectCity("IXU","DEL");
        g.connectCity("IXU","HYD");
        g.connectCity("IXU","AMD");
        
        // Add edges or air ways in the graph From Agartala
        g.connectCity("IXA", "DEL");
        g.connectCity("IXA", "CCU");
        
        // Add edges or air ways in the graph From Ahmedabad
        g.connectCity("AMD", "DEL");
        g.connectCity("AMD", "STV");
        g.connectCity("AMD", "MAA");
        
        // Add edges or air ways in the graph From Aizaml
        g.connectCity("AJL", "CCU");
        g.connectCity("AJL", "IMF");
        g.connectCity("AJL", "IXS");
        
        // Add edges or air ways in the graph From Bhopal
        g.connectCity("BHO","BOM");
        g.connectCity("BHO","DEL");
        g.connectCity("BHO","PNQ");
        
        // Add edges or air ways in the graph From Bagdogra
        g.connectCity("IXB","DEL");
        g.connectCity("IXB","CCU");
        
        // Add edges or air ways in the graph From Bengaluru
        g.connectCity("BLR","MAA");
        g.connectCity("BLR","DEL");
        g.connectCity("BLR","JAI");
        g.connectCity("BLR","LKO");
        g.connectCity("BLR","PAT");
        g.connectCity("BLR","CCU");
        g.connectCity("BLR","BBI");
        g.connectCity("BLR","HYD");
        g.connectCity("BLR","BOM");
        g.connectCity("BLR","TRV");
        g.connectCity("BLR","CCJ");
        g.connectCity("BLR","CNN");
        g.connectCity("BLR","GOI");
        
        // Add edges or air ways in the graph From Bhubhaneswar
        g.connectCity("BBI","HYD");
        g.connectCity("BBI","BOM");
        g.connectCity("BBI","DEL");
        g.connectCity("BBI","STV");
        g.connectCity("BBI","BLR");
        
        
        // Add edges or air ways in the graph From Chennai
        g.connectCity("MAA", "HYD");
        g.connectCity("MAA", "CCU");
        g.connectCity("MAA", "BOM");
        g.connectCity("MAA", "AMD");
        g.connectCity("MAA", "DEL");
        g.connectCity("MAA", "BLR");
        g.connectCity("MAA", "CNN");
        g.connectCity("MAA", "CCJ");
        g.connectCity("MAA", "CJB");
        g.connectCity("MAA", "COK");
        g.connectCity("MAA", "TRZ");
        g.connectCity("MAA", "IXM");
        g.connectCity("MAA", "TRV");
        
        // Add edges or air ways in the graph From Chandigarh
        g.connectCity("IXC", "DEL");
        
        // Add edges or air ways in the graph From Coimbatore
        g.connectCity("CJB", "BOM");
        g.connectCity("CJB", "MAA");
        g.connectCity("CJB", "IXE");
        
        // Add edges or air ways in the graph From Deharadun
        g.connectCity("DED", "DEL");
        g.connectCity("DED", "JAI");
        g.connectCity("DED", "AMD");
        g.connectCity("DED", "LKO");
        g.connectCity("DED", "BOM");
        g.connectCity("DED", "BLR");
        
        // Add edges or air ways in the graph From Dibrugarh
        g.connectCity("DIB", "CCU");
        
        // Add edges or air ways in the graph From Dimapur
        g.connectCity("DMU", "CCU");
        
        // Add edges or air ways in the graph From Gaya
        g.connectCity("GAY", "CCU");
        g.connectCity("GAY", "DEL");
        
        // Add edges or air ways in the graph From Goa
        g.connectCity("GOI", "DEL");
        g.connectCity("GOI", "STV");
        g.connectCity("GOI", "BOM");
        g.connectCity("GOI", "BLR");
        
        // Add edges or air ways in the graph From Guwahati
        g.connectCity("GAU", "CCU");
        g.connectCity("GAU", "DEL");
        
        // Add edges or air ways in the graph From Hyderabad 
        g.connectCity("HYD", "BBI");
        g.connectCity("HYD", "MAA");
        g.connectCity("HYD", "PAT");
        g.connectCity("HYD", "CCU");
        g.connectCity("HYD", "BOM");
        g.connectCity("HYD", "DEL");
        g.connectCity("HYD", "STV");
        g.connectCity("HYD", "TIR");
        g.connectCity("HYD", "VGA");
        g.connectCity("HYD", "BLR");
        
         // Add edges or air ways in the graph From Hubli
        g.connectCity("HMX", "BOM");
        
        // Add edges or air ways in the graph From Indor
        g.connectCity("IDR", "BOM");
        g.connectCity("IDR", "DEL");
        
        // Add edges or air ways in the graph From Imphal
        g.connectCity("IMF", "GAU");
        g.connectCity("IMF", "CCU");
        g.connectCity("IMF", "AJL");
        
        // Add edges or air ways in the graph From Jaipur
        g.connectCity("JAI", "BOM");
        
        // Add edges or air ways in the graph From Jammu
        g.connectCity("IXJ", "SXR");
        g.connectCity("IXJ", "DEL");
        g.connectCity("IXJ", "IXL");
        
         // Add edges or air ways in the graph From Jamnagar
        g.connectCity("JGA", "BOM");
        
        // Add edges or air ways in the graph From Jodhpur 
        g.connectCity("JDH", "BOM");
        g.connectCity("JDH", "DEL");
        
        // Add edges or air ways in the graph From Kolkata 
        g.connectCity("CCU", "BBI");
        g.connectCity("CCU", "GAY");
        g.connectCity("CCU", "GAU");
        g.connectCity("CCU", "HYD");
        g.connectCity("CCU", "BOM");
        g.connectCity("CCU", "DEL");
        g.connectCity("CCU", "PAT");
        g.connectCity("CCU", "STV");
        
        // Add edges or air ways in the graph From Kannur 
        g.connectCity("CNN", "DEL");
        g.connectCity("CNN", "MAA");
        g.connectCity("CNN", "BLR");
        g.connectCity("CNN", "CCJ");
        
         // Add edges or air ways in the graph From Khajuraho
        g.connectCity("HJR", "VNS");
        
        // Add edges or air ways in the graph From Kochi
        g.connectCity("COK", "DEL");
        g.connectCity("COK", "BOM");
        g.connectCity("COK", "MAA");
        g.connectCity("COK", "TRV");
        
        // Add edges or air ways in the graph From Kozhikode
        g.connectCity("CCJ", "DEL");
        g.connectCity("CCJ", "BOM");
        g.connectCity("CCJ", "MAA");
        g.connectCity("CCJ", "BLR");
        g.connectCity("CCJ", "CNN");
                
        // Add edges or air ways in the graph From Lucknow 
        g.connectCity("LKO", "DEL");
        
        // Add edges or air ways in the graph From Leh
        g.connectCity("IXL", "DEL");
        g.connectCity("IXL", "SXR");
        g.connectCity("IXL", "IXJ");
        g.connectCity("IXL", "IXC");
        
        // Add edges or air ways in the graph From Mumbai 
        g.connectCity("BOM", "ATQ");
        g.connectCity("BOM", "BHO");
        g.connectCity("BOM", "BBI");
        g.connectCity("BOM", "MAA");
        g.connectCity("BOM", "HYD");
        g.connectCity("BOM", "IDR");
        g.connectCity("BOM", "JAI");
        g.connectCity("BOM", "JDH");
        g.connectCity("BOM", "CCU");
        g.connectCity("BOM", "LKO");
        g.connectCity("BOM", "NAG");
        g.connectCity("BOM", "DEL");
        g.connectCity("BOM", "PAT");
        g.connectCity("BOM", "RPR");
        g.connectCity("BOM", "RAJ");
        g.connectCity("BOM", "TIR");
        g.connectCity("BOM", "UDR");
        g.connectCity("BOM", "VNS");
        g.connectCity("BOM", "VTZ");
        g.connectCity("BOM", "BLR");
        g.connectCity("DEL", "IXU");
        g.connectCity("DEL", "TRV");
        g.connectCity("DEL", "IXZ");
        g.connectCity("DEL", "IXA");
        g.connectCity("DEL", "CNN");
        g.connectCity("DEL", "COK");
        g.connectCity("DEL", "CCJ");
        g.connectCity("DEL", "GOI");
       
        // Add edges or air ways in the graph From Madurai
        g.connectCity("IXM", "MAA");
        
        // Add edges or air ways in the graph From Mangalore
        g.connectCity("IXE", "BOM");
        g.connectCity("IXE", "CJB");
        
        // Add edges or air ways in the graph From Nagpur 
        g.connectCity("NAG", "BOM");
        g.connectCity("NAG", "DEL");
        g.connectCity("NAG", "RPR");
        
        // Add edges or air ways in the graph From Nanded 
        g.connectCity("NDC", "ATQ");
        
        // Add edges or air ways in the graph From Delhi 
        g.connectCity("DEL", "ATQ");
        g.connectCity("DEL", "BHO");
        g.connectCity("DEL", "BBI");
        g.connectCity("DEL", "MAA");
        g.connectCity("DEL", "GAY");
        g.connectCity("DEL", "GAU");
        g.connectCity("DEL", "HYD");
        g.connectCity("DEL", "CCU");
        g.connectCity("DEL", "IDR");
        g.connectCity("DEL", "JAI");
        g.connectCity("DEL", "JDH");
        g.connectCity("DEL", "LKO");
        g.connectCity("DEL", "BOM");
        g.connectCity("DEL", "NAG");
        g.connectCity("DEL", "PAT");
        g.connectCity("DEL", "PNQ");
        g.connectCity("DEL", "RAJ");
        g.connectCity("DEL", "RPR");
        g.connectCity("DEL", "IXC");
        g.connectCity("DEL", "IXR");
        g.connectCity("DEL", "SXR");
        g.connectCity("DEL", "STV");
        g.connectCity("DEL", "UDR");
        g.connectCity("DEL", "VNS");
        g.connectCity("DEL", "VGA");
        g.connectCity("DEL", "VTZ");
        g.connectCity("DEL", "IXU");
        g.connectCity("DEL", "TRV");
        g.connectCity("DEL", "IXZ");
        g.connectCity("DEL", "IXA");
        g.connectCity("DEL", "CNN");
        g.connectCity("DEL", "COK");
        g.connectCity("DEL", "CCJ");
        g.connectCity("DEL", "GOI");
        g.connectCity("DEL", "BLR");
        
        // Add edges or air ways in the graph From Patna 
        g.connectCity("PAT", "ATQ");
        g.connectCity("PAT", "HYD");
        g.connectCity("PAT", "CCU");
        g.connectCity("PAT", "BOM");
        g.connectCity("PAT", "DEL");
        
        // Add edges or air ways in the graph From Port Blair
        g.connectCity("IXZ", "DEL");
        g.connectCity("IXZ", "CCU");
        g.connectCity("IXZ", "VTZ");
        g.connectCity("IXZ", "MAA");
        
        // Add edges or air ways in the graph From Pune 
        g.connectCity("PNQ", "BHO");
        g.connectCity("PNQ", "DEL");
        
        // Add edges or air ways in the graph From Raipur 
        g.connectCity("RPR", "BOM");
        g.connectCity("RPR", "DEL");
        g.connectCity("RPR", "VTZ");
        
        // Add edges or air ways in the graph From Rajkot 
        g.connectCity("RAJ", "BOM");
        
        // Add edges or air ways in the graph From Rachi 
        g.connectCity("IXR", "DEL");
        
        // Add edges or air ways in the graph From Srinagar 
        g.connectCity("SXR", "DEL");
        
        // Add edges or air ways in the graph From Silchar 
        g.connectCity("IXS", "CCU");
        g.connectCity("IXS", "AJL");
        
        // Add edges or air ways in the graph From Surat
        g.connectCity("STV", "BBI");
        g.connectCity("STV", "HYD");
        g.connectCity("STV", "CCU");
        g.connectCity("STV", "DEL");
        
        // Add edges or air ways in the graph From Tirupati 
        g.connectCity("TIR", "HYD");
        g.connectCity("TIR", "BOM");
        
        // Add edges or air ways in the graph From Thiruvananthapuram 
        g.connectCity("TRV", "DEL");
        g.connectCity("TRV", "BOM");
        g.connectCity("TRV", "MAA");
        g.connectCity("TRV", "BLR");
        g.connectCity("TRV", "COK");
       
        
        // Add edges or air ways in the graph From Tiruchirappalli
        g.connectCity("TRZ", "MAA");
        
        // Add edges or air ways in the graph From Udaipur 
        g.connectCity("UDR", "BOM");
        g.connectCity("UDR", "DEL");
        
        // Add edges or air ways in the graph From Varanasi 
        g.connectCity("VNS", "GAY");
        g.connectCity("VNS", "BOM");
        g.connectCity("VNS", "DEL");
        
        // Add edges or air ways in the graph From Vadodara 
        g.connectCity("BDQ", "DEL");
        
        // Add edges or air ways in the graph From Vijayawada 
        g.connectCity("VGA", "DEL");
        g.connectCity("VGA", "HYD");
        
        // Add edges or air ways in the graph From VisakhaPatnam 
        g.connectCity("VTZ", "HYD");
        g.connectCity("VTZ", "BOM");
        g.connectCity("VTZ", "DEL");
        g.connectCity("VTZ", "RPR");
        g.connectCity("VTZ", "IXZ");
            }
            else{
               
                mas.setText("Wrong username or password!!");
            }
        }catch(SQLException e){
            
          System.out.println(e);
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testcomboboc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      //</editor-fold>
      
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton cancel;
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
    public static javax.swing.JLabel mas;
    private javax.swing.JLabel maslabel;
    private javax.swing.JPasswordField past;
    private javax.swing.JButton submit;
    public static javax.swing.JTextField ut;
    // End of variables declaration//GEN-END:variables

    private void JOptionshowMessageDialog(String login_success) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
