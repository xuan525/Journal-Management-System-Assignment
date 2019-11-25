/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem.frame;

import java.awt.Dimension;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.com2008.journalmanagementsystem.model.Account;
import com.com2008.journalmanagementsystem.util.Password;

/**
 *
 * @author Xuan
 */
public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form registerPanel
     */
    public RegisterPanel() {
        initComponents();
    }

    public Account getRegInfo(){
        String email = emailTextField.getText();
        String title = titleComboBox.getSelectedItem().toString();
        String forename = forenameTextField.getText();
        String surname = surnameTextField.getText();
        String university = universityTextField.getText();

        Account account = new Account(email, title, forename, surname, university);
        
        return account;
    }

    public String getHashedPassword(){
        char[] password = passwordField.getPassword();
        String hashedPassword = Password.generateHash(new String(password));
        return hashedPassword;
    }

    public boolean verify(){
        String email = emailTextField.getText();
        String title = titleComboBox.getSelectedItem().toString();
        String forename = forenameTextField.getText();
        String surname = surnameTextField.getText();
        String university = universityTextField.getText();
        char[] password = passwordField.getPassword();
        char[] rePassword = rePasswordField.getPassword();

        if(email.isBlank() || title.isBlank() || forename.isBlank() || surname.isBlank() || university.isBlank() || new String(password).isBlank() || new String(rePassword).isBlank()){
            JOptionPane.showMessageDialog(null, "Please complete all the fileds.", "Register", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String patternString = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Invalid email.", "Register", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(!Arrays.equals(password, rePassword)){
            JOptionPane.showMessageDialog(null, "Inconsistent password.", "Register", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        emailPanel = new javax.swing.JPanel();
        emailLabelPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        emailTextField = new javax.swing.JTextField();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        passwordPanel = new javax.swing.JPanel();
        passwordLabelPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        passwordField = new javax.swing.JPasswordField();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        rePasswordPanel = new javax.swing.JPanel();
        rePasswordLabelPanel = new javax.swing.JPanel();
        rePasswordLabel = new javax.swing.JLabel();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        rePasswordField = new javax.swing.JPasswordField();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        universityPanel = new javax.swing.JPanel();
        universityLabelPanel = new javax.swing.JPanel();
        universityLabel = new javax.swing.JLabel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        universityTextField = new javax.swing.JTextField();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        titlePanel = new javax.swing.JPanel();
        titleLabelPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        titleComboBox = new javax.swing.JComboBox<>();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        forenamePanel = new javax.swing.JPanel();
        forenameLabelPanel = new javax.swing.JPanel();
        forenameLabel = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        forenameTextField = new javax.swing.JTextField();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        surnamePanel = new javax.swing.JPanel();
        surnameLabelPanel = new javax.swing.JPanel();
        surnameLabel = new javax.swing.JLabel();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        surnameTextField = new javax.swing.JTextField();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));

        setLayout(new java.awt.BorderLayout());

        mainScrollPane.setBackground(Theme.getBgColor());
        mainScrollPane.setBorder(null);

        mainPanel.setBackground(Theme.getBgColor());
        mainPanel.setLayout(new java.awt.BorderLayout());

        innerPanel.setBackground(Theme.getBgColor());
        innerPanel.setLayout(new javax.swing.BoxLayout(innerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        emailPanel.setBackground(Theme.getBgColor());
        emailPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        emailPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        emailPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        emailPanel.setLayout(new java.awt.BorderLayout());

        emailLabelPanel.setBackground(Theme.getBgColor());
        emailLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        emailLabelPanel.setPreferredSize(getTextfieldLabelSize());
        emailLabelPanel.setLayout(new java.awt.BorderLayout());

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(204, 204, 204));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        emailLabel.setText("Email:");
        emailLabelPanel.add(emailLabel, java.awt.BorderLayout.CENTER);
        emailLabelPanel.add(filler16, java.awt.BorderLayout.EAST);

        emailPanel.add(emailLabelPanel, java.awt.BorderLayout.WEST);

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailTextField.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        emailPanel.add(emailTextField, java.awt.BorderLayout.CENTER);
        emailPanel.add(filler17, java.awt.BorderLayout.SOUTH);

        innerPanel.add(emailPanel);

        passwordPanel.setBackground(Theme.getBgColor());
        passwordPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        passwordPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        passwordPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        passwordPanel.setLayout(new java.awt.BorderLayout());

        passwordLabelPanel.setBackground(Theme.getBgColor());
        passwordLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        passwordLabelPanel.setPreferredSize(getTextfieldLabelSize());
        passwordLabelPanel.setLayout(new java.awt.BorderLayout());

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordLabel.setText("Password:");
        passwordLabelPanel.add(passwordLabel, java.awt.BorderLayout.CENTER);
        passwordLabelPanel.add(filler18, java.awt.BorderLayout.EAST);

        passwordPanel.add(passwordLabelPanel, java.awt.BorderLayout.WEST);

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        passwordPanel.add(passwordField, java.awt.BorderLayout.CENTER);
        passwordPanel.add(filler19, java.awt.BorderLayout.SOUTH);

        innerPanel.add(passwordPanel);

        rePasswordPanel.setBackground(Theme.getBgColor());
        rePasswordPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        rePasswordPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        rePasswordPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        rePasswordPanel.setLayout(new java.awt.BorderLayout());

        rePasswordLabelPanel.setBackground(Theme.getBgColor());
        rePasswordLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        rePasswordLabelPanel.setPreferredSize(getTextfieldLabelSize());
        rePasswordLabelPanel.setLayout(new java.awt.BorderLayout());

        rePasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rePasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        rePasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rePasswordLabel.setText("Confirm password:");
        rePasswordLabelPanel.add(rePasswordLabel, java.awt.BorderLayout.CENTER);
        rePasswordLabelPanel.add(filler20, java.awt.BorderLayout.EAST);

        rePasswordPanel.add(rePasswordLabelPanel, java.awt.BorderLayout.WEST);

        rePasswordField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rePasswordPanel.add(rePasswordField, java.awt.BorderLayout.CENTER);
        rePasswordPanel.add(filler21, java.awt.BorderLayout.SOUTH);

        innerPanel.add(rePasswordPanel);

        universityPanel.setBackground(Theme.getBgColor());
        universityPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        universityPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        universityPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        universityPanel.setLayout(new java.awt.BorderLayout());

        universityLabelPanel.setBackground(Theme.getBgColor());
        universityLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        universityLabelPanel.setPreferredSize(getTextfieldLabelSize());
        universityLabelPanel.setLayout(new java.awt.BorderLayout());

        universityLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        universityLabel.setForeground(new java.awt.Color(204, 204, 204));
        universityLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        universityLabel.setText("University:");
        universityLabelPanel.add(universityLabel, java.awt.BorderLayout.CENTER);
        universityLabelPanel.add(filler22, java.awt.BorderLayout.EAST);

        universityPanel.add(universityLabelPanel, java.awt.BorderLayout.WEST);

        universityTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        universityTextField.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        universityPanel.add(universityTextField, java.awt.BorderLayout.CENTER);
        universityPanel.add(filler23, java.awt.BorderLayout.SOUTH);

        innerPanel.add(universityPanel);

        titlePanel.setBackground(Theme.getBgColor());
        titlePanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        titlePanel.setMinimumSize(new java.awt.Dimension(0, 31));
        titlePanel.setPreferredSize(new java.awt.Dimension(120, 31));
        titlePanel.setLayout(new java.awt.BorderLayout());

        titleLabelPanel.setBackground(Theme.getBgColor());
        titleLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        titleLabelPanel.setPreferredSize(getTextfieldLabelSize());
        titleLabelPanel.setLayout(new java.awt.BorderLayout());

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 204, 204));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText("Title:");
        titleLabelPanel.add(titleLabel, java.awt.BorderLayout.CENTER);
        titleLabelPanel.add(filler29, java.awt.BorderLayout.EAST);

        titlePanel.add(titleLabelPanel, java.awt.BorderLayout.WEST);

        titleComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        titleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof", "Dr", "Mr", "Ms" }));
        titlePanel.add(titleComboBox, java.awt.BorderLayout.CENTER);
        titlePanel.add(filler30, java.awt.BorderLayout.SOUTH);

        innerPanel.add(titlePanel);

        forenamePanel.setBackground(Theme.getBgColor());
        forenamePanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        forenamePanel.setMinimumSize(new java.awt.Dimension(0, 31));
        forenamePanel.setPreferredSize(new java.awt.Dimension(120, 31));
        forenamePanel.setLayout(new java.awt.BorderLayout());

        forenameLabelPanel.setBackground(Theme.getBgColor());
        forenameLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        forenameLabelPanel.setPreferredSize(getTextfieldLabelSize());
        forenameLabelPanel.setLayout(new java.awt.BorderLayout());

        forenameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forenameLabel.setForeground(new java.awt.Color(204, 204, 204));
        forenameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        forenameLabel.setText("Forename:");
        forenameLabelPanel.add(forenameLabel, java.awt.BorderLayout.CENTER);
        forenameLabelPanel.add(filler24, java.awt.BorderLayout.EAST);

        forenamePanel.add(forenameLabelPanel, java.awt.BorderLayout.WEST);

        forenameTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forenameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        forenamePanel.add(forenameTextField, java.awt.BorderLayout.CENTER);
        forenamePanel.add(filler25, java.awt.BorderLayout.SOUTH);

        innerPanel.add(forenamePanel);

        surnamePanel.setBackground(Theme.getBgColor());
        surnamePanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        surnamePanel.setMinimumSize(new java.awt.Dimension(0, 31));
        surnamePanel.setPreferredSize(new java.awt.Dimension(120, 31));
        surnamePanel.setLayout(new java.awt.BorderLayout());

        surnameLabelPanel.setBackground(Theme.getBgColor());
        surnameLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        surnameLabelPanel.setPreferredSize(getTextfieldLabelSize());
        surnameLabelPanel.setLayout(new java.awt.BorderLayout());

        surnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(204, 204, 204));
        surnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        surnameLabel.setText("Surname:");
        surnameLabelPanel.add(surnameLabel, java.awt.BorderLayout.CENTER);
        surnameLabelPanel.add(filler27, java.awt.BorderLayout.EAST);

        surnamePanel.add(surnameLabelPanel, java.awt.BorderLayout.WEST);

        surnameTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        surnameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        surnamePanel.add(surnameTextField, java.awt.BorderLayout.CENTER);
        surnamePanel.add(filler28, java.awt.BorderLayout.SOUTH);

        innerPanel.add(surnamePanel);

        mainPanel.add(innerPanel, java.awt.BorderLayout.CENTER);
        mainPanel.add(filler2, java.awt.BorderLayout.NORTH);
        mainPanel.add(filler3, java.awt.BorderLayout.SOUTH);
        mainPanel.add(filler13, java.awt.BorderLayout.WEST);
        mainPanel.add(filler14, java.awt.BorderLayout.EAST);

        mainScrollPane.setViewportView(mainPanel);

        add(mainScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Element size">
    private Dimension textfieldLabelSize = new Dimension(120, 100);
    private Dimension getTextfieldLabelSize(){
        return textfieldLabelSize;
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailLabelPanel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.JLabel forenameLabel;
    private javax.swing.JPanel forenameLabelPanel;
    private javax.swing.JPanel forenamePanel;
    private javax.swing.JTextField forenameTextField;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordLabelPanel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPasswordField rePasswordField;
    private javax.swing.JLabel rePasswordLabel;
    private javax.swing.JPanel rePasswordLabelPanel;
    private javax.swing.JPanel rePasswordPanel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JPanel surnameLabelPanel;
    private javax.swing.JPanel surnamePanel;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JComboBox<String> titleComboBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titleLabelPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JPanel universityLabelPanel;
    private javax.swing.JPanel universityPanel;
    private javax.swing.JTextField universityTextField;
    // End of variables declaration//GEN-END:variables
}
