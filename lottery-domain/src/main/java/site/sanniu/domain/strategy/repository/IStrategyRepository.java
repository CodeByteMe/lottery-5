package site.sanniu.domain.strategy.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
import site.sanniu.domain.strategy.model.aggregates.StrategyRich;
import site.sanniu.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * @Author sanniu
 * @Description 策略表仓储服务
 * @Date $ $
 **/
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}

