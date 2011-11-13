package org.hypher.mavengwt.client;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Label;

/**
 * A custom GWT widget to test JRebel swapping of code in a GWT component in a separate jar.
 * 
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class LocalLabel extends Label
{
	private int count;
	
	public LocalLabel() {
		new Timer() {
			@Override
			public void run() {
				change();
			}
		}.scheduleRepeating(1000);
	}
	
	protected void change() {
		setText("Local Label: " + (++count));
	}
}
