package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class Inquiry2Activity extends AppCompatActivity {
    protected Inquiry2Activity mActivity = null;
    protected View mView = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mTextResult = null;
    //ボタン
    private Button mHead = null;
    private Button mEye = null;
    private Button mEar = null;
    private Button mNose = null;
    private Button mMouth = null;
    private Button mTooth = null;
    private Button mThroat = null;
    private Button mShoulder = null;
    private Button mStomach = null;
    private Button mChest = null;
    private Button mUpperBack = null;
    private Button mLowerBack = null;
    private Button mHandOrArm = null;
    private Button mFinger = null;
    private Button mButtocks = null;
    private Button mLegOrFoot = null;
    private Button mKnee = null;
    private Button mOther = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry2);
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        mText1 = (TextView)findViewById(R.id.i21);
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //頭
        mHead = (Button)findViewById(R.id.btnHead);
        String nameHead = "i211";
        int resourceIdHead = getResources().getIdentifier(nameHead, "string", getPackageName());
        mHead.setText(resourceIdHead);
        mView.findViewById(R.id.btnHead).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i210";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //目
        mEye = (Button)findViewById(R.id.btnEye);
        String nameEye = "i221";
        int resourceIdEye = getResources().getIdentifier(nameEye, "string", getPackageName());
        mEye.setText(resourceIdEye);
        mEye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i220";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //耳
        mEar = (Button)findViewById(R.id.btnEar);
        String nameEar = "i231";
        int resourceIdEar = getResources().getIdentifier(nameEar, "string", getPackageName());
        mEar.setText(resourceIdEar);
        mEar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i230";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //鼻
        mNose = (Button)findViewById(R.id.btnNose);
        String nameNose = "i241";
        int resourceIdNose = getResources().getIdentifier(nameNose, "string", getPackageName());
        mNose.setText(resourceIdNose);
        mNose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i240";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //口
        mMouth = (Button)findViewById(R.id.btnMouth);
        String nameMouth = "i251";
        int resourceIdMouth = getResources().getIdentifier(nameMouth, "string", getPackageName());
        mMouth.setText(resourceIdMouth);
        mMouth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i250";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //歯
        mTooth = (Button)findViewById(R.id.btnTooth);
        String nameTooth = "i261";
        int resourceIdTooth = getResources().getIdentifier(nameTooth, "string", getPackageName());
        mTooth.setText(resourceIdTooth);
        mTooth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i260";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //喉
        mThroat = (Button)findViewById(R.id.btnThroat);
        String nameThroat = "i271";
        int resourceIdThroat = getResources().getIdentifier(nameThroat, "string", getPackageName());
        mThroat.setText(resourceIdThroat);
        mThroat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i270";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //肩
        mShoulder = (Button)findViewById(R.id.btnShoulder);
        String nameShoulder = "i281";
        int resourceIdShoulder = getResources().getIdentifier(nameShoulder, "string", getPackageName());
        mShoulder.setText(resourceIdShoulder);
        mShoulder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i280";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //腹
        mStomach = (Button)findViewById(R.id.btnStomach);
        String nameStomach = "i291";
        int resourceIdStomach = getResources().getIdentifier(nameStomach, "string", getPackageName());
        mStomach.setText(resourceIdStomach);
        mStomach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i290";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnChest).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2100";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnUpperBack).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2110";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnLowerBack).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnHandOrArm).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnFinger).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2140";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnButtocks).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2150";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnLegOrFoot).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2160";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnKnee).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2170";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        mView.findViewById(R.id.btnOther).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2180";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
            }
        });
        //
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
