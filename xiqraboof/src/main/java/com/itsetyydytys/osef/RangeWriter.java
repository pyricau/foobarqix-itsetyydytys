package com.itsetyydytys.osef;

public interface RangeWriter {

	/**
	 * 
	 * @param start
	 * @param inclusiveEnd
	 * @throws IllegalArgumentException
	 *             if start is greater than inclusiveEnd
	 */
	public abstract void writeRange(int start, int inclusiveEnd);

}