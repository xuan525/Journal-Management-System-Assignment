/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem.frame;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.xml.crypto.Data;

import com.com2008.journalmanagementsystem.model.Account;
import com.com2008.journalmanagementsystem.model.Criticism;
import com.com2008.journalmanagementsystem.model.Response;
import com.com2008.journalmanagementsystem.model.Review;
import com.com2008.journalmanagementsystem.model.Submission;
import com.com2008.journalmanagementsystem.model.SubmissionAuthor;
import com.com2008.journalmanagementsystem.model.Submission.Status;
import com.com2008.journalmanagementsystem.util.database.Database;

/**
 *
 * @author harix
 */
public class ReviewerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReviewerPanel
     */
    private String email;

    public ReviewerPanel(String email) {
        initComponents();

        this.email = email;

        refreshList();
    }

    private void refreshList(){
        try {
            DefaultListModel selectListModel = new DefaultListModel<Submission>();
            List<Submission> sub = Database.read("Submission",new Submission(null, null, null, null, null, null, Status.SUBMITTED));
            for (Submission submission : sub) {
                
                List<SubmissionAuthor> submissionAuthors = Database.read("SubmissionAuthor", new SubmissionAuthor(submission.getIssn(), submission.getSubmissionID(), null));

                List<Account> accounts = new ArrayList<Account>();

                for (SubmissionAuthor submissionAuthor : submissionAuthors)
                    accounts.add(Database.read("Account", new Account(submissionAuthor.getEmail(), null, null, null, null)).get(0));

                HashSet<String> universitySet = new HashSet<String>();
                for (Account account : accounts)
                    universitySet.add(account.getUniversity());

                String reviewerUniversity = Database.read("Account", new Account(email, null, null, null, null)).get(0).getUniversity();
                int reviewSize = Database.read("Review", new Review(email, null, null, null, null, null, null)).size();
                int articleSize = Database.read("SubmissionAuthor", new SubmissionAuthor(null, null, email)).size();

                if(!universitySet.contains(reviewerUniversity)){
                    if (reviewSize - (articleSize*3) < 0){
                        if(Database.read("Review", new Review(email, submission.getIssn(), submission.getSubmissionID(), null, null, null, null)).size() == 0)
                            selectListModel.addElement(submission);
                    }
                }
            }

            List<Review> reviews = Database.read("Review", new Review(email, null, null, null, null, null, null));
                for (Review review : reviews) {
                    Submission submis = Database.read("Submission", new Submission(review.getIssn(), review.getSubmissionID(), null, null, null, null, null, null, null)).get(0);
                    if (submis.getStatus() == Submission.Status.REVIEWED) {
                        // selectListModel.addElement(submis);
                        selectListModel.add(0, submis);
                    }
                }

            selectList.setModel(selectListModel);

            DefaultListModel responsDefaultListModel = new DefaultListModel<Submission>();
            List<Review> reviewList = Database.read("Review", new Review(email, null, null, null, null, null, null));
            for (Review review : reviewList) {
                if (Database.read("Response", new Response(email, review.getIssn(), review.getSubmissionID(), null, null)).size() != 0) {
                    if (review.getFinalVerdict() == null) {
                        responsDefaultListModel.addElement(Database.read("Submission", new Submission(review.getIssn(), review.getSubmissionID(), null, null, null, null, null)).get(0));
                    }
                }
            }
            responsedList.setModel(responsDefaultListModel);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        list = new javax.swing.JPanel();
        SelectResponcePanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        selectPanel = new javax.swing.JPanel();
        selectLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectList = new javax.swing.JList<>();
        authorResponsePanel = new javax.swing.JPanel();
        responsedLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        responsedList = new javax.swing.JList<>();
        refreshButtonPanel = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        reviewPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(200);

        list.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        list.setLayout(new javax.swing.BoxLayout(list, javax.swing.BoxLayout.PAGE_AXIS));

        SelectResponcePanel.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(500);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        selectPanel.setLayout(new java.awt.BorderLayout());

        selectLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectLable.setText("Select here:");
        selectLable.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        selectPanel.add(selectLable, java.awt.BorderLayout.PAGE_START);

        selectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(selectList);

        selectPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane2.setLeftComponent(selectPanel);

        authorResponsePanel.setLayout(new java.awt.BorderLayout());

        responsedLable.setText("Responsed:");
        authorResponsePanel.add(responsedLable, java.awt.BorderLayout.PAGE_START);

        responsedList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        responsedList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                responsedListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(responsedList);

        authorResponsePanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(authorResponsePanel);

        SelectResponcePanel.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        list.add(SelectResponcePanel);

        refreshButtonPanel.setMaximumSize(new java.awt.Dimension(2147483647, 29));
        refreshButtonPanel.setLayout(new java.awt.BorderLayout());

        refreshButton.setText("Refresh list");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        refreshButtonPanel.add(refreshButton, java.awt.BorderLayout.PAGE_END);

        list.add(refreshButtonPanel);

        jSplitPane1.setLeftComponent(list);

        reviewPanel.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(reviewPanel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void selectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectListValueChanged
        responsedList.setSelectedValue(null, false);

        Submission submission = selectList.getSelectedValue();
        if(submission == null){
            return;
        }
        selectList.setEnabled(false);
        responsedList.setEnabled(false);
        ArticlePanel articlePanel = new ArticlePanel(submission, UserRole.REVIEWER, email);
        reviewPanel.removeAll();
        reviewPanel.add(articlePanel);
        reviewPanel.revalidate();
    }//GEN-LAST:event_selectListValueChanged

    private void responsedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_responsedListValueChanged
        // TODO add your handling code here:
        selectList.setSelectedValue(null, false);

        Submission submission = responsedList.getSelectedValue();
        if(submission == null){
            return;
        }
        selectList.setEnabled(false);
        responsedList.setEnabled(false);
        ArticlePanel articlePanel = new ArticlePanel(submission, UserRole.REVIEWER, email);
        reviewPanel.removeAll();
        reviewPanel.add(articlePanel);
        reviewPanel.revalidate();
        selectList.setEnabled(true);
    }//GEN-LAST:event_responsedListValueChanged

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        // Submission submissionNow = selectList.getSelectedValue();
        // selectListModel.removeElement(submissionNow);
        reviewPanel.removeAll();
        reviewPanel.repaint();
        reviewPanel.revalidate();
        refreshList();
        selectList.setEnabled(true);
        responsedList.setEnabled(true);
    }//GEN-LAST:event_refreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SelectResponcePanel;
    private javax.swing.JPanel authorResponsePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel list;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel refreshButtonPanel;
    private javax.swing.JLabel responsedLable;
    private javax.swing.JList<Submission> responsedList;
    private javax.swing.JPanel reviewPanel;
    private javax.swing.JLabel selectLable;
    private javax.swing.JList<Submission> selectList;
    private javax.swing.JPanel selectPanel;
    // End of variables declaration//GEN-END:variables
}
