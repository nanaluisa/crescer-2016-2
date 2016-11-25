/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anna.silva
 */
public class Run {

   public static void main(String[] args) throws SQLException {
       final String query = "SELECT * FROM ANNA";
       try (
           final Connection connection = ConnectionUtils.getConnection()){
           try (final Statement resultSet = connection.createStatement()) {
              
           if (!connection.isClosed()) {
               System.out.println("OK !");
           }
       } catch (SQLException e) {
       }
           } catch (final SQLException e) {
               System.err.format("SQLException: %s", e);
           }
   }
}
        /*
        try (final Connection connection = ConnectionUtils.getConnection()) {
            if (!connection.isClosed()) {
                System.out.println("OK !");
            }
        } catch (SQLException e) {
        }*/
    

