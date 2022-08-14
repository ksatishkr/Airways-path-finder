
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
  class City {
         int index;
    public String name;
    public String code;
    public  LinkedList<City> connectedCity = new LinkedList<>();
    public City(int i, String name, String code) {
        this.index = i;
        this.name = name;
        this.code = code;
    }
}
public class AirMap extends javax.swing.JFrame { 
    Set<String> s;
    public AirMap() {
        initComponents();
        this.setLocationRelativeTo(null);
        to.setText(null);
         s=new TreeSet<>();
        s.add("");
        s.add("Amritsar"); s.add("Aurangabad"); s.add("Agartala"); s.add("Ahmedabad"); s.add("Aizawl");s.add("Bhopal");
        s.add("Bagdogra"); s.add("Bengaluru");s.add("Bhubaneswar"); s.add("Chennai"); s.add("Chandigarh");
        s.add("Coimbatore"); s.add("Dibrugarh"); s.add("Deharadun");s.add("Dimapur"); s.add("Goa");s.add("Gaya"); s.add("Guwahati");
        s.add("Hyderabad"); s.add("Hubli"); s.add("Indore");s.add("Imphal");s.add("Jammu");s.add("Jamnagar");s.add("Jaipur"); s.add("Jodhpur");
        s.add("Kolkata");s.add("Kannur");s.add("Khajuraho");s.add("Kochi");s.add("Kozhikode");s.add("Lucknow");s.add("Leh");
        s.add("Mumbai");s.add("Madurai");s.add("Mangalore");s.add("Nagpur");s.add("Nanded");s.add("Delhi");s.add("Patna"); 
        s.add("Port Blair");s.add("Pune");s.add("Raipur"); s.add("Rajkot");s.add("Ranchi"); s.add("Srinagar");s.add("Silchar"); 
        s.add("Surat");s.add("Tirupati");s.add("Thiruvannanthapuram");s.add("Tiruchirappalli"); 
        s.add("Udaipur"); s.add("Varanasi");s.add("Vadodara"); s.add("Vijayawada");
        s.add("VisakhaPatnam");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginmas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JButton();
        showcities = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText(" SEARCH AIRWAYS HERE..");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("x");
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/airmapedit.png"))); // NOI18N

        loginmas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginmas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(loginmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("From Airport:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("To Airport:");

        from.setBackground(new java.awt.Color(255, 204, 204));
        from.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        from.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fromKeyReleased(evt);
            }
        });

