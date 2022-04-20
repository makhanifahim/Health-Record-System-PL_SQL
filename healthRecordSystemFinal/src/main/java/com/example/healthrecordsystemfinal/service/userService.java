package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.User;
import com.example.healthrecordsystemfinal.repository.addressRepository;
import com.example.healthrecordsystemfinal.repository.registerRepository;
import com.example.healthrecordsystemfinal.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository Repository;

    @Autowired
    private registerRepository registerRepository;

    @Autowired
    private addressRepository addressRepository;

//    @Autowired
//    private AuthenticationManager authentication;

//    @Autowired
//    private JwtUtil jwtUtil;
    public User user(User use)
    {
        addressRepository.save(use.getPerson().getAddress());
        registerRepository.save(use.getPerson());
        User us=Repository.save(use);
        return use;
    }
    public String encryptionPassword(String password)
    {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32){
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String findUser(String username,String password)
    {
        if(Repository.userLogin(username,password) != null) {
//           // authentication.authenticate(new UsernamePasswordAuthenticationToken(username));
//            String token = jwtUtil.generateToken(username);
//            return token;
            return "login";
        }
        else
            return "Invalid credentials...";
    }
    public List<User> getDetails()
    {
        return Repository.findAll();
    }


}
