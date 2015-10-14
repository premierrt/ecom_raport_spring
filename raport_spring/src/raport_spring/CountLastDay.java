package raport_spring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tyszewr
 *
 */
@Component
public class CountLastDay {

@Autowired	
private DataSource datasource;
	
private Connection con;

private  String eshopCount = "select  count(*) from v_task_ts"
		+ " where  to_char(data_zamowienia,'DD-MM-YYYY') =  to_char(sysdate-1, 'DD-MM-YYYY')  "
		+ " and data_zamowienia > sysdate-2"
		+ "and account_type <> 'UNKNOWN'"
		+ " and length(id) = 17 and origin='ESHOP' ";

private  String ecommCount =" select  count(*) from v_task_ts "
		+ " where  to_char(data_zamowienia,'DD-MM-YYYY') =  to_char(sysdate-1, 'DD-MM-YYYY')  "
		+ " and data_zamowienia > sysdate-2"
		+ " and length(id) = 12 and origin='ESHOP' ";

	
private int eshopIle;
private int ecomIle;

	public void compute() {
		// TODO Auto-generated method stub

		try {
			con= datasource.getConnection();
			Statement smtm =con.createStatement();
			ResultSet rs= smtm.executeQuery(eshopCount);
			if (rs.next())
				 eshopIle = rs.getInt(1);
			rs=smtm.executeQuery(ecommCount);
			if(rs.next())
				ecomIle=rs.getInt(1);
			System.out.println(ecomIle +" "+eshopIle);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public String getEshopCount() {
		return eshopCount;
	}

	public void setEshopCount(String eshopCount) {
		this.eshopCount = eshopCount;
	}

	public String getEcommCount() {
		return ecommCount;
	}

	public void setEcommCount(String ecommCount) {
		this.ecommCount = ecommCount;
	}

	public int getEshopIle() {
		return eshopIle;
	}

	public void setEshopIle(int eshopIle) {
		this.eshopIle = eshopIle;
	}

	public int getEcomIle() {
		return ecomIle;
	}

	public void setEcomIle(int ecomIle) {
		this.ecomIle = ecomIle;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	
	
}
