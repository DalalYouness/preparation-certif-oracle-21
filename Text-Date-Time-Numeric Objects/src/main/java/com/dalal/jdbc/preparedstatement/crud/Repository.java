package com.dalal.jdbc.preparedstatement.crud;

import java.sql.SQLException;

public interface Repository <T,U>
{
    void create(T entity) throws SQLException;
}
