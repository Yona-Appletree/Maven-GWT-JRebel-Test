package org.hypher.mavengwt.library.client;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Label;

/**
 * A custom GWT widget to test JRebel swapping of code in a GWT component in a separate jar.
 * 
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class LibraryLabel extends Label
{
	private int count;
	
	public LibraryLabel() {
		new Timer() {
			@Override
			public void run() {
				change();
			}
		}.scheduleRepeating(1000);
	}
	
	protected void change() {
		setText("Library Label: " + (++count));
	}
}
