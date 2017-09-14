package jiyun.com.recyclerview_sixdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称: 城市通
 * 类描述:
 * 创建人: Administrator
 * 创建时间: 2017/7/23 20:04
 * 修改人:  张超
 * 修改内容:
 * 修改时间:
 */

public class RecyclerAdapter extends RecyclerView.Adapter {
    public static final int TYPE_ITEM_ONE = 0;
    public static final int TYPE_ITEM_TWO = 1;
    public static final int TYPE_ITEM_THREE = 2;
    public static final int TYPE_ITEM_FOUR = 3;
    public static final int TYPE_ITEM_FIVE = 4;
    public static final int TYPE_ITEM_SIX = 5;

    private List<String> mList;
    private Context context;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int itemViewType = getItemViewType(viewType);
        View v = null;
        switch (itemViewType) {
            case TYPE_ITEM_ONE:
                v = inflater.inflate(R.layout.activity_one, null);
                break;
            case TYPE_ITEM_TWO:
                v = inflater.inflate(R.layout.activity_two, null);
                break;
            case TYPE_ITEM_THREE:
                v = inflater.inflate(R.layout.activity_three, null);
                break;
            case TYPE_ITEM_FOUR:
                v = inflater.inflate(R.layout.activity_four, null);
                break;
            case TYPE_ITEM_FIVE:
                v = inflater.inflate(R.layout.activity_five, null);
                break;
            case TYPE_ITEM_SIX:
                v = inflater.inflate(R.layout.activity_six, null);
                break;

        }

        return new OneHodler(v);
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_ITEM_ONE;
            case 1:
                return TYPE_ITEM_TWO;
            case 2:
                return TYPE_ITEM_THREE;
            case 3:
                return TYPE_ITEM_FOUR;
            case 4:
                return TYPE_ITEM_FIVE;
            case 5:
                return TYPE_ITEM_SIX;
        }


        return super.getItemViewType(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {



        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class OneHodler extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mtextView;
        private boolean isfirst;
        public OneHodler(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AnimatorSet animatorSetGroup2 = new AnimatorSet();

                    if(isfirst){
                        ObjectAnimator objectAnimatorTranslate2 = ObjectAnimator.ofFloat(mtextView, "translationX", 500f, 0f);
                        ObjectAnimator objectAnimatorRotateX2 = ObjectAnimator.ofFloat(mtextView, "rotationX", 360f, 0f);
                        ObjectAnimator objectAnimatorRotateY2 = ObjectAnimator.ofFloat(mtextView, "rotationY", 360f, 0f);
                        animatorSetGroup2.setDuration(1000);
                        animatorSetGroup2.play(objectAnimatorRotateY2).after(objectAnimatorRotateX2)
                                .after(objectAnimatorTranslate2);
                        animatorSetGroup2.start();
                        isfirst=false;
                    }else {
                        ObjectAnimator objectAnimatorTranslate2 = ObjectAnimator.ofFloat(mtextView, "translationX", 0f, 500f);
                        ObjectAnimator objectAnimatorRotateX2 = ObjectAnimator.ofFloat(mtextView, "rotationX", 0f, 360f);
                        ObjectAnimator objectAnimatorRotateY2 = ObjectAnimator.ofFloat(mtextView, "rotationY", 0f, 360f);
                        animatorSetGroup2.setDuration(1000);
                        animatorSetGroup2.play(objectAnimatorTranslate2).with(objectAnimatorRotateX2)
                                .with(objectAnimatorRotateY2);
                        animatorSetGroup2.start();

                        isfirst=true;
                    }

                }
            });


        }
    }

    public List getA(int count){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=count;i++){
            if(0 != (count % i)){
            list.add(i);
        }
        }
            return list;

    }
}
