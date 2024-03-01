package com.online_store.demo.service;

import com.online_store.demo.config.UserDetailsBean;
import com.online_store.demo.entity.User;
import com.online_store.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceBean implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByName(username);
        return user.map(UserDetailsBean::new)
                .orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }
}
