package com.itsetyydytys.osef.integerbomb;

import java.lang.reflect.Field;

/**
 * Try calling {@link #supercalifragilisticexpialidocious()} and all hell will break loose
 */
public class MaryPoppins {

	public static void supercalifragilisticexpialidocious(int shift) {
		try {
			Class<?>[] integerDeclaredClasses = Integer.class.getDeclaredClasses();

			Class<?> integerCacheClass = integerDeclaredClasses[0];
			Field cacheField = integerCacheClass.getDeclaredField("cache");
			cacheField.setAccessible(true);

			Integer[] cache = (Integer[]) cacheField.get(null);

			int start = 128 - shift;
			int end = 228 - shift;
			for (int i = start; i <= end; i++) {
				cache[i] = cache[i] + shift;
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
