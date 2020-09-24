package application;


import java.sql.Connection;
import java.util.Date;
import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		//Connection conn = DB.getConnection();
		//DB.closeConnection();
		
		//Department obj = new Department(1,"Books");
		//Seller seller = new Seller(55,"Jose maria", "Ze@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.print("------Teste 1 ---findById------\n");
		System.out.println(seller);

	}
}
	


