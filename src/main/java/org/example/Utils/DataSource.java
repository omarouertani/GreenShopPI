package org.example.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

        private static org.example.Utils.DataSource data;
        private Connection con ;
        static String url="jdbc:mysql://localhost:3306/GreenShop";
        static String user="root";
        static String pwd="";

        private DataSource(){
            try{
                con = DriverManager.getConnection(url, user, pwd);
                System.out.println(con);
                System.out.println("connexion etablie");
            }catch(SQLException S){
                System.out.println(S);
            }

        }
        public Connection getCon()
        {
            return con;
        }
        public static org.example.Utils.DataSource getInstance() {
            if (data==null){
                data=new org.example.Utils.DataSource();
            }
            return data ;
        }
    }


