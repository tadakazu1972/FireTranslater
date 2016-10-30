package tadakazu1972.firetranslater;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class ResultActivity extends AppCompatActivity {
    protected ResultActivity mActivity = null;
    protected View mView = null;
    //ボタン
    private Button mButton1 = null;
    private Button mButton2 = null;
    private Button mButton3 = null;
    private Button mButton4 = null;
    private Button mButton5 = null;
    private Button mButton6 = null;
    private Button mButton7 = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mText2 = null;
    private TextView mText3 = null;
    private TextView mText4 = null;
    private TextView mText5 = null;
    private TextView mText6 = null;
    private TextView mText7 = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.result);
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.txtR1);
        //選択言語番号を呼び出し
        SharedPreferences sp1 = PreferenceManager.getDefaultSharedPreferences(this);
        String s1 = sp1.getString("result1",""); // 第２引数はkeyが存在しない時に返す初期値
        mText1.setText(s1);
        //text2
        mText2 = (TextView)findViewById(R.id.txtR2);
        //選択言語番号を呼び出し
        SharedPreferences sp2 = PreferenceManager.getDefaultSharedPreferences(this);
        String s2 = sp2.getString("result2",""); // 第２引数はkeyが存在しない時に返す初期値
        mText2.setText(s2);
        //text3
        mText3 = (TextView)findViewById(R.id.txtR3);
        //選択言語番号を呼び出し
        SharedPreferences sp3 = PreferenceManager.getDefaultSharedPreferences(this);
        String s3 = sp3.getString("result3",""); // 第２引数はkeyが存在しない時に返す初期値
        mText3.setText(s3);
        //text4
        mText4 = (TextView)findViewById(R.id.txtR4);
        //選択言語番号を呼び出し
        SharedPreferences sp4 = PreferenceManager.getDefaultSharedPreferences(this);
        String s4 = sp4.getString("result4",""); // 第２引数はkeyが存在しない時に返す初期値
        mText4.setText(s4);
        //text5
        mText5 = (TextView)findViewById(R.id.txtR5);
        //選択言語番号を呼び出し
        SharedPreferences sp5 = PreferenceManager.getDefaultSharedPreferences(this);
        String s5 = sp5.getString("result5",""); // 第２引数はkeyが存在しない時に返す初期値
        mText5.setText(s5);
        //text6
        mText6 = (TextView)findViewById(R.id.txtR6);
        //選択言語番号を呼び出し
        SharedPreferences sp6 = PreferenceManager.getDefaultSharedPreferences(this);
        String s6 = sp6.getString("result6",""); // 第２引数はkeyが存在しない時に返す初期値
        mText6.setText(s6);
        //text7
        mText7 = (TextView)findViewById(R.id.txtR7);
        //選択言語番号を呼び出し
        SharedPreferences sp7 = PreferenceManager.getDefaultSharedPreferences(this);
        String s7 = sp7.getString("result7",""); // 第２引数はkeyが存在しない時に返す初期値
        mText7.setText(s7);
    }

    private void initButtons(){
        //
        mButton1 = (Button)findViewById(R.id.btnR1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry1Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton2 = (Button)findViewById(R.id.btnR2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry2Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton3 = (Button)findViewById(R.id.btnR3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry3Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton4 = (Button)findViewById(R.id.btnR4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry4Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton5 = (Button)findViewById(R.id.btnR5);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry5Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton6 = (Button)findViewById(R.id.btnR6);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry6Activity.class);
                startActivity(intent);
            }
        });
        //
        mButton7 = (Button)findViewById(R.id.btnR7);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry7Activity.class);
                startActivity(intent);
            }
        });

        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //全ての翻訳結果をクリア
                mText1.setText("");
                mText2.setText("");
                mText3.setText("");
                mText4.setText("");
                mText5.setText("");
                mText6.setText("");
                mText7.setText("");
            }
        });
        //ホーム
        mView.findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
