package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 在群组中发送普通消息-结果
 *
 * @author bingo
 * @since 2021/8/4 11:25
 */
public class SendGroupMsgResult extends GenericResult {
    /**
     * 消息发送的时间戳，对应后台 server 时间
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("msgSeq")
    private Long msgSeq;

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    @Override
    public String toString() {
        return "SendGroupMsgResult{" +
                "msgTime=" + msgTime +
                ", msgSeq=" + msgSeq +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
