/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthview;

import model.Facility;

/**
 *
 * @author Mohammad
 */
public class Root extends javax.swing.JFrame {

    /**
     * Creates new form root
     */
    public Root() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        top = new javax.swing.JPanel();
        Go = new javax.swing.JButton();
        removeFacilityFromList = new javax.swing.JButton();
        runPassPrediction = new javax.swing.JButton();
        NewFacility = new javax.swing.JButton();
        CustomFacility = new javax.swing.JButton();
        CustomSatellite = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Compass = new javax.swing.JToggleButton();
        WorldView = new javax.swing.JToggleButton();
        Scale = new javax.swing.JToggleButton();
        Exit = new javax.swing.JButton();
        satReport = new javax.swing.JButton();
        satDetailsButton = new javax.swing.JButton();
        excelSat = new javax.swing.JButton();
        allSatsButton = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        bottom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        localTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        universalTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        localDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        universalDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        facilityList = new javax.swing.JList<>();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        customeFacilityMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        CustomSatelliteMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        SaveMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        compassMenuItem = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        worldMenuItem = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        scaleMenuItem = new javax.swing.JCheckBoxMenuItem();
        placeNameMenuItem = new javax.swing.JCheckBoxMenuItem();
        openStreetMenuItem = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        top.setPreferredSize(new java.awt.Dimension(701, 70));

