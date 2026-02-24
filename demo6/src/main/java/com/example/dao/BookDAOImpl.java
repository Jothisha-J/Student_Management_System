package com.example.dao;

import java.sql.*;
import java.util.*;

import com.example.model.*;;
import com.example.util.*;;

public class BookDAOImpl implements  BookDAO{
    public boolean add(Book b){
        try{
        Connection con=DBConnection.getConnection();
        String str="Insert into book values(?,?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(str);
        pst.setInt(1,b.getBook_id());
        pst.setString(2, b.getBook_name());
        pst.setString(3,b.getBook_auth());
        pst.setString(4,b.getBook_pub());
        pst.setFloat(5,b.getBook_price());
        pst.execute();
        System.out.println("Inserted Succesfullyy...");
        return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
