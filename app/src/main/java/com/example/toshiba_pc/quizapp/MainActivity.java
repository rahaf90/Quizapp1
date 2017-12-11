package com.example.toshiba_pc.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText kingname;
    RadioGroup r;
    RadioButton rightbutton;
    CheckBox right1;
    CheckBox right2;
    RadioGroup sec;
    RadioButton riyadh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kingname = findViewById(R.id.editText);
        r = findViewById(R.id.group1);
        rightbutton = findViewById(R.id.radioButton2);
        right1 = findViewById(R.id.right1);
        right2 = findViewById(R.id.right2);
        sec=findViewById(R.id.seconedradiog);
        riyadh=findViewById(R.id.c2);
    }


    public boolean q1() {
        String n = kingname.getText().toString();
        if (n == "salman") {
            return true;
        } else
            return false;
    }

    public boolean q2() {

        int radioButtonID = r.getCheckedRadioButtonId();
        if (radioButtonID == R.id.radioButton2)
            return true;
            else
            return false;
    }


    public boolean q3answer1() {

        if (right1.isChecked())
            return true;
        else return false;
    }

    public boolean q3answer2() {
        if (right2.isChecked())
            return true;
         else return false;
    }


    public boolean q4(){
        int radioButtonID2 = sec.getCheckedRadioButtonId();

        if(radioButtonID2==R.id.c2)
            return true;

        else return false;
    }


    public void Submit(View view) {

        int counter = 0;
        if (q1() == true) {

            counter++;
        }

        if (q2() == true) {
            counter++;
        }


        if (q3answer1() == true) {

            counter++;
        }

        if (q3answer2() == true) {

            counter++;

        }

        if(q4()){
            counter++;
        }

        Toast.makeText(this, "you answerd " + counter + "questions right",
                Toast.LENGTH_LONG).show();


    }

}