        to.setBackground(new java.awt.Color(255, 204, 204));
        to.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        to.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toKeyReleased(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN NO:", "CITY CODE:", "CITY NAME:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        search.setBackground(new java.awt.Color(51, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        showcities.setBackground(new java.awt.Color(51, 255, 255));
        showcities.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showcities.setText("SHOWCITYCODE");
        showcities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showcitiesMouseClicked(evt);
            }
        });
        showcities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcitiesActionPerformed(evt);
            }
        });
        showcities.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                showcitiesKeyPressed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("CLEARTABLE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearKeyPressed(evt);
            }
        });

        display.setAutoCreateRowSorter(true);
        display.setBackground(new java.awt.Color(255, 204, 204));
        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Search Result.........."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jScrollPane3.setViewportView(display);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exchange32.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showcities)
                .addGap(36, 36, 36)
                .addComponent(clear)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(showcities)
                    .addComponent(clear))
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
      
         Airway nf=new Airway();
         nf.setVisible(true);
         nf.pack();
         nf.setLocationRelativeTo(null);
         nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
        Airway.loginlabel.setText("Logout");
        Airway.loginmas.setText("You are signed in as "+Login.temp);
        Airway.forward.setText(">>>");
    }//GEN-LAST:event_backMouseClicked

    private void showcitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcitiesActionPerformed
       
       table.setModel(new DefaultTableModel(null,  new String [] {"SN NO:", "CITY CODE:","CITY NAME:"}));
         codename();
    }//GEN-LAST:event_showcitiesActionPerformed
  
    private void showcitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showcitiesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showcitiesMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
     display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
      findBFSpath();
      
       
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        table.setModel(new DefaultTableModel(null,  new String [] {"SN NO:", "CITY CODE:","CITY NAME:"}));
    }//GEN-LAST:event_clearActionPerformed

    private void fromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE){}else
       {   
            String to_check=from.getText();
            int to_check_len=to_check.length();
            for(String data:s)
            {
                String check_from_data="";
                for(int i=0;i<to_check_len;i++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(i);
                    }
                }
                if(check_from_data.equalsIgnoreCase(to_check))
                {
                    from.setText(data);
                    from.setSelectionStart(to_check_len);
                    from.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_fromKeyReleased

    private void toKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE){}else
        {   
            String to_check=to.getText();
            int to_check_len=to_check.length();
            for(String data:s)
            {
                String check_from_data="";
                for(int i=0;i<to_check_len;i++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(i);
                    }
                }
                if(check_from_data.equalsIgnoreCase(to_check))
                { 
                    to.setText(data);
                    to.setSelectionStart(to_check_len);
                    to.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_toKeyReleased

    private void toKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
            display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
            findBFSpath();
       }
       if(to.getText().length()==0){
           switch(evt.getKeyCode()){
               case 39:showcities.requestFocus();
               break;
           }
       }
           switch(evt.getKeyCode()){
           case 38: from.requestFocus();
           break;
           case 40: search.requestFocus();
           break;   
       } 
    }//GEN-LAST:event_toKeyPressed

    private void fromKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromKeyPressed

           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                if(to.getText().length()==0){
                   to.requestFocus(); 
                }else{
                     display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
                     display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
                     findBFSpath();
                }
       }
        if(from.getText().length()==0){
              switch(evt.getKeyCode()){
                case 37:back.requestFocus();
                break;
              case 39:showcities.requestFocus();
                break;
              }
         }
           switch(evt.getKeyCode()){    
           case 40: to.requestFocus();
           break;  
       }  
    }//GEN-LAST:event_fromKeyPressed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
            display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
            findBFSpath();
       }
       switch(evt.getKeyCode()){
           case 39:showcities.requestFocus();
           break;
           case 38:to.requestFocus();
           break;
          
       }
    }//GEN-LAST:event_searchKeyPressed

    private void showcitiesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showcitiesKeyPressed
       switch(evt.getKeyCode()){
           case 39:clear.requestFocus();
           break;
           case 37:search.requestFocus();
           break;
            case 38:to.requestFocus();
           break;
          
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           table.setModel(new DefaultTableModel(null,  new String [] {"SN NO:", "CITY CODE:","CITY NAME:"}));
         codename();
       }    
    }//GEN-LAST:event_showcitiesKeyPressed

    private void clearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearKeyPressed
        switch(evt.getKeyCode()){
           case 37:showcities.requestFocus();
           break;
           case 38:to.requestFocus();
           break;
           case 39:break;
           case 40:break;
           default:
       }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         table.setModel(new DefaultTableModel(null,  new String [] {"SN NO:", "CITY CODE:","CITY NAME:"}));
    }//GEN-LAST:event_clearKeyPressed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             Airway nf=new Airway();
             nf.setVisible(true);
             nf.pack();
             nf.setLocationRelativeTo(null);
             nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.dispose();
            Airway.loginlabel.setText("Logout");
            Airway.loginmas.setText("You are signed in as "+Login.temp);
            Airway.forward.setText(">>>");
       }
       switch(evt.getKeyCode()){
           case 39:from.requestFocus();
           break;
       }
    }//GEN-LAST:event_backKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String s1=from.getText();
       String s2=to.getText();
        from.setText(s2);
       to.setText(s1);
    }//GEN-LAST:event_jButton1MouseClicked
    
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception{
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
        java.awt.EventQueue.invokeLater(() -> {
            new AirMap().setVisible(true);
        });
    }
    public void codename(){ 
       for(City c:cities){
           String s00=Integer.toString(c.index);
            String s11=c.code;
           String s22=c.name;
           String data[]={s00,s11,s22};
           DefaultTableModel tm;
            tm = ( DefaultTableModel)table.getModel();
           tm.addRow(data);
       }
    }
     
     public void checkInput(){
         String s1=from.getText().trim();
         String s2=to.getText().trim();
       try{
            City c12=cityLookup(s1);
            City c22=cityLookup(s2);
       
            if(c12==null || c22==null||s1==null||s2==null){
                JOptionPane.showMessageDialog(this,"Please Enter vailid  arrival and destivation airport...");
            } 
       }catch(NullPointerException e){
           
       }
       
    }
     int size =1;
    public static List<City> cities = new ArrayList<>();
    public void addCity(String code, String name){
        int i = size++;
        City city = new City(i,name, code);
        cities.add(city);  
    }
    public City cityLookup(String code){
        
        for(City c:cities){
            if(c.code.equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }
     public City cityLookupname(String name){
        
        for(City c:cities){
            if(c.name.equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    public void connectCity(String code1,String code2){
        City c1 = cityLookup(code1);
        City c2 = cityLookup(code2);
            if( c1 ==null || c2 == null){
            
             JOptionPane.showMessageDialog(this,"Cannot connect, Invalid city code. "+c1 +" "+c2);
            return;
        }
        c1.connectedCity.add(c2);   
    }
    public void findBFSpath() {
        display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
        String fromstring=from.getText().trim();
       String tostring=to.getText().trim();
       if("".equals(fromstring)||"".equals(tostring)){
           JOptionPane.showMessageDialog(this,"Please Enter Arrival and Destivation airport First..");
       }else{
         try{
             City name1=cityLookupname(fromstring);
             City name2=cityLookupname(tostring);
             if(name1==null || name2==null){
                 JOptionPane.showMessageDialog(this,"Please Enter Arrival and Destivation airport First..");
             }{
             String code=name1.code;
             String code2=name2.code;
         int flag=0;
         int finalcount=0;
         City city = cityLookup(code);
        City descity=cityLookup(code2);
        String Arricode=city.name;
        String Descode=descity.name;
        LinkedList<City> q = new LinkedList<>();
        q.add(city);
        while(!q.isEmpty()){
             DefaultTableModel tm;
                    tm = ( DefaultTableModel)display.getModel();
            City currentCity = q.poll();
            for(City cc:currentCity.connectedCity){
                if(cc.code.equalsIgnoreCase(code2)){
                     String s="Yes,There is direct path between:-->";
                     String s1="      "+Arricode+"  To  "+cc.name;
                     String data[]={s};
                     String data0[]={" "};
                     String data1[]={s1};
                     tm.addRow(data);
                     tm.addRow(data0);
                     tm.addRow(data1);
                     flag=1; 
                }
            }
            if(flag==0){
                String nopath="No Direct Path Found between: "+Arricode+" To "+Descode;
                String nopath1="But,You Can Follow below paths:-->>";
                String datan[]={" "};
                String data1[]={nopath};
                String data2[]={nopath1};
                 tm.addRow(data1);
                 tm.addRow(data2);
                  tm.addRow(datan);
                for(City cc:currentCity.connectedCity){
                    for(City pc:cc.connectedCity){   
                       if(pc.code.equalsIgnoreCase(code2)){
                           finalcount++;
                        }
                    }
                }   
                int need=0;
                for(City cc:currentCity.connectedCity){
                    for(City pc:cc.connectedCity){    
                       if(pc.code.equalsIgnoreCase(code2)){
                            need++;
                            String data[]={Arricode+" -->> "+cc.name+" -->>  "+pc.name};
                            tm.addRow(data);
                            if(finalcount!=need){
                                String stror="            "+"(OR) ";
                                
                                String dataor[]={stror};
                                tm.addRow(dataor); 
                            }  
                        }else{
                           //display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
                       }
                    }
                }
       
                 if(need==0 && flag==0){
                     display.setModel(new DefaultTableModel(null,  new String [] {"Search Result.........."}));
                    String sm="Result not found...";
                    String da[]={sm};
                    DefaultTableModel cl;
                    cl = ( DefaultTableModel)display.getModel();
                    cl.addRow(da);
                }
                }
             break; 
        }}
         }catch(HeadlessException e){ 
        }
    }}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton clear;
    private javax.swing.JTable display;
    private javax.swing.JTextField from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel loginmas;
    private javax.swing.JButton search;
    public static javax.swing.JButton showcities;
    public static javax.swing.JTable table;
    public static javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
