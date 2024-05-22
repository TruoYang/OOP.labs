/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.global_ict.aims.screen.GUI_manager;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import hust.soict.global_ict.aims.store.Store;
import hust.soict.global_ict.aims.media.Media;

public class StoreManagerScreen extends Screen implements ActionListener{
	public StoreManagerScreen(Store store) {
		super(store);
	}
	
	 JPanel createCenter() {
		 JPanel center = new JPanel();
		 center.setLayout(new GridLayout(3, 3, 2, 2));
		 ArrayList <Media> mediaInStore = store.getItems();
		 for (int i = 0; i < mediaInStore.size(); i++) {
			 MediaStore cell = new MediaStore(mediaInStore.get(i));
			 center.add(cell);
		 }
		 
		 return center;
	 }
	
	 public void actionPerformed(ActionEvent e) {
		 String action = e.getActionCommand();
		 if (action.equals("Add Book")) {
			 dispose();
			 new AddBookToStoreScreen(store);
		 }
		 else if(action.equals("Add CD")) {
			 dispose();
			 new AddCompactDiscToStoreScreen(store);
		 }
		 else if(action.equals("Add DVD")) {
			 dispose();
			 new AddDigitalVideoDiscToStoreScreen(store);
		 }
	 }
}