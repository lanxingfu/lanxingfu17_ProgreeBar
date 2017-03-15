package com.lanxingfu.lanxingfu17_progreebar;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置标题栏进度条
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        setContentView(R.layout.activity_main);

        //显示进度条
        setProgressBarIndeterminateVisibility(true);

    }

    /**
     * 显示对话框进度条
     *
     * @param view
     */
    public void showDialogProgress(View view) {

        //方式一：
        //创建对话框进度条
/*        ProgressDialog pd = new ProgressDialog(this);
        pd.setMax(100);
        //pd.setIndeterminate(false);
        pd.setMessage("正在下载中...");
        pd.setProgress(60);
        pd.setTitle("下载对话框");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);  //设置水平进度条
        pd.setCancelable(true);//是否可以被取消
        pd.show();*/

        //方式二：
        ProgressDialog pd2 = ProgressDialog.show(this,"Download","download......",false,true);
    }

}
