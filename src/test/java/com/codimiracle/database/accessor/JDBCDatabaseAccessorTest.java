package com.codimiracle.database.accessor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JDBCDatabaseAccessorTest {
	private DatabaseAccessor accessor;

	@Before
	public void setUp() throws Exception {
		JDBCConfig config = new JDBCConfig();
		config.setUser("root");
		config.setPassword("Codimiracle855866");
		config.setDriverClass("com.mysql.jdbc.Driver");
		config.setUrl("jdbc:mysql://localhost:3306/xml_last?useSSL=false");
		accessor = new JDBCDatabaseAccessor(config);
	}

	@After
	public void tearDown() throws Exception {
		accessor.close();
	}

	@Test
	public void testQuery() throws Exception {
		ResultSet resultSet = accessor.query("select * from users");
		int count = 0;
		while (resultSet.next()) {
			count++;
		}
		assertEquals(5, count);
	}
	
	@Test
	public void testQueryWithArguments() throws Exception {
		ResultSet resultSet = accessor.query("select username from users where username = ?", new String[] {"张三"});
		while (resultSet.next()) {
			assertEquals("张三", resultSet.getString(1));
		}
	}

}
