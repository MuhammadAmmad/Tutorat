package ca.tutorat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StudentDetails extends AppCompatActivity {

    private TextView myFullName;
    private TextView myProgramOfStudy;
    private TextView mySchool;
    private TextView myEmail;
    private TextView myUsername;
    private TextView myPostalCode;
    private TextView myPhoneNumber;
    //private static user student;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.appTitle);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().collapseActionView();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        myPostalCode = (TextView) findViewById(R.id.my_postal_code);
        myProgramOfStudy = (TextView) findViewById(R.id.programOfStudy);
        myFullName = (TextView) findViewById(R.id.My_name_on_student_details);
        myEmail = (TextView) findViewById(R.id.my_email);
        mySchool = (TextView) findViewById(R.id.school_on_student_details);
        myPhoneNumber = (TextView) findViewById(R.id.my_phone_number);
        myUsername = (TextView) findViewById(R.id.userName);

        myFullName.setText(StudentMainPage.student.getFirstName() + " " + StudentMainPage.student.getLastName());
        //mySchool.setText(me.getSchool);
       // myProgramOfStudy.setText(me.getProgramOfStudy);
        myEmail.setText(StudentMainPage.student.getEmail());
        myUsername.setText(StudentMainPage.student.getUsername());
        //myPostalCode.setText(me.getCodePostal());
        //myPhoneNumber.setText(me.getNumeroTelephone());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_student_main_page, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        //SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem); // <-- change your code to this
        // Configure the search info and add any event listeners
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(StudentDetails.this, "option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                break;
            case R.id.action_disconnect:
                Intent intent = new Intent(StudentDetails.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return true; //super.onOptionsItemSelected(item);
    }
}
