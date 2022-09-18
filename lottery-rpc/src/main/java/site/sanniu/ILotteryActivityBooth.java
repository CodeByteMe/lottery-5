package site.sanniu;

import site.sanniu.rpc.req.DrawReq;
import site.sanniu.rpc.req.QuantificationDrawReq;
import site.sanniu.rpc.res.DrawRes;

/**
 * @Author sanniu
 * @Description 抽奖活动展台接口
 * @Date $ $
 **/
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}

