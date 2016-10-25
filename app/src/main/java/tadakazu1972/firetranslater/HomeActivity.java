package tadakazu1972.firetranslater;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class HomeActivity extends AppCompatActivity {
    protected HomeActivity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //選択言語表示用TextView
    private TextView mText1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.home);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //選択言語表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.lblLanguage);
        String nameText1 = "langnum" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
    }

    private void initButtons(){
        mView.findViewById(R.id.btnInquiry1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry1Activity.class);
                startActivity(intent);
            }
        });
        mView.findViewById(R.id.btnInquiry2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry2Activity.class);
                startActivity(intent);
            }
        });
        mView.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
