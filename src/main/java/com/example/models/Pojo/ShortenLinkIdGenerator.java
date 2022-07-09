package com.example.models.Pojo;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.sql.*;

public class ShortenLinkIdGenerator implements IdentifierGenerator,Serializable {

	/**
	 * 
	 */

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		System.out.println("ehll");
		String prefix = "sh";
		System.out.println(prefix);
        Connection connection = session.connection();
        
        try {
            Statement statement=connection.createStatement();
            
            ResultSet rs=statement.executeQuery("select id from Link order by Id desc limit 1");
            
            if(rs.next())
            {
                int id=rs.getInt(1);
                String generatedId = prefix + String.valueOf(id);
                System.out.println("Generated Id: " + generatedId);
                System.out.println(generatedId);
                return 1;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
	}

}
