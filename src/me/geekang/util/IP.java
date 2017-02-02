package me.geekang.util;

import org.junit.Test;

public class IP {

	/**
	 * 检验IP是否合法
	 * 
	 * @return
	 */
	public static boolean isIPAddress(String ip) {

		String sgn[] = ip.split("\\.");
		if (sgn.length == 4) {
			for (int i = 0; i < 4; i++) {
				int nsgn = Integer.parseInt(sgn[i]);
				if (0 > nsgn || nsgn > 255) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Test
	public void test() {
		System.out.println(isIPAddress("1217.0.0.1"));
	}
}
