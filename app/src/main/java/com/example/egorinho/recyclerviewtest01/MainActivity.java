package com.example.egorinho.recyclerviewtest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ArrayList<String> mLinks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //назначаем менеджер разметки
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        //заполняем список ссылками
        inizializeData();

        //создаем адаптер RecyclerView
        MyAdapter adapter = new MyAdapter(this, mLinks);
        //присваиваем адаптер нашему mRecyclerView
        mRecyclerView.setAdapter(adapter);

    }
        //заполняем ArrayList ссылками на изображения
    private void inizializeData(){
        mLinks = new ArrayList<>();
        mLinks.add("https://sun9-3.userapi.com/c840436/v840436803/705aa/CBddqcB21W4.jpg");
        mLinks.add("https://pp.userapi.com/c831108/v831108726/957e4/ykSeKyLcb0E.jpg");
        mLinks.add("https://pp.userapi.com/c841625/v841625699/67ffb/PpAc0KFB3nA.jpg");
        mLinks.add("https://sun9-3.userapi.com/c840720/v840720066/40efd/GdZkqh0yC1c.jpg");
        mLinks.add("https://pp.userapi.com/c637222/v637222703/140c4/EDR6IYtpMCU.jpg");
        mLinks.add("https://pp.userapi.com/c637222/v637222703/140a8/47zLUPr2X7Q.jpg");
        mLinks.add("https://pp.userapi.com/c636924/v636924703/4fd33/6v_vlUxiVCw.jpg");
        mLinks.add("https://pp.userapi.com/c638020/v638020979/4e9b3/s-mnKsrJJrE.jpg");
        mLinks.add("https://pp.userapi.com/c638020/v638020979/4e98b/PurC_YGaWig.jpg");
        mLinks.add("https://pp.userapi.com/c841528/v841528841/d0d3/Q6gVRn3HVqU.jpg");
        mLinks.add("https://pp.userapi.com/c841528/v841528841/d0fb/_OM325NG0FY.jpg");
        mLinks.add("https://sun9-3.userapi.com/c840621/v840621919/7c54c/4kA1dgIQSPw.jpg");
        mLinks.add("https://pp.userapi.com/c543104/v543104919/61109/wUSjaHUize0.jpg");
        mLinks.add("https://pp.userapi.com/c834104/v834104919/131d4e/iTJ4nX-cd8c.jpg");
        mLinks.add("https://pp.userapi.com/c834300/v834300047/132808/5xd8C9--U_Q.jpg");
        mLinks.add("https://pp.userapi.com/c845220/v845220655/45546/ELhUMyl-aT0.jpg");
        mLinks.add("https://pp.userapi.com/c845220/v845220655/45518/1_DyZzojRFo.jpg");
        mLinks.add("https://pp.userapi.com/c845421/v845421857/38b7f/RXazvbeVYww.jpg");
        mLinks.add("https://pp.userapi.com/c846217/v846217503/24b03/kc3cB8wAeVs.jpg");
        mLinks.add("https://pp.userapi.com/c824203/v824203732/fe9b8/QUojojpSLkg.jpg");
        mLinks.add("https://sun9-3.userapi.com/c840724/v840724785/5d877/ePiuSGeKSAU.jpg");
        mLinks.add("https://pp.userapi.com/c635100/v635100909/32a86/HOZW9H_toYA.jpg");
        mLinks.add("https://pp.userapi.com/c411125/v411125809/24c7/BFBzEJA0kxQ.jpg");
        mLinks.add("https://pp.userapi.com/c837122/v837122809/aef8/FCsVEMLqx6c.jpg");
        mLinks.add("https://pp.userapi.com/c543104/v543104452/666d7/BEThPE0C5BU.jpg");
        mLinks.add("https://pp.userapi.com/c840138/v840138400/62b88/TXVASISijpo.jpg");
        mLinks.add("https://pp.userapi.com/c543104/v543104475/58188/bF6xisayEXc.jpg");
        mLinks.add("https://pp.userapi.com/c543104/v543104893/3faa1/HRhJC_-_hOw.jpg");
        mLinks.add("https://pp.userapi.com/c638027/v638027919/6949a/8LhOnsT-1yM.jpg");

    }

}
