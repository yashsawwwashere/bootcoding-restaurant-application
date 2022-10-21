package com.bootcoding.restaurant.dao;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.MenuItem;

import java.sql.*;

public class MenuItemDAO {
    private static final String TABLE_NAME = "app_menu_item";
    private DAOService daoService;

    public MenuItemDAO() {
        // Inside Constructor
        daoService = new DAOService();
    }

    public void insertMenuItem(MenuItem menuitem) {
        try {
            Connection con = daoService.getConnection();
            if(!daoService.exists(con, TABLE_NAME, menuitem.getMenuItemId())) {
                String sql = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1, menuitem.getMenuItemId());
                ps.setString(2, menuitem.getMenuItem());
                ps.setDouble(3, menuitem.getPrice());
                ps.setString(4, menuitem.getCategory());
                ps.setBoolean(5, menuitem.isVeg());
                ps.executeUpdate();
                System.out.println(menuitem.getMenuItem() + " inserted into DB!");
            }else{
                System.out.println(menuitem.getMenuItem() + " already exists!");
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
                        + "( id bigint NOT NULL, "
                        +"menu_item text, "
                        +"price decimal, "
                        +"categary text, "
                        +"is_veg bool, "
                        +"CONSTRAINT app_menu_item_pkey PRIMARY KEY (id))";
                System.out.println(query);
                stmt.executeUpdate(query);


            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


    }

