package com.jingchen.timerpicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.jingchen.timerpicker.PickerView.onSelectListener;

import java.util.ArrayList;
import java.util.List;

/**
 * 更多详解见博客http://blog.csdn.net/zhongkejingwang/article/details/38513301
 *
 * @author chenjing
 */
public class MainActivity extends Activity {
    PickerView month_pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        month_pv = (PickerView) findViewById(R.id.minute_pv);
        month_pv.setData(initData());
        month_pv.setOnSelectListener(new onSelectListener() {
            @Override
            public void onSelect(String text) {
                Toast.makeText(MainActivity.this, "选择了 " + text,
                        Toast.LENGTH_SHORT).show();
            }
        });

        month_pv.setSelected(0);
    }

    public List<String> initData() {
        List<String> data = new ArrayList<>();
        data.add("Jan");
        data.add("Feb");
        data.add("Mar");
        data.add("Apr");
        data.add("May");
        data.add("Jun");
        data.add("Jul");
        data.add("Aug");
        data.add("Sep");
        data.add("Oct");
        data.add("Nov");
        data.add("Dec");
        return data;
    }

}
