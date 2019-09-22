package com.example.android.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ac,persent,divide,star,plus,minus,one,two,three,four,five,six,seven,eight,nine,zero,equal,dot;
    View backSpace;
    TextView typing,typed,result;
    static  final String i = "0";
    Character op=null;
    double num1=0,num2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac = (TextView) findViewById(R.id.ac);
        divide = (TextView) findViewById(R.id.divide);
        persent = (TextView) findViewById(R.id.percent);
        star = (TextView) findViewById(R.id.multiply);
        plus  = (TextView) findViewById(R.id.add);
        minus = (TextView) findViewById(R.id.difference);
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three  = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        zero = (TextView) findViewById(R.id.zero);
        equal = (TextView) findViewById(R.id.equals);
        backSpace = findViewById(R.id.back_space);
        dot=(TextView) findViewById(R.id.dot);

        typing = (TextView) findViewById(R.id.typing);
        typed = (TextView) findViewById(R.id.typed);
        result = (TextView) findViewById(R.id.result);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=0;
                num2=0;
                op = null;
                typed.setText("");
                typing.setText("");
                result.setText("");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String typingText=typing.getText().toString();
                if(typingText.equals("")){
                    typing.setText("0.");
                }
                else if(typingText.equals("+") || typingText.equals("-") || typingText.equals("*")
                || typingText.equals("/") || typingText.equals("%"));
                else
                    typing.append(".");

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  try {
                      if (typing.getText().toString().equals(""))
                          return;
                      try {
                          num2 = Double.parseDouble(typing.getText() + "");
                      } catch (Exception e) {
                      }
                      if(op!=null)
                      typed.append(typing.getText());


                      if (op == '+') {
                          num1 = num1 + num2;
                      } else if (op == '-') {
                          num1 = num1 - num2;
                      } else if (op == '*') {
                          num1 = num1 * num2;
                      } else if (op == '/') {
                          num1 = num1 / num2;
                      } else if (op == '%') {
                          num1 = num1 % num2;
                      }
                      if ((double) (int) num1 == num1)
                          typing.setText((int) num1 + "");
                      else
                          typing.setText(num1 + "");

                      op = null;
                  }
                  catch (Exception e){}
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1==0) {
                    try {
                        num1 = Double.parseDouble(typing.getText() + "");
                    }
                    catch (Exception e){}
                    typing.setText("+");

                        if ((double) (int) num1 == num1)
                            typed.setText((int) num1 + "");
                        else
                            typed.setText(num1 + "");
                }
                else {
                    try {
                        if (op != null) {
                            num2 = Double.parseDouble(typing.getText() + "");
                            if (op == '+') {
                                num1 = num1 + num2;
                            } else if (op == '-') {
                                num1 = num1 - num2;
                            } else if (op == '*') {
                                 num1 = num1 * num2;
                            } else if (op == '/') {
                                num1 = num1 / num2;
                            } else if (op == '%') {
                                num1 = num1 % num2;
                            }
                        }
                        else{
                            num1=Double.parseDouble(typing.getText() + "");
                        }
                        if((double)(int)num1==num1)
                            typed.setText((int)num1 + "");
                        else
                            typed.setText(num1 + "");
                    }catch (Exception e){}
                    typing.setText("+");
                }
                op='+';
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1==0) {
                    try {
                        num1 = Double.parseDouble(typing.getText() + "");
                    }
                    catch (Exception e){}
                    typing.setText("-");
                        if ((double) (int) num1 == num1)
                            typed.setText((int) num1 + "");
                        else
                            typed.setText(num1 + "");
                }
                else {
                    try {
                        if (op != null) {
                            num2 = Double.parseDouble(typing.getText() + "");
                            if (op == '+') {
                                num1 = num1 + num2;
                            } else if (op == '-') {
                                num1 = num1 - num2;
                            } else if (op == '*') {
                                num1 = num1 * num2;
                            } else if (op == '/') {
                                num1 = num1 / num2;
                            } else if (op == '%') {
                                num1 = num1 % num2;
                            }
                        }
                        else{
                            num1 = Double.parseDouble(typing.getText() + "");
                        }
                        if((double)(int)num1==num1)
                            typed.setText((int)num1 + "");
                        else
                            typed.setText(num1 + "");
                    }catch (Exception e){}
                    typing.setText("-");
                }
                op='-';
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1==0) {
                    try {
                        num1 = Double.parseDouble(typing.getText() + "");
                    } catch (Exception e){}
                    typing.setText("*");
                        if ((double) (int) num1 == num1)
                            typed.setText((int) num1 + "");
                        else
                            typed.setText(num1 + "");
                }
                else {
                    try {
                        if (op != null) {
                            num2 = Double.parseDouble(typing.getText() + "");
                            if (op == '+') {
                                num1 = num1 + num2;
                            } else if (op == '-') {
                                num1 = num1 - num2;
                            } else if (op == '*') {
                                num1 = num1 * num2;
                            } else if (op == '/') {
                                num1 = num1 / num2;
                            } else if (op == '%') {
                                num1 = num1 % num2;
                            }
                        }
                        else {
                            num1 = Double.parseDouble(typing.getText() + "");
                        }
                        if((double)(int)num1==num1)
                            typed.setText((int)num1 + "");
                        else
                            typed.setText(num1 + "");
                    }catch (Exception e){}
                    typing.setText("*");
                }
                op='*';

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1==0) {
                    try {
                        num1 = Double.parseDouble(typing.getText() + "");
                    }
                    catch (Exception e){}
                    typing.setText("/");
                        if ((double) (int) num1 == num1)
                            typed.setText((int) num1 + "");
                        else
                            typed.setText(num1 + "");

                }
                else {
                    try {
                        if (op != null) {
                            num2 = Double.parseDouble(typing.getText() + "");
                            if (op == '+') {
                                num1 = num1 + num2;
                            } else if (op == '-') {
                                num1 = num1 - num2;
                            } else if (op == '*') {
                                num1 = num1 * num2;
                            } else if (op == '/') {
                                num1 = num1 / num2;
                            } else if (op == '%') {
                                num1 = num1 % num2;
                            }
                        }
                        else{
                            num1 = Double.parseDouble(typing.getText() + "");
                        }
                        if((double)(int)num1==num1)
                            typed.setText((int)num1 + "");
                        else
                            typed.setText(num1 + "");
                    }catch (Exception e){}
                    typing.setText("/");
                }
                op='/';

            }
        });

        persent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1==0) {
                    try {
                        num1 = Double.parseDouble(typing.getText() + "");
                    }
                    catch (Exception e){}
                    typing.setText("%");
                        if ((double) (int) num1 == num1)
                            typed.setText((int) num1 + "");
                        else
                            typed.setText(num1 + "");

                }
                else {
                    try {
                        if (op != null) {
                            num2 = Double.parseDouble(typing.getText() + "");
                            if (op == '+') {
                                num1 = num1 + num2;
                            } else if (op == '-') {
                                num1 = num1 - num2;
                            } else if (op == '*') {
                                num1 = num1 * num2;
                            } else if (op == '/') {
                                num1 = num1 / num2;
                            } else if (op == '%') {
                                num1 = num1 % num2;
                            }
                        }
                        else{
                            num1 = Double.parseDouble(typing.getText() + "");
                        }
                        if((double)(int)num1==num1)
                            typed.setText((int)num1 + "");
                        else
                            typed.setText(num1 + "");
                    }catch (Exception e){}
                    typing.setText("%");
                }
                op='%';

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                    typing.append("3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                typing.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(typing.getText().toString().equals("+")) {
                    typed.append("+");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("-")){
                    typed.append("-");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("*")){
                    typed.append("*");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("/")){
                    typed.append("/");
                    typing.setText((""));
                }
                else if(typing.getText().toString().equals("%")){
                    typed.append("%");
                    typing.setText((""));
                }
                 typing.append("0");
            }
        });



        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String str = typing.getText().toString();
                    String substr = str.substring(0, str.length() - 1);
                    typing.setText(substr);
                }
                catch (Exception e){}
            }
        });







    }





}
