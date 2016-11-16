package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
    protected MainActivity mActivity = null;
    protected View mView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.activity_main);
        //ボタン初期化
        initButtons();
    }

    private void initButtons(){
        //英語
        mView.findViewById(R.id.btnEnglish).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　英語＝1
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "1").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //中国語
        mView.findViewById(R.id.btnChinese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　中国語＝2
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "2").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //韓国語
        mView.findViewById(R.id.btnKorean).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　韓国語＝3
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "3").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });

        //日本語
        mView.findViewById(R.id.btnJapanese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　日本語＝0
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "0").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
