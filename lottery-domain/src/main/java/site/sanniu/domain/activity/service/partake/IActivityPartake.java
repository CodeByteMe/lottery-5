package site.sanniu.domain.activity.service.partake;

import site.sanniu.common.Result;
import site.sanniu.domain.activity.model.req.PartakeReq;
import site.sanniu.domain.activity.model.res.PartakeResult;
import site.sanniu.domain.activity.model.vo.DrawOrderVO;

/**
 * 抽奖活动参与接口
 * @author 12966
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

}
