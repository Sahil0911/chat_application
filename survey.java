/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.group;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class survey extends javax.swing.JFrame {

    /**
     * Creates new form survey
     */
    private static String st, pw;
    static int s;
    static int n;
    static String pers;
    int i = 0, dbno, count = 0;
    String[] usersall = new String[20];
    int[] c = new int[50];
    String a[] = new String[50];
    String[] mainStr = new String[20];

    public survey(String st, String pw) {
        this.st = st;
        this.pw = pw;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        button3 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        propA1 = new javax.swing.JRadioButton();
        propA2 = new javax.swing.JRadioButton();
        propA3 = new javax.swing.JRadioButton();
        propB1 = new javax.swing.JRadioButton();
        propB2 = new javax.swing.JRadioButton();
        propB3 = new javax.swing.JRadioButton();
        propC1 = new javax.swing.JRadioButton();
        propC2 = new javax.swing.JRadioButton();
        propC3 = new javax.swing.JRadioButton();
        propD1 = new javax.swing.JRadioButton();
        propD2 = new javax.swing.JRadioButton();
        propD3 = new javax.swing.JRadioButton();
        propE1 = new javax.swing.JRadioButton();
        propE2 = new javax.swing.JRadioButton();
        propE3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button2 = new java.awt.Button();
//        lmao = new javax.swing.JTextField();

        button3.setLabel("button2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Fill out the following questions for recommendation purposes");

        propA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propA1ActionPerformed(evt);
            }
        });

        propA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propA2ActionPerformed(evt);
            }
        });

        propA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propA3ActionPerformed(evt);
            }
        });

        propB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propB1ActionPerformed(evt);
            }
        });

        propB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propB2ActionPerformed(evt);
            }
        });

        propB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propB3ActionPerformed(evt);
            }
        });

        propC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propC1ActionPerformed(evt);
            }
        });

        propC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propC2ActionPerformed(evt);
            }
        });

        propC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propC3ActionPerformed(evt);
            }
        });

        propD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propD1ActionPerformed(evt);
            }
        });

        propD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propD2ActionPerformed(evt);
            }
        });

        propD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propD3ActionPerformed(evt);
            }
        });

        propE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propE1ActionPerformed(evt);
            }
        });

        propE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propE2ActionPerformed(evt);
            }
        });

        propE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propE3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Photography");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Politics");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Music");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Movies");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Gaming");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel7.setText("Not Interested");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel8.setText("Fairly Interested");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel9.setText("Neutral");

        button2.setBackground(new java.awt.Color(255, 102, 102));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("SUBMIT");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
/*
        lmao.setText("                     ");
        lmao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmaoActionPerformed(evt);
            }
        });
*/
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGap(125, 125, 125)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(propE1)
                                                                                        .addComponent(propD1)
                                                                                        .addComponent(propC1)
                                                                                        .addComponent(propB1))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(propB2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(propC2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(propD2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(propE2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(propA1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(propA2))
                                                                        .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(114, 114, 114)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(propE3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(propD3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(propC3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(propB3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(propA3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(104, 104, 104)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)))
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(146, 146, 146)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(154, 154, 154))
//                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                                .addComponent(lmao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(113, 113, 113))))
        )));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(propA1)
                                                        .addComponent(propA2)
                                                        .addComponent(propA3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(propB1)
                                                        .addComponent(propB2)
                                                        .addComponent(propB3)
                                                        .addComponent(jLabel3))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(propC2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(propC3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)))
                                        .addComponent(propC1))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(propD2)
                                                        .addComponent(propD1)
                                                        .addComponent(jLabel5)
                                                        .addComponent(propD3))
                                                //add Component add gareko ho ahile
//                                                .addComponent(jLabel5)
                                               .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(propE1)
                                                        .addComponent(propE2)
                                                        .addComponent(propE3))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                                .addGap(23, 23, 23))
