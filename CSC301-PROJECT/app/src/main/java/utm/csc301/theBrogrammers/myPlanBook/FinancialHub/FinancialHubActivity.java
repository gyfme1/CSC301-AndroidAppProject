package utm.csc301.theBrogrammers.myPlanBook.FinancialHub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import utm.csc301.theBrogrammers.myPlanBook.R;

public class FinancialHubActivity extends AppCompatActivity {

     final String[] monthStrings = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
             "Aug", "Sep", "Oct", "Nov", "Dec"};
     int lastly; // the last month's expenditure - for demo purposes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide(); // Get rid of toolbar
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_hub);

    }

    public void switchToImportScreen(View v){
        Intent myIntent = new Intent(getApplicationContext(), LoadTransactions.class);
        startActivity(myIntent);
    }

    public void switchToGoalsScreen(View v){
        Intent intent = new Intent(getApplicationContext(), GoalProgress.class);
        startActivity(intent);
    }

    public void switchToManageFinancesScreen(View v){
        Intent intent = new Intent(getApplicationContext(), ManageFinances.class);
        startActivity(intent);
    }
}