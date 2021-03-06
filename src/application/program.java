package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
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
		
		System.out.println("\n------Teste 4----Seller insert-----\n");
		Seller newSeller = new Seller(null, "Greg","greg@gmail.com", new Date(), 4000.0, new Department(2,null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		
		
		System.out.println("\n-------Teste 5-----Seller Update-----\n");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update complete");
		
		
		System.out.println("\n---------Teste 6 ------Seller Delete-------\n");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
		
		

	}
}
	


