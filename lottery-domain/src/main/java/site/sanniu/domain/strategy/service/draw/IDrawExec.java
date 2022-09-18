package site.sanniu.domain.strategy.service.draw;

import site.sanniu.domain.strategy.model.req.DrawReq;
import site.sanniu.domain.strategy.model.res.DrawResult;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public interface IDrawExec {

    /**
     * 抽奖方法
     * @param req 抽奖参数；用户ID、策略ID
     * @return    中奖结果
     */
    DrawResult doDrawExec(DrawReq req);

}

