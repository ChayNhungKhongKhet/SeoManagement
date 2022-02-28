/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.demo.service;

import java.demo.dao.UserDao;
import java.demo.entity.User;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserService {
    
    UserDao userDao = new UserDao();
    
    public List<User> findAll() {
        
        return userDao.findAll();
        
    }
    
}
