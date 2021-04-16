package org.pavan.fsd.p4.api.dao;

import org.pavan.fsd.p4.api.dto.User;
import org.pavan.fsd.p4.api.exception.OnlineTestDaoException;

public interface UserDao {

	User getUser(String email) throws OnlineTestDaoException;
	User getUser(String email, String password) throws OnlineTestDaoException;
	User save(User user) throws OnlineTestDaoException;
	
}
