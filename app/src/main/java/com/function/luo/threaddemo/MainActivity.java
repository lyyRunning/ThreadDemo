package com.function.luo.threaddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bt_fixed)
    Button btFixed;
    @BindView(R.id.bt_cached)
    Button btCached;
    @BindView(R.id.bt_scheduled)
    Button btScheduled;
    @BindView(R.id.bt_single)
    Button btSingle;
    @BindView(R.id.bt_next)
    Button btNext;

    /**
     * 声明自动生成
     * 类似 findViewById 的效果
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * 下面整个方法自动生成
     *
     * @param view
     */
    @OnClick({R.id.bt_fixed, R.id.bt_cached, R.id.bt_scheduled, R.id.bt_single,R.id.bt_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_fixed:
                fixedInit();
                break;
            case R.id.bt_cached:
                cachedInit();
                break;
            case R.id.bt_scheduled:
                scheduledInit();
                break;
            case R.id.bt_single:
                singleInit();
                break;
            case R.id.bt_next:
                SecondActivity.launch(MainActivity.this);
                break;
            default:
        }
    }
    private void scheduledInit() {
        TheadPoolUtils.getScheduledThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                Log.d("LUO", "scheduledInit======333");
            }
        });
    }

    private void cachedInit() {
        TheadPoolUtils.getCachedThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                Log.d("LUO", "cachedInit======222");
            }
        });


    }

    private void singleInit() {
        TheadPoolUtils.getSingleThread().execute(new Runnable() {
            @Override
            public void run() {
                Log.d("LUO", "singleInit======444");
            }
        });
    }

    private void fixedInit() {


        TheadPoolUtils.getFixedThreadPool().execute(new Runnable() {
            @Override
            public void run() {

                Log.d("LUO", "fixedInit======111");
            }
        });


    }



}
