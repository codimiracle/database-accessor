package com.codimiracle.database.accessor;

import java.io.Closeable;
import java.sql.ResultSet;

public interface DatabaseAccessor extends Closeable {
	public ResultSet query(String sql) throws DatabaseAccessorException;

	public ResultSet query(String sql, Object[] args) throws DatabaseAccessorException;

	public int update(String sql) throws DatabaseAccessorException;

	public int update(String sql, Object[] args) throws DatabaseAccessorException;

	public int insert(String sql) throws DatabaseAccessorException;

	public int insert(String sql, Object[] args) throws DatabaseAccessorException;

	public int delete(String sql) throws DatabaseAccessorException;

	public int delete(String sql, Object[] args) throws DatabaseAccessorException;

	public boolean execute(String sql) throws DatabaseAccessorException;
}
