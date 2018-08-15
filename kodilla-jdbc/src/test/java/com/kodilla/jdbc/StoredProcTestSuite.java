package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        int howMany = -1;
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestSellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();
        String sqlResetBestSellers = "UPDATE BOOKS SET BESTSELLER = FALSE";
        statement.executeUpdate(sqlResetBestSellers);

        //When
        String callProcedure = "CALL UpdateBestSellers()";
        statement.execute(callProcedure);

        //Then

        int howMany = -1;

        ResultSet set = statement.executeQuery("SELECT * FROM BOOKS WHERE BESTSELLER = TRUE");
        if (set.next()) {
            howMany = set.getInt("BESTSELLER");

            assertEquals(1, howMany, 0);
        }
    }
}
