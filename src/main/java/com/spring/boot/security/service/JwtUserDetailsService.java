package com.spring.boot.security.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sun.security.auth.UserPrincipal;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	//@Autowired
	//private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*// TODO Auto-generated method stub
		
		  //here we need to get User by username and we need to have UserRepository
		User user=userRepo.findByUsername(username);
	    if(user==null)
	    	throw new UsernameNotFoundException("User Not Found:404");
		
	    return new UserPrincipal(user);*/
		
		if ("rahat".equals(username)) {
			return new User("rahat", "$2a$04$TkM6AJ1.78c1bu4dgEGhSuja1s5vlOW/hkVKiPXWojaH4YJPMQCA6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}	
	}

}
