package com.codimiracle.database.accessor;

import java.io.IOException;
import java.sql.ResultSet;

public class JNDIDatabaseAccessor implements DatabaseAccessor {
	@Override
	public void close() throws IOException {
	}

	@Override
	public ResultSet query(String sql) throws DatabaseAccessorException {
		return null;
	}

	@Override
	public ResultSet query(String sql, Object[] args) throws DatabaseAccessorException {
		
		return null;
	}

	@Override
	public int update(String sql) throws DatabaseAccessorException {
		return 0;
	}

	@Override
	public int update(String sql, Object[] args) throws DatabaseAccessorException {
		
		return 0;
	}

	@Override
	public int insert(String sql) throws DatabaseAccessorException {
		return 0;
	}

	@Override
	public int insert(String sql, Object[] args) throws DatabaseAccessorException {
		return 0;
	}

	@Override
	public int delete(String sql) throws DatabaseAccessorException {
		return 0; 
	}

	@Override
	public int delete(String sql, Object[] args) throws DatabaseAccessorException {
		return 0;
	}

	@Override
	public boolean execute(String sql) throws DatabaseAccessorException {
		// TODO Auto-generated method stub
		return false;
	}

}
