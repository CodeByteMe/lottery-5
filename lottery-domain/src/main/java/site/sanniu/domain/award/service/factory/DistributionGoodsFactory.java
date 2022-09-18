package site.sanniu.domain.award.service.factory;

import org.springframework.stereotype.Service;
import site.sanniu.domain.award.service.goods.IDistributionGoods;

/**
 * @Author sanniu
 * @Description 配送商品简单工厂，提供获取配送服务
 * @Date $ $
 **/
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
