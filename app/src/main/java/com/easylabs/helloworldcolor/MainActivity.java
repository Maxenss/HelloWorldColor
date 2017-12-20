package com.easylabs.helloworldcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Объявляем GUI-элементы
    Button btRed;
    Button btBlack;
    Button btBlue;
    Button btGreen;
    Button btYellow;
    TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Выберите цвет текста");

        // Инициализируем GUI-элементы
        btRed = (Button) findViewById(R.id.btRed);
        btBlack = (Button) findViewById(R.id.btBlack);
        btBlue = (Button) findViewById(R.id.btBlue);
        btGreen = (Button) findViewById(R.id.btGreen);
        btYellow = (Button) findViewById(R.id.btYellow);
        tvHelloWorld = (TextView) findViewById(R.id.tvHelloWorld);

        // this - в данном конкретном случае, ссылается на метод OnClick в данном классе
        btRed.setOnClickListener(this);
        btBlack.setOnClickListener(this);
        btBlue.setOnClickListener(this);
        btGreen.setOnClickListener(this);
        btYellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // класс View - явл. родительским для всех элементов GUI в Android
        // У каждого элемента GUI есть свой уникальный id

        // Получаем id элемента, на который нажал пользователь
        int idView = view.getId();
        String strColor = " ";
        String message="";

        switch (idView) {
            case R.id.btRed:
                message = "Выбран красный цвет";
                strColor = "#ffff4444";
                break;
            case R.id.btBlack:
                message = "Выбран черный цвет";
                strColor = "#000000";
                break;
            case R.id.btBlue:
                message = "Выбран синий цвет";
                strColor = "#ff33b5e5";
                break;
            case R.id.btYellow:
                message = "Выбран желтый цвет";
                strColor = "#ffffbb33";
                break;
            case R.id.btGreen:
                message = "Выбран зеленый цвет";
                strColor = "#ff99cc00";
                break;
        }

        // Выводим на экран сообщение, какой цвет выбрал пользователь
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // Изменяем цвет в текстовом поле
        tvHelloWorld.setTextColor(Color.parseColor(strColor));
    }
}
