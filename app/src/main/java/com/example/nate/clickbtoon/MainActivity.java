package com.example.nate.clickbtoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView display;
    String originalNumber = "", newNumber, displayNumber, operators;
    double ans = 0;
    boolean reNew = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.display);
    }


    public void clickButton(View v) {
        // get display number put into displayNumber
        displayNumber = display.getText().toString();

        //decide that which key click
        //number key was clicked
        switch (v.getId()) {
            case R.id.one: {
                if (reNew == true) {//user click AC
                    reNew = false;
                    displayNumber = "";//clear displayNumber
                }
                display.setText(displayNumber + 1);
                break;
            }
            case R.id.tow: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 2);
                break;
            }
            case R.id.three: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 3);
                break;
            }
            case R.id.four: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 4);
                break;
            }
            case R.id.five: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 5);
                break;
            }
            case R.id.six: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 6);
                break;
            }
            case R.id.sevsn: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 7);
                break;
            }
            case R.id.eight: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }

                display.setText(displayNumber + 8);
                break;
            }
            case R.id.nine: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 9);
                break;
            }
            case R.id.zero: {
                if (reNew == true) {
                    reNew = false;
                    displayNumber = "";
                }
                display.setText(displayNumber + 0);
                break;
            }
            //operators
            case R.id.addition: {
                if (displayNumber.equals("")) {
                    Toast.makeText(this, R.string.noPutNumber, Toast.LENGTH_SHORT)
                            .show();
                } else {
                    originalNumber = displayNumber;
                    display.setText(""); //clear display
                    operators = "add"; //put operator
                }

                break;
            }

            case R.id.subtraction: {
                if (displayNumber.equals("")) {
                    Toast.makeText(this, R.string.noPutNumber, Toast.LENGTH_SHORT)
                            .show();
                } else {
                    originalNumber = displayNumber;
                    display.setText("");
                    operators = "plus";
                }
                break;
            }

            case R.id.division: {
                if (displayNumber.equals("")) {
                    Toast.makeText(this, R.string.noPutNumber, Toast.LENGTH_SHORT)
                            .show();
                } else {
                    originalNumber = displayNumber;
                    display.setText("");
                    operators = "divide";
                }
                break;
            }

            case R.id.multiplication: {
                if (displayNumber.equals("")) {
                    Toast.makeText(this, R.string.noPutNumber, Toast.LENGTH_SHORT).show();
                } else {
                    originalNumber = displayNumber;
                    display.setText("");
                    operators = "times";
                }
                break;
            }
            //equal
            case R.id.equal: {

                if (originalNumber.equals("")) {
                    Toast.makeText(this, R.string.noPutNumber, Toast.LENGTH_SHORT).show();
                } else {
                    newNumber = displayNumber;
                    switch (operators) {  //decide operator
                        case "add": {
                            ans = Double.parseDouble(originalNumber) +//do math
                                    Double.parseDouble(newNumber);
                            display.setText(String.valueOf(ans)); //show answer
                            break;
                        }
                        case "plus": {
                            ans = Double.parseDouble(originalNumber) -
                                    Double.parseDouble(newNumber);
                            display.setText(String.valueOf(ans));
                            break;
                        }
                        case "times": {
                            ans = (Double.parseDouble(originalNumber) *
                                    Double.parseDouble(newNumber));
                            display.setText(String.valueOf(ans));
                            break;
                        }
                        case "divide": {
                            double dd = Double.parseDouble(originalNumber) /
                                    Double.parseDouble(newNumber);
                            display.setText(String.valueOf(dd));
                        }


                    }
                    reNew = true;
                    originalNumber = null;
                }
            }

        }


    }

    public void clickAC(View v) {
        display.setText("");
        originalNumber = "";
        newNumber = "";
        ans = 0;
        reNew = false;

    }


}
