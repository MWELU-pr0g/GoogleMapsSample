import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.mutinda.R;

public class CustomAdpter extends BaseAdapter {
    private ListView lstView;
    private  String[] countries;
    private LayoutInflater inflates;
    private Context context;



    @Override
    public int getCount() {
        int count = countries.length;
        return count;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        lstView= (ListView) inflates.inflate(R.layout.lst_view,parent,true );



        return lstView;
    }
}
