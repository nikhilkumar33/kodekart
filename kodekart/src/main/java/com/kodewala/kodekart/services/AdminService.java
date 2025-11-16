package com.kodewala.kodekart.services;

import java.sql.Connection;

public interface AdminService {

	int adminHome();

	void addProduct(Connection con);

	void updateProducts(Connection con);

	void deleteProduct(Connection con);
	
	void fetchProducts(Connection con);

	void fetchAllOrders(Connection con);

}
