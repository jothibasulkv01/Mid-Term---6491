package org.jfree.chart.axis;


import java.io.Serializable;

public class ValueAxisProduct implements Serializable, Cloneable {
	private boolean positiveArrowVisible;
	private boolean negativeArrowVisible;

	public boolean getPositiveArrowVisible() {
		return positiveArrowVisible;
	}

	public void setPositiveArrowVisible2(boolean positiveArrowVisible) {
		this.positiveArrowVisible = positiveArrowVisible;
	}

	public boolean getNegativeArrowVisible() {
		return negativeArrowVisible;
	}

	public void setNegativeArrowVisible2(boolean negativeArrowVisible) {
		this.negativeArrowVisible = negativeArrowVisible;
	}

	/**
	* Sets a flag that controls whether or not the axis lines has an arrow drawn that points in the positive direction for the axis, and sends an {@link AxisChangeEvent}  to all registered listeners.
	* @param visible   the flag.
	* @see #isPositiveArrowVisible()
	*/
	public void setPositiveArrowVisible(boolean visible, ValueAxis valueAxis) {
		this.positiveArrowVisible = visible;
		valueAxis.fireChangeEvent();
	}

	/**
	* Sets a flag that controls whether or not the axis lines has an arrow drawn that points in the negative direction for the axis, and sends an {@link AxisChangeEvent}  to all registered listeners.
	* @param visible   the flag.
	* @see #setNegativeArrowVisible(boolean)
	*/
	public void setNegativeArrowVisible(boolean visible, ValueAxis valueAxis) {
		this.negativeArrowVisible = visible;
		valueAxis.fireChangeEvent();
	}

	public Object clone() throws CloneNotSupportedException {
		return (ValueAxisProduct) super.clone();
	}
}