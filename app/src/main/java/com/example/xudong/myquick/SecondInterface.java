package com.example.xudong.myquick;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondInterface extends AppCompatActivity {

    @BindView(R.id.activtyImage)
    ImageView icon;

    @BindView(R.id.activities)
    TextView text;

    @BindView(R.id.tb_note_date)
    TextView date;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_interface);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity)
    public void select(){
        dialog = new Dialog(this, R.style.BottomDialog);
        View contentView = LayoutInflater.from(this).inflate(R.layout.dialog_content_normal, null);
        //我的想法是设置一个switch程序，根据你的点击，执行对应的程序
        contentView.findViewById(R.id.alipay).setOnClickListener(v->{
            alipay();
        });
        contentView.findViewById(R.id.wechat).setOnClickListener(v->{
            wechat();
        });
        contentView.findViewById(R.id.card).setOnClickListener(v->{
            card();
        });
        contentView.findViewById(R.id.cash).setOnClickListener(v->{
            cash();
        });

        dialog.setContentView(contentView);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        contentView.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        dialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
        dialog.show();
    }

    public void alipay(){
        icon.setImageDrawable(getDrawable(R.drawable.alipay));
        text.setText("支付宝转账");
        dialog.dismiss();
    }
    public void wechat(){
        icon.setImageDrawable(getDrawable(R.drawable.wechat));
        text.setText("微信收款");
        dialog.dismiss();
    }
    public void card(){
        icon.setImageDrawable(getDrawable(R.drawable.credit_card));
        text.setText("银行卡转账");
        dialog.dismiss();
    }
    public void cash(){
        icon.setImageDrawable(getDrawable(R.drawable.rmb));
        text.setText("工资到帐");
        dialog.dismiss();
    }
    @OnClick(R.id.date)    //设置日期
    public void date(){
        Calendar ca = Calendar.getInstance();
        int  mYear = ca.get(Calendar.YEAR);
        int  mMonth = ca.get(Calendar.MONTH);
        int  mDay = ca.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (view, year, month, dayOfMonth) -> {
                    ca.set(year,month, dayOfMonth);
                    date.setText(new Date(ca.getTimeInMillis()).toString());
                },mYear,mMonth,mDay);
        datePickerDialog.show();
    }

    @OnClick(R.id.back_btn)
    void back(){
        super.onBackPressed();
    }
}
