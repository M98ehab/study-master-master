package com.mohamed.mozkra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner)findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner year = (Spinner)findViewById(R.id.year);
        final Spinner semester = (Spinner)findViewById(R.id.semester);
        final Spinner material = (Spinner)findViewById(R.id.material);


        ArrayAdapter facultyAdapter = ArrayAdapter.createFromResource(this,R.array.faculty,
                android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(facultyAdapter);

        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.year, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);
                }
                    }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
                });
        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
        year.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(year.getSelectedItem().toString().equals("first year P.E")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterpe1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }else if(year.getSelectedItem().toString().equals("second year P.E")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterpe2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        semester.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(semester.getSelectedItem().toString().equals("first semester Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }else if(semester.getSelectedItem().toString().equals("second semester Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }else if(semester.getSelectedItem().toString().equals("first semester Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        material.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(material.getSelectedItem().toString().equals("مبادئ القانون 1")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCdFY2NF96NVFoQVU");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("مبادئ العلوم السياسة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLS15d1Juc0dENEk");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("مبادئ السلوك التنظيمى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5IdmNodXFBOXM");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("اقتصاد جزئى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5FdEVHdXk2a2M");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("امتحانات 1")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLUpjaTVSYmRCaGs");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("مبادئ القانون 2")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5lNnBld1BkVW8");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("مبادئ احصاء")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLUZLVmJENmVsYW8");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("حقوق انسان")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZWSmRMb0d5Smc");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("الادارة العامة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLVFyUEhzVElVYVU");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("اقتصاد كلى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZfUHhncGM3UXM");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("international organization")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLVVGYjJIUmgwMlE");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("امتحانات 2")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5hVGd1N3pqcjQ");
                            startActivity(i);
                        }else if(material.getSelectedItem().toString().equals("امتحان اقتصاد")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1-1BCTt6cZxAxQZ-9he2esNYisgNFspmu");
                            startActivity(i);
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
}
