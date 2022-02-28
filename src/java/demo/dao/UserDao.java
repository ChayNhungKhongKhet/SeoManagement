/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.demo.dao;

import java.sql.*;
import java.demo.entity.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UserDao {

    public List<User> findAll() {
        List<User> listUser = new ArrayList();
        try (Connection conn = new MyConnection().getConnection()) {

           
            String sql = "select * from _user";

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                User user = new User();

                user.setId(result.getInt("id"));
                user.setName(result.getString("name"));
                user.setRole(result.getString("role"));
                user.setPassword(result.getString("password"));
                user.setPhone(result.getString("phone"));
                user.setUser(result.getString("user"));
                user.setFavorite(result.getString("fovorite"));
                user.setAbout(result.getString("about"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;

    }

    public boolean saveUser(User user) throws SQLException {
        try (Connection conn = new MyConnection().getConnection()) {
          

            

            String sql = "insert into _user values(?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getPhone());
            preparedStatement.setString(4,user.getUser());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setString(6,user.getRole());
            preparedStatement.setString(7,user.getFavorite());
            preparedStatement.setString(8,user.getAbout());
            
            int rs = preparedStatement.executeUpdate(sql);
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    
    public void updateUser(User user) throws SQLException {
        try (Connection conn = new MyConnection().getConnection()) {
            
            
            String sql = "update _user "
                    + "set name = ?,phone = ?"
                    + ",username = ?,password = ?"
                    + ",role = ?,favorites = ?,about = ?";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getPhone());
            preparedStatement.setString(4,user.getUser());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setString(6,user.getRole());
            preparedStatement.setString(7,user.getFavorite());
            preparedStatement.setString(8,user.getAbout());
            
            int rs = preparedStatement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void deleteUser(int id) throws SQLException {
        Connection conn = new MyConnection().getConnection();
        String sql = "delete * from _user where id = ?";
        
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            conn.close();
        }
        
    }

}
