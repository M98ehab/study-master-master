package com.mohamed.mozkra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /*These variables in rts and Humanities science Faculty*/
    String dep ;   // stands for which department is selected
    // E stands for english department , F for french department and so on
    int ye;      // stands for which year is selected
    int sem;    //stands for which semester is selected
    String ur ;//virable to store links of materials

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner)findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner year = (Spinner)findViewById(R.id.year);
        final Spinner semester = (Spinner)findViewById(R.id.semester);
        final Spinner material = (Spinner)findViewById(R.id.material);


        /*faculties*/
        ArrayAdapter facultyAdapter = ArrayAdapter.createFromResource(this,R.array.faculty,
                android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(facultyAdapter);

        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (faculty.getSelectedItem().toString().equals("Choose your Faculty....")) {
                    Toast.makeText(MainActivity.this,"Choose your faculty..",Toast.LENGTH_SHORT).show();
                department.setVisibility(View.GONE);
                year.setVisibility(View.GONE);
                semester.setVisibility(View.GONE);
                material.setVisibility(View.GONE);

                /*Politics and Economy*/
                }else if (faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                    department.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);
                    material.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.year, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);

                    /*Fish resources and marine studies*/
                } else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);
                    material.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.departmentfr, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                    /*Computers and information*/
                } else if (faculty.getSelectedItem().toString().equals("Computers and information")) {
                    department.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);
                    material.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.yearcs, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);

                    /*Petroleum and Mining Engineering Faculty*/
                }else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering Faculty")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);
                    material.setVisibility(View.GONE);
                    ArrayAdapter pme_departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.pme_department, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(pme_departmentAdapter);

                    /*Arts and Humanities science Faculty*/
                }else if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    semester.setVisibility(View.GONE);
                    material.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.department, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
                });
        /*departments*/
        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        /*Fish resources and marine studies*/
                        if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")) {
                            if (department.getSelectedItem().toString().equals("Ocean")) {
                                year.setVisibility(View.VISIBLE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.yearRF1, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            } else if (department.getSelectedItem().toString().equals("هندسة بحرية")) {
                                year.setVisibility(View.VISIBLE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.yearRF2, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            } else if (department.getSelectedItem().toString().equals("مميز")) {
                                year.setVisibility(View.VISIBLE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.yearRF, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            } else if (department.getSelectedItem().toString().equals("سلامة بحرية")) {
                                year.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(yearAdapter);
                            }
                            /*Petroleum and Mining Engineering Faculty*/
                        }else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering Faculty")) {
                            if (department.getSelectedItem().toString().equals("Petroleum Engineering Dept.")) {
                                year.setVisibility(View.VISIBLE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_petroleum_yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(pme_petroleum_yearAdapter);
                            } else if (department.getSelectedItem().toString().equals("Refining Engineering Dept.")) {
                                year.setVisibility(View.VISIBLE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_refining_yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(pme_refining_yearAdapter);
                            } else if (department.getSelectedItem().toString().equals("Preparatory")) {
                                year.setVisibility(View.GONE);
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_preparatory_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_preparatory_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_preparatory_semesterAdapter);
                            } else if (department.getSelectedItem().toString().equals("Petroleum Production and Exploration Program")) {
                                year.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_program_materialAdapterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_program_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_program_materialAdapterAdapter);
                            } else if (department.getSelectedItem().toString().equals("Geology Dept.")) {
                                year.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_geologyDept_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_geologyDept_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_geologyDept_materialAdapter);
                            }
                            /*Arts and Humanities science Faculty*/
                        }else if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                            if(department.getSelectedItem().toString().equals("English Dapartment")){
                                dep="E";
                                year.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.E_dep_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            }else if(department.getSelectedItem().toString().equals("French Department")){
                                dep ="F";
                                year.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.F_dep_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            }else if(department.getSelectedItem().toString().equals("Geography")){
                                dep="G";
                                year.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.G_dep_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            }else if(department.getSelectedItem().toString().equals("Physiology Department")){
                                dep="PH";
                                year.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.PH_and_S_dep_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            }else if(department.getSelectedItem().toString().equals("Sociology Department")){
                                dep="S";
                                year.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.PH_and_S_dep_year, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);
                            }
                        }

                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
        /*year*/
        year.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        /*Politics and Economy*/
                        if(faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                            if (year.getSelectedItem().toString().equals("first year P.E")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semesterpe1, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("second year P.E")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semesterpe2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }
                            /*Fish resources and marine studies*/
                        }else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if (year.getSelectedItem().toString().equals("First year F.R")){
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr1, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(semesterAdapter);

                            }
                            else if (year.getSelectedItem().toString().equals("Second year F.R")){
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semesterfr1, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);

                            }
                            else if (year.getSelectedItem().toString().equals("first year F.R")){
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semesterfr11, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);

                            }
                            /*Computers and information*/
                        }else if (faculty.getSelectedItem().toString().equals("Computers and information")) {
                            if (year.getSelectedItem().toString().equals("first year C.S")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semestercs1, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("second year C.S")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semestercs2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }
                            /*Petroleum and Mining Engineering Faculty*/
                        }else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering Faculty")) {
                            if (year.getSelectedItem().toString().equals("first year Petroleum")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_petroleum1_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum1_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_petroleum1_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("second year Petroleum")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_petroleum2_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum2_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_petroleum2_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("third year Petroleum")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_petroleum3_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum3_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_petroleum3_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("fourth year Petroleum")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_petroleum4_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum4_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_petroleum4_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("first year Refining")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_refining1_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining1_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_refining1_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("second year Refining")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_refining2_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining2_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_refining2_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("third year Refining")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_refining3_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining3_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_refining3_semesterAdapter);
                            } else if (year.getSelectedItem().toString().equals("fourth year Refining")) {
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter pme_refining4_semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining4_semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(pme_refining4_semesterAdapter);
                            }
                            /*Arts and Humanities science Faculty*/
                        }else if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                            if (dep == "E" & year.getSelectedItem().toString().equals("first year")) {
                                ye = 1;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (dep == "E" & year.getSelectedItem().toString().equals("second year")) {
                                ye = 2;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (dep == "E" & year.getSelectedItem().toString().equals("third year")) {
                                ye = 3;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (dep == "E" & year.getSelectedItem().toString().equals("امتحانات قسم انجليزى")) {
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1dvFWHkRZ8jNmAzwfWpc1aAl-tJ0C7-fs&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                                Intent intent = new Intent(MainActivity.this, study.class);
                                intent.putExtra("url", ur);
                                startActivity(intent);
                            } else if (dep == "F" & year.getSelectedItem().toString().equals("first year")) {
                                ye = 1;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (dep == "F" & year.getSelectedItem().toString().equals("second year")) {
                                ye = 2;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            } else if (dep == "F" & year.getSelectedItem().toString().equals("third year")) {
                                ye = 3;
                                material.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1DGNEhr3KAhuSzPtAAqZSNTK2v9evqTeY&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                                Intent intent = new Intent(MainActivity.this, study.class);
                                intent.putExtra("url", ur);
                                startActivity(intent);
                            }else if (dep == "G" & year.getSelectedItem().toString().equals("first year")){
                                ye=1;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester3, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }else if (dep == "PH" & year.getSelectedItem().toString().equals("first year")) {
                                ye=1;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }else if(dep == "PH" & year.getSelectedItem().toString().equals("second year")){
                                ye=2;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }else if (dep == "S" & year.getSelectedItem().toString().equals("first year")) {
                                ye=1;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester2, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }else if(dep == "S" & year.getSelectedItem().toString().equals("second year")){
                                ye=2;
                                semester.setVisibility(View.VISIBLE);
                                material.setVisibility(View.GONE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semester, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);
                            }
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        /*semester*/
        semester.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        /*Politics and Economy*/
                        if (faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                            if (semester.getSelectedItem().toString().equals("first semester Y1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialpe11, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester Y1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialpe12, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester Y2")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialpe21, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                            /*Fish resources and marine studies*/
                        }else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if(semester.getSelectedItem().toString().equals("first semester - second year")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr112,android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                            else if(semester.getSelectedItem().toString().equals("first semester - first year")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr11,android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                            /*Computers and information*/
                        }else if (faculty.getSelectedItem().toString().equals("Computers and information")) {
                            if (semester.getSelectedItem().toString().equals("first semester Y1-C.S")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialcs11, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester Y1-C.S")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialcs12, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester Y2-C.S")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialcs21, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                            /*Petroleum and Mining Engineering Faculty*/
                        }else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering Faculty")) {
                            if (semester.getSelectedItem().toString().equals("first semester preparatory")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_preparatory_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_preparatory_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_preparatory_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester preparatory")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_preparatory_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_preparatory_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_preparatory_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester petroleum1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum1_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum1_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum1_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester petroleum1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum1_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum1_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum1_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester petroleum2")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum2_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum2_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum2_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester petroleum2")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum2_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum2_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum2_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester petroleum3")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum3_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum3_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum3_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester petroleum3")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum3_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum3_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum3_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester petroleum4")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum4_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum4_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum4_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester petroleum4")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_petroleum4_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_petroleum4_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_petroleum4_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester refining1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining1_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining1_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining1_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester refining1")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining1_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining1_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining1_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester refining2")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining2_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining2_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining2_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester refining2")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining2_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining2_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining2_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester refining3")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining3_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining3_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining3_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester refining3")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining3_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining3_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining3_secondSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("first semester refining4")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining4_firstSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining4_firstSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining4_firstSemester_materialAdapter);
                            } else if (semester.getSelectedItem().toString().equals("second semester refining4 ")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter pme_refining4_secondSemester_materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.pme_refining4_secondSemester_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(pme_refining4_secondSemester_materialAdapter);
                            }
                            /*Arts and Humanities science Faculty*/
                        }else if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                            if(dep =="E"&ye==1 & semester.getSelectedItem().toString().equals("first semester")){
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter =ArrayAdapter.createFromResource(MainActivity.this
                                        ,R.array.E_Y1_S1_material,android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="E"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                                sem=2;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.E_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="E"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.E_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="E"&ye==2 & semester.getSelectedItem().toString().equals("second semester")) {
                                sem=2;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.E_Y2_S2_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="E"&ye==3 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.E_Y3_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="F"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.F_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="F"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                                sem=2;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.F_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="F"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.F_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="F"&ye==2 & semester.getSelectedItem().toString().equals("second semester")) {
                                sem=2;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.F_Y2_S2_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            } else if(dep =="G"&ye==1 & semester.getSelectedItem().toString().equals("امتحانات ترم اول")) {
                                sem = 1;
                                material.setVisibility(View.GONE);
                                ur = "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F14VKt2K9_b_0ZKmZaRxzi7wB3et7-Iwtj&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
                                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                                intent.putExtra("url", ur);
                                startActivity(intent);
                            }else if(dep =="PH"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.PH_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="PH"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.PH_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="S"&ye==1 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.S_Y1_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="S"&ye==1 & semester.getSelectedItem().toString().equals("second semester")) {
                                sem=2;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.S_Y1_S2_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }else if(dep =="S"&ye==2 & semester.getSelectedItem().toString().equals("first semester")) {
                                sem=1;
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this
                                        , R.array.S_Y2_S1_material, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        /*material*/
        material.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        /*Politics and Economy*/
                        if (faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                            if (material.getSelectedItem().toString().equals("مبادئ القانون 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCdFY2NF96NVFoQVU");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ العلوم السياسة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLS15d1Juc0dENEk");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ السلوك التنظيمى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5IdmNodXFBOXM");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("اقتصاد جزئى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5FdEVHdXk2a2M");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLUpjaTVSYmRCaGs");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ القانون 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5lNnBld1BkVW8");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ احصاء")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLUZLVmJENmVsYW8");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("حقوق انسان")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZWSmRMb0d5Smc");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("الادارة العامة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLVFyUEhzVElVYVU");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("اقتصاد كلى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZfUHhncGM3UXM");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("international organization")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLVVGYjJIUmgwMlE");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5hVGd1N3pqcjQ");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحان اقتصاد")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1-1BCTt6cZxAxQZ-9he2esNYisgNFspmu");
                                startActivity(i);
                            }
                            /*Fish resources and marine studies*/
                        } else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if (material.getSelectedItem().toString().equals("final oceanography")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1nWnuAB3orMucrw8K1cuqn7um6sY_fFFf%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1nWnuAB3orMucrw8K1cuqn7um6sY_fFFf%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            }
                            else if (material.getSelectedItem().toString().equals("فلك وأرصاد جوية")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F18OTLPuLL-Na4VG9WWNW52SGqve77gyH9%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F18OTLPuLL-Na4VG9WWNW52SGqve77gyH9%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("بحيرات")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?service=wise&passive=1209600&continue=https://drive.google.com/file/d/1y89UHfyCaZAgkwnra30FAymDSIskNlja/view?usp%3Ddrive_web&hl=ar&followup=https://drive.google.com/file/d/1y89UHfyCaZAgkwnra30FAymDSIskNlja/view?usp%3Ddrive_web");
                                startActivity(i);

                            }else if (material.getSelectedItem().toString().equals("MidTerm")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1P9oinJETZoRASPIcVy6Y9xTGBWcS2ZWG%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1P9oinJETZoRASPIcVy6Y9xTGBWcS2ZWG%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams1")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1LF64vl-ZfjO-jwe29bnruZWTIrSCHNdO%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1LF64vl-ZfjO-jwe29bnruZWTIrSCHNdO%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams2")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1TE26J2WqvHjizB9SUGdaKs8Ws8IJQ-Js%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1TE26J2WqvHjizB9SUGdaKs8Ws8IJQ-Js%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1q20dfK13htE1YhCXBMKqqra-1MWMVOVp%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1q20dfK13htE1YhCXBMKqqra-1MWMVOVp%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            } else if (material.getSelectedItem().toString().equals("فلك وارصاد جوية")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F18OTLPuLL-Na4VG9WWNW52SGqve77gyH9%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F18OTLPuLL-Na4VG9WWNW52SGqve77gyH9%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("بحيـرات")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1y89UHfyCaZAgkwnra30FAymDSIskNlja%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1y89UHfyCaZAgkwnra30FAymDSIskNlja%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Caga culture")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?service=wise&passive=1209600&continue=https://drive.google.com/file/d/0Bx1TXZ-UjRguYlo3NWFET1RadGM/view?usp%3Ddrive_web&hl=ar&followup=https://drive.google.com/file/d/0Bx1TXZ-UjRguYlo3NWFET1RadGM/view?usp%3Ddrive_web");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("تسويق")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F0B9nviOTHpzByeFdpdko1Ny1UcXM%2Fview%3Fusp%3Ddrive_web&hl=ar&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F0B9nviOTHpzByeFdpdko1Ny1UcXM%2Fview%3Fusp%3Ddrive_web&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Caga culture-fourth year")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?service=wise&passive=1209600&continue=https://drive.google.com/file/d/0Bx1TXZ-UjRguaGRrNHJJa01CSnc/view?usp%3Ddrive_web&hl=ar&followup=https://drive.google.com/file/d/0Bx1TXZ-UjRguaGRrNHJJa01CSnc/view?usp%3Ddrive_web");
                                startActivity(i);

                            }
                            /*Computers and information*/
                        }else if (faculty.getSelectedItem().toString().equals("Computers and information")) {
                            if (material.getSelectedItem().toString().equals("Physics1 Dr.Yasser Amoun ملخصات المادة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFTVlpOEdZdlJJWmM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Physics1 Dr.Yasser Amoun ملخصات السكاشن")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFMnNlWk4xM1M0Qlk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Math1 Dr.Mohamed Ramadan")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFSjN2NnoxTGN2UjA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("General English Dr.Dosoky")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFZ0NaZUpEMjJ4N0k&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Programming Dr.Mohammed Ali")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFY01nMlZTTEt6bGM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Mathematics2 Dr.Taha El-Garib")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFUWd0UlZDVjA1bFk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("English writing Dr.Dosoky")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFRUpOTloxN1dydlE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Discrete structure Dr.Hussein Sharaf")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFUW1RYUhxVl9HLVE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Cables")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1_4TNzdTh-H6GWT-plDMO4clpaISOBUwA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Communication")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1yexQTZj0ADIPxVtq0akMJZIUeNyNSSbg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("IP adress")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F12RI9VYznM5tbafheV2VBqFzLgJW25ES_%3Fpli%3D1&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Is امتحانات")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1uiAfeScfWpFXZdGhC_5toGb-izWTLIO6&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Laplace transformation")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1l_3IWgxIKVc7wotlFkGE7xA7E3Y0MkUs&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("maths Dr.Mohammed Saleh امتحانات")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F1QRgHev21L5oB0KYU2ZPqxDro-vYqbMB6&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("maths 3 fouri series")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1gTWol5njJaY9YTAj9UMGYTyzqw6bZBaK&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("الأعداد المركبة maths 3")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1aa6mv-brReV_cUIShequ7Mekjo2QmqNv&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("System analysis")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1PpHQpO7OIfl42aYJ-geHRuJKdDlwAJ3X&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات دكتور هيثم")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1dSXTZ8mQMjvW86irDapdj5c-wnoSkQvC&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Business")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1CnDW5EZXLhpGuQqvhmJHVGICRXl64q4Q%3Fpli%3D1&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("definition of Java")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1CnDW5EZXLhpGuQqvhmJHVGICRXl64q4Q&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات تانية حاسبات")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/1CnDW5EZXLhpGuQqvhmJHVGICRXl64q4Q&service=writely");
                                startActivity(i);
                        }
                        /*Petroleum and Mining Engineering Faculty*/
                        }else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering Faculty")) {
                            if (material.getSelectedItem().toString().equals("Calculus")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvYkJVQzB4cWJickk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("هندسة تحليلية")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvUmdEcUdjcEprSDg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("استاتيكا")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvdlFreXl1OFlrbnc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("التاريخ الهندسي")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRElmeWFOUUdyRzA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("رسم هندسي")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvVGQ3OGc3YnhmeU0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("فيزياء1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvTkhJNDdCSkNDWDQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("كيمياء")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSFJ1YXp6Y0t6eDQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("تكامل")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKveXdnNGFHWVN3ajQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("لغة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvVE1iX1NXZzZhclE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("انتاج")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvelpTWVAzN0xRekk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("رسم و إسقاط")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSnlSODhhSzRneHM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("سليدات الديناميكا")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvQVlHbG9tZ2twdzQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("سليدات كهربية و مغناطيسية")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSGNSZENtSVZMeTQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("English")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMFR3b1NNOVNwNHM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Maths 3")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvaVc5NXh2TG5abk0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Matlab")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvbnZiRUQtYXFuSEE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Plane and Topographic Surveying")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvazBuNERCSWNFRTQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Quantum Physics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvU1ZQZHg2OHhzNnc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Strength")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvNG1zX1haVXIwZWs&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Structure")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSnJxQWNyOG1QR1k&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Geology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvU29WTi1jYXpPcEE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Introduction to Petroleum Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvaWdodWlnZ1pOdG8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Maths")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRjZaMDNrMFlIaVU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Mechanical Drawing")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvQjZ5Zl82UHpvbEE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Organic Chemstry")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMWJsZUM2RE1Gd2s&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Physical Chemstry")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvTGM3N2N3eWF5REk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Sustainability and Environmental Education")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSndlTHJJWDFZT2c&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Drilling 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRjZZaEZHUDhGTjA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Fluid Mechanics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRWxlR2hveUlCYms&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Material Science")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvbGFGbjQ3WnU1c1U&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Statistics and Probability")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvUDg5ZUFBSTZxTGc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Structural Geology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvYXJrUkFjQzFHS1E&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Automatic Control")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSC16MUttMlpaZ3c&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Computer Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWUlkUGFDRzBlbFU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Electrical Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRDFoTHBRM0pnVUk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Reservoir Fluids")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZXJCMTRVWjZRNGs&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Thermodynamics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZGEzYl83eG1mMkU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Computer Applications")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZkI2c2g4WDQ3Q1U&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Geophisics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKveUtjY24tcGJQNEU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Hydraulics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMVkxT0hMMENsLTg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Production Engineering 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvQ0J5bzdiWlJOS00&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Production Equipment")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvaFZQLUxKV2FSSHM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Rock Properties")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvTzNmLUpmYlpGVGc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Drilling 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvNzdqTDlWQUthLTg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Drilling Equipment")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvU1MxVFBvaE9wNVk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Exploration Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvelZJcGUySElsajA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Language.")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvdGc3TGZtc1ZsUm8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Safety")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvdjRLa2JjbHBaOVE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Well Completion")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvVDhkdkZUWm9iUG8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Sections")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMml1ZnVWS1VRdzQ&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petroleum Economics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWnV3amFmd3ZHN3M&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petroleum Geology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvLU56aERMWnAtekU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Production Engineering 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvY3dkNnFMMG5KQnc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Transportation and Storage of Crude Oil")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvUWlXSzRxaEJoQWc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Well Simulation")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvNUEwYnFJRFRkRGM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Applied Reservoir Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWWJiOUR4SlBzUXc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Enhanced Oil Recovery (EOR)")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWjI0UWR2cmRnYjg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Environmental Control in Oil and Gas Industry")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSTNFQlNLZ0xBY3M&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Natural Gas Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvYjlYcWxYOVFNZDg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Well Logging")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvTzRqYlYzTjUwelU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مدخل تكرير")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSnRJU01kcXdnVlU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Physical Chemsrty")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvellBUTA3ckx3bFk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petroleum Evaluation")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvNWNZRklUVXFKSzg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Unit Operations 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvbjAxdV9tT2VlLW8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Water Treatment")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvcm4yNDZKcjZheUk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Corrosion")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvYk9kQTFFblB0Rnc&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("تفاعلات")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvYnpCOEtrZnlYcEk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Refining Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWFB4TXc2Vmx5TFk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Rheology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvbk92UnB1YUhQdlE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Safety.")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvang4ei1BWmlYV1E&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Transportation and Storage")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvVkg2bmdPblYyZ0k&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Units Operations 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvVnkzRFg4ejR1ekU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("English.")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWE5TNXpfOVE4VU0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Gas Engineering 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvam9nNjJXT1cxOEk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Heat Transfer")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvczBfWWgxQ2tkYm8&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petrochemical Industry 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKveEdlMzZPV05HMjA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Pollution Control")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvS2J0SEFndjVGbWM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Design")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMTl0RUhNTFF3elk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Natural Gas")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZWdNcXhPWDJUQ1U&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petrochemical Industry 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvb0ZIUEdaQ3VRM3c&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Process Control")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvbl93VmhoeF9EaHM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("معالجة المواد البترولية")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZF9FVTc2Q0NiajA&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Refining Engineering 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvUlNuZnEzdlhmQlk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("اقتصاديات")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvMFNvX0twSFJKZ1E&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("تصميم أفران")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvWEpVc29BVkdJTXM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("تصميم أمثل")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvOEMtTTdJZEcwZlU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("تطبيقات حاسب")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvQW1SZFY0MG5JUEE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Geophysics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZUE5MFNDTzVtSUE&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Hydrology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvZlBBS0xxZEVsTEk&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petroleum Geology")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B_yTOPHqjRKvbGs2YjBFcV90QUk&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Petrophysics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B_yTOPHqjRKvbE84OFF4ZjNjbHM&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Rock Engineering")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/ServiceLogin?hl=ar&passive=true&continue=https://drive.google.com/drive/folders/0B_yTOPHqjRKvd1VYTDEtOXNFbzQ&service=writely");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Sedimentary Rocks")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvRjNRY0t3aEpvRU0&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Soil Mechanics")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvSVFHeW5lUUxVTHM&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Crude Oil Evaluation")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvaU1jeFVTcUJmQlU&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("Horizontal Drilling")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0B_yTOPHqjRKvd21qcUp0VmhSR1E&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            }
                            /*Arts and Humanities science Faculty*/
                        }else if(faculty.getSelectedItem().toString().equals("Arts and Humanities science Faculty")) {
                            if (dep == "E" & ye == 1 & sem == 1 & material.getSelectedItem().toString().equals("ادب انجليزى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://accounts.google.com/signin/v2/sl/pwd?hl=ar&passive=true&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Ffolders%2F0ByJz1l2rodbFTDBDY1ByZU9Ndzg&service=writely&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                                startActivity(i);
                            }
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
}
