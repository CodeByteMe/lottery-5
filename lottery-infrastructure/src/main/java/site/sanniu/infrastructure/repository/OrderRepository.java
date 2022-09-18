package site.sanniu.infrastructure.repository;

import org.springframework.stereotype.Repository;
import site.sanniu.domain.award.repository.IOrderRepository;
import site.sanniu.infrastructure.dao.IUserStrategyExportDao;
import site.sanniu.infrastructure.po.UserStrategyExport;

import javax.annotation.Resource;

/**
 * @Author sanniu
 * @Description 奖品表仓储服务
 * @Date $ $
 **/
@Repository
public class OrderRepository implements IOrderRepository {

    @Resource
    private IUserStrategyExportDao userStrategyExportDao;

    @Override
    public void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        UserStrategyExport userStrategyExport = new UserStrategyExport();
        userStrategyExport.setuId(uId);
        userStrategyExport.setOrderId(orderId);
        userStrategyExport.setAwardId(awardId);
        userStrategyExport.setGrantState(grantState);
        userStrategyExportDao.updateUserAwardState(userStrategyExport);
    }
}

