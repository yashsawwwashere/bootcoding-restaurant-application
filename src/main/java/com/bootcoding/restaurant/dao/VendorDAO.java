package com.bootcoding.restaurant.dao;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.Vendor;

import java.sql.*;

public class VendorDAO {
    private static final String TABLE_NAME = "app_vendor";
    private DAOService daoService;

    public VendorDAO() {
        // Inside Constructor
        daoService = new DAOService();
    }

    public void insertCustomer(Vendor vendor) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, vendor.getVendorId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, vendor.getVendorId());
                ps.setString(2, vendor.getName());
                ps.setString(3, vendor.getAddress());
                ps.setLong(4, vendor.getPhoneNumber());
                ps.setString(5, vendor.getEmailId());
                ps.setString(6, vendor.getCity());
                ps.setBoolean(7, vendor.isPureVeg());
                ps.setString(8, vendor.getCategory());
                ps.setDouble(9, vendor.getRating());


                ps.executeUpdate();
                System.out.println(vendor.getVendorId() + " inserted into DB!");
            }else{
                System.out.println(vendor.getVendorId() + " already exists!");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void createTable(){


            try{
                Class.forName("org.postgresql.Driver");

                Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres","postgres");
                Statement stmt=con.createStatement();
                String query="Create table if not exists " + TABLE_NAME
                        +"( id bigint NOT NULL, "
                        +"name text, "
                        +"address text, "
                        +"phone_number bigint, "
                        +"emailid text, "
                        +"city text, "
                        +"state text, "
                        +"pureVeg bool, "
                        +"category text, "
                        +"rating decimal, "
                        +"CONSTRAINT app_vendor_pkey PRIMARY KEY (id))";
                System.out.println(query);
                stmt.executeUpdate(query);


            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


    }

