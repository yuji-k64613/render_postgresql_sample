package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgres://mydb_qwhk_user:O0A7WQxaXw4fnLFzcYMKHiapusZyuPIw@dpg-cev7tbqrrk0a2joo07fg-a.oregon-postgres.render.com/mydb_qwhk";
        Connection con = DriverManager.getConnection(url);
        System.out.println(con.toString());
	}
}