        Go.setText("برو");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        removeFacilityFromList.setText("حذف از لیست");
        removeFacilityFromList.setToolTipText("");
        removeFacilityFromList.setEnabled(false);
        removeFacilityFromList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFacilityFromListActionPerformed(evt);
            }
        });

        runPassPrediction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        runPassPrediction.setForeground(java.awt.Color.darkGray);
        runPassPrediction.setText("پردازش");
        runPassPrediction.setToolTipText("");
        runPassPrediction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runPassPredictionActionPerformed(evt);
            }
        });

        NewFacility.setText("تجهیزات");
        NewFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFacilityActionPerformed(evt);
            }
        });

        CustomFacility.setText("معرفی تجهیزات");
        CustomFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomFacilityActionPerformed(evt);
            }
        });

        CustomSatellite.setText("ماهواره");
        CustomSatellite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomSatelliteActionPerformed(evt);
            }
        });

        Help.setText("راهنما");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        Compass.setText("جهت");
        Compass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompassActionPerformed(evt);
            }
        });

        WorldView.setText("دید جهانی");
        WorldView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorldViewActionPerformed(evt);
            }
        });

        Scale.setText("مقیاس");
        Scale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleActionPerformed(evt);
            }
        });

        Exit.setText("خروج");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        satReport.setText("گزارش ماهواره ها");
        satReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satReportActionPerformed(evt);
            }
        });

        satDetailsButton.setText("جزییات ماهواره");
        satDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satDetailsButtonActionPerformed(evt);
            }
        });

        excelSat.setText("تعریف دسته ایی ماهواره");
        excelSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelSatActionPerformed(evt);
            }
        });

        allSatsButton.setText("لیست ماهواره ها");
        allSatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allSatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addComponent(Go)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeFacilityFromList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewFacility)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomSatellite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WorldView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Compass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satDetailsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excelSat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allSatsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runPassPrediction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runPassPrediction, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Go)
                    .addComponent(removeFacilityFromList)
                    .addComponent(NewFacility)
                    .addComponent(CustomFacility)
                    .addComponent(CustomSatellite)
                    .addComponent(Scale)
                    .addComponent(WorldView)
                    .addComponent(Compass)
                    .addComponent(Help)
                    .addComponent(Exit)
                    .addComponent(satReport)
                    .addComponent(satDetailsButton)
                    .addComponent(excelSat)
                    .addComponent(allSatsButton))
                .addContainerGap())
        );

        getContentPane().add(top, java.awt.BorderLayout.PAGE_START);

        bottom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("زمان محلی");

        localTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        localTime.setForeground(java.awt.Color.darkGray);
        localTime.setText("00:00:00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("زمان جهانی");

        universalTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        universalTime.setForeground(java.awt.Color.darkGray);
        universalTime.setText("00:00:00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("تاریخ محلی");

        localDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        localDate.setForeground(java.awt.Color.darkGray);
        localDate.setText("14/10/2016");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("تاریخ جهانی");

        universalDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        universalDate.setForeground(java.awt.Color.darkGray);
        universalDate.setText("14/10/2016");

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(universalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(localDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(universalTime)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(localTime, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(localTime)
                    .addComponent(jLabel2)
                    .addComponent(universalTime)
                    .addComponent(jLabel3)
                    .addComponent(localDate)
                    .addComponent(jLabel5)
                    .addComponent(universalDate))
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 1297, Short.MAX_VALUE)
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        left.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        facilityList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        facilityList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facilityListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(facilityList);

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        getContentPane().add(left, java.awt.BorderLayout.LINE_START);

        fileMenu.setText("File");

        newMenuItem.setText("تجهیزات");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);
        fileMenu.add(jSeparator3);

        customeFacilityMenuItem.setText("تعریف تجهیزات");
        customeFacilityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeFacilityMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(customeFacilityMenuItem);
        fileMenu.add(jSeparator4);

        CustomSatelliteMenuItem.setText("تعریف ماهواره");
        CustomSatelliteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomSatelliteMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(CustomSatelliteMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        SaveMenuItem.setText("ذخیره");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(SaveMenuItem);

        menuBar.add(editMenu);

        jMenu1.setText("view");

        compassMenuItem.setText("جهت");
        compassMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compassMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(compassMenuItem);
        jMenu1.add(jSeparator1);

        worldMenuItem.setText("دید جهانی");
        worldMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worldMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(worldMenuItem);
        jMenu1.add(jSeparator2);

        scaleMenuItem.setText("مقیاس");
        scaleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(scaleMenuItem);

        placeNameMenuItem.setText("نام مناطق جهان");
        placeNameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeNameMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(placeNameMenuItem);

        openStreetMenuItem.setText("نام مناطق و راهها");
        openStreetMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openStreetMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openStreetMenuItem);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
       
        GoDialog goDialog = new GoDialog(this,true);
        goDialog.setVisible(true);       
    }//GEN-LAST:event_GoActionPerformed

    private void scaleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scaleMenuItemActionPerformed

    private void worldMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worldMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worldMenuItemActionPerformed

    private void compassMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compassMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compassMenuItemActionPerformed

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void facilityListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilityListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_facilityListMouseClicked

    private void customeFacilityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeFacilityMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customeFacilityMenuItemActionPerformed

    private void removeFacilityFromListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFacilityFromListActionPerformed
        // TODO add your handling code here: 
        
        
        
    }//GEN-LAST:event_removeFacilityFromListActionPerformed

    private void CustomSatelliteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomSatelliteMenuItemActionPerformed
        
        CreateSatelliteDialog createSatelliteDialog = new CreateSatelliteDialog(this, rootPaneCheckingEnabled);
        createSatelliteDialog.setVisible(true);
    }//GEN-LAST:event_CustomSatelliteMenuItemActionPerformed

    private void runPassPredictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runPassPredictionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runPassPredictionActionPerformed

    private void NewFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFacilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewFacilityActionPerformed

    private void CustomFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomFacilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomFacilityActionPerformed

    private void CustomSatelliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomSatelliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomSatelliteActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HelpActionPerformed

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMenuItemActionPerformed

    private void CompassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompassActionPerformed

    private void WorldViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorldViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorldViewActionPerformed

    private void ScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScaleActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void placeNameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeNameMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeNameMenuItemActionPerformed

    private void openStreetMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStreetMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openStreetMenuItemActionPerformed

    private void satReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satReportActionPerformed

    private void satDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satDetailsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satDetailsButtonActionPerformed

    private void allSatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allSatsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allSatsButtonActionPerformed

    private void excelSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excelSatActionPerformed

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
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Root().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Compass;
    private javax.swing.JButton CustomFacility;
    private javax.swing.JButton CustomSatellite;
    private javax.swing.JMenuItem CustomSatelliteMenuItem;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Go;
    private javax.swing.JButton Help;
    private javax.swing.JButton NewFacility;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JToggleButton Scale;
    private javax.swing.JToggleButton WorldView;
    private javax.swing.JButton allSatsButton;
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel center;
    private javax.swing.JCheckBoxMenuItem compassMenuItem;
    private javax.swing.JMenuItem customeFacilityMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton excelSat;
    public static javax.swing.JList<Facility> facilityList;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPanel left;
    private javax.swing.JLabel localDate;
    private javax.swing.JLabel localTime;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JCheckBoxMenuItem openStreetMenuItem;
    private javax.swing.JCheckBoxMenuItem placeNameMenuItem;
    private javax.swing.JButton removeFacilityFromList;
    private javax.swing.JButton runPassPrediction;
    private javax.swing.JButton satDetailsButton;
    private javax.swing.JButton satReport;
    private javax.swing.JCheckBoxMenuItem scaleMenuItem;
    private javax.swing.JPanel top;
    private javax.swing.JLabel universalDate;
    private javax.swing.JLabel universalTime;
    private javax.swing.JCheckBoxMenuItem worldMenuItem;
    // End of variables declaration//GEN-END:variables
}
