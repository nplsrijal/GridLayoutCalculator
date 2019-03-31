package com.example.gridlayoutcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndivide,btnmult,btnsub,btnadd,btndot,btnc,btncalc;
    private TextView inputval,toshow;
    double input1 = 0, input2 = 0;

    boolean Addition, Subtract, Multiplication, Division, decimal;
    private static DecimalFormat df2 = new DecimalFormat(".##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btndot=findViewById(R.id.btndot);
        btnc=findViewById(R.id.btnc);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmult=findViewById(R.id.btnmult);
        btndivide=findViewById(R.id.btndivide);
        btncalc=findViewById(R.id.btncalc);
        toshow=findViewById(R.id.toshow);






        inputval=findViewById(R.id.inputval);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    inputval.setText(inputval.getText().toString() + ".");
                    decimal = true;
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText("0");
                toshow.setText("0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputval.getText().length() != 0) {
                    input1 = Float.parseFloat(inputval.getText().toString() + "");
                    toshow.setText(""+df2.format(input1)+"+");
                    Addition = true;
                    decimal = false;
                    inputval.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputval.getText().length() != 0) {
                    input1 = Float.parseFloat(inputval.getText() + "");
                    toshow.setText(""+df2.format(input1)+"-");
                    Subtract = true;
                    decimal = false;
                    inputval.setText(null);
                }
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputval.getText().length() != 0) {
                    input1 = Float.parseFloat(inputval.getText().toString() + "");
                    toshow.setText(""+df2.format(input1)+"*");
                    Multiplication = true;
                    decimal = false;
                    inputval.setText(null);
                }
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputval.getText().length() != 0) {
                    input1 = Float.parseFloat(inputval.getText().toString()+ "");
                    toshow.setText(""+df2.format(input1)+"/");
                    Division = true;
                    decimal = false;
                    inputval.setText(null);
                }
            }
        });
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division) {
                    input2 = Float.parseFloat(inputval.getText().toString() + "");
                }

                if (Addition) {

                    toshow.setText(""+df2.format(input1 )+"+" + df2.format(input2));
                    inputval.setText(df2.format(input1 + input2) + "");
                    Addition = false;
                }

                if (Subtract) {

                    toshow.setText(""+df2.format(input1 )+"-" + df2.format(input2));

                    inputval.setText(df2.format(input1 - input2) + "");
                    Subtract = false;
                }

                if (Multiplication) {

                    toshow.setText(""+df2.format(input1 )+"*" + df2.format(input2));
                    inputval.setText(df2.format(input1 * input2) + "");
                    Multiplication = false;
                }

                if (Division) {

                    toshow.setText(""+df2.format(input1 )+"/" + df2.format(input2));
                    inputval.setText(df2.format(input1 / input2) + "");
                    Division = false;
                }

            }
        });






    }
}
