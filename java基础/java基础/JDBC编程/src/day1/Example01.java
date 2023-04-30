package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Example01 {

	public static void main(String[] args) {
		Connection conn=null;//获得这个对象才能访问数据库
		java.sql.Statement stmt=null;//执行sql语句
		Resultset rs=null;//返回的结果集
		
		try {
			//注册数据库的驱动程序
			Class.forName("com.mysql.cj.jdbc.Driver");
			//通过DriverManger 获取数据库连接
			String url="jdbc:mysql://localhost:3306/eudc? characterEncoding=utf8&useSSL=true";
			String username="root",password="123456";
			
    		conn=DriverManager.getConnection(url,username,password);//利用DriverManager获取Connection对象
			//通过connection对象获取Statement 对象
			stmt= conn.createStatement();
			
			String sql="select *from sc";
			rs=(Resultset) ((java.sql.Statement) stmt).executeQuery(sql);//操作结果返回的字符集
			System.out.println("sno             |cno      |grade   ");
			while(((ResultSet) rs).next())
			{
				String sno=((ResultSet) rs).getString("sno");//通过列名获取指定列的值
			String cno=((ResultSet) rs).getString("cno");
			String  grade=((ResultSet) rs).getString("grade");
			System.out.println(sno+"     |"+cno+"     |"+grade);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt!=null)
				try {
					((Connection) stmt).close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			stmt=null;
			if(rs!=null) {
				try {
					((Connection) rs).close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rs=null;
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				conn=null;
			}
		}
	}

}
