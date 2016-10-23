package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class Inquiry1Activity extends AppCompatActivity {
    protected Inquiry1Activity mActivity = null;
    protected View mView = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mText2 = null;
    private TextView mTextResult = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry1);
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        mText1 = (TextView)findViewById(R.id.i10);
        mText2 = (TextView)findViewById(R.id.i11);
        mTextResult = (TextView)findViewById(R.id.textResult);
    }

    private void initButtons(){
        mView.findViewById(R.id.btnSick).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnInjured).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mTextResult.setText("");
            }
        });
        mView.findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
