/**
 * 
 */
package com.beike.wechat.pojo.message;

/**
 * @author yuhuizhe
 *
 */
public class TextcardMessage extends BaseMessage {
	//文本
    private Textcard textcard;
    //btntxt    否    按钮文字。 默认为“详情”， 不超过4个文字，超过自动截断。
    
    public Textcard getTextcard() {
        return textcard;
    }

    public void setTextcard(Textcard textcard) {
        this.textcard = textcard;
    }
}
