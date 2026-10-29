package com.example.workoutapp.Activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.workoutapp.Adapter.WorkoutAdapter;
import com.example.workoutapp.Domain.Lession;
import com.example.workoutapp.Domain.Workout;
import com.example.workoutapp.R;
import com.example.workoutapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));
    }
    //this sample data for list, you can use your data with api services
    private ArrayList<Workout> getData(){
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Running","Har bir mashq – bu o‘z ustingda qilingan sarmoya. Bugun qanchalik harakat qilsang, ertaga shunchalik kuchli va bardoshli bo‘lasan. Oldinga intil, natijalar seni kutmoqda! ","pic_111",160,"9 min",getLession_1()));
        list.add(new Workout("Stretching","Har bir mashq – bu o‘z ustingda qilingan sarmoya. Bugun qanchalik harakat qilsang, ertaga shunchalik kuchli va bardoshli bo‘lasan. Oldinga intil, natijalar seni kutmoqda! ","pic_2",230,"85 min",getLession_2()));
        list.add(new Workout("Yoga","Har bir mashq – bu o‘z ustingda qilingan sarmoya. Bugun qanchalik harakat qilsang, ertaga shunchalik kuchli va bardoshli bo‘lasan. Oldinga intil, natijalar seni kutmoqda! ","pic_3",180,"60 min",getLession_3()));
        list.add(new Workout("Strength","Har bir mashq – bu o‘z ustingda qilingan sarmoya. Bugun qanchalik harakat qilsang, ertaga shunchalik kuchli va bardoshli bo‘lasan. Oldinga intil, natijalar seni kutmoqda! ","pic_4",200,"30 min",getLession_4()));

        return list;
    }
  private ArrayList<Lession> getLession_1(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","03:46 ","HBPMvFkpNgE","pic_1_1"));
        list.add(new Lession("Lession 2","03:41 ","K6I24WgiiPw","pic_1_2"));
        list.add(new Lession("Lession 3","01:57 ","Zc08v4YY0eA","pic_1_3"));

        return list;
  }
  private ArrayList<Lession> getLession_2(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","20:23 ","L3eImBAXT7I","pic_3_1"));
        list.add(new Lession("Lession 2","18:27 ","47Exgz07FlU","pic_3_2"));
        list.add(new Lession("Lession 3","32:25 ","OmLx8tmaQ-4","pic_3_3"));
        list.add(new Lession("Lession 4","07:52 ","w86EalEoFRY","pic_3_4"));

        return list;
  }

  private ArrayList<Lession> getLession_3(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","23:00","v7AYKMP6r0E","pic_3_1"));
        list.add(new Lession("Lession 2","27:00","Eml2xnoLpYE","pic_3_2"));
        list.add(new Lession("Lession 3","25:00","v7SN-d4qXx0","pic_3_3"));
        list.add(new Lession("Lession 4","21:00","LqXZ628YNj4","pic_3_4"));

        return list;
  }
    private ArrayList<Lession> getLession_4(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","32:00","tj0o8aH9vJw","pic_4_1"));
        list.add(new Lession("Lession 2","11:06","GcZJhNi2yOM","pic_4_1"));
        list.add(new Lession("Lession 3","1:02:34","rWearms3rFY","pic_4_1"));

        return list;
    }

}