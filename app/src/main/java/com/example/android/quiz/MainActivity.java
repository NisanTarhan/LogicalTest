package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizSolution(View view){

        EditText nameText = findViewById(R.id.nameText);
        CharSequence name = nameText.getText();

        RadioButton question1_answer2 = findViewById(R.id.answer2_radio_button);
        boolean answer2Selected = question1_answer2.isChecked();

        RadioButton question2_answer3 = findViewById(R.id.answer7_radio_button);
        boolean answer7Selected = question2_answer3.isChecked();

        CheckBox question3_answer1 = findViewById(R.id.answer1_checkbox);
        boolean answerCheckBox1 = question3_answer1.isChecked();

        CheckBox question3_answer4 = findViewById(R.id.answer4_checkbox);
        boolean answerCheckBox4 = question3_answer4.isChecked();

        RadioButton question4_answer4 = findViewById(R.id.answer12_radio_button);
        boolean answer12Selected = question4_answer4.isChecked();

        RadioButton question5_answer4 = findViewById(R.id.answer16_radio_button);
        boolean answer16Selected = question5_answer4.isChecked();

        RadioButton question6_answer2 = findViewById(R.id.answer18_radio_button);
        boolean answer18Selected = question6_answer2.isChecked();

        RadioButton question7_answer2 = findViewById(R.id.answer22_radio_button);
        boolean answer22Selected = question7_answer2.isChecked();

        RadioButton question8_answer3 = findViewById(R.id.answer27_radio_button);
        boolean answer27Selected = question8_answer3.isChecked();

        if (answer2Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer7Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answerCheckBox1 & answerCheckBox4) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer12Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer16Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer18Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer22Selected) {
            correctAnswer = correctAnswer + 1;
        }

        if (answer27Selected) {
            correctAnswer = correctAnswer + 1;
        }


        if (correctAnswer >= 7) {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nWow you're so clever ", Toast.LENGTH_LONG).show();
        }


        if (correctAnswer < 7 & correctAnswer >= 3) {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nHmm I think you're a brilliant guy but you need to work a little more ", Toast.LENGTH_LONG).show();
        }

        if (correctAnswer < 3)
        {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nSorry you don't have an arithmetic skills. You must work hard and then try again later.", Toast.LENGTH_LONG).show();
        }

        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setEnabled(false);

    }

    public void resetScore(View v) {
        correctAnswer = 0;
        Button summaryButton = findViewById(R.id.submit_button);
        summaryButton.setEnabled(true);
    }
}
