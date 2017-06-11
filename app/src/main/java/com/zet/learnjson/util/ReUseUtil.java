package com.zet.learnjson.util;

import android.content.Context;
import android.support.annotation.NonNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Zet on 2017/6/11.
 * 可重用工具类
 */

public final class ReUseUtil {
    /**
     * assets目录获取字符串
     *
     * @param context  上下文
     * @param fileName 文件名
     * @return
     */
    @NonNull
    public static String assetsGetString(Context context, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            InputStream inputStream = context.getAssets().open(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String temp = bufferedReader.readLine();

            while (temp != null) {
                stringBuilder.append(temp);
                temp = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
