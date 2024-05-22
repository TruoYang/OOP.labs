/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.global_ict.aims.media.Comparator;

import java.util.Comparator;
import hust.soict.global_ict.aims.media.Media;

public class Cost_Title implements Comparator <Media> {
	public int compare(Media m1, Media m2) {
		Double cost1 = (double) m1.getCost();
		Double cost2 = (double) m2.getCost();
		String title1 = m1.getTitle();
		String title2 = m2.getTitle();
		int costDiff = cost1.compareTo(cost2);
		
		return costDiff == 0 ? title1.compareTo(title2) : costDiff;  
	}
}