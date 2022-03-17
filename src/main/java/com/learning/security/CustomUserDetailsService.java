package com.learning.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.learning.dao.User;
import com.learning.dao.UserDao;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<User> user = userDao.findByUserName(username);

		if (user != null && !user.isEmpty()) {
			return new SecurityUserDetails(user.get(0));
		} else {
			throw new UsernameNotFoundException("User Not Found");
		}

	}

}
