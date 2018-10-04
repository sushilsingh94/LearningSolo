package payu.android.sushil.com.payu_test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by kumars28 on 12-08-2017.
 */

public class ProjectsDetailAdapter extends RecyclerView.Adapter<ProjectsDetailAdapter.MyViewHolder> {

    private final Context context;
    private final List<ProjectsVo> projectList;

    public ProjectsDetailAdapter(Context context,List<ProjectsVo> projectList){
        this.context = context;
        this.projectList = projectList;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final ProjectsVo project = projectList.get(position);

        holder.titleTxt.setText(project.getTitle());
        holder.amountPledgedTxt.setText("Pleadged - "+project.getAmountPledged());
        holder.backersTxt.setText("Backers - "+project.getNumBackers());
        if(project.getEndTime() != null && project.getEndTime().length()!=0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD'T'hh:mm:ss");
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

            Date rem = null;
            try {
                Date date = sdf.parse(project.getEndTime());
                holder.noOfDaysToGoTxt.setText("Time - "+sdf.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        holder.cardViewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext().getApplicationContext(), DetailActivity.class);
                intent.putExtra("title", project.getTitle());
                intent.putExtra("amount", project.getAmountPledged());
                intent.putExtra("backers", project.getNumBackers());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.project_list_view, parent, false);

        return new MyViewHolder(itemView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTxt, amountPledgedTxt, backersTxt, noOfDaysToGoTxt;
        public LinearLayout cardViewLayout;

        public MyViewHolder(View view) {
            super(view);
            titleTxt = (TextView) view.findViewById(R.id.titleTxt);
            amountPledgedTxt = (TextView) view.findViewById(R.id.amountPledgedTxt);
            backersTxt = (TextView) view.findViewById(R.id.backersTxt);
            noOfDaysToGoTxt = (TextView) view.findViewById(R.id.noOfDaysToGoTxt);
            cardViewLayout = (LinearLayout)view.findViewById(R.id.card_view_layout);

        }
    }
}
