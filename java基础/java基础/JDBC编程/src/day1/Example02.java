package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//加载并且注册数据库驱动程序
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addCourse();//添加数据到数据库中
		System.out.println("添加成功！");
		delCourse();//删除数据
		display();
	}
	public static void addCourse() {
		Connection conn=null;//只有获得这个对象才能访问数据库
		PreparedStatement pstm=null;//用于执行预编译SQL语句
		String sql="insert into text1 value(?,?)";
		String url="jdbc:mysql://localhost:3306/day1?characterEncoding=utf8&useSSL=true";		
		String user="root",password="123456";
		
		try {
			conn=DriverManager.getConnection(url,user,password);
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, 3);
			pstm.setString(2, "3");//给占位符赋值
			pstm.executeUpdate();//执行
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//关闭顺序与声明顺序相反
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	public static void delCourse() {//从数据表中删除数据
		String sql="delete from text1 where id=?";
		String url="jdbc:mysql://localhost:3306/day1?characterEncoding=utf8&useSSL=true";
		String user="root",password="123456";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 3);//给占位符赋值
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void display() {
		String sql="select *from text1";
		String url="jdbc:mysql://localhost:3306/day1?characterEncoding=utf8&useSSL=true";
		String user="root",password="123456";
		Connection conn=null;
		java.sql.Statement stm=null;
		ResultSet rst=null;
		try {
			conn=DriverManager.getConnection(url,user,password);
			stm=conn.createStatement();
			rst=stm.executeQuery(sql);//会返回一个结果集合
			while(rst.next()) {
				int id=rst.getInt(1);//通过字段的索引获取指定的数据
				String name=rst.getString("name");//通过字段的名称获取指定的数据
				System.out.println(id+"\t"+name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
