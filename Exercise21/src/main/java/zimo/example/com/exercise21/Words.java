package zimo.example.com.exercise21;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by zimo on 16-9-22.
 */
public class Words {
    public final static String AUTHORITY=".wordsprovider";

    public Words(){

    }

    public static abstract class Word implements BaseColumns {
        public static final String Table_name="words";
        public static final String Column_name_word="word";
        public static final String Column_name_meaning="meaning";
        public static final String Column_name_sample="sample";

        //MIME类型
        public static final String MIME_DIR_PREFIX = "vnd.android.cursor.dir";
        public static final String MIME_ITEM_PREFIX = "vnd.android.cursor.item";
        public static final String MINE_ITEM = "vnd.bistu.cs.se.word";

        public static final String MINE_TYPE_SINGLE = MIME_ITEM_PREFIX + "/" + MINE_ITEM;
        public static final String MINE_TYPE_MULTIPLE = MIME_DIR_PREFIX + "/" + MINE_ITEM;

        public static final String PATH_SINGLE = "word/#";//单条数据的路径
        public static final String PATH_MULTIPLE = "word";//多条数据的路径

        //Content Uri
        public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + PATH_MULTIPLE;
        public static final Uri CONTENT_URI = Uri.parse(CONTENT_URI_STRING);

    }
}