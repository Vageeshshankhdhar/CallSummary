/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trainingbasket.changepassword;

import com.trainingbasket.loginapp.services.LoginServices;
import javax.swing.JOptionPane;

import com.trainingbasket.loginapp.Login;
import com.trainingbasket.loginapp.TextToCSVConverter;
import com.trainingbasket.loginapp.dao.*;

/**
 *
 * @author HP
 */
@SuppressWarnings({ "serial", "unused" })
public class ChangePassword extends javax.swing.JFrame {
	LoginServices loginServices;

	/**
	 * Creates new form ChangePassword
	 */
	public ChangePassword() {
		initComponents();
		loginServices = new LoginServices();
		this.pack();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		fldnewpassword = new javax.swing.JPasswordField();
		fldoldpassword = new javax.swing.JPasswordField();
		fldusername = new javax.swing.JTextField();
		btnchangepassword = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 255, 0));
		jPanel1.setFont(new java.awt.Font("Constantia", 2, 18)); // NOI18N

		jLabel1.setBackground(new java.awt.Color(255, 255, 204));
		jLabel1.setFont(new java.awt.Font("Constantia", 2, 18)); // NOI18N
		jLabel1.setText(" Enter User Name:");

		jLabel2.setBackground(new java.awt.Color(255, 204, 255));
		jLabel2.setFont(new java.awt.Font("Constantia", 2, 18)); // NOI18N
		jLabel2.setText(" Enter Old Password:");

		jLabel3.setBackground(new java.awt.Color(255, 204, 255));
		jLabel3.setFont(new java.awt.Font("Constantia", 2, 18)); // NOI18N
		jLabel3.setText(" Enter New Password:");

		btnchangepassword.setBackground(new java.awt.Color(51, 51, 51));
		btnchangepassword.setFont(new java.awt.Font("Constantia", 2, 18)); // NOI18N
		btnchangepassword.setForeground(new java.awt.Color(204, 255, 204));
		btnchangepassword.setText("Change Password");
		btnchangepassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnchangepasswordActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(fldoldpassword, javax.swing.GroupLayout.PREFERRED_SIZE,
														117, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(fldusername))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(fldnewpassword))))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(110, 110, 110)
								.addComponent(btnchangepassword)))
						.addContainerGap(70, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(79, 79, 79)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fldusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fldoldpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fldnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(btnchangepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(70, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	@SuppressWarnings("deprecation")
	private void btnchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnchangepasswordActionPerformed
		if (loginServices.authenticateUser(fldusername.getText(), fldoldpassword.getText())) {
			int status=loginServices.resetPassword(fldusername.getText(),fldoldpassword.getText(), fldnewpassword.getText());
			JOptionPane.showMessageDialog(this, "Changed Password Succesfully", "Message", 2);
			

		} else {
			JOptionPane.showMessageDialog(this, "Either User Name or Password is incorrect", "Warning", 1);
		}
	}// GEN-LAST:event_btnchangepasswordActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnchangepassword;
	private javax.swing.JPasswordField fldnewpassword;
	private javax.swing.JPasswordField fldoldpassword;
	private javax.swing.JTextField fldusername;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
