package com.bignerdranch.android.geoquiz;

/**
 * Created by Eugene on 05/10/15.
 */
public class Question {

  private int mTextResId;
  private boolean mAnswerTrue;

  public Question(int textResId, boolean answerTrue) {
    mTextResId = textResId;
    mAnswerTrue = answerTrue;
  }
}
