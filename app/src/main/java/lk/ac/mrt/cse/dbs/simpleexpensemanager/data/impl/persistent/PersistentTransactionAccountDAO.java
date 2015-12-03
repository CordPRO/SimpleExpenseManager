package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent;

import android.content.Context;

import java.util.Date;
import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Transaction;

/**
 * Created by Madhawa on 03/12/2015.
 */
public class PersistentTransactionAccountDAO implements TransactionDAO {
    public  PersistentTransactionAccountDAO(Context context)
    {

    }
    @Override
    public void logTransaction(Date date, String accountNo, ExpenseType expenseType, double amount) {

    }

    @Override
    public List<Transaction> getAllTransactionLogs() {
        return null;
    }

    @Override
    public List<Transaction> getPaginatedTransactionLogs(int limit) {
        return null;
    }
}
