/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author c051618
 */
public class DBException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public DBException (String msg) {
        super (msg);
    }
    
}
