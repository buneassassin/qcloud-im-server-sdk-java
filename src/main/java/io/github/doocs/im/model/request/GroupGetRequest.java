package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取分组-请求参数
 *
 * @author hyh
 * @since 2021/07/31 15:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetRequest extends GenericRequest {
    /**
     * 指定要拉取分组的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 是否需要拉取分组下的 User 列表, Need_Friend_Type_Yes: 需要拉取, 不填时默认不拉取, 只有 GroupName 为空时有效
     */
    @JsonProperty("NeedFriend")
    private String needFriend;

    /**
     * 上一次拉取分组时后台返回给客户端的 Seq，初次拉取时为0，只有 GroupName 为空时有效
     */
    @JsonProperty("LastSequence")
    private Integer lastSequence;

    /**
     * 要拉取的分组名称
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    public GroupGetRequest() {
    }

    public GroupGetRequest(String fromAccount, Integer lastSequence) {
        this.fromAccount = fromAccount;
        this.lastSequence = lastSequence;
    }

    public GroupGetRequest(String fromAccount, String needFriend, Integer lastSequence, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.needFriend = needFriend;
        this.lastSequence = lastSequence;
        this.groupName = groupName;
    }

    private GroupGetRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.needFriend = builder.needFriend;
        this.lastSequence = builder.lastSequence;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getNeedFriend() {
        return needFriend;
    }

    public void setNeedFriend(String needFriend) {
        this.needFriend = needFriend;
    }

    public Integer getLastSequence() {
        return lastSequence;
    }

    public void setLastSequence(Integer lastSequence) {
        this.lastSequence = lastSequence;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }


    public static final class Builder {
        private String fromAccount;
        private String needFriend;
        private Integer lastSequence;
        private List<String> groupName;

        private Builder() {
        }

        public GroupGetRequest build() {
            return new GroupGetRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder needFriend(String needFriend) {
            this.needFriend = needFriend;
            return this;
        }

        public Builder lastSequence(Integer lastSequence) {
            this.lastSequence = lastSequence;
            return this;
        }

        public Builder groupName(List<String> groupName) {
            this.groupName = groupName;
            return this;
        }
    }
}
