package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

/**
 * 普通消息
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

   @Override
   public void sendMessage(String message, String toUser){
       super.sendMessage(message+"普通",toUser);
   }

}
