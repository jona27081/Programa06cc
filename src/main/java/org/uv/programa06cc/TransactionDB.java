/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa06cc;

import java.sql.Connection;

/**
 *
 * @author ZS20006736
 */
public abstract class TransactionDB<T> {
    protected T p;
    
    protected TransactionDB(T p){
        this.p=p;
    }
            
    public abstract boolean execute(Connection con);
}
