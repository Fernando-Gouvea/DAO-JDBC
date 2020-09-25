package application;


import java.sql.Connection;
import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.print("------Teste 1 ---findById------\n");
		System.out.println(seller);
		
		System.out.println("\n-----Teste 2-----Seller findById------\n");
		Department department =  new Department(2 ,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n-----Teste 3-----Seller findAll------\n");
		department =  new Department();
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		

	}
}
	


