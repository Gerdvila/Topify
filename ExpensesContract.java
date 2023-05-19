import android.provider.BaseColumns;

public final class ExpensesContract {
    private ExpensesContract() {}

    public static class ExpensesEntry implements BaseColumns {
        public static final String TABLE_NAME = "expenses";
        public static final String COLUMN_NAME_MONTH = "month";
        public static final String COLUMN_NAME_HOUSING = "housing";
        public static final String COLUMN_NAME_TRANSPORTATION = "transportation";
        public static final String COLUMN_NAME_TRAVEL_EXPENSES = "travel_expenses";
        public static final String COLUMN_NAME_FOOD_AND_GROCERIES = "food_and_groceries";
        public static final String COLUMN_NAME_UTILITY_BILLS = "utility_bills";
        public static final String COLUMN_NAME_PET_FOOD_AND_CARE = "pet_food_and_care";
        public static final String COLUMN_NAME_CLOTHING = "clothing";
        public static final String COLUMN_NAME_MEMBERSHIPS_AND_SUBSCRIPTIONS = "memberships_and_subscriptions";
        public static final String COLUMN_NAME_ENTERTAINMENTS = "entertainments";
        public static final String COLUMN_NAME_LOANS = "loans";
        public static final String COLUMN_NAME_RETIREMENT = "retirement";
        public static final String COLUMN_NAME_EMERGENCY_FUND = "emergency_fund";
    }
}
