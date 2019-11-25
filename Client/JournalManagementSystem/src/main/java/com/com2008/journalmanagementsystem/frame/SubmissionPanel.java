/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem.frame;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.com2008.journalmanagementsystem.model.Account;
import com.com2008.journalmanagementsystem.model.Author;
import com.com2008.journalmanagementsystem.util.database.Database;

/**
 *
 * @author boxuanshan
 */
public class SubmissionPanel extends javax.swing.JPanel {

    /**
     * Creates new form SubmissionPanel
     */
    public SubmissionPanel() {
        initComponents();
    }

    private JFrame parent;

    public SubmissionPanel(JFrame parent) {
        initComponents();

        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        journalPanel = new javax.swing.JPanel();
        journalLabel = new javax.swing.JLabel();
        journalComboBox = new javax.swing.JComboBox<>();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        filePanel = new javax.swing.JPanel();
        fileLabel = new javax.swing.JLabel();
        chooseFileBtn = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20),
                new java.awt.Dimension(32767, 20));
        corrAuthorPanel = new javax.swing.JPanel();
        corrAuthorTextField = new javax.swing.JTextField();
        setCorrAuthorBtn = new javax.swing.JButton();
        selectedCorrAuthorPanel = new javax.swing.JPanel();
        corrAuthorLabel = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20),
                new java.awt.Dimension(32767, 20));
        coAuthorPanel = new javax.swing.JPanel();
        coAuthorTextField = new javax.swing.JTextField();
        setCoAuthorBtn = new javax.swing.JButton();
        removeCoAuthorBtn = new javax.swing.JButton();
        coAuthorScrollPane = new javax.swing.JScrollPane();
        coAuthorList = new javax.swing.JList<>();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20),
                new java.awt.Dimension(32767, 20));
        submitPanel = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0),
                new java.awt.Dimension(0, 32767));

        setLayout(new java.awt.BorderLayout());

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.PAGE_AXIS));

        journalPanel.setLayout(new javax.swing.BoxLayout(journalPanel, javax.swing.BoxLayout.LINE_AXIS));

        journalLabel.setText("Journal to submit:");
        journalPanel.add(journalLabel);

        journalComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        journalComboBox.setMaximumSize(new java.awt.Dimension(32767, 27));
        journalPanel.add(journalComboBox);

        mainPanel.add(journalPanel);

        titlePanel.setLayout(new javax.swing.BoxLayout(titlePanel, javax.swing.BoxLayout.LINE_AXIS));

        titleLabel.setText("Title: ");
        titlePanel.add(titleLabel);

        titleTextField.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        titlePanel.add(titleTextField);

        mainPanel.add(titlePanel);

        filePanel.setMaximumSize(new java.awt.Dimension(2147483647, 45));
        filePanel.setLayout(new java.awt.BorderLayout());

        fileLabel.setText("<No file selected>");
        filePanel.add(fileLabel, java.awt.BorderLayout.CENTER);

        chooseFileBtn.setText("Choose a file...");
        chooseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileBtnActionPerformed(evt);
            }
        });
        filePanel.add(chooseFileBtn, java.awt.BorderLayout.EAST);

        mainPanel.add(filePanel);
        mainPanel.add(filler2);

        corrAuthorPanel.setLayout(new javax.swing.BoxLayout(corrAuthorPanel, javax.swing.BoxLayout.LINE_AXIS));

        corrAuthorTextField.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        corrAuthorPanel.add(corrAuthorTextField);

        setCorrAuthorBtn.setText("Set Corr-author");
        setCorrAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCorrAuthorBtnActionPerformed(evt);
            }
        });
        corrAuthorPanel.add(setCorrAuthorBtn);

        mainPanel.add(corrAuthorPanel);

        selectedCorrAuthorPanel.setMaximumSize(new java.awt.Dimension(2147483647, 16));
        selectedCorrAuthorPanel.setLayout(new java.awt.BorderLayout());

        corrAuthorLabel.setText("<No corr-author setted>");
        selectedCorrAuthorPanel.add(corrAuthorLabel, java.awt.BorderLayout.CENTER);

        mainPanel.add(selectedCorrAuthorPanel);
        mainPanel.add(filler3);

        coAuthorPanel.setLayout(new javax.swing.BoxLayout(coAuthorPanel, javax.swing.BoxLayout.LINE_AXIS));

        coAuthorTextField.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        coAuthorPanel.add(coAuthorTextField);

        setCoAuthorBtn.setText("Add Co-author");
        coAuthorPanel.add(setCoAuthorBtn);

        removeCoAuthorBtn.setText("Remove");
        coAuthorPanel.add(removeCoAuthorBtn);

        mainPanel.add(coAuthorPanel);

        coAuthorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        coAuthorScrollPane.setViewportView(coAuthorList);

        mainPanel.add(coAuthorScrollPane);
        mainPanel.add(filler4);

        submitPanel.setMaximumSize(new java.awt.Dimension(2147483647, 29));
        submitPanel.setLayout(new java.awt.BorderLayout());

        submitBtn.setText("Submit");
        submitBtn.setActionCommand("Submit");
        submitPanel.add(submitBtn, java.awt.BorderLayout.EAST);

        mainPanel.add(submitPanel);
        mainPanel.add(filler1);

        jScrollPane1.setViewportView(mainPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private File pdfFile;

    private void chooseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chooseFileBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF (*.pdf)", "pdf"));
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            pdfFile = fileChooser.getSelectedFile();
            // TODO : Check format
            fileLabel.setText(pdfFile.getName());
        }
        
    }// GEN-LAST:event_chooseFileBtnActionPerformed

    private Account corrAuthor;

    private void setCorrAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_setCorrAuthorBtnActionPerformed
        String email = corrAuthorTextField.getText();
        try {
            List<Account> accounts = Database.read("Account", new Account(email, null, null, null, null));
            if(accounts.size() > 0){
                corrAuthor = accounts.get(0);
                corrAuthorLabel.setText(corrAuthor.toString());
            }
            else{
                RegisterDialog dialog = new RegisterDialog(parent, true, email);
                dialog.setVisible(true);
                if(dialog.isRegistered()){
                    corrAuthor = dialog.getAccount();
                    String hashedPassword = dialog.getHashedPassword();
                    try {
                        if(Database.write("Account", corrAuthor) == 1){
                            if(Database.write("Author", new Author(corrAuthor.getEmail(), hashedPassword)) == 1){
                                JOptionPane.showMessageDialog(null, "registration success", "Register", JOptionPane.INFORMATION_MESSAGE);
                                corrAuthorLabel.setText(corrAuthor.toString());
                            }
                            else{
                                // TODO : Regiter failed
                            }
                        }
                        else{
                            // TODO : Regiter failed
                        }
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_setCorrAuthorBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileBtn;
    private javax.swing.JList<String> coAuthorList;
    private javax.swing.JPanel coAuthorPanel;
    private javax.swing.JScrollPane coAuthorScrollPane;
    private javax.swing.JTextField coAuthorTextField;
    private javax.swing.JLabel corrAuthorLabel;
    private javax.swing.JPanel corrAuthorPanel;
    private javax.swing.JTextField corrAuthorTextField;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JPanel filePanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> journalComboBox;
    private javax.swing.JLabel journalLabel;
    private javax.swing.JPanel journalPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton removeCoAuthorBtn;
    private javax.swing.JPanel selectedCorrAuthorPanel;
    private javax.swing.JButton setCoAuthorBtn;
    private javax.swing.JButton setCorrAuthorBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JPanel submitPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
