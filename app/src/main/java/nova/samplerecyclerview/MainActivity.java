package nova.samplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView shoppingRecyclerView; //리사이클러뷰
        LinearLayoutManager layoutManager; //리사이클러뷰에서 필요한 레이아웃 매니저
        ListAdapter listAdapter; //어뎁터
        ArrayList<ShoppingList> data = new ArrayList<>(); //데이터

        shoppingRecyclerView = (RecyclerView)findViewById(R.id.shoppingRecyclerView);

        layoutManager = new LinearLayoutManager(getApplicationContext() );
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL); //아이템이 어떻게 나열될지 선택 vertical or horizental
        shoppingRecyclerView.setLayoutManager(layoutManager); //레이아웃 매니저 연결
        listAdapter = new ListAdapter(data); //어뎁터 만들고
        shoppingRecyclerView.setAdapter(listAdapter); //어뎁터 연결

        data.add(new ShoppingList());
        data.add(new ShoppingList());
        data.add(new ShoppingList());
        data.add(new ShoppingList());
        data.add(new ShoppingList());
        data.add(new ShoppingList());
    }
    private class ListItemViewHolder extends RecyclerView.ViewHolder{

        TextView date, cal, sugar, salt;

        public ListItemViewHolder(View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.date);
            cal = (TextView) itemView.findViewById(R.id.listCal);
            sugar = (TextView) itemView.findViewById(R.id.listSugar);
            salt = (TextView) itemView.findViewById(R.id.listSalt);
        }
    }

    class ListAdapter extends RecyclerView.Adapter{

        ArrayList<ShoppingList> data;

        ListAdapter(ArrayList<ShoppingList> data){
            this.data = data;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View item = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item, parent, false);
            return new ListItemViewHolder(item);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ShoppingList shoppingList = data.get(position);
            ListItemViewHolder item = (ListItemViewHolder) holder;
            item.date.setText(shoppingList.date);
            item.cal.setText(shoppingList.cal);
            item.salt.setText(shoppingList.salt);
            item.sugar.setText(shoppingList.sugar);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }


}


