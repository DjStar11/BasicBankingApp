package com.example.basicbankingapp.DB;

import android.provider.BaseColumns;

public class TransactionContract {
    private TransactionContract(){}
    public static final class TransactionEntry implements BaseColumns {
        public final static String TABLE_NAME = "Transact_table";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TO_NAME ="to_name";
        public final static String COLUMN_AMOUNT ="amount";
        public final static String COLUMN_STATUS ="status";
        public static final String COLUMN_FROM_NAME ="from_name" ;
    }
}
