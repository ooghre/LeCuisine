package com.example.lecuisine.Presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lecuisine.Logic.DishList;
import com.example.lecuisine.R;

import static com.example.lecuisine.Presentation.MainActivity.returnDishList;


public class CreateDishActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dish);
    }

    public void sendMessage(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String dishName = editText.getText().toString();

        if(!dishName.equals("")){
            //Intent intentFromPrevActivity = getIntent();
            //DishList dishList = (DishList) intentFromPrevActivity.getSerializableExtra("dish list");
            DishList dishList = returnDishList();
            dishList.addDish(dishName);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else{
            AppUtil.displayError(this, R.string.missing_dish_name);
        }
    }
}
