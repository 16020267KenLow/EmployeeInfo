package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvInfo;
    ArrayList<EmployeeInfo> alEmployeeInfo;
    CustomeAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.ListViewInfo);
        alEmployeeInfo = new ArrayList<>();
        EmployeeInfo employee1 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee2 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee3 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);
        EmployeeInfo employee4 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee5 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee6 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);
        EmployeeInfo employee7 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee8 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee9 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);
        EmployeeInfo employee10 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee11 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee12 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);
        EmployeeInfo employee13 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee14 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee15 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);
        EmployeeInfo employee16 = new EmployeeInfo("Ken", "Owner Of Cry Cry", 7000.0f);
        EmployeeInfo employee17 = new EmployeeInfo("Fawwa", "Co-owner of Cry Cry", 6000.0f);
        EmployeeInfo employee18 = new EmployeeInfo("Sherms", "Leo of Pride", 1.0f);

        alEmployeeInfo.add(employee1);
        alEmployeeInfo.add(employee2);
        alEmployeeInfo.add(employee3);
        alEmployeeInfo.add(employee4);
        alEmployeeInfo.add(employee5);
        alEmployeeInfo.add(employee6);
        alEmployeeInfo.add(employee7);
        alEmployeeInfo.add(employee8);
        alEmployeeInfo.add(employee9);
        alEmployeeInfo.add(employee10);
        alEmployeeInfo.add(employee11);
        alEmployeeInfo.add(employee12);
        alEmployeeInfo.add(employee13);
        alEmployeeInfo.add(employee14);
        alEmployeeInfo.add(employee15);
        alEmployeeInfo.add(employee16);
        alEmployeeInfo.add(employee17);
        alEmployeeInfo.add(employee18);

        caInfo = new CustomeAdapter(this, R.layout.employee_info, alEmployeeInfo);
        lvInfo.setAdapter(caInfo);

    }
}
