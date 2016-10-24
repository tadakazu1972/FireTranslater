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
    protected int mLanguageNum = 0; //選択された言語ナンバー保存用

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
    }
}