//                                                      .addGroup(layout.createSequentialGroup()
//                                                                .addComponent(lmao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                 s                               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                      /*  .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addContainerGap())))
                                                        */
                                )))));

        pack();
    }// </editor-fold>                        

    private void propD2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propD2.isSelected()) {
            propD1.setSelected(false);
            propD3.setSelected(false);
        }
    }

    private void propB2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propB2.isSelected()) {
            propB1.setSelected(false);
            propB3.setSelected(false);
        }
    }

    private void propE3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propE3.isSelected()) {
            propE2.setSelected(false);
            propE1.setSelected(false);
        }
    }

    private void propA1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propA1.isSelected()) {
            propA2.setSelected(false);
            propA3.setSelected(false);
        }
    }

    private void propD1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propD1.isSelected()) {
            propD2.setSelected(false);
            propD3.setSelected(false);
        }
    }

    private void propB1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propB1.isSelected()) {
            propB2.setSelected(false);
            propB3.setSelected(false);
        }
    }

    private void propC1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propC1.isSelected()) {
            propC2.setSelected(false);
            propC3.setSelected(false);
        }
    }

    public void findafriend() throws Exception {
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/minorproject", "root ", "");
            String select_sql1 = "Select personality from minorproject.tbl_userdescrip";
            PreparedStatement stmt_select1 = conn.prepareStatement(select_sql1);
            ResultSet personalities = stmt_select1.executeQuery();
            String select_users = "Select user_name from minorproject.tbl_userdescrip";
            PreparedStatement su = conn.prepareStatement(select_users);
            ResultSet users = su.executeQuery();
            while (users.next()) {
                usersall[i] = users.getString("user_name");
//                System.out.println(i + "......" + usersall[i]);
                i++;

            }
            dbno = i;
//            System.out.println("DB No. is.........." + dbno);
            i = 0;
            while (personalities.next()) {
                a[i] = personalities.getString("personality");
//                System.out.println(i + "....." + a[i]);
                i++;
            }

            ResultSet rs = conn.prepareStatement("Select personality from minorproject.tbl_userdescrip where user_name ='" + st + "'").executeQuery();
            while (rs.next()) {
                pers = rs.getString("personality");
            }

            for (i = 0; i < dbno; i++) {

                if (st.equals(usersall[i])) {
                    n = i;
                    break;
                }
            }
//            System.out.println("n is " + n);
            char[] char_pers = pers.toCharArray();
            count = 0;
//            Bring Logged in user to index 0
            if (n != 0) {
                String user_names = "";
                String user_pers = "";
                user_names = usersall[0];
                user_pers = a[0];
                usersall[0] = st;
                a[0] = pers;
                usersall[n] = user_names;
                a[n] = user_pers;
                n = 0;
            }

            for (i = 0; i < dbno; i++) {
//                System.out.println(i + " Usernames: " + usersall[i] + " Personalities " + a[i]);
                char[] char_pers1 = a[i].toCharArray();
                if (i != n) {
                    for (int j = 0; j < 5; j++) {
                        if (char_pers[j] == char_pers1[j]) {

                            count++;

                        }
                    }

                    c[i] = count;

                    count = 0;
                }

            }

            for (i = 0; i < dbno - 1; i++) {
                c[i] = c[i + 1];

            }

            int lol = 0;
            for (int k = 1; k < dbno; k++) {

                mainStr[lol] = usersall[k];

                lol++;

            }
            /*
            System.out.println("n is " + n);

            for (int k = 0; k < dbno - 1; k++) {
                System.out.println("Count is-------------->" + c[k] + " with name--------------> " + mainStr[k]);

            }
             */
            int temp;
            String nam = "";
            for (int j = 0; j < c.length; j++) {

//                    if (n != i) {
                for (i = 0; i < dbno - 2; i++) {

                    if (c[i] < c[i + 1]) {

                        temp = c[i];
                        nam = mainStr[i];
                        c[i] = c[i + 1];
                        mainStr[i] = mainStr[i + 1];
                        c[i + 1] = temp;
                        mainStr[i + 1] = nam;

                    }
                }

            }

            LoginController control = new LoginController();
            control.recommend(c, mainStr);

        } catch (ClassNotFoundException | SQLException ce) {
            ce.printStackTrace();

        }

    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // everything is here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/minorproject", "root ", "");

            String str;
            char x, y, z;
            x = 'a';
            y = 'b';
            z = 'c';
            StringBuilder sb = new StringBuilder();

            if (propA1.isSelected()) {
                sb.append(x);
            }
            if (propA2.isSelected()) {
                sb.append(y);
            }
            if (propA3.isSelected()) {
                sb.append(z);
            }
            if (propB1.isSelected()) {
                sb.append(x);
            }
            if (propB2.isSelected()) {
                sb.append(y);
            }
            if (propB3.isSelected()) {
                sb.append(z);
            }
            if (propC1.isSelected()) {
                sb.append(x);
            }
            if (propC2.isSelected()) {
                sb.append(y);
            }
            if (propC3.isSelected()) {
                sb.append(z);
            }
            if (propD1.isSelected()) {
                sb.append(x);
            }
            if (propD2.isSelected()) {
                sb.append(y);
            }
            if (propD3.isSelected()) {
                sb.append(z);
            }
            if (propE1.isSelected()) {
                sb.append(x);
            }
            if (propE2.isSelected()) {
                sb.append(y);
            }
            if (propE3.isSelected()) {
                sb.append(z);
            }
            str = sb.toString();
