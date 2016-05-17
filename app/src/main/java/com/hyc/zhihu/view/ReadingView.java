package com.hyc.zhihu.view;

import com.hyc.zhihu.base.BaseView;
import com.hyc.zhihu.beans.HeadScrollItem;
import com.hyc.zhihu.beans.RealReading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/16.
 */
public interface ReadingView extends BaseView {
    void showHead(List<HeadScrollItem> headScrollItems);
    void showList(List<RealReading> realReadings,LinkedHashMap<Integer,String> indexer);
}
