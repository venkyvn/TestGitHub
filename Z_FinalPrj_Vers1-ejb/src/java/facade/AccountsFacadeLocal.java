/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import entity.Accounts;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author venky
 */
@Local
public interface AccountsFacadeLocal {

    void create(Accounts accounts);

    void edit(Accounts accounts);

    void remove(Accounts accounts);

    Accounts find(Object id);

    List<Accounts> findAll();

    List<Accounts> findRange(int[] range);

    int count();
    
    Accounts checkLoginAccounts(String id, String password);
    
    boolean changePassword(String id, String password);
    
}