//            lmao.setText(str);

            PreparedStatement stmt_insert = conn.prepareStatement("UPDATE minorproject.tbl_userdescrip SET `personality`='" + str + "' WHERE `user_name`='" + st + "'");

            if (stmt_insert.executeUpdate() > 0) {
                System.out.println("Inserted..");

            }

        } catch (ClassNotFoundException | SQLException ce) {
            ce.printStackTrace();

        }

    }

    private void propA2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propA2.isSelected()) {
            propA1.setSelected(false);
            propA3.setSelected(false);
        }
    }

    private void propA3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propA3.isSelected()) {
            propA1.setSelected(false);
            propA2.setSelected(false);
        }
    }

    private void propB3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propB3.isSelected()) {
            propB2.setSelected(false);
            propB1.setSelected(false);
        }
    }

    private void propC2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propC2.isSelected()) {
            propC1.setSelected(false);
            propC3.setSelected(false);
        }
    }

    private void propC3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propC3.isSelected()) {
            propC1.setSelected(false);
            propC2.setSelected(false);
        }
    }

    private void propD3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propD3.isSelected()) {
            propD1.setSelected(false);
            propD2.setSelected(false);
        }
    }

    private void propE1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propE1.isSelected()) {
            propE2.setSelected(false);
            propE3.setSelected(false);
        }
    }

    private void propE2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (propE2.isSelected()) {
            propE1.setSelected(false);
            propE3.setSelected(false);
        }
    }

    private void lmaoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new survey(st, pw).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lmao;
    private javax.swing.JRadioButton propA1;
    private javax.swing.JRadioButton propA2;
    private javax.swing.JRadioButton propA3;
    private javax.swing.JRadioButton propB1;
    private javax.swing.JRadioButton propB2;
    private javax.swing.JRadioButton propB3;
    private javax.swing.JRadioButton propC1;
    private javax.swing.JRadioButton propC2;
    private javax.swing.JRadioButton propC3;
    private javax.swing.JRadioButton propD1;
    private javax.swing.JRadioButton propD2;
    private javax.swing.JRadioButton propD3;
    private javax.swing.JRadioButton propE1;
    private javax.swing.JRadioButton propE2;
    private javax.swing.JRadioButton propE3;
    // End of variables declaration                   
}