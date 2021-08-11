package com.example.android.mivok;

public class Word {
    private String mDefaultTranslation;

    private String mMivokTranslation;

    public Word(String defaulttranslation, String mivokTranslation){
        mDefaultTranslation = defaulttranslation;
        mMivokTranslation = mivokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }

    public String getMivokTranslation(){
        return mMivokTranslation;
    }
    
}
