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
    public Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.submit_button);
    }

    public void quizSolution(View view) {

        EditText nameText = findViewById(R.id.nameText);
        CharSequence name = nameText.getText();

        EditText answerText = findViewById(R.id.answer_textfield);

        RadioButton question1_answer2 = findViewById(R.id.answer2_radio_button);

        RadioButton question2_answer3 = findViewById(R.id.answer7_radio_button);

        CheckBox question3_answer1 = findViewById(R.id.answer1_checkbox);

        CheckBox question3_answer2 = findViewById(R.id.answer2_checkbox);

        CheckBox question3_answer3 = findViewById(R.id.answer3_checkbox);

        CheckBox question3_answer4 = findViewById(R.id.answer4_checkbox);

        RadioButton question4_answer4 = findViewById(R.id.answer12_radio_button);

        RadioButton question5_answer4 = findViewById(R.id.answer16_radio_button);

        RadioButton question6_answer2 = findViewById(R.id.answer18_radio_button);

        RadioButton question8_answer3 = findViewById(R.id.answer27_radio_button);

        if (question1_answer2.isChecked()) {
            correctAnswer++;
        }

        if (question2_answer3.isChecked()) {
            correctAnswer++;
        }

        if (question3_answer1.isChecked()) {
            if (question3_answer4.isChecked()) {
                if(!question3_answer2.isChecked())
                    if (!question3_answer3.isChecked())
                correctAnswer++;
            }
        }

        if (question4_answer4.isChecked()) {
            correctAnswer++;
        }

        if (question5_answer4.isChecked()) {
            correctAnswer++;
        }

        if (question6_answer2.isChecked()) {
            correctAnswer++;
        }

        String question7_answer = answerText.getText().toString();
        if (question7_answer.equals("2")) {
            correctAnswer++;
        }

        if (question8_answer3.isChecked()) {
            correctAnswer++;
        }


        if (correctAnswer >= 7) {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nWow you're so clever ", Toast.LENGTH_LONG).show();
        }

        else if (correctAnswer < 7 & correctAnswer >= 3) {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nHmm I think you're a brilliant guy but you need to work a little more ", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(this, "Correct answer: " + correctAnswer + "\nHi " + name + "\nSorry you don't have an arithmetic skills. You must work hard and then try again later.", Toast.LENGTH_LONG).show();
        }

        submitButton.setEnabled(false);
    }

    public void resetScore(View v) {
        correctAnswer = 0;
        submitButton.setEnabled(true);
    }
}
