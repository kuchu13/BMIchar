package ex;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

public class DBConnection {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/bmichar?useUnicode=true&characterEncoding=utf8";
	private Connection dbConn;
	private Frame frm;

	public DBConnection(Frame frm1, String id, String pw) {
		frm = frm1;
		try {
			Class.forName(driver);
			dbConn = DriverManager.getConnection(url, id, pw);
			//JOptionPane.showMessageDialog(frm, "連接資料庫成功!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(frm, ex.toString());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frm, ex.toString());
		}
	}
	
	public void dispose(){
		if(dbConn!=null){
			try {
				dbConn.close();
				dbConn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ResultSet getData() {
		ResultSet rs = null;
		try {
			Statement stm = dbConn.createStatement();
			String sqlStr = "select * from bmichar";
			rs = stm.executeQuery(sqlStr);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(frm, ex.toString());
		}
		return rs;
	}
	
	public List<PersonInfo> getData(String Name){
		List<PersonInfo> result = new ArrayList<PersonInfo>();
		if(Name==null||Name.length()<1)
			return result;
		try {
			Statement stm = dbConn.createStatement();
			String sqlStr = "select * from bmichar where name = '"+Name+"'";
			ResultSet rs = stm.executeQuery(sqlStr);
			while (rs.next()) {
				result.add(new PersonInfo(rs.getString("gender"),rs.getInt("age"),rs.getFloat("height"),rs.getFloat("weight"),rs.getLong("time")));
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(frm, ex.toString());
		} catch (Exception ex){
			JOptionPane.showMessageDialog(frm, ex.toString());
		}
		return result;
	}//取這個人的所有資料
	
	public void addData(String Name,float height,float weight,int age,int gender){
		//insert into bmichar () values ()
		try {
			Statement stm = dbConn.createStatement();
			Calendar c = Calendar.getInstance();
			stm.executeUpdate("insert into bmichar (name,height,weight,age,gender,time) values ('"+Name+"','"+height+"','"+weight+"','"+age+"','"+gender+"','"+c.getTimeInMillis()+"')");
			JOptionPane.showMessageDialog(frm, "新增成功");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(frm, e.toString());
		}
	}//新增到資料庫裡
}
