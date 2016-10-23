package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class HomeActivity extends AppCompatActivity {
    protected HomeActivity mActivity = null;
    protected View mView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.home);
        //ボタン初期化
        initButtons();
    }

    private void initButtons(){
        mView.findViewById(R.id.btnInquiry1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, Inquiry1Activity.class);
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
