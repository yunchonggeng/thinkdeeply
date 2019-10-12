package gof.adapter.adapter3;

/**
 * @author gengyunchong
 */
public interface AnimatorListener {
    void onAnimationStart(Animator animation);

    void onAnimationEnd(Animator animation);

    void onAnimationCancel(Animator animation);

    void onAnimationRepeat(Animator animation);
}
