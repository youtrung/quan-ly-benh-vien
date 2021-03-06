/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DAO.DAO_Profiles;
import MODEL.TableModelProfiles;
import POJO.POJO_Profiles;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Admin
 */
public class GUI_Profiles extends javax.swing.JPanel {
      TableModelProfiles tblModelProfiles;
       POJO_Profiles  p;
    /**
     * Creates new form GUI_Profiles
     */
    public GUI_Profiles() {
        initComponents();
        initTableProfiles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogProfiles = new javax.swing.JDialog();
        btnTaoprofiles = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNameprofiles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSessions_per_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConnecttimes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdleTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpusession = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpuCall = new javax.swing.JTextField();
        dialogAltersys = new javax.swing.JDialog();
        btnAlterInfo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAlterNameprofiles = new javax.swing.JTextField();
        txtAlterSessions_per_user = new javax.swing.JTextField();
        txtAlterConnecttimes = new javax.swing.JTextField();
        txtAlterIdleTime = new javax.swing.JTextField();
        txtAlterCpusession = new javax.swing.JTextField();
        txtAlterCpuCall = new javax.swing.JTextField();
        ckConnectTimes = new javax.swing.JCheckBox();
        ckIdletime = new javax.swing.JCheckBox();
        ckcpupercall = new javax.swing.JCheckBox();
        ckSession_per_user = new javax.swing.JCheckBox();
        ckCpu_per_sessions = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btnProfiles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblprofile = new javax.swing.JTable();
        btnDrop = new javax.swing.JButton();
        txtProfiles = new javax.swing.JTextField();
        btnViewdetail = new javax.swing.JButton();
        btnAlterSystem = new javax.swing.JButton();

        dialogProfiles.setLocation(new java.awt.Point(450, 400));
        dialogProfiles.setMinimumSize(new java.awt.Dimension(800, 300));
        dialogProfiles.setName("dialogCreateProfile"); // NOI18N

        btnTaoprofiles.setText("T???o");
        btnTaoprofiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoprofilesActionPerformed(evt);
            }
        });

        jLabel2.setText("Name_Profiles:");

        jLabel7.setText("sessions_per_user:");

        jLabel5.setText("Connect_Time(min):");

        jLabel6.setText("idle_time:");

        jLabel3.setText(" cpu_per_session:");

        jLabel4.setText(" cpu_per_call:");

        javax.swing.GroupLayout dialogProfilesLayout = new javax.swing.GroupLayout(dialogProfiles.getContentPane());
        dialogProfiles.getContentPane().setLayout(dialogProfilesLayout);
        dialogProfilesLayout.setHorizontalGroup(
            dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProfilesLayout.createSequentialGroup()
                .addGroup(dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogProfilesLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogProfilesLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSessions_per_user, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpusession, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpuCall, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogProfilesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameprofiles, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConnecttimes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdleTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dialogProfilesLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnTaoprofiles, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        dialogProfilesLayout.setVerticalGroup(
            dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProfilesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNameprofiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtConnecttimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdleTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogProfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSessions_per_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpusession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpuCall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTaoprofiles)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        dialogAltersys.setLocation(new java.awt.Point(450, 400));
        dialogAltersys.setMinimumSize(new java.awt.Dimension(800, 300));
        dialogAltersys.setName("dialogCreateProfile"); // NOI18N

        btnAlterInfo.setText("S???a th??ng tin ");
        btnAlterInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterInfoActionPerformed(evt);
            }
        });

        jLabel8.setText("Name_Profiles:");

        ckConnectTimes.setText("Connect_time");

        ckIdletime.setText("idle_time");

        ckcpupercall.setText("cpu_per_call");

        ckSession_per_user.setText("sessions_per_user");

        ckCpu_per_sessions.setText(" cpu_per_session");

        javax.swing.GroupLayout dialogAltersysLayout = new javax.swing.GroupLayout(dialogAltersys.getContentPane());
        dialogAltersys.getContentPane().setLayout(dialogAltersysLayout);
        dialogAltersysLayout.setHorizontalGroup(
            dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAltersysLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogAltersysLayout.createSequentialGroup()
                        .addComponent(ckConnectTimes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterConnecttimes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckIdletime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterIdleTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckcpupercall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterCpuCall, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogAltersysLayout.createSequentialGroup()
                        .addComponent(ckSession_per_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterSessions_per_user, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogAltersysLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnAlterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogAltersysLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckCpu_per_sessions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlterCpusession, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dialogAltersysLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterNameprofiles, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        dialogAltersysLayout.setVerticalGroup(
            dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAltersysLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAlterNameprofiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlterConnecttimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlterIdleTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckConnectTimes)
                    .addComponent(ckIdletime)
                    .addComponent(ckcpupercall)
                    .addComponent(txtAlterCpuCall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogAltersysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlterSessions_per_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlterCpusession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckSession_per_user)
                    .addComponent(ckCpu_per_sessions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnAlterInfo)
                .addContainerGap())
        );

        btnProfiles.setText("Create Profiles");
        btnProfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilesActionPerformed(evt);
            }
        });

        jLabel1.setText("Profiles");

        tblprofile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblprofile);

        btnDrop.setText("Drop Profiles");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        txtProfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfilesActionPerformed(evt);
            }
        });

        btnViewdetail.setText("Views Details");
        btnViewdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewdetailActionPerformed(evt);
            }
        });

        btnAlterSystem.setText("Alter profiles");
        btnAlterSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterSystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProfiles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDrop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewdetail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterSystem))
                            .addComponent(jLabel1))
                        .addGap(0, 268, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfiles)
                    .addComponent(btnDrop)
                    .addComponent(txtProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewdetail)
                    .addComponent(btnAlterSystem))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilesActionPerformed
        // TODO add your handling code here:
        dialogProfiles.show();
    }//GEN-LAST:event_btnProfilesActionPerformed

    private void btnTaoprofilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoprofilesActionPerformed
        // TODO add your handling code here:
         p=new POJO_Profiles();
        p.setProfiles(txtNameprofiles.getText());
        p.setConnectTime(txtConnecttimes.getText());
        p.setIdleTime(txtIdleTime.getText());
        p.setSessionperuser(txtSessions_per_user.getText());
        p.setCpupercall(txtCpuCall.getText());
        p.setCpupersession(txtCpusession.getText());
        DAO_Profiles prof=new DAO_Profiles();
        prof.addProfiles(p);
        tblModelProfiles= new TableModelProfiles();
        tblprofile.setModel(tblModelProfiles);
        dialogProfiles.dispose();
        
    }//GEN-LAST:event_btnTaoprofilesActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        // TODO add your handling code here:
        int index=tblprofile.getSelectedRow();
            POJO_Profiles p=tblModelProfiles.getByIndex(index);
        DAO_Profiles prof=new DAO_Profiles();
        prof.dropProfiles(txtProfiles.getText());
        tblModelProfiles.removeElement(p);
    }//GEN-LAST:event_btnDropActionPerformed

    private void txtProfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfilesActionPerformed

    private void btnViewdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewdetailActionPerformed
        // TODO add your handling code here:
        initsearchProfiles();
    }//GEN-LAST:event_btnViewdetailActionPerformed

    private void btnAlterSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterSystemActionPerformed
        // TODO add your handling code here:
        txtAlterNameprofiles.setText(txtProfiles.getText());
        txtAlterConnecttimes.setText(p.getConnectTime());
        txtAlterCpuCall.setText(p.getCpupercall());
        txtAlterIdleTime.setText(p.getIdleTime());
        txtAlterSessions_per_user.setText(p.getSessionperuser());
        txtAlterCpusession.setText(p.getCpupersession());
        dialogAltersys.show();
    }//GEN-LAST:event_btnAlterSystemActionPerformed

    private void btnAlterInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterInfoActionPerformed
        // TODO add your handling code here:
         POJO_Profiles  p=new POJO_Profiles();
         ArrayList<String> cacThongtincansua= new ArrayList<>();
         if(ckConnectTimes.isSelected())
         {
             cacThongtincansua.add(ckConnectTimes.getText()+" "+txtAlterConnecttimes.getText()+ " ");
         }
         if(ckcpupercall.isSelected())
         {
             cacThongtincansua.add(ckcpupercall.getText()+" "+txtAlterCpuCall.getText()+ " ");
         }
         if(ckCpu_per_sessions.isSelected())
         {
             cacThongtincansua.add(ckCpu_per_sessions.getText()+" "+txtAlterCpusession.getText()+ " ");
         }
         if(ckIdletime.isSelected())
         {
             cacThongtincansua.add(ckIdletime.getText()+" "+txtAlterIdleTime.getText()+ " ");
         }
         if(ckSession_per_user.isSelected())
         {
             cacThongtincansua.add(ckSession_per_user.getText()+" "+txtAlterSessions_per_user.getText()+ " ");
         }
         String kq="";
            for(String s : cacThongtincansua)
            {
                kq+=s;
            }
            
        DAO_Profiles prof=new DAO_Profiles();
        if (kq.trim().length()>1)
        {
            prof.alterProfiles(txtAlterNameprofiles.getText(),kq);
            tblModelProfiles= new TableModelProfiles();
            tblprofile.setModel(tblModelProfiles);
        }
             dialogAltersys.dispose();
        
    }//GEN-LAST:event_btnAlterInfoActionPerformed
    public void initTableProfiles()
    {
         tblModelProfiles= new TableModelProfiles();
         tblprofile.setModel(tblModelProfiles);
         tblprofile.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                  if (e.getValueIsAdjusting()){
                        return;
                }
                  int index=tblprofile.getSelectedRow();
                  if (index <0)
                  {
                      return ;
                  }
                   p=tblModelProfiles.getByIndex(index);
                  txtProfiles.setText(p.getProfiles());
                  
       
                  
             }
         });
    }
     public void initsearchProfiles()
    {
         tblModelProfiles= new TableModelProfiles(txtProfiles.getText());
         tblprofile.setModel(tblModelProfiles);
         tblprofile.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                  if (e.getValueIsAdjusting()){
                        return;
                }
                  int index=tblprofile.getSelectedRow();
                  if (index <0)
                  {
                      return ;
                  }
                  POJO_Profiles pro=tblModelProfiles.getByIndex(index);
                  txtProfiles.setText(pro.getProfiles());
                  
             }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterInfo;
    private javax.swing.JButton btnAlterSystem;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnProfiles;
    private javax.swing.JButton btnTaoprofiles;
    private javax.swing.JButton btnViewdetail;
    private javax.swing.JCheckBox ckConnectTimes;
    private javax.swing.JCheckBox ckCpu_per_sessions;
    private javax.swing.JCheckBox ckIdletime;
    private javax.swing.JCheckBox ckSession_per_user;
    private javax.swing.JCheckBox ckcpupercall;
    private javax.swing.JDialog dialogAltersys;
    private javax.swing.JDialog dialogProfiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblprofile;
    private javax.swing.JTextField txtAlterConnecttimes;
    private javax.swing.JTextField txtAlterCpuCall;
    private javax.swing.JTextField txtAlterCpusession;
    private javax.swing.JTextField txtAlterIdleTime;
    private javax.swing.JTextField txtAlterNameprofiles;
    private javax.swing.JTextField txtAlterSessions_per_user;
    private javax.swing.JTextField txtConnecttimes;
    private javax.swing.JTextField txtCpuCall;
    private javax.swing.JTextField txtCpusession;
    private javax.swing.JTextField txtIdleTime;
    private javax.swing.JTextField txtNameprofiles;
    private javax.swing.JTextField txtProfiles;
    private javax.swing.JTextField txtSessions_per_user;
    // End of variables declaration//GEN-END:variables
}
