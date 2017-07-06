package in.uskcorp.tool.das.util;

import java.sql.ResultSet;
import java.sql.Time;
import java.util.Date;
import java.util.Random;

public final class ResultSetUtil {

	private ResultSetUtil() {
		// Restrict Object Creation
	}

	public static Date getDate(ResultSet rs, String columnName) {
		try {
			return rs.getDate(columnName);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public static java.sql.Date converttoSQLDate(Date utilDate) {
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		// System.out.println(sqlDate);
		return sqlDate;
	}

	public static java.sql.Time converttoTime(Time utilTime) {
		java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
		return sqlTime;

	}

	public static String getGeneratedPassword() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * chars.length());
			sb.append(chars.charAt(index));
		}
		String password = sb.toString();
		return password;

	}
}
