package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.InMemoryTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent.PersistentTransactionAccountDAO;

/**
 * Created by Madhawa on 03/12/2015.
 */
public class PersistentExpenseManager extends ExpenseManager {

    private Context context = null;
    public PersistentExpenseManager( Context context) {
            this.context = context;
            setup();

    }

    @Override
    public void setup()  {
        //Setup DAO objects
        TransactionDAO inMemoryTransactionDAO = new InMemoryTransactionDAO();
        setTransactionsDAO(inMemoryTransactionDAO);


        AccountDAO persistentAccountDAO = new PersistentAccountDAO(context);
        setAccountsDAO(persistentAccountDAO);


    }
}
