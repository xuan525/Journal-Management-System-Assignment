/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem;

/**
 *
 * @author Xuan
 */
public class ArticlePanel extends javax.swing.JPanel {

    /**
     * Creates new form ArticlePanel
     */
    public ArticlePanel() {
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

        headerPanel = new javax.swing.JPanel();
        titleScrollPane = new javax.swing.JScrollPane();
        titleLabel = new javax.swing.JLabel();
        toolbarPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        decisionPanel = new javax.swing.JPanel();
        acceptBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        abstructPanel = new javax.swing.JPanel();
        abstructLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jSeparator1 = new javax.swing.JSeparator();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        pdfPanel = new javax.swing.JPanel();
        innerPdfPanel = new javax.swing.JPanel();
        pdfLabel = new javax.swing.JLabel();
        linkLabel = new javax.swing.JLabel();
        copyLinkBtn = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jSeparator2 = new javax.swing.JSeparator();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        reviewPanel = new javax.swing.JPanel();
        ReviewsLabel = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        innerReviewPanel = new javax.swing.JPanel();
        reviewPanel1 = new com.com2008.journalmanagementsystem.ReviewPanel();
        reviewPanel2 = new com.com2008.journalmanagementsystem.ReviewPanel();
        reviewPanel3 = new com.com2008.journalmanagementsystem.ReviewPanel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jSeparator3 = new javax.swing.JSeparator();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setLayout(new java.awt.BorderLayout());

        headerPanel.setLayout(new java.awt.BorderLayout());

        titleScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        titleLabel.setText("Title of the article  Title of the article  Title of the article  Title of the article  Title of the article  Title of the article");
        titleLabel.setToolTipText("");
        titleScrollPane.setViewportView(titleLabel);

        headerPanel.add(titleScrollPane, java.awt.BorderLayout.CENTER);

        toolbarPanel.setLayout(new java.awt.GridLayout(2, 1, 0, 8));

        statusLabel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        statusLabel.setText("Status");
        toolbarPanel.add(statusLabel);

        decisionPanel.setLayout(new javax.swing.BoxLayout(decisionPanel, javax.swing.BoxLayout.LINE_AXIS));

        acceptBtn.setText("Accept");
        decisionPanel.add(acceptBtn);

        rejectBtn.setText("Reject");
        decisionPanel.add(rejectBtn);

        toolbarPanel.add(decisionPanel);

        headerPanel.add(toolbarPanel, java.awt.BorderLayout.EAST);

        add(headerPanel, java.awt.BorderLayout.NORTH);

        mainPanel.setLayout(new java.awt.BorderLayout());

        innerPanel.setLayout(new javax.swing.BoxLayout(innerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        abstructPanel.setLayout(new java.awt.BorderLayout());

        abstructLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        abstructLabel.setText("Abstruct");
        abstructPanel.add(abstructLabel, java.awt.BorderLayout.NORTH);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  This is abstruct area  ");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        abstructPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        innerPanel.add(abstructPanel);
        innerPanel.add(filler1);
        innerPanel.add(jSeparator1);
        innerPanel.add(filler7);

        pdfPanel.setLayout(new java.awt.BorderLayout());

        innerPdfPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        innerPdfPanel.setLayout(new javax.swing.BoxLayout(innerPdfPanel, javax.swing.BoxLayout.PAGE_AXIS));

        pdfLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pdfLabel.setText("PDF link");
        innerPdfPanel.add(pdfLabel);

        linkLabel.setText("https://link.pdf.here");
        innerPdfPanel.add(linkLabel);

        copyLinkBtn.setText("Copy Link");
        innerPdfPanel.add(copyLinkBtn);

        pdfPanel.add(innerPdfPanel, java.awt.BorderLayout.CENTER);

        innerPanel.add(pdfPanel);
        innerPanel.add(filler8);
        innerPanel.add(jSeparator2);
        innerPanel.add(filler9);

        reviewPanel.setLayout(new java.awt.BorderLayout());

        ReviewsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ReviewsLabel.setText("Reviews");
        reviewPanel.add(ReviewsLabel, java.awt.BorderLayout.NORTH);
        reviewPanel.add(filler12, java.awt.BorderLayout.PAGE_END);

        innerReviewPanel.setLayout(new javax.swing.BoxLayout(innerReviewPanel, javax.swing.BoxLayout.PAGE_AXIS));
        innerReviewPanel.add(reviewPanel1);
        innerReviewPanel.add(reviewPanel2);
        innerReviewPanel.add(reviewPanel3);

        reviewPanel.add(innerReviewPanel, java.awt.BorderLayout.CENTER);

        innerPanel.add(reviewPanel);
        innerPanel.add(filler10);
        innerPanel.add(jSeparator3);

        mainPanel.add(innerPanel, java.awt.BorderLayout.CENTER);
        mainPanel.add(filler3, java.awt.BorderLayout.WEST);
        mainPanel.add(filler4, java.awt.BorderLayout.EAST);
        mainPanel.add(filler5, java.awt.BorderLayout.NORTH);
        mainPanel.add(filler6, java.awt.BorderLayout.SOUTH);

        mainScrollPane.setViewportView(mainPanel);

        add(mainScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReviewsLabel;
    private javax.swing.JLabel abstructLabel;
    private javax.swing.JPanel abstructPanel;
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton copyLinkBtn;
    private javax.swing.JPanel decisionPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JPanel innerPdfPanel;
    private javax.swing.JPanel innerReviewPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JLabel pdfLabel;
    private javax.swing.JPanel pdfPanel;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JPanel reviewPanel;
    private com.com2008.journalmanagementsystem.ReviewPanel reviewPanel1;
    private com.com2008.journalmanagementsystem.ReviewPanel reviewPanel2;
    private com.com2008.journalmanagementsystem.ReviewPanel reviewPanel3;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JScrollPane titleScrollPane;
    private javax.swing.JPanel toolbarPanel;
    // End of variables declaration//GEN-END:variables
}
