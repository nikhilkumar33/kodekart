package com.kodewala.kodekart.services;

import java.sql.Connection;

public interface UserService {

	int userHome();

	void viewProducts(Connection con);

	void searchProduct(Connection con);

	void addToCart(Connection con, int userId);

	int viewCart(Connection con, int userId);

	void orderItem(Connection con, int userId);

	void removeItemFromCart(Connection con, int userId);

	void fetchMyOrders(Connection con, int userId);

}
