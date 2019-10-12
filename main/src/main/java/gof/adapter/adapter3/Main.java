package gof.adapter.adapter3;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-05 22:06
 **/
public class Main {
    public static void main(String[] args) {
        AnimatorListenerAdapter animatorListenerAdapter=new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                System.out.println("测试");
            }
        };

        animatorListenerAdapter.onAnimationStart(null);
    }
}
