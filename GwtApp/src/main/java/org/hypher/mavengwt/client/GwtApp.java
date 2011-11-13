package org.hypher.mavengwt.client;

import org.hypher.mavengwt.library.client.LibraryLabel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtApp implements EntryPoint {
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
	RootPanel container = RootPanel.get("gwtContainer");
	container.add(new LibraryLabel());
	container.add(new LocalLabel());
  }
}
