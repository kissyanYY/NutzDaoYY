package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.util.DaoUp;

public class MyNutzDao{
	static Dao dao =  null;
	static Dao SqliteDao = null;
	static {
		 try {
			DaoUp.me().init("ora.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  static Dao GetDaoDao(){
		if(dao == null )dao = DaoUp.me().dao();
		return dao;
	}
	
	public static Dao GetMysqlDao(){
		if(SqliteDao == null){
			SqliteDao = new NutDao(new DataSource() {
				
				@Override
				public <T> T unwrap(Class<T> iface) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public boolean isWrapperFor(Class<?> iface) throws SQLException {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public void setLoginTimeout(int seconds) throws SQLException {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setLogWriter(PrintWriter out) throws SQLException {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public Logger getParentLogger() throws SQLFeatureNotSupportedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getLoginTimeout() throws SQLException {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public PrintWriter getLogWriter() throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Connection getConnection(String username, String password)
						throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Connection getConnection() throws SQLException {
					// TODO Auto-generated method stub
					try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return DriverManager.getConnection("jdbc:mysql://10.130.43.212:3306/vicp_fz","fuzhou123","fuzhou123");
				}
			});
		}
		return  SqliteDao;
	}
	
	public static Dao getSQlDao(){
		if(SqliteDao == null){
			SqliteDao = new NutDao(new DataSource() {
				
				@Override
				public <T> T unwrap(Class<T> iface) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public boolean isWrapperFor(Class<?> iface) throws SQLException {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public void setLoginTimeout(int seconds) throws SQLException {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setLogWriter(PrintWriter out) throws SQLException {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public Logger getParentLogger() throws SQLFeatureNotSupportedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getLoginTimeout() throws SQLException {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public PrintWriter getLogWriter() throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Connection getConnection(String username, String password)
						throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Connection getConnection() throws SQLException {
					// TODO Auto-generated method stub
					try {
						Class.forName("org.sqlite.JDBC");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return DriverManager.getConnection("jdbc:sqlite:test.db");
				}
			});
		}
		return  SqliteDao;
	}
}
