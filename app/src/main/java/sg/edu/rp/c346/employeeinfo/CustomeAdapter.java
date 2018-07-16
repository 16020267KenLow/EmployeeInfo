package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by 16020267 on 16/7/2018.
 */

public class CustomeAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> infoList;

    public CustomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        infoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView;
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView =inflater.inflate(layout_id, parent, false);
        }
        else{
            rowView = convertView;

        }

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        EmployeeInfo currentItem = infoList.get(position);
        String name = currentItem.getName();
        String title = currentItem.getTitle();
        Float salary = currentItem.getSalary();

        tvName.setText(name);
        tvSalary.setText(salary.toString());
        tvTitle.setText(title);

        return rowView;


    }
}
