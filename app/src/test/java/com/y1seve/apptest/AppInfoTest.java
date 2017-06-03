package com.y1seve.apptest;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;


/**
 * Created by Jim on 17/6/3.
 */

@RunWith(MockitoJUnitRunner.class)
public class AppInfoTest {

    private static final String PKG_NAME = "com.y1seve.apptest";

    @Mock
    Context mMockContext;

    @Test
    public void getPackageName_isCorrect() {

        //当when里面的方法被调用时,会模拟返回thenReturn里面的内容
        when(mMockContext.getPackageName()).thenReturn(PKG_NAME);

        //依据上述定义,当AppInfo.getPackageName被调用时,会模拟返回PKG_NAME。
        String result = AppInfo.getPackageName(mMockContext);

        assertThat(result, is(PKG_NAME));
    }

}
