package com.baidu.test;

import com.baidu.lucene.Index;
import com.baidu.lucene.Search;

/**
 * Created by dllo on 17/11/24.
 */
public class MainText {
    public static void main(String[] args) {
        Index index = new Index();
        index.index();

        Search search = new Search();
        search.search("旁观者");
    }
}
