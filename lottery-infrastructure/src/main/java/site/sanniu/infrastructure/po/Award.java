package site.sanniu.infrastructure.po;

import java.util.Date;

/**
 * 奖品信息
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public class Award {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 奖品ID
     */
    private Long awardId;

    /**
     * 奖品类型【文字描述、兑换码、优惠卷、实物商品】
     */
    private int awardType;

    /**
     * 奖品数量
     */
    private int awardCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /***
     * 奖品描述
     */
    private String awardContent;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAwardId() {
        return awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public int getAwardType() {
        return awardType;
    }

    public void setAwardType(int awardType) {
        this.awardType = awardType;
    }

    public int getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(int awardCount) {
        this.awardCount = awardCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardContent() {
        return awardContent;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
