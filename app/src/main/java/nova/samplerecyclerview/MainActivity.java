package nova.samplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {

    @BindView(R.id.shoppingRecyclerView)
    RecyclerView shoppingRecyclerView;  //리사이클러뷰

//    @BindView(R.id.buttonAdd)
//    Button buttonAdd;

    ArrayList<ShoppingList> data;

    ListAdapter listAdapter; //어뎁터


    public static int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager; //리사이클러뷰에서 필요한 레이아웃 매니저

        data = new ArrayList<>(); //데이터


        layoutManager = new LinearLayoutManager(getApplicationContext() );
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL); //아이템이 어떻게 나열될지 선택 vertical or horizental
        shoppingRecyclerView.setLayoutManager(layoutManager); //레이아웃 매니저 연결
        listAdapter = new ListAdapter(data); //어뎁터 만들고
        shoppingRecyclerView.setAdapter(listAdapter); //어뎁터 연결




    }

    @OnClick(R.id.buttonAdd)
    void onClick(View view){

        switch(view.getId()){

            case R.id.buttonAdd:


                data.add(new ShoppingList(num));

                listAdapter.notifyItemInserted(num);

                Toast.makeText(this, "아이템이 추가되었습니다.", Toast.LENGTH_SHORT).show();

                num++;

                break;

        }
    }




}


