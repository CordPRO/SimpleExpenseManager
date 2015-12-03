package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent.contracts;

import android.provider.BaseColumns;

import java.text.SimpleDateFormat;
import java.util.Date;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;

/**
 * Created by Madhawa on 03/12/2015.
 */
public final class TransactionContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public TransactionContract() {}

    /* Inner class that defines the table contents */
    public static abstract class TransactionEntry implements BaseColumns {
        public static final String TABLE_NAME = "transaction_history";

        public static final String COLUMN_NAME_ENTRY_INDEX = "record_number";
        public static final String COLUMN_NAME_ACCOUNT_NO = "account_number";
        public static final String COLUMN_NAME_EXPENSE_TYPE = "expense_type";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_AMOUNT = "amount";


    }
}